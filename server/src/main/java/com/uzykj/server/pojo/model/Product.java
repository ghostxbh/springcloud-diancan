package com.uzykj.server.pojo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author xu
 * @DateTime 2018-12-11 10:00
 */


@Data
//@Table(name="y_xxx")
@Entity
public class Product {

    @Id
    private String id;

    private String name;

    private BigDecimal price;

    private Integer stock;//库存

    private String description;//描述

    private String icon;//小图

    private Integer status;

    private Integer category;

    private Date createTime;

    private Date updateTime;


}
