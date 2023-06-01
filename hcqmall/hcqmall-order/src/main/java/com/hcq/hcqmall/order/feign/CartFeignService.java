package com.hcq.hcqmall.order.feign;

import com.hcq.hcqmall.order.vo.OrderItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


/**
 * @author yaoxinjia
 * @email 894548575@qq.com
 */
@FeignClient("hcqmall-cart")
public interface CartFeignService {

    /**
     * 查询当前用户购物车选中的商品项
     * @return
     */
    @GetMapping(value = "/currentUserCartItems")
    List<OrderItemVo> getCurrentCartItems();
    @GetMapping("/currentUserCartItemByHu")
    List<OrderItemVo> getCurrentUserCartItemByHu();

}
