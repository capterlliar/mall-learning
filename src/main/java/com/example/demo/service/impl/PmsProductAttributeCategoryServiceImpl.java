package com.example.demo.service.impl;

import com.example.demo.mbg.mapper.PmsProductAttributeCategoryDao;
import com.example.demo.mbg.model.PmsProductAttributeCategoryItem;
import com.example.demo.mbg.mapper.PmsProductAttributeCategoryMapper;
import com.example.demo.service.PmsProductAttributeCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    @Resource
    PmsProductAttributeCategoryDao pmsProductAttributeCategoryDao;
    @Resource
    PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr(){
        return pmsProductAttributeCategoryDao.getListWithAttr();
    }
}
