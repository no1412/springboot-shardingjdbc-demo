CREATE database test_db_sharding_0;

USE test_db_sharding_0;

DROP TABLE IF EXISTS `user_activity_0`;
CREATE TABLE `user_activity_0` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                                   `u_id` bigint DEFAULT NULL COMMENT '用户ID',
                                   `activity_id` bigint DEFAULT NULL COMMENT '活动ID',
                                   `activity_name` varchar(64) DEFAULT NULL COMMENT '活动名称',
                                   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='用户参与活动记录表';

DROP TABLE IF EXISTS `user_activity_1`;
CREATE TABLE `user_activity_1` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                                   `u_id` bigint DEFAULT NULL COMMENT '用户ID',
                                   `activity_id` bigint DEFAULT NULL COMMENT '活动ID',
                                   `activity_name` varchar(64) DEFAULT NULL COMMENT '活动名称',
                                   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='用户参与活动记录表';

CREATE database test_db_sharding_1;

USE test_db_sharding_1;

DROP TABLE IF EXISTS `user_activity_0`;
CREATE TABLE `user_activity_0` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                                   `u_id` bigint DEFAULT NULL COMMENT '用户ID',
                                   `activity_id` bigint DEFAULT NULL COMMENT '活动ID',
                                   `activity_name` varchar(64) DEFAULT NULL COMMENT '活动名称',
                                   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='用户参与活动记录表';

DROP TABLE IF EXISTS `user_activity_1`;
CREATE TABLE `user_activity_1` (
                                   `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                                   `u_id` bigint DEFAULT NULL COMMENT '用户ID',
                                   `activity_id` bigint DEFAULT NULL COMMENT '活动ID',
                                   `activity_name` varchar(64) DEFAULT NULL COMMENT '活动名称',
                                   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`id`)
) ENGINE=InnoDB COMMENT='用户参与活动记录表';
