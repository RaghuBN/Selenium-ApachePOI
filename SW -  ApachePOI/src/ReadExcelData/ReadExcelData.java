package ReadExcelData;

import library.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args)
	{
		ExcelDataConfig excel = new ExcelDataConfig("D:\\LTI Selenium Samples\\Apache TestData\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
	}
}
