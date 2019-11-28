package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Yhb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer yhid;//用户id

    private String yhyx;//邮箱

    private String yhmm;//密码

    private String yhnc;//昵称

    private String yhdh;//电话

    private String yhtx;//头像

    private String yhxb;//性别

    private String yhzy;//职业

    private String yhcs;//所在城市

    private String yhjj;//个人简介

    private String yhzt;//认证状态

    private String yhzg;//家宴资格

}
