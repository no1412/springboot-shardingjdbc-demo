package com.m.springbootshardingjdbcdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.m.springbootshardingjdbcdemo.model.UserActivity;
import org.apache.ibatis.annotations.*;

/**
 * @author ll
 */
@Mapper
public interface IUserActivityDao extends BaseMapper<UserActivity> {


}
