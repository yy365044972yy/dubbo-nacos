package com.clinic.doctor.service.api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 李文涛
 * @title: TextDoctor
 * date 2021/5/711:15 上午
 */

public interface TestDoctorApi {

    @GetMapping("/textDemo")
    String textDemo(String name);
}
