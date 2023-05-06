package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(tags = "PmsProductCategoryController", description = "商品分类管理")
@RequestMapping("/productCategory")
public class PmsProductCategoryController {

}
