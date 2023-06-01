package com.hcq.hcqmall.search.service;


import com.hcq.hcqmall.common.to.es.SkuEsModel;

import java.util.List;
/**
 * @author huchangqi
 */
public interface ProductSaveService {
    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws Exception;
}
