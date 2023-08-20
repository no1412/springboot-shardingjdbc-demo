package com.m.springbootshardingjdbcdemo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author ll
 */
@TableName("user_activity")
@Data
public class UserActivity {

    /**
     * id
     */
    private Long id;

    /**
     * uid
     */
    private Long uId;

    /**
     * activity id
     */
    private Long activityId;

    /**
     * activity name
     */
    private String activityName;

    /**
     * create time
     */
    private LocalDateTime createTime;

    /**
     * update time
     */
    private LocalDateTime updateTime;

}
