package com.gaoshu.model;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Jysqb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer jyid;//家宴申请id

    private Integer yhid;//申请用户id

    private String jycs;//城市

    private String jyrs;//人数

    private String jydd;//地点

    private String jypr;//是否学过烹饪

    private String jyprfs;//烹饪方式

    private String jycsl;//菜数

    private String jycsxq;//菜数详情

    private String jyhd;//现场活动

    private String jyry;//家宴人员

    private String jyhb;//家宴伙伴

    private String jyyc;//月次

    private String jygj;//家宴人员国籍

    private String jywz;//家宴位置

    private String jyjtwz;//具体位置

    private String jywys;//掌握外语数

    private String jynl;//年龄

    private String jysq;//社区详情

    private String jycy;//菜肴形式

    private String jyyp;//提供的饮品

    private String jytd;//餐后甜点

    private String jysh;//审核状态

    private String jysj;//审核时间
}
