# API 开放平台 - 开发中

提供 API 接口供开发者调用

## 1. 需求分析

- 用户通过注册登录，可以开通接口调用权限，并可以浏览和调用接口。每次调用都会进行统计，用户可以根据统计数据进行分析和优化。
  
- 管理员可以发布接口、下线接口、接入接口，并可视化接口的调用情况和数据。

## 2. 业务流程

5个子系统：

- **模拟接口**系统：提供各种模拟接口供开发者使用和测试。
  
- **后台管理**系统：管理员可以发布接口、设置接口的调用数量、设定是否下线接口等功能，以及查看用户使用接口的情况，例如使用次数，错误调用等。
  
- **用户前台**系统：提供一个访问界面，供开发者浏览所有的接口，可以购买或开通接口，并获得一定量的调用次数。
  
- **API 网关**系统：负责接口的流量控制，计费统计，安全防护等功能，提供一致的接口服务质量，和简化 API 的管理工作。
    
- **第三方调用 SDK** 系统：提供一个简化的工具包，使得开发者可以更方便地调用接口，例如提供预封装的 HTTP 请求方法、接口调用示例等。

## 3. 技术选型

**前端**：

- React 18
  
- Ant Design Pro 5.x 脚手架
  
- Ant Design & Procomponents 组件库
  
- Umi 4 前端框架
  
- Umi Request（Axios 的封装）
  
- OpenAPI 前端代码生成

**后端**：

- Java Spring Boot
  
- MySQL 数据库
  
- MyBatis-Plus 及 MyBatis X 自动生成
  
- API 签名认证（Http 调用）
  
- Spring Boot Starter（SDK 开发）
  
- Dubbo 分布式（RPC、Nacos）
  
- Swagger + Knife4j 接口文档生成
  
- Spring Cloud Gateway 微服务网关
  
- Hutool、Apache Common Utils、Gson 等工具库

