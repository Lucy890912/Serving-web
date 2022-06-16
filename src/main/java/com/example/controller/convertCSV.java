package com.example.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class convertCSV {
	public	String[] text1=new String[19];
	public	String[] text2=new String[19];	
	public	String[] text3=new String[19];
	public	String[] text4=new String[19];	
	
	public String[] getText1() {
		return text1;
	}
	public String[] getText2() {
		return text2;
	}
	public String[] getText3() {
		return text3;
	}
	public String[] getText4() {
		return text4;
	}
	public void convert() {
		String line = "";
	    final String delimiter = ",";
	    try
	    {
	        String filePath = "data_stu.csv";
	        FileReader fileReader = new FileReader(filePath);
	        int i=0;
	        BufferedReader reader = new BufferedReader(fileReader);
	        while ((line = reader.readLine()) != null)   //loops through every line until null found
	        {
	        	String[] token = line.split(delimiter);// separate every token by comma
	        	this.text1[i]=token[0];
	            this.text2[i]=token[1];
	            this.text3[i]=token[2];
	            this.text4[i]=token[3];
	            System.out.println(text1[i]+" "+text2[i]+" "+text3[i]+" "+text4[i]);
	            i++;
	         }
	            reader.close();
	        }
	        catch (IOException e){
	            e.printStackTrace();
	        }
	}
}		