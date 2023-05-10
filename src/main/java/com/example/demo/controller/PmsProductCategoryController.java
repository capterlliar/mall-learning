package com.example.demo.controller;

import com.example.demo.common.api.CommonResult;
import com.example.demo.mbg.model.PmsProductCategory;
import com.example.demo.service.PmsProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "PmsProductCategoryController", description = "商品分类管理")
@RequestMapping("/productCategory")
public class PmsProductCategoryController {
    @Autowired
    PmsProductCategoryService pmsProductCategoryService;

    @ApiOperation("查询商品分类")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductCategory>> getList() {
        List<PmsProductCategory> list = pmsProductCategoryService.getList();
        return CommonResult.success(list);
    }

}
