package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.PmsProductParam;
import org.apache.ibatis.annotations.Param;

public interface PmsProductDao {
    PmsProductParam getUpdateInfo(@Param("id") Long id);
}
