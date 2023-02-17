# JAVA SPI 服务发现机制 Demo

### 工程结构

分为以下四个模块

* spi-app-server: 程序入口
* spi-service-interface: 定义了服务接口
* spi-service-mysql: 模拟mysql服务提供者，定义了实现类
* spi-service-oracle: 模拟oracle服务提供者，定义了实现类

```
├── pom.xml
├── readme.md
├── spi-app-server
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── com
│           │       └── platform
│           │           └── server
│           │               └── AppServer.java
│           └── resources
│               └── META-INF
│                   └── services
├── spi-service-interface
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── com
│           │       └── platform
│           │           └── service
│           │               └── IDataOperator.java
│           └── resources
├── spi-service-mysql
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── com
│           │       └── platform
│           │           └── service
│           │               └── MysqlDataOperator.java
│           └── resources
│               └── META-INF
│                   └── services
│                       └── com.platform.service.IDataOperator
├── spi-service-oracle
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── com
│           │       └── platform
│           │           └── service
│           │               └── OracleDataOperator.java
│           └── resources
│               └── META-INF
│                   └── services
│                       └── com.platform.service.IDataOperator
└── src
    └── main
        ├── java
        └── resources
```
### 文档
https://ericwu0930.github.io/post/java_spi/
