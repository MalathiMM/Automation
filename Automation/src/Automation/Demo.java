package Automation;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

//import jxl.write.Label;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
//import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {



	public static void main(String[] args) throws BiffException, IOException, InterruptedException, WriteException {	

		Demo obj = new Demo();
		obj.Excel();
	}


	public void Excel() throws BiffException, IOException, InterruptedException, WriteException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MALATHI.M\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe" );
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://akamai.markethub.shell.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("userId")).sendKeys("Malathi.m");
		driver.findElement(By.id("password")).sendKeys("Malathi@123");
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//li[@class='user manageUser']/a/img")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



		String Filepath = "C:\\Apps\\Testdata.xls";

		FileInputStream fs = new FileInputStream(Filepath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");  

		/*Write excel
		String Filepath1= "C:\\Apps\\Testdata1.xls";

		FileOutputStream fs1 = new FileOutputStream(Filepath1);
		 WritableWorkbook wb1 = Workbook.createWorkbook(fs1);
		 WritableSheet ws = wb1.createSheet("Soldto",0);*/

		//span[contains(text(),Data)]/ancestor::tr/td/div/input



		sh.getRows();
		sh.getColumns();

		System.out.println(("Inside xcel"));
		int row, col;

		for (row = 0; row <1; row++)

		{
			
			for (col = 0; col <1; col++)

			{
				String Data=sh.getCell(col, row).getContents();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(Data);
				driver.findElement(By.id("userid")).sendKeys(Data);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


				WebElement Fname = driver.findElement(By.xpath("//input[@id='userid']")); 
				System.out.println(Fname.getText());

				WebElement e1=driver.findElement(By.xpath("//input[@id='userid']"));

				System.out.println(e1.getAttribute("value"));
				driver.findElement(By.id("searchRegisteredUser")).click();
				System.out.println("we r here 1");
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


				System.out.println("we r here");
				
				new WebDriverWait(driver, 50);
				//driver.findElement(By.xpath("//span[contains(text(),'Perf_DFOA_US')]/ancestor::tr/td/div/input[@id='checkbox1']")).click();
				

				//driver.findElement(By.xpath("//*[@id='userList']/tbody/tr[1]/td[1]/div/input")).click();
				
				driver.findElement(By.xpath("//table[@id='userList']//input[@id='checkbox1']")).click();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				System.out.println("we r here 123");

				driver.findElement(By.id("manageUserEdit")).click();
				
				WebElement e2=driver.findElement(By.xpath("//span[@id='customerNumber']"));

				System.out.println(e2.getText());
				
				driver.findElement(By.xpath("//div[@class='inputBox']//button[contains(text(),'Previous')]")).click();
				driver.findElement(By.id("userid")).clear();
			





				/*String Write=Data;
				Label ob=new Label(0,0,Write);
				ws.addCell(ob);*/



			}

		}
		// wb1.write();
		//wb.close();
		System.out.println("completed");

	}
}

