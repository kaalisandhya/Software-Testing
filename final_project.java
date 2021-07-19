package Seleniumweb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
public class final_project {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver","C:\\Users\\win 10\\Desktop\\Selenium jar\\geckodriver.exe");
			WebDriver w=new FirefoxDriver(); 
			Thread.sleep(2000);
			//2.open url
			w.get("http://demo.guru99.com/test/newtours/index.php");
			//3.Enter username data is test
			w.findElement(By.name("userName")).sendKeys("test");
			//4.Enter password data is test
			w.findElement(By.name("password")).sendKeys("test");
			//5. click on login button
			w.findElement(By.name("submit")).click();
			System.out.println("webpage is working");
			System.out.println(w.getCurrentUrl());
			System.out.println(w.getTitle());
			w.navigate().back();
			Thread.sleep(2000);		
			
			//signon
			w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
			w.findElement(By.name("userName")).sendKeys("1234");
			w.findElement(By.name("password")).sendKeys("1234");
			w.findElement(By.name("submit")).click();
			System.out.println("signon");
			w.navigate().back();
			w.navigate().back();
			
			
			//Register
			w.findElement(By.linkText("REGISTER")).click();
			Thread.sleep(4000);
			w.findElement(By.linkText("REGISTER")).click();
			w.findElement(By.name("firstName")).sendKeys("kaali");
			w.findElement(By.name("lastName")).sendKeys("sandhya");
			w.findElement(By.name("phone")).sendKeys("1234546578");
			w.findElement(By.name("userName")).sendKeys("kaalisandhya@gmail.com");
			w.findElement(By.name("address1")).sendKeys("Ananthaiah gari palli");
			w.findElement(By.name("city")).sendKeys("kadapa");
			w.findElement(By.name("state")).sendKeys("andhra pradesh");
			w.findElement(By.name("postalCode")).sendKeys("516107");
					Select s=new Select(w.findElement(By.name("country")));
					s.selectByIndex(13);
			s.selectByValue("AUSTRIA");
			s.selectByVisibleText("AUSTRIA");
			w.findElement(By.name("email")).sendKeys("kaalisandhya@gmail.com");
			w.findElement(By.name("password")).sendKeys("1111112");
			w.findElement(By.name("confirmPassword")).sendKeys("1111112");
			w.findElement(By.name("submit")).click();
			w.navigate().back();
			System.out.println("Register");
			Thread.sleep(4000);	
			w.navigate().back();
			
			//support
			w.findElement(By.linkText("SUPPORT")).click();
			Thread.sleep(2000);
			w.navigate().back();
			System.out.println("support");
			Thread.sleep(2000);	
			
			//contact
			w.findElement(By.linkText("CONTACT")).click();
			Thread.sleep(1000);
			w.navigate().back();
			System.out.println("contact");
			Thread.sleep(1000);	
			
			
			//home page
			w.findElement(By.linkText("Home")).click();
		    Thread.sleep(2000);
				System.out.println("home");
	      	
	      	
			//Flights
			w.findElement(By.linkText("Flights")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
			System.out.println("radio button");
			Select s0=new Select(w.findElement(By.name("passCount")));
			s0.selectByIndex(0);
			Select s1=new Select(w.findElement(By.name("fromPort")));
			s1.selectByIndex(2);
			Select s2=new Select(w.findElement(By.name("fromMonth")));
			s2.selectByIndex(5);
			Select s3=new Select(w.findElement(By.name("fromDay")));
			s3.selectByIndex(14);
			Select s4=new Select(w.findElement(By.name("toPort")));
			s4.selectByIndex(5);
			Select s5=new Select(w.findElement(By.name("toMonth")));
			s5.selectByIndex(6);
			Select s6=new Select(w.findElement(By.name("toDay")));
			s6.selectByIndex(19);
			w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
			Select s7=new Select(w.findElement(By.name("airline")));
			s7.selectByIndex(2);
			w.findElement(By.name("findFlights")).click();
			w.navigate().back();
			System.out.println("flights");
			Thread.sleep(2000);	
			w.navigate().back();
			
			
			//hotels
			w.findElement(By.linkText("Hotels")).click();
			Thread.sleep(2000);
			w.navigate().back();
			System.out.println("hotels");
			Thread.sleep(2000);	
			
			
			//car rentals
			w.findElement(By.linkText("Car Rentals")).click();
			Thread.sleep(2000);
			w.navigate().back();
			System.out.println("car rentals");
			Thread.sleep(2000);	
			
			
			//cruises
			w.findElement(By.linkText("Cruises")).click();
			Thread.sleep(2000);
			System.out.println("Cruises");
			//Thread.sleep(2000);
			
			
			
			//Destinations
			w.findElement(By.linkText("Destinations")).click();
			Thread.sleep(2000);
			w.navigate().back();
			System.out.println("Destinations");
			Thread.sleep(2000);	
			
			//vacations
			w.findElement(By.linkText("Vacations")).click();
			Thread.sleep(2000);
			w.navigate().back();
			System.out.println("vacations");
			Thread.sleep(2000);	
			
			//selenium 
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//flash movie demo
			w.findElement(By.linkText("Flash Movie Demo")).click();
			//w.findElement(By.name("Play")).click();
		    Thread.sleep(1000);
			w.navigate().back();
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//radio & check demo
			w.findElement(By.linkText("Radio & Checkbox Demo")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//table demo
			w.findElement(By.linkText("Table Demo")).click();
			Thread.sleep(2000);
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//accessing link
			w.findElement(By.linkText("Accessing Link")).click();
			w.findElement(By.linkText("click here")).click();
			Thread.sleep(2000);
			w.navigate().back();
			w.navigate().back();
				
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//ajAX DEMO
			w.findElement(By.linkText("Ajax Demo")).click();
			Thread.sleep(2000);
			w.findElement(By.name("name")).click();
			w.findElement(By.id("buttoncheck")).click();
			Thread.sleep(2000);
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//Inside & Outside Block Level Tag
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[6]/a")).click();
			w.findElement(By.xpath("/html/body/p/a")).click();
			Thread.sleep(2000);
			w.navigate().back();
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//Delete Customer Form
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[7]/a")).click();
			w.findElement(By.name("cusid")).sendKeys("123");
			w.findElement(By.name("submit")).click();
			//Thread.sleep(2000);
			Thread.sleep(6000);
			Alert A1=w.switchTo().alert();
			System.out.println(A1.getText());
			A1.accept();
			//w.navigate().back();
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//yahoo
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[8]/a")).click();
			Thread.sleep(2000);
			//w.findElement(By.xpath("//*[@id=\"messenger-download\"]")).click();
			w.navigate().back();
			
			

			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//tooltip
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[9]/a")).click();
			Thread.sleep(2000);
		//	w.findElement(By.xpath("//*[@id=\"download_now\"]")).click();
			w.navigate().back();
			
			

			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//fileupload
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[10]/a")).click();
			w.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\win 10\\Desktop\\New.txt");
			Thread.sleep(2000);
			w.findElement(By.name("send")).click();
			Thread.sleep(2000);
			w.navigate().back();
			w.navigate().back();
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(4000);
			//login
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[11]/a")).click();
			Thread.sleep(4000);
			w.findElement(By.name("email")).sendKeys("kaalisandhya@gmail.com");
			w.findElement(By.name("passwd")).sendKeys("1111112");
			w.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
			w.navigate().back();
			w.navigate().back();
			

			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//social icon
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[12]/a")).click();
			Thread.sleep(2000);
			w.navigate().back();
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//selenium auto it
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[13]/a")).click();
			Thread.sleep(2000);
			w.manage().window().maximize();
			JavascriptExecutor js =(JavascriptExecutor) w;
			js.executeScript("window.scrollTo(0,2000)");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-2000)");
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//selenium IDE test
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[14]/a")).click();
			Thread.sleep(2000);
			w.navigate().back();
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//guru 99 demo page
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[15]/a")).click();
			Thread.sleep(2000);
			w.navigate().back();
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//scrollbar 
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[16]/a")).click();
			Thread.sleep(2000);
			w.manage().window().maximize();
			WebElement Element = w.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div/div[6]/div/div/div/div/div[1]/div/div/a/i"));
			JavascriptExecutor js1 =(JavascriptExecutor) w;
			js1.executeScript("arguments[0].scrollIntoView();",Element);
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//fileupload using sikuli demo
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[17]/a")).click();
			w.findElement(By.xpath("//*[@id=\"photoimg\"]")).sendKeys("C:\\Users\\win 10\\Desktop\\New.txt");
			Thread.sleep(2000);
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//cookies handling demo
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[18]/a")).click();
			Thread.sleep(4000);
			w.findElement(By.name("username")).sendKeys("kaalisandhya@gmail.com");
			w.findElement(By.name("password")).sendKeys("1111112");
			w.findElement(By.name("submit")).click();
			Thread.sleep(3000);
			w.navigate().back();
			w.navigate().back();
			
			
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//Drag and drop action
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[19]/a")).click();
			Thread.sleep(2000);
			WebElement Drag=w.findElement(By.partialLinkText("BANK"));
			WebElement Drop=w.findElement(By.xpath("//*[@id=\"bank\"]/li"));
			Actions act=new Actions(w);
			act.dragAndDrop(Drag, Drop).build().perform();
			
			
			WebElement Drag1=w.findElement(By.partialLinkText("5000"));
			WebElement Drop1=w.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
			Actions act1=new Actions(w);
			act1.dragAndDrop(Drag1, Drop1).build().perform();
		
			
			WebElement Drag2=w.findElement(By.partialLinkText("SALES"));
			WebElement Drop2=w.findElement(By.xpath("//*[@id=\"loan\"]/li"));
			Actions act2=new Actions(w);
			act2.dragAndDrop(Drag2, Drop2).build().perform();
			
			
			WebElement Drag3=w.findElement(By.partialLinkText("5000"));
			WebElement Drop3=w.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
			Actions act3=new Actions(w);
			act3.dragAndDrop(Drag3, Drop3).build().perform();
			Thread.sleep(3000);
			w.navigate().back();
			
			
					
			//selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			//selenium datepicker demo
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[20]/a")).click();
			Thread.sleep(2000);
			w.findElement(By.name("bdaytime")).click();
			w.navigate().back();
			w.navigate().back();
			
					
				
			//insurance
			w.findElement(By.partialLinkText("Insurance Project")).click();
			Thread.sleep(4000);
			w.findElement(By.name("email")).sendKeys("kaalisandhya@gmail.com");
			w.findElement(By.name("password")).sendKeys("1111112");
			w.findElement(By.name("submit")).click();
			w.navigate().back();
			w.navigate().back();
			
			
			
			//agile project
			w.findElement(By.partialLinkText("Agile Project")).click();
			Thread.sleep(3000);
			w.findElement(By.name("uid")).sendKeys("1234");
			w.findElement(By.name("password")).sendKeys("1111112");
			Thread.sleep(3000);
			w.findElement(By.name("btnReset")).click();
			w.navigate().back();
			
			
			//bank project
			w.findElement(By.partialLinkText("Bank Project")).click();
			Thread.sleep(3000);
			w.findElement(By.name("uid")).sendKeys("1234");
			w.findElement(By.name("password")).sendKeys("1111112");
			Thread.sleep(3000);
			w.findElement(By.name("btnReset")).click();
			w.navigate().back();
			w.navigate().back();
			
			//security project
			w.findElement(By.partialLinkText("Security Project")).click();
			Thread.sleep(3000);
			w.findElement(By.name("uid")).sendKeys("1234");
			w.findElement(By.name("password")).sendKeys("1111112");
			Thread.sleep(3000);
			w.findElement(By.name("btnReset")).click();
			w.navigate().back();
			w.navigate().back();
			
			//telecom project
			w.findElement(By.partialLinkText("Telecom Project")).click();
			Thread.sleep(3000);
			w.navigate().back();
			
			//payment gateway project
			w.findElement(By.partialLinkText("Payment Gateway Project")).click();
			Thread.sleep(3000);
			w.navigate().back();
			
			
			//newtours
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[10]/a")).click();
			Thread.sleep(2000);
			
			
			//SEO
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
			Thread.sleep(3000);
			w.findElement(By.linkText("Page-1")).click();
			Thread.sleep(3000);
			w.navigate().back();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
			Thread.sleep(3000);
			w.findElement(By.linkText("Page-2")).click();
			Thread.sleep(3000);
			w.navigate().back();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
			Thread.sleep(3000);
			w.findElement(By.linkText("Page-3")).click();
			Thread.sleep(3000);
			w.navigate().back();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
			Thread.sleep(3000);
			w.findElement(By.linkText("Page-4")).click();
			Thread.sleep(3000);
			w.navigate().back();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
			Thread.sleep(3000);
			w.findElement(By.linkText("Page-5")).click();
			Thread.sleep(3000);
			w.navigate().back();
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
			Thread.sleep(3000);
			w.findElement(By.linkText("Page-6")).click();
			Thread.sleep(3000);
			w.navigate().back();

		}

	}



