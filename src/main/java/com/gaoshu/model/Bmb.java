package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Bmb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer bmid;//报名id

    private Integer yhid;//报名人

    private Integer fjid;//饭局id

    private String bmly;//申请理由

    private String bmbz;//备注

    private String bmsj;//申请时间

    private String bmzt;//状态
}
