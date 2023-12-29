package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	//public static void main(String[]args) throws IOException {
	//	getproperty("browser");
	//	ReadDataFromExcel();
	//}

	public static String getproperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream(FrameWorkConstants.EXCEL_PATH);
		
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
		
	}
//program to read data from cell
	
	public static String ReadDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(FrameWorkConstants.EXCEL_PATH);
		
		//Workbook book = WorkbookFactory.create(fis);
		
		//Sheet sheet = book.getSheet("Register");
		
		//Row row = sheet.getRow(4);
		//System.out.println(row.getCell(4));
		
		return WorkbookFactory.create(fis).getSheet("Register").getRow(3).getCell(4).toString();
		
		
		
		
	}
	//Alternative way to read data from cell
	public static void main(String[] args) throws IOException {
		//System.out.println(ReadDataFromExcel("Register",2,4));
	}
	
	//program to read data from excel row by row
	public static String[][] ReadDataFromExcel(String Register) throws EncryptedDocumentException, IOException {
       FileInputStream fis=new FileInputStream(FrameWorkConstants.EXCEL_PATH);
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Register");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String [][] data=new String[rowCount-1][cellCount-1];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
			
		}
		
		return data;
	}
	
		
	}

