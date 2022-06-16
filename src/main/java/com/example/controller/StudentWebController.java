package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bean.StudentBean;


@RestController
public class StudentWebController {
	@RequestMapping("/bean")
	public String nameSpringBoot(HttpServletRequest request,
				@RequestBody StudentBean requestBean) {
		return  requestBean.getName();
	}

}
