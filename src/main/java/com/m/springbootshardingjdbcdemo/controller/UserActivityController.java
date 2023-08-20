package com.m.springbootshardingjdbcdemo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.m.springbootshardingjdbcdemo.dao.IUserActivityDao;
import com.m.springbootshardingjdbcdemo.model.UserActivity;
import com.m.springbootshardingjdbcdemo.service.IUserActivityService;
import com.m.springbootshardingjdbcdemo.vo.UserActivityVO;
import io.swagger.annotations.ApiOperation;
import org.apache.shardingsphere.transaction.annotation.ShardingSphereTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.jooq.User;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ll
 */
@RestController("/user-activity")
public class UserActivityController {


    @Resource
    private IUserActivityService userService;
    @Resource
    private IUserActivityDao userActivityDao;

    @ApiOperation(value = "/add")
    @PostMapping
    public UserActivityVO add(@RequestBody UserActivityVO userActivityVO) {
        UserActivity userActivity = new UserActivity();
        BeanUtils.copyProperties(userActivityVO, userActivity);
        userActivityDao.insert(userActivity);
        return userActivityVO;
    }

    @ApiOperation(value = "/test")
    @PutMapping
    public UserActivityVO test(@RequestBody UserActivityVO userActivityVO) {

        UserActivity userActivity = new UserActivity();
        BeanUtils.copyProperties(userActivityVO, userActivity);
        userActivityDao.insert(userActivity);

        UserActivity updateUserActivity = new UserActivity();
        updateUserActivity.setActivityName("change");
        userActivityDao.update(updateUserActivity, Wrappers.<UserActivity>lambdaUpdate()
                .eq(UserActivity::getUId, userActivityVO.getUId())
        );
        int x = 1/0;
        return userActivityVO;

//        int x = 1/0;
//        return userActivityVO;
    }

    @ApiOperation(value = "/list")
    @GetMapping
    public List<UserActivityVO> list() {
        List<UserActivity> list = userService.list();
        List<UserActivityVO> userActivityVOList = new ArrayList<>();
        for (UserActivity userActivity : list) {
            UserActivityVO userActivityVO = new UserActivityVO();
            BeanUtils.copyProperties(userActivity, userActivityVO);
            userActivityVOList.add(userActivityVO);
        }
        return userActivityVOList;
    }
}
