package BasicWeb;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        FileInputStream file = new FileInputStream("D:\\Java automation practice\\Exceldata-1.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("Sheet1"); // Providing sheet name
        // XSSFSheet sheet = workbook.getSheetAt(0); // Providing sheet name

        int rowcount = sheet.getLastRowNum(); // returns row count
    
        int colcount = sheet.getRow(0).getLastCellNum(); // returns col/cell count
        
        for (int i = 0; i < rowcount; i++) {

            XSSFRow currentrow = sheet.getRow(i); // Focused on current row

            for (int j = 0; j < colcount; j++) {
                String value = currentrow.getCell(j).toString(); // read the value from the cell
                System.out.print("   " +value);
            }
            System.out.println();
        }

    }
}
