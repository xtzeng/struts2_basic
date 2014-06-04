package com.xiaoti.javacsv;

import java.nio.charset.Charset;
import java.util.ArrayList;

import com.csvreader.CsvReader;

public class Test {

	/** 
	* 读取CSV文件 
	*/  
	public void  readeCsv(){  
	    try {      
	           
	        ArrayList<String[]> csvList = new ArrayList<String[]>(); //用来保存数据  
	        String csvFilePath = "c:/test.csv";  
	         CsvReader reader = new CsvReader(csvFilePath,',',Charset.forName("SJIS"));    //一般用这编码读就可以了      
	           
	         reader.readHeaders(); // 跳过表头   如果需要表头的话，不要写这句。  
	           
	         while(reader.readRecord()){ //逐行读入除表头的数据      
	             csvList.add(reader.getValues());  
	         }              
	         reader.close();  
	           
	         for(int row=0;row<csvList.size();row++){  
	               
	             String  cell = csvList.get(row)[0]; //取得第row行第0列的数据  
	             System.out.println(cell);  
	               
	         }  
	           
	           
	    }catch(Exception ex){  
	        System.out.println(ex);  
	    }  
	}  
	
	public static void main(String[] args) {
		new Test().readeCsv();
	}
}
