package com.viewscenes.netsupervisor.service;

import com.viewscenes.netsupervisor.entity.InfoUser;

import java.util.List;
import java.util.Map;

/**
 * @program: rpc-provider
 * @description: ${description}
 * @author: shiqizhen
 * @create: 2018-11-30 16:53
 **/
public interface InfoUserService {

    //新增用户信息
    List<InfoUser> insertInfoUser(InfoUser infoUser);

    //通过id获取用户信息
    InfoUser getInfoUserById(int id);

    //通过id删除用户信息
    void deleteInfoUserById(int id);

    //根据id查询用户名
    String getNameById(int id);

    //获取所有的用户
    List<InfoUser> getAllUser();
}
