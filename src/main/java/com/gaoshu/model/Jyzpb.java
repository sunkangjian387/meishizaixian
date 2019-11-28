package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Jyzpb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer jbid;//家宴照片表id

    private Integer jyid;//家宴id

    private String jytp;//家宴图片

    private String jylb;//图片类别
}
