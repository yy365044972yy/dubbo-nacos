package com.clinic.patient.service.api;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 李文涛
 * date 2021/5/72:01 下午
 * @title: PatientApi
 */
public interface PatientApi {
    @PostMapping("/getName")
    String getName(String name);
}
