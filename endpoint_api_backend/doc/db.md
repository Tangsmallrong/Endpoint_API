# 数据库设计

> 建表语句见 `sql` 目录下的文件

## 接口信息表

| 接口信息表(interface_info) |                            |              |
| -------------------------- | -------------------------- | ------------ |
| 字段                       | 说明                       | 类型         |
| **id**                     | 用户 id(主键)              | bigint       |
| name                       | 接口名称                   | varchar(256) |
| description                | 描述                       | varchar(256) |
| url                        | 接口地址                   | varchar(512) |
| requestHeader              | 请求头                     | text         |
| responseHeader             | 响应头                     | text         |
| status                     | 接口状态（0-关闭，1-开启） | int          |
| method                     | 请求类型                   | varchar(256) |
| userId                     | 创建人                     | bigint       |
| **createTime**             | 创建时间                   | datetime     |
| **updateTime**             | 更新时间                   | datetime     |
| **isDelete**               | 是否删除(0-未删, 1-已删)   | tinyint      |



