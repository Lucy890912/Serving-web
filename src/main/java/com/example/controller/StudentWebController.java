package com.example.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentWebController {
	
	@RequestMapping("/bean")
	public void nameSpringBoot(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		convert(doPost(request,response));
	}
	
	protected String doPost(HttpServletRequest request,	HttpServletResponse response)
			throws ServletException,IOException{ 
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8"); 
			String username=request.getParameter("user") ;
		return username;
	}
	private void convert(String name) {
		String line = "";
        final String delimiter = ",";
        String[] text1=new String[19];
        String[] text2=new String[19];
        String[] text3=new String[19];
        String[] text4=new String[19];
        try
        {
            String filePath = "data_stu.csv";
            FileReader fileReader = new FileReader(filePath);
            int i=0;
            BufferedReader reader = new BufferedReader(fileReader);
            while ((line = reader.readLine()) != null)   //loops through every line until null found
            {
               String[] token = line.split(delimiter);// separate every token by comma
               text1[i]=token[0];
               text2[i]=token[1];
               text3[i]=token[2];
               text4[i]=token[3];
               i++;
            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        for(int i=0;i<19;i++) {
        	if(name==text2[i]) {
        		System.out.println(text1[i]+""+text3[i]+""+text4[i]);
        	}
        }
	}
}
