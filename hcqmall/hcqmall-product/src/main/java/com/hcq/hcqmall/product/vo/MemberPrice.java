/**
  * Copyright 2021 bejson.com 
  */
package com.hcq.hcqmall.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author huchangqi
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;


}