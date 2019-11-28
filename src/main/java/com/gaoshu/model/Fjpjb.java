package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Fjpjb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer pjid;//饭局评价id

    private Integer yhid;//用户id

    private Integer fjid;//饭局id

    private String pjnr;//评论内容

    private String pjsj;//评论的时间
}
