package com.example.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentWebController {
	
	@RequestMapping("/bean")
	public void nameSpringBoot(HttpServletRequest request,HttpServletResponse response,
			@RequestBody convertCSV requestBean) throws ServletException, IOException {
		String[] id=requestBean.getText1();
		String[] name=requestBean.getText2();
		String[] dep=requestBean.getText2();
		String[] Class=requestBean.getText2();
		int record=-1;
		for (int i=0;i<19;i++) {
			if(doPost(request,response)==name[i] ){
				record=i;
				break;
			}
		}
		System.out.println(id[record]+" "+dep[record]+" "+Class[record]);

	}
	
	protected String doPost(HttpServletRequest request,	HttpServletResponse response)
			throws ServletException,IOException{ 
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8"); 
			String username=request.getParameter("user") ;
		return username;
	}

}
