package com.yojulab.study_springboot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CarCompanyMapper {
    @Delete("DELETE FROM CAR_INFO WHERE CI_PK = #{carId}")
    void deleteCarById(@Param("carId") String carId);
}
