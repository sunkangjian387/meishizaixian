package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Tpzyb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer tpid;//图片资源表id

    private Integer fjid;//饭局id

    private String tplj;//图片链接
}
