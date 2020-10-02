package marathishaadi.com;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * it's used to read data from Excel-workBok, based on user argument..
 * 
 * @param SheetName
 * @param rowNum
 * @param colNum
 * @return data
 */
public class ExcelData {
	
	XSSFWorkbook workbook;
    XSSFSheet Data;
    
public ExcelData(String excellpath)
{
	try {
		File src=new File("./data/marathishadi.xlsx");   
		// Load the file.
		FileInputStream fis = new FileInputStream(src);
		// Load he workbook.
		workbook = new XSSFWorkbook(fis);
		// Load the sheet in which data is stored.
		Data=workbook.getSheetAt(0);
			}catch (Exception e)
			{
				System.out.println(e.getMessage());
			}}

public String getData(String SheetName,int rowNum,int colNum)
{
	String data=Data.getRow(rowNum).getCell(colNum).getStringCellValue();
	return data;
	
	}
}
