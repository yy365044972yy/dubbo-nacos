package com.clinic.doctor.service;

import com.clinic.doctor.service.api.TestDoctorApi;
import com.clinic.patient.service.api.PatientApi;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李文涛
 * date 2021/5/711:55 上午
 * @title: TestDoctorService
 */
@RestController
@Service
public class TestDoctorService implements TestDoctorApi {

    @Reference
    private PatientApi patientApi;

    @Override
    public String textDemo(String name) {
        String helloName = patientApi.getName(name);
        return helloName;
    }
}
