package com.example.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentWebController {
	@SuppressWarnings("static-access")
	@RequestMapping("/bean")
	public String nameSpringBoot(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("static-access")
		String username = request.getParameter("name") ;
		convertCSV.convert();
		String[] id=convertCSV.getText1();
		String[] name=convertCSV.getText2();
		String[] dep=convertCSV.getText3();
		String[] Class=convertCSV.getText4();
		int record=2;
//		for (int i=1;i<19;i++) {
//			if(username==name[i] ){
//				record=i;
//				break;
//			}
//		}
		String combine=id[record]+" "+dep[record]+" "+Class[record];
		combine=new String(combine.getBytes(),"UTF-8");
		return combine;
	}
	@RequestMapping("/name")
	public String Get(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{ 
			String username = request.getParameter("name") ;
		return "hello"+username;
	}

}
