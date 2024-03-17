package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
	public static String ExcelSheet(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
		String ExcelPath = System.getProperty("user.dir")+"\\MasterParameterization\\BDDmaster.xlsx";
		FileInputStream ExcelFile = new FileInputStream(ExcelPath);
		String ExcelSheet = WorkbookFactory.create(ExcelFile).getSheet("Test data").getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		return ExcelSheet;
	}
	
	public static String PropertyFile(String Key) throws IOException
	{
		Properties Property = new Properties();
		String PropertyPath = System.getProperty("user.dir")+"\\Parameterization\\BDDmaster.properties";
		FileInputStream PropertyFile = new FileInputStream(PropertyPath);
		Property.load(PropertyFile);
		String Value = Property.getProperty(Key);
		return Value;
	}
	

}
