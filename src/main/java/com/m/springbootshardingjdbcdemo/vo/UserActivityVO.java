package com.m.springbootshardingjdbcdemo.vo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author ll
 */
@Data
public class UserActivityVO {

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
