package com.yojulab.study_springboot.service;

import com.yojulab.study_springboot.dao.SharedDao;
import com.yojulab.study_springboot.mapper.CarCompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CarCompanyService {
    private final SharedDao sharedDao;
    private final CarCompanyMapper carCompanyMapper;

    public Object list(Map dataMap) {
        String sqlMapId = "carcompany.list";

        Object result = sharedDao.getList(sqlMapId, dataMap);

        return result;
    }

    public void deleteCarById(String carId) {
        carCompanyMapper.deleteCarById(carId);
    }



}
