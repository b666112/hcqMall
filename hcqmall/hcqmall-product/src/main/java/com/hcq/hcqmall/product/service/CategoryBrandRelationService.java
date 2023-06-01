package com.hcq.hcqmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcq.hcqmall.product.entity.BrandEntity;
import com.hcq.hcqmall.common.utils.PageUtils;
import com.hcq.hcqmall.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author yaoxinjia
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetail(CategoryBrandRelationEntity categoryBrandRelation);

    void updateBrand(Long brandId, String name);

    void updateCategory(Long catId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}

