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

    List<InfoUser> insertInfoUser(InfoUser infoUser);

    InfoUser getInfoUserById(int id);

    void deleteInfoUserById(int id);

    String getNameById(int id);

    Map<String,InfoUser> getAllUser();
}
