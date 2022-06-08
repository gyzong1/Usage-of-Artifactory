# 描述
在此课程中，我们将引导您如何在Artifactory中创建仓库，您将能够从Artifactory拉取镜像，并将指定镜像上传至Artifactory。
# 主要内容
* 通过Artifactory拉取镜像  
* Push镜像至Artifactory
# 操作步骤
## Artifactory 创建仓库
访问并登录Artifactory，如浏览器访问：http://ip:8082/artifactory  
创建仓库：  
webinar-docker-dev-local  
webinar-docker-remote  
webinar-docker-virtual  
* ### 创建 webinar-docker-dev-local 仓库  
  Settings--Repositories  
  1\) 点击右上角 "+ Add Repositories" -- "Local Repository"  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-1.png">
  2\) 选择 "Docker" 类型  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-2.png">
  3\) 填写仓库名 "webinar-docker-dev-local", 保存  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-3.png">
* ### 创建 webinar-docker-remote 仓库  
  Settings--Repositories  
  1\) 同上，点击右上角 "+ Add Repositories" -- "Remote Repository"  
  2\) 选择 "Docker" 类型  
  3\) 填写仓库名 "webinar-docker-remote", URL保持默认，保存  
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-4.png">
* ### 创建 webinar-docker-virtual 仓库  
  Settings--Repositories  
  1\) 同上，点击右上角 "+ Add Repositories" -- "Virtual Repository"
  2\) 选择 "Docker" 类型  
  填写仓库名 "webinar-docker-virtual", 并将上面刚创建的2个仓库拖动至右侧，保存
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-5.png">
  <img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-6.png">
##  获取 Docker 配置  
Settings--Artifactory--HTTP Settings，查看使用示例   
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-7.png">  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-8.png">  
##  拉取镜像(docker pull)   
```bash
docker login 192.168.56.11:8082
docker pull 192.168.56.11:8082/webinar-docker-virtual/busybox
```
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Docker-9.png">    

##  推送镜像(docker push)  
```bash
docker tag 192.168.56.11:8082/webinar-docker-virtual/busybox 192.168.56.11:8082/webinar-docker-dev-local/busybox:v1
docker push 192.168.56.11:8082/webinar-docker-dev-local/busybox:v1
```
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-10.png">   

##  查看 Artifactory 中缓存和上传的镜像  
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-11.png">
<img width="1751" alt="image" src="https://github.com/gyzong1/Usage-of-Artifactory/blob/main/images/Npm-12.png">
