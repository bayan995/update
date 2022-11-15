import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Remove {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Desktop\\my new driver\\chromedriver.exe");
		

        WebDriver driver= new ChromeDriver();

        driver.get("http://127.0.0.1:5500/index.html");
        
        
    
        
        
       
        List <WebElement> thestudents = driver.findElements(By.tagName("option"));
      // int theTotalNumberOfStudent = thestudents.size();
       // System.out.println(theTotalNumberOfStudent+"the orginal number");
        
      //  int howManyItems =1;
    //    System.out.println(howManyItems+"this is the number of item i want removed");
        
      		  for(int i=0 ;i <thestudents.size() ;i++) {
      			  
      			  if(i%2==0) {
      				  thestudents.get(i).click();
      			  
        driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
        
      		  }
      			  else{
      				System.out.println("delet"+thestudents.get(i).getText());  
      				
      			  }
      			  
      			  }
      		//  List<WebElement> theStudentAfterRemove = driver.findElements(By.tagName("option"));
      		  
        
        //Date currentDate = new Date();
        
      //  String TheAcctualDate = currentDate.toString().replace(":", "-");
        
        //TakesScreenshot src = ((TakesScreenshot) driver);
        
       // File SrcFile =src.getScreenshotAs(OutputType.FILE);
        
        //File Dest = new File(".//mypictures/"+TheAcctualDate+".png");
        //FileUtils.copyFile (SrcFile,Dest);
      	//int	acctualNumber=  theStudentAfterRemove.size();
      	
          //System.out.println(acctualNumber+"this is the new acctual number");
          
      	//int	  expectedItem =theTotalNumberOfStudent-howManyItems;
      	
       //System.out.println(expectedItem+"this is the number i have expected");
     //   Assert.assertEquals(acctualNumber ,expectedItem);
      
	}

	}


