package com.m.springbootshardingjdbcdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.m.springbootshardingjdbcdemo.dao.IUserActivityDao;
import com.m.springbootshardingjdbcdemo.model.UserActivity;
import com.m.springbootshardingjdbcdemo.service.IUserActivityService;
import org.springframework.stereotype.Service;


/**
 * @author ll
 */

@Service
public class UserActivityServiceImpl extends ServiceImpl<IUserActivityDao, UserActivity> implements IUserActivityService {
}
