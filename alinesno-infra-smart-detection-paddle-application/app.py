"""
Object Detection API using YOLOv5 models with Flask
"""

import os
import requests
import torch
from flask import Flask, request
from PIL import Image
import io

app = Flask(__name__)
models = {}

DETECTION_URL = '/v1/object-detection/<model>'  # 检测请求URL模板

def download_models():
    """
    从七牛下载模型文件到 app/models 目录
    """
    model_urls = [
        'http://data.linesno.com/models/fire-smoke5s.pt',
        'http://data.linesno.com/models/yolov5s.pt',
        'http://data.linesno.com/models/yolov5m.pt',
        'http://data.linesno.com/models/yolov5l.pt'
    ]

    models_dir = 'models'

    if not os.path.exists(models_dir):
        os.makedirs(models_dir)

    for url in model_urls:
        filename = os.path.join(models_dir, os.path.basename(url))
        if not os.path.exists(filename):
            response = requests.get(url)
            with open(filename, 'wb') as file:
                file.write(response.content)
            print(f"Downloaded {filename}")

@app.route(DETECTION_URL, methods=['POST'])
def predict(model):
    """
    处理图像检测请求
    """
    if request.method != 'POST':
        return

    if request.files.get('image'):
        im_file = request.files['image']
        im_bytes = im_file.read()
        im = Image.open(io.BytesIO(im_bytes))

        if model in models:
            results = models[model](im, size=640)
            return results.pandas().xyxy[0].to_json(orient='records')

if __name__ == '__main__':

    download_models()

    # 手动加载本地模型
    model_paths = {
        'yolov5s': 'models/yolov5s.pt',
        'yolov5m': 'models/yolov5m.pt',
        'yolov5l': 'models/yolov5l.pt',
        'fire-smoke5s': 'models/fire-smoke5s.pt',
    }

    for model_name, model_path in model_paths.items():
        models[model_name] = torch.hub.load('ultralytics/yolov5', 'custom', path=model_path, force_reload=False)

    app.run(host='0.0.0.0', port=5001)  # 启动 Flask 应用

