package com.unitedcoder.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadDemo1 {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\countries.xlsx";
        FileInputStream inputStream=new FileInputStream(filePath);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);
        //using for loop
        int rowCount=sheet.getLastRowNum();
        int colCount=sheet.getRow(1).getLastCellNum();

        for(int r=0;r<=rowCount;r++){
            XSSFRow rows=sheet.getRow(r);
            for(int cell=0;cell<colCount;cell++){
                XSSFCell cell1=rows.getCell(cell);
                switch (cell1.getCellType()){
                    case STRING:
                        System.out.print(cell1.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell1.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell1.getBooleanCellValue());
                        break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}
