package com.unitedcoder.excel;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {
    //write a method to read from excell cells
    public String readExcellCell(String fileName,String sheetName,int rowNumber,int cellNumber){
        FileInputStream fileInputStream=null;
        try {
           fileInputStream=new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook=null;
        try {
            workbook=new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        XSSFRow   row=sheet.getRow(rowNumber);
        String cellValue=null;
        if(row==null){
            System.out.println("Empty Row ,no data in the excell sheet");
        }else{
            XSSFCell cell=row.getCell(cellNumber);
            CellType cellType=cell.getCellType();
            switch (cellType){
                case NUMERIC:
                    cellValue=String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;
            }
        }
        return cellValue;
    }
}
