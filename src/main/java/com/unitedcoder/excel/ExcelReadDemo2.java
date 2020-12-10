package com.unitedcoder.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReadDemo2 {
    public List<String> getData(String productName) throws IOException {
        String filePath="C:\\Users\\Aynigar\\projects\\SeleniumJavaTests\\testdata\\productInfo.xlsx";
        FileInputStream inputStream=new FileInputStream(filePath);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        int sheets=workbook.getNumberOfSheets();
        List<String> productInfo=new ArrayList<>();
        for(int i=0;i<sheets;i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("Product-Info")){
                XSSFSheet sheet=workbook.getSheetAt(i);
                Iterator<Row> rows=sheet.iterator();
                Row firstRow=rows.next();
                Iterator<Cell> cell=firstRow.cellIterator();
                while (rows.hasNext()){
                    Row r=rows.next();
                    if(r.getCell(0).getStringCellValue().equalsIgnoreCase(productName)){
                        Iterator<Cell> c=r.cellIterator();
                        while (c.hasNext()){
                            Cell c1=c.next();
                            if(c1.getCellTypeEnum()== CellType.STRING){
                                productInfo.add(c1.getStringCellValue());
                            }else{
                                productInfo.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
                            }
                        }
                    }
                }
            }
        }
        return productInfo;
    }

    public static void main(String[] args) throws IOException {
        ExcelReadDemo2 readDemo2=new ExcelReadDemo2();
        List<String> productList=readDemo2.getData("Selenium Book");
        System.out.println(productList.toString());
    }
}
