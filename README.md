\# 学生管理系统后端



\## 项目介绍

基于 Spring Boot 的学生管理系统后端，提供学生的增删改查接口，数据存储在 MySQL。



\## 技术栈

\- Spring Boot 3.3.5

\- Spring Data JPA

\- Hibernate

\- MySQL

\- Maven



\## 功能

\- 查询所有学生

\- 按 id 查询学生

\- 新增学生

\- 修改学生

\- 删除学生



\## 项目结构

com.example.springbootstrat

├── controller   接口层

├── service      业务层

├── repository   数据层

└── entity       实体类



\## 接口列表

| 方法 | 路径 | 说明 |

|---|---|---|

| GET | /api/students | 查所有 |

| GET | /api/students/{id} | 查一个 |

| POST | /api/students | 新增 |

| PUT | /api/students/{id} | 修改 |

| DELETE | /api/students/{id} | 删除 |



\## 运行方式

1\. 建数据库：`CREATE DATABASE student\_db DEFAULT CHARACTER SET utf8mb4;`

2\. 修改 `application.properties` 里的数据库密码

3\. 运行 `SpringbootStratApplication`

4\. 访问 `http://localhost:8080/api/students`

