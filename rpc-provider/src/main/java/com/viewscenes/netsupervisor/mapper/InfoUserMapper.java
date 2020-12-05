package com.viewscenes.netsupervisor.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.viewscenes.netsupervisor.entity.InfoUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Matt Sun
 * @since 2020-12-05
 */
public interface InfoUserMapper extends BaseMapper<InfoUser> {

    //新增用户信息
    void insertInfoUser(InfoUser infoUser);

    //通过id获取用户信息
    InfoUser getInfoUserById(@Param("id") int id);

    //通过id删除用户信息
    void deleteInfoUserById(@Param("id") int id);

    //根据id查询用户名
    String getNameById(@Param("id") int id);

    //获取所有的用户
    List<InfoUser> getAllUser();


}
