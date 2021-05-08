package com.clinic.patient.service;

import com.clinic.patient.service.api.PatientApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李文涛
 * date 2021/5/72:02 下午
 * @title: PatientService
 */
@RestController
@Service
public class PatientService implements PatientApi {
    @Override
    public String getName(String name) {
        return "我是"+name;
    }
}
