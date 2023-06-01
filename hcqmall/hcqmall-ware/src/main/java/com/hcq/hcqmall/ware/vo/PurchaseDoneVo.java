package com.hcq.hcqmall.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * @author huchangqi
 */
@Data
public class PurchaseDoneVo {

    @NotNull(message = "id不允许为空")
    private Long id;

    private List<PurchaseItemDoneVo> items;

}
