# 基于Python镜像构建Docker容器
FROM registry.cn-shenzhen.aliyuncs.com/alinesno-infra-base/yolo:v5

# 设置工作目录
WORKDIR /app

# 复制所需文件到容器中
COPY requirements.txt app.py ./

# 安装依赖包
RUN pip install --no-cache-dir -r requirements.txt

# 暴露端口
EXPOSE 5001

# 运行应用（以root用户）
CMD ["python3", "app.py", "--port", "5001"]

