package com.hcq.hcqmall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;
/**
 * @author huchangqi
 */
@ToString
@Data
public class SpuItemAttrGroupVo {
    private String groupName;
    private List<Attr> attrs;
}
