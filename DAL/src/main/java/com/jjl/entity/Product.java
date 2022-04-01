package com.jjl.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Product {
    //主键
    private Long id;
    //商品名
    private String name;
    //库存数量
    private Integer num;
    //原价
    private BigDecimal originalPrice;
    //现价
    private BigDecimal currentPrice;
    //状态 1:有效 0:已下架
    private Integer status;
    //商品描述
    private String note;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


}
