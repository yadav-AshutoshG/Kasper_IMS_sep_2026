//package xlsxData;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//
//public class ReadingExcel {
//	
//public String getDataFromExcel(String[] args) throws IOException{
//	
//	String excelFilePath="/IMS/src/test/resources/single_products.xlsx";
//	FileInputStream inputstream = new FileInputStream(excelFilePath);
//
//	XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
//	XSSFSheet sheet = workbook.getSheetAt(0);  //XSSFSheet sheet = workbook.getSheetAt("Sheet1");
//	
//	
//	////Using For Loop
//	
//	
//	int rows = sheet.getLastRowNum();
//	int clomns = sheet.getRow(1).getLastCellNum();
//	
//	
//	
////	Row Loop
//	for(int r=0; r<=rows;r++)
//	{
//		XSSFRow row=sheet.getRow(r);  //0
//		
//		
////		Colomn Loop
//		for(int c=0;c<clomns;c++) 
//		{
//			XSSFCell cell = row.getCell(c);
//			
//			switch(cell.getCellType())
//			{
//			case STRING:  System.out.print(cell.getStringCellValue());break;
//			case NUMERIC: System.out.print(cell.getNumericCellValue());break;
//			case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
//			}
//			System.out.println("  |  ");
//		
//	}
//	
//		
//		System.out.println();
//}
//
//
//}
//}
