package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Fjb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer fjid;//饭局id1

    private Integer yhid;//发起人

    private String fjbt;//标题

    private Double fjxf;//人均消费

    private Integer fjrs;//最大人数

    private String fjxq;//详情

    private String fjdd;//地点

    private String fjlx;//类型

    private String fjsj;//饭局时间

    private String fjjzzsj;//报名截止时间

    private String fjhd;//饭后活动

    private String fjzt;//饭局状态
}
