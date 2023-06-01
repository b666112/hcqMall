package com.hcq.hcqmall.product.vo;

import lombok.Data;
/**
 * @author huchangqi
 */
@Data
public class AttrRespVo extends AttrVo{

    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
