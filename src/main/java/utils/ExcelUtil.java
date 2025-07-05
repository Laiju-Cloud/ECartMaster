package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
    private Workbook workbook;
    private Sheet sheet;
    
    public ExcelUtil(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetName);
    }
    
    public String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        return cell.getStringCellValue();
    }
    
    public int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }
    
    public void close() throws IOException {
        workbook.close();
    }
}