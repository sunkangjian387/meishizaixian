package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Gzb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer gzid;//关注id

    private Integer gzr;//关注人

    private Integer bgzr;//被关注人
}
