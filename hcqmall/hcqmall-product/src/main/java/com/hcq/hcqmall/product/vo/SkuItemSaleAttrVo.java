package com.hcq.hcqmall.product.vo;

import lombok.Data;

import java.util.List;
/**
 * @author huchangqi
 */
@Data
public class SkuItemSaleAttrVo {
    private Long attrId;
    private String attrName;
    private List<AttrValueWithSkuIdVo> attrValues;
}
