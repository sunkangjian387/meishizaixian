package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Rzb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer rzid;//认证id

    private Integer yhid;//用户id

    private String rzmz;//真实姓名

    private String rzsfzh;//身份证号

    private String rztp;//正反图片

    private String rzjg;//审核结果
}
