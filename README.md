# Spring Boot MicroService Starter Kit

 - 技术栈
 - 代码规范
 - 配置管理
 - 测试策略
 - 应用层
 - 数据管理
 - 集成策略
 - 安全策略
 - 持续交付
 - 运维监控

### 技术栈：
  * spring boot
  * spring cloud
  * spring security
  * mysql
  * flyway
  * mybatis
  * docker/variant
  * git
  ...

### 代码规范：
 - [x] Checkstyle/PMD/FindBugs/AlibabaJavaCodingGuidelines
 - [x] EditorConfig
 - [x] SonarQube  
 - [ ] API Normalize

### 配置管理：
 - [x] Version Control System：Git
 - [x] Build Tool：Gradle
 - [x] Config Management：application.yml
 - [x] Env Management： Vagrant/Docker
    - [x] `memory size setup`
    - [ ] `network port link`
    - [ ] `database link`
    - [ ] `related to the envrionment configuration`
      
### 测试策略：
  - [x] Unit Test
  - [x] Component Test
  - [x] Api Test 
  - [x] Test Coverage
  - [ ] Contract Test
  - [ ] Integration Test
  - [ ] Performance Test
  - [ ] Test Coverage
  
### 应用层
  - [ ] DDD Tactics
  - [x] DIP(Spring Container)  
  - [x] AOP(Spring AOP)
  - [x] ORM(mybatis)
  - [ ] Asnyc
  - [ ] Transactional Management   
  - [ ] DSL
  - [ ] API Design: RESTfuls(Idempotent, Error Handling, etc.)

### 数据管理
  - [x] Migration: Database schema management: flyway
  - [ ] Database: RDBMS
  - [ ] Message: Kafaka
  - [ ] Cache: Redis、Spring Cache

### 集成策略
  - [ ] API Semantic Versioning
  - [ ] Event Driven
  - [ ] Service Discovery/Register
  - [ ] Service Fallback: Hystrix
  - [ ] Load Balance: Ribbon
  - [ ] API Call: Feign
  ....

 ### 安全策略
  - [ ] Auth: session management、Json web token
  - [ ] Permission: Data permission、Feature permission
  - [ ] Security: CORS、XSS、SQL Inject
  ...

### 持续交付：
  - [ ] Pipeline: GoCD/Jenkins(pipeline as code)
  - [ ] Containeize: Docker
  - [ ] Container Scheduling and Management: Kubernetes、Docker Compose
  - [ ] Container management platform: Rancher
 ...

### 运维监控 
  - [ ] APM: APP Dynamic、Pinpoint、Grafana、Prometheus、Zipkin
  - [ ] Logging System: EFK
  - [ ] Cerebro

...
