package com.example.springboot.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaSourceUtil {
	static long normalLine = 0; //正常的行数
	static long comentLine = 0; //注释行数
	static long whiteLine = 0;  //空行数
	static long countLine = 0;  //总行数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//代码文件路径
		File file = new File("E:\\workspace\\quickpay-cashier\\quickPay-service\\src\\main\\java");
//		File file = new File("F:\\MyEclipe 2015\\Workplace\\Java\\src\\com\\java\\week05");
		//得到当前路径下的子目录
		File [] files = file.listFiles();
		tree(file);
		countLine = normalLine +comentLine + whiteLine;
		System.out.println("正常代码:"+normalLine);
		System.out.println("注释代码:"+comentLine);
		System.out.println("空行数:"+whiteLine);
		System.out.println("总行数:"+countLine);
	}
	
	private static void count(File child) {
		FileReader fileReader = null;
		BufferedReader br = null;
		boolean coments = false;
		try {
			fileReader = new FileReader(child);
		    br = new BufferedReader(fileReader);
		    String line = "";
		    while((line=br.readLine())!=null) {
		    	/*
		    	 *  去掉开头和末尾的空格行  防止出现
		    	 *	 注释开始前存在空格而导致没有计入注释行的问题
		    	 *	 注释结尾前存在空格而导致不匹配的问题
		    	 */
		    	line = line.trim();   
		    	if(line.matches("^[\\s&&[^\\n]]*$")) {
		    		whiteLine++;
		    	} else if(line.startsWith("/*")&&!line.endsWith("*/")) {
		    		comentLine++;
		    		coments = true;
		    	} else if(true == coments ) {
		    		comentLine++;
		    		if(line.endsWith("*/"))
		    			coments = false;
		    	}else if(line.startsWith("/*")&&line.endsWith("*/")) {   // 一行以/*开头。以*/结尾 
		    		comentLine++;
		    	} 
		    	else if(line.startsWith("//")) {
		    		comentLine++;
		    	}
		    	else 
					normalLine++;
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null) {
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * 递归遍历所有java文件
	 */
	public static void tree(File file) {
		File[] childFiles = file.listFiles();
		for(File child : childFiles) {
			if(child.getName().matches(".*\\.java$")) {
				count(child);
				}
			if(child.isDirectory()) {
			   tree(child);
			}
		}
	}
	
}
 