package com.example.demo.service.impl;

import com.example.demo.mbg.mapper.PmsProductCategoryMapper;
import com.example.demo.mbg.model.PmsProductCategory;
import com.example.demo.mbg.model.PmsProductCategoryExample;
import com.example.demo.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    @Resource
    private PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public List<PmsProductCategory> getList(){
        return pmsProductCategoryMapper.selectByExample(new PmsProductCategoryExample());
    }
}
