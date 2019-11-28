package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Znx implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer znid;//站内信id

    private Integer znfxr;//发信人

    private Integer znsxr;//收信人

    private String znbt;//标题

    private String znnr;//内容

    private String znsj;//时间

    private String znzt;//状态
}
