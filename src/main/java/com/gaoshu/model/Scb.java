package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Scb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer scid;//收藏id

    private Integer yhid;//用户id

    private Integer fjid;//饭局id

    private String scsj;//收藏时间
}
