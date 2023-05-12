package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductAttributeDao {
    /**
     * 获取商品属性信息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
