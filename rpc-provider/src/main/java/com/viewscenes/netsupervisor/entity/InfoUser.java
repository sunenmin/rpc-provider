package com.viewscenes.netsupervisor.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author Matt Sun
 * @Version 1.0
 **/

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("InfoUser")
public class InfoUser  extends Model<InfoUser> {

	private static final long serialVersionUID = 1L;

	@TableId("id")
	private int id;

	@TableField("name")
    private String name;

	@TableField("address")
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InfoUser(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public InfoUser(String name,String address){
        this.name = name;
        this.address = address;
    }

    public  InfoUser(){}

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    @Override
    public String toString() {
        return "InfoUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}

