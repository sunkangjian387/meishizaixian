package com.gaoshu.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Hmdb implements Serializable {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer hmdid;//黑名单id

    private Integer lhr;//拉黑人

    private Integer blhr;//被拉黑人
}
