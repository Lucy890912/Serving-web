package com.example.controller;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentWebController {
	
	@RequestMapping("/bean")
	public String nameSpringBoot(HttpServletRequest request,HttpServletResponse response,
			@RequestBody convertCSV requestBean) throws ServletException, IOException {
		String[] id=requestBean.getText1();
		String[] name=requestBean.getText2();
		String[] dep=requestBean.getText3();
		String[] Class=requestBean.getText4();
		int record=-1;
		for (int i=0;i<19;i++) {
			if(doPost(request,response)==name[i] ){
				record=i;
				break;
			}
		}
		String reply=id[record]+" "+dep[record]+" "+Class[record];
		return "11";
	}
	
	public String doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{ 
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8"); 
			String username=request.getParameter("name") ;
		return username;
	}
	
//	@RequestMapping("/get")
//	public void Get(HttpServletRequest request,HttpServletResponse response,
//			@RequestBody convertCSV requestBean) throws IOException {
//		PrintWriter writer=response.getWriter();
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
//		String username=request.getParameter("name") ;
//		String[] id=requestBean.getText1();
//		String[] name=requestBean.getText2();
//		String[] dep=requestBean.getText3();
//		String[] Class=requestBean.getText4();
//		int record=-1;
//		for (int i=0;i<19;i++) {
//			if(username==name[i] ){
//				record=i;
//				break;
//			}
//		}
//		
//		writer.println(id[record]+" "+dep[record]+" "+Class[record]);
//		writer.println(11);
//	}
	@RequestMapping("/Helloget")
	public class HelloGet extends HttpServlet{
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			req.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			PrintWriter out = res.getWriter();
			String username=req.getParameter("name") ;
			out.println("Hello");
		}
	}
}
