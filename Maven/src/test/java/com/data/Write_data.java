package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	private static void Write() throws IOException {
		File f = new File("C:\\Users\\admin\\Desktop\\Keerthi.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.createSheet("Login1").createRow(0).createCell(0).setCellValue("ID");
		wb.getSheet("Login1").getRow(0).createCell(1).setCellValue("Passcode");
		wb.getSheet("Login1").createRow(1).createCell(0).setCellValue("012");
		wb.getSheet("Login1").getRow(1).createCell(1).setCellValue("abc");
		wb.getSheet("Login1").createRow(2).createCell(0).setCellValue("345");
		wb.getSheet("Login1").getRow(2).createCell(1).setCellValue("def");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("success");
		
	}

	
	public static void main(String[] args)throws IOException {
		Write();
	}
}
