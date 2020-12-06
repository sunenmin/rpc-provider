package com.viewscenes.netsupervisor.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.viewscenes.netsupervisor.annotation.RpcService;
import com.viewscenes.netsupervisor.entity.InfoUser;
import com.viewscenes.netsupervisor.mapper.InfoUserMapper;
import com.viewscenes.netsupervisor.service.InfoUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @Author Matt Sun
 * @Version 1.0
 **/
@RpcService
@Controller
public class InfoUserServiceImpl implements InfoUserService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    InfoUserMapper infoUserMap;

   // Map<Integer,InfoUser> infoUserMap = new ConcurrentHashMap<>();

    @ResponseBody
    public List<InfoUser> insertInfoUser(InfoUser infoUser) {
        logger.info("新增用户信息:{}", JSONObject.toJSONString(infoUser));
        infoUserMap.insertInfoUser(infoUser);
        return getAllUser();
    }

    @ResponseBody
    public InfoUser getInfoUserById(int id) {
     //   InfoUser infoUser = infoUserMap.get(id);
        logger.info("查询用户ID:{}",id);
        return infoUserMap.getInfoUserById(id);
    }


    @ResponseBody
    public void deleteInfoUserById(int id) {
        logger.info("删除用户信息:{}");
        infoUserMap.deleteInfoUserById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getNameById")
    public String getNameById(int id){
        logger.info("根据ID查询用户名称:{}",id);
        return infoUserMap.getNameById(id);
    }

    @ResponseBody
    @RequestMapping(value="/getAllUser")
    public List<InfoUser> getAllUser(){
        logger.info("查询所有用户信息{}",JSONObject.toJSONString(infoUserMap));
        return infoUserMap.getAllUser();
    }


    @ResponseBody
    @RequestMapping("/test")
    public  int  test(){
        InfoUser infoUser = new InfoUser();
        infoUser.setName("test!!!1");
        infoUser.setAddress("beijing");
        infoUserMap.insertInfoUserNoId(infoUser);
        return infoUser.getId();


    }

}
