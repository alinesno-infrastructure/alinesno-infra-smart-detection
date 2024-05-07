<template>
  <div>
    <el-row class="acp-dashboard-panel" :gutter="20">
      <el-col class="panel-col" :span="19">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 业务最新巡检</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
              <div class="direct-box">
                <ul>
                  <li class="box-item" v-for="item in attractiveFeatures" :key="item">
                    <div class="dire-panel">
                      <div class="panel-title">
                        <i class="dire-panel-icon" :class="item.icon" :alt="item.name" />
                        {{ item.name }} 
                      </div>
                      <div class="panel-describe">通过简单几步，图中7种主流开发环境轻松部署，摆脱海量文档搜索之苦。</div>
                      <!-- <div class="panel-tip">访问链接</div> -->
                    </div>
                  </li>
                </ul>
              </div>
          </div>
        </div>
      </el-col>
      <el-col :span="5">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 应用场景</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
            <div class="acp-app-list">
              <ul>
                <li class="app-items" style="width:100%" v-for="item in apps" :key="item">
                  <div class="app-info">
                    <div class="app-item-title">
                        <i :class="item.icon" :alt="item.name" />
                        {{ item.name }} 
                    </div>
                    <div class="app-item desc">{{ item.desc }}</div>
                  </div>
                </li>
              </ul>
            </div>
          </div>

        </div>
      </el-col>
    </el-row>

  </div>
</template>

<script setup>

const attractiveFeatures = ref([
  { "icon": "fa-solid fa-video", "name": "实时监控", "desc": "能够在实时视频画面中准确检测并跟踪行人与车辆，提供即时反馈与数据支持" },
  { "icon": "fa-solid fa-car-crash", "name": "事故预警", "desc": "提供准确的事故记录与快速响应能力，帮助降低事故发生风险" },
  { "icon": "fa-solid fa-shield-alt", "name": "安全监控", "desc": "用于公共场所与设施周边的安全监控，预防犯罪行为，提升公共安全管理水平" },
  { "icon": "fa-solid fa-route", "name": "智能交通", "desc": "整合至自动驾驶系统，帮助车辆避免碰撞，提升交通安全水平" },
  { "icon": "fa-solid fa-chart-network", "name": "数据驱动", "desc": "通过长期数据收集与分析，为城市规划与基础设施建设提供决策支持，助力城市可持续发展" }
]);

const apps = ref([
  { "icon": "fa-solid fa-car", "name": "智慧交通监控", "desc": "监测城市交通流量、行人穿行情况，优化交通信号控制，提高交通效率" },
  { "icon": "fa-solid fa-video-surveillance", "name": "安全监控系统", "desc": "用于公共场所和重要设施周边的安全监控，预防犯罪行为，提升安全水平" },
  { "icon": "fa-solid fa-city", "name": "智慧城市规划", "desc": "通过数据收集分析人流和车流模式，为城市规划和基础设施建设提供支持" }
]);

</script>