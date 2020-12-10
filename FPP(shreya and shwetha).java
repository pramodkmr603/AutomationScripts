package Selenium_testng;

import org.testng.annotations.Test;

import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class FPP {
	WebDriver d;
	String url="https://specsqaap.pg.com/login";
	SoftAssert sassert=new SoftAssert();
  @Test
  public void attributes() throws Exception{
	    //attributes part
	    d.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		d.findElement(By.id("username")).sendKeys("Anywheretwo.im");
		d.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		d.findElement(By.id("password")).sendKeys("Sa061920");
		d.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		d.findElement(By.id("loginButton")).click();
		d.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		d.get(url);
		Thread.sleep(4000);
		d.findElement(By.id("searchBox")).sendKeys("FPP");
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[1]/td[1]/a/span")).click();
		List<String>attribute=new ArrayList<String>();
		attribute.add("Description");
		attribute.add("Title");
		attribute.add("CO");
		attribute.add("Originator");
		attribute.add("Last Update User");
		attribute.add("Product Form");
		attribute.add("Type");
		attribute.add("Specification Sub Type");
		attribute.add("Revision");
		attribute.add("Originated");
		attribute.add("Phase");
		attribute.add("Owner");
		attribute.add("Segment");
		attribute.add("Structured Release Criteria Required");
		attribute.add("Release Date");
		attribute.add("Effective Date");
		attribute.add("Expiration Date");
		attribute.add("Previous Revision Obsolete Date");
		attribute.add("Manufacturing Status");
		attribute.add("Part Family");
		attribute.add("Reason for Change");
		attribute.add("Replaced Product Name (Phase Out)");
		attribute.add("Brand");
		attribute.add("Base Unit Of Measure");
		attribute.add("Retailer Publication Ready");
		attribute.add("W&D status");
		attribute.add("SAP BOM Base QTY");
		attribute.add("Other Names");
		attribute.add("Local Description");
		attribute.add("Marketing Size");
		attribute.add("Statistical Unit");
		attribute.add("Customization Type");
		attribute.add("Shipping Information");
		attribute.add("Labeling Information");
		attribute.add("Primary Packaging Type");
		attribute.add("Secondary Packaging Type");
		attribute.add("Packaging Size");
		attribute.add("Packaging Size UofM");
		attribute.add("Comments");
		attribute.add("Obsolete Date");
		attribute.add("Obsolete Comment");
		attribute.add("Classification");
		List<WebElement>l=d.findElements(By.id("pageheaders"));
		for(String s:attribute) {
			int count=0;
			for(WebElement w:l) {
				String s1=w.getText();
				if(s.equalsIgnoreCase(s1)) {
					sassert.assertEquals(s1, s);
					System.out.println(s+" is present on webpage");
					break;
				
				}
				else {
					count+=1;
					if(count>=l.size()) {
						System.out.println("Desc not in webpage");
						sassert.assertFalse(true);
					}
					
				continue;
				}
				
			}
		}
		 
		}
  @Test(dependsOnMethods = {"attributes"})
  public void storage_transport_labelling() throws Exception{
	  //storage,transportation labeling data
	  WebElement t=d.findElement(By.id("three"));
		List<WebElement>l=t.findElements(By.id("pageheaders"));
		List<String>attribute=new ArrayList<String>();
		attribute.add("Power Source:");
		attribute.add("Battery Type:");
		attribute.add("UN Number:");
		attribute.add("Hazard Class:");
		attribute.add("Proper Shipping Name:");
		attribute.add("Packing Group:");
		attribute.add("Storage Conditions:");
		attribute.add("Storage Temperature Limits °C:");
		attribute.add("Unique Formula Identifier:");
		attribute.add("Storage Humidity Limits -%:");
		
		for(String s:attribute) {
			int count=0;
			for(WebElement w:l) {
				String s1=w.getText();
				if(s.equalsIgnoreCase(s1)) {
					sassert.assertEquals(s1, s);
					System.out.println(s+" is present on webpage");
					break;
				
				}
				else {
					count+=1;
					if(count>=l.size()) {
						System.out.println("Desc not in webpage");
						sassert.assertFalse(true);
					}
					
				continue;
				}
				
			}
		}
  }
  
  @Test(dependsOnMethods = {"storage_transport_labelling"})
  public void warehouse_classification() throws Exception{
	  //warehouse classification
	  Thread.sleep(4000);
	  WebElement t=d.findElement(By.id("five"));
	  List<WebElement>l=t.findElements(By.id("pageheaders"));
	  List<String>attribute=new ArrayList<String>();
	  attribute.add("Warehousing Classification:");
	  attribute.add("Corrosive:");
	  for(String s:attribute) {
			int count=0;
			for(WebElement w:l) {
				String s1=w.getText();
				if(s.equalsIgnoreCase(s1)) {
					sassert.assertEquals(s1, s);
					System.out.println(s+" is present on webpage");
					break;
				
				}
				else {
					count+=1;
					if(count>=l.size()) {
						System.out.println("Desc not in webpage");
						sassert.assertFalse(true);
					}
					
				continue;
				}
				
			}
		}
  }
  
  @Test(dependsOnMethods = {"warehouse_classification"})
  public void ownership() throws Exception{
	  //ownership
	  WebElement w=d.findElement(By.id("thirtyone"));
		List<WebElement>l=w.findElements(By.id("pageheaders"));
		List<String>attributes=new ArrayList<String>();
		attributes.add("Originator:");
		attributes.add("Approvers:");
		attributes.add("Segment:");
		attributes.add("Last Update User:");
		attributes.add("Last Update Date:");
		for(WebElement e:l) {
			System.out.println(e.getText());
		}
		for(String s:attributes) {
			int count=0;
			for(WebElement e:l) {
				String s1=e.getText();
				if(s.equals(s1)) {
					sassert.assertEquals(s1, s);
				System.out.println(s+" present in the webpage");
				break;
				
			}
				else {
					count+=1;
					if(count>=l.size()) {
						System.out.println("Desc not in webpage");
						sassert.assertFalse(true);
					}
					continue;
				}
		}
		}
  }
  
  @Test(dependsOnMethods = {"ownership"})
  public void BoM_customer() throws Exception{
	  //BoM customer unit
	  WebElement table=d.findElement(By.id("ten"));
	  List<String>header=new ArrayList<String>();
	  header.add("Name(N) Rev(R)");
	  header.add("Chg");
	  header.add("F/N");
	  header.add("title");
	  header.add("Type");
	  header.add("Substitute Parts (SP) Alternate (Alt)");
	  header.add("Qty");
	  header.add("Base Unit of Measure");
	  header.add("EBOM Comments");
	  header.add("Release Date");
	  header.add("Phase (Pha) State(St)");
	  header.add("Ref Des(RD) On-Shelf Product Density(OSPD)");
	  header.add("Density Unit Of Measure(DUoM) Optional Components(OC)");
	  
	  List<String>body=new ArrayList<String>();
	  body.add("N:");
	  body.add("R");
	  body.add("Sp:");
	  body.add("Alt");
	  body.add("Pha:");
	  body.add("St:");
	  body.add("RD:");
	  body.add("OSPD:");
	  body.add("DUoM:");
	  body.add("OC:");
	  List<WebElement>rows=table.findElements(By.tagName("tr"));
	  System.out.println(rows.size());
	  List<String>actual_head=new ArrayList<String>();
	  for(int i=0;i<rows.size();i++) {
		  List<WebElement>head=rows.get(i).findElements(By.tagName("th"));
	  
	  for(WebElement h:head) {
		  String s=h.getText();
		  actual_head.add(s);
	  }
	  }
	  for(String s:header) {
		  int count=0;
		  for(String s1:actual_head) {
			  
			  if(s==s1) {
				  System.out.println(s+" present on the webtable as header");
				  sassert.assertEquals(s1, s);
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=actual_head.size()) {
					  sassert.assertFalse(true);
				  }
				  continue;
			  }
		  }
	  }
	  for(String s:body) {
		  int count=0;
		  List<WebElement>c=rows.get(1).findElements(By.tagName("td"));
		  for(WebElement col:c) {
			  List<WebElement>h=col.findElements(By.className("bomFontClass"));
			  for(WebElement he:h) {
				  String s1=he.getText();
				  if(s==s1) {
					  System.out.println(s+" present in the table body");
					  sassert.assertEquals(s1, s);
				  }
				  else {
					  count+=1;
					  if(count>=h.size()) {
						  System.out.println("Desc not in the webtable");
						  sassert.assertFalse(true);
					  }
				  }
			  }
		  }
	  }
	  
	  
  }
  
  @Test(dependsOnMethods = {"BoM_customer"})
  public void packaging_unit() throws Exception{
	  //Packaging unit
	  Thread.sleep(4000);
	  WebElement table=d.findElement(By.id("thirtyfive"));
	  List<WebElement>rows=table.findElements(By.tagName("tr"));
	  List<String>actual_head=new ArrayList<String>();
	  for(int i=0;i<rows.size();i++) {
		  List<WebElement>head=rows.get(i).findElements(By.tagName("th"));
		  for(WebElement h:head) {
			  String s=h.getText();
			  actual_head.add(s);
		  }
	  }
	  
	  List<String>header=new ArrayList<String>();
	  header.add("Packaging Unit Type");
	  header.add("AUOM");
	  header.add("GTIN");
	  header.add("Dimensions - OD with Bulge");
	  header.add("Depth");
	  header.add("Width");
	  header.add("Height");
	  header.add("Dimension Unit of Measure");
	  header.add("Gross Weight");
	  header.add("Unit of Measure");
	  header.add("Number of Consumer Units per Unit");
	  header.add("Net Weight of Product in Consumer Unit");
	  header.add("Unit of Measure");
	  
	  
	  for(String s:header) {
		  int count=0;
		  for(String s1:actual_head) {
			  
			  if(s==s1) {
				  System.out.println(s+" present on the webtable as header");
				  sassert.assertEquals(s1, s);
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=actual_head.size()) {
					  sassert.assertFalse(true);
				  }
				  continue;
			  }
		  }
	  }
	  
	  
  }
  
  
  @Test(dependsOnMethods = {"packaging_unit"})
  public void transport_unit() throws Exception{
	  //transport unit
	  WebElement trans=d.findElement(By.id("thirtysix"));
	  List<WebElement>rows=trans.findElements(By.tagName("tr"));
	  List<String>actual_head=new ArrayList<String>();
	  List<String>header=new ArrayList<String>();
	  header.add("Pallet Type");
	  header.add("GTIN");
	  header.add("Dimensions - OD with Bulge");
	  header.add("Depth");
	  header.add("Width");
	  header.add("Height");
	  header.add("Dimension Unit of Measure");
	  header.add("Gross Weight with Pallet");
	  header.add("Gross Weight Without Pallet");
	  header.add("Unit of Measure");
	  header.add("Number of Customer Units Per Layer");
	  header.add("Number of Layers per Transport Unit");
	  header.add("Number of Customer Units Per Transport Unit");
	  header.add("Warehouse:Pallet Stack Height Maximum");
	  header.add("Warehouse:Case Stack Height Maximum");
	  header.add("Truck:Pallet Stack Height Maximum");
	  header.add("Stacking Pattern GCAS Code");
	  header.add("Cube Efficiency");
	  header.add("Include in SAP BOM Field");
	  
	  for(int i=0;i<=3;i++) {
		  if(i!=2) {
			  List<WebElement>head=rows.get(i).findElements(By.tagName("th"));
			  for(WebElement h:head) {
				  String s=h.getText();
				  actual_head.add(s);
			  }
			  
		  }
	  }
	  for(String s:header) {
		  int count=0;
		  for(String s1:actual_head) {
			  
			  if(s==s1) {
				  System.out.println(s+" present on the webtable as header");
				  sassert.assertEquals(s1, s);
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=actual_head.size()) {
					  sassert.assertFalse(true);
				  }
				  continue;
			  }
		  }
	  }
	  
	  
	  
  }
  
  @Test(dependsOnMethods = {"transport_unit"})
  public void market_validation() throws Exception{
	  List<String> val=new ArrayList<String>();
		val.add("Market of Sale");
		val.add("Market of Sale Restrictions");
		WebElement t=d.findElement(By.id("twentyeight"));
		List<WebElement>h1=t.findElements(By.tagName("th"));
		for(String s1:val) {
			int c=0;
		for(WebElement w:h1) {
			String s=w.getText();
			if(s1.equalsIgnoreCase(s)) {
				sassert.assertEquals(s1, s);
				System.out.println(s1+" is present on webpage");
			}
			else {
				c+=1;
				if(c>=h1.size()) {
				System.out.println("Desc not in webpage");
	sassert.assertFalse(true);
				}
				continue;
			}
		}}
	  }
  @Test(dependsOnMethods = {"market_validation"})
  public void ip_class() {
	  WebElement t=d.findElement(By.id("thirtytwo"));
	  List<WebElement>rows=t.findElements(By.tagName("tr"));
	  List<String>actual_head=new ArrayList<String>();
	  List<String>header=new ArrayList<String>();
	  header.add("Name");
	  header.add("Has Class Access?");
	  header.add("Type");
	  header.add("Description");
	  header.add("State");
	  
	  for(int i=0;i<rows.size();i++) {
		  List<WebElement>head=rows.get(i).findElements(By.tagName("th"));
		  for(WebElement h:head) {
			  String s=h.getText();
			  actual_head.add(s);
		  }
	  }
	  for(String s:header) {
		  int count=0;
		  for(String s1:actual_head) {
			  
			  if(s==s1) {
				  System.out.println(s+" present on the webtable as header");
				  sassert.assertEquals(s1, s);
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=actual_head.size()) {
					  sassert.assertFalse(true);
				  }
				  continue;
			  }
		  }
	  }
	  
  } 
  @Test(dependsOnMethods = {"ip_class"})
  public void BoM() throws Exception{
	  WebElement t=d.findElement(By.id("eight"));
	  List<WebElement>rows=t.findElements(By.tagName("tr"));
	  List<String>header=new ArrayList<String>();
	  header.add("Name(N) Rev(R)");
	  header.add("Chg");
	  header.add("F/N");
	  header.add("title");
	  header.add("Type");
	  header.add("Substitute Parts (SP) Alternate (Alt)");
	  header.add("Qty");
	  header.add("Base Unit of Measure");
	  header.add("EBOM Comments");
	  header.add("Release Date");
	  header.add("Phase (Pha) State(St)");
	  header.add("Ref Des(RD) On-Shelf Product Density(OSPD)");
	  header.add("Density Unit Of Measure(DUoM) Optional Components(OC)");
	  
	  List<String>body=new ArrayList<String>();
	  body.add("N:");
	  body.add("R");
	  body.add("Sp:");
	  body.add("Alt");
	  body.add("Pha:");
	  body.add("St:");
	  body.add("RD:");
	  body.add("OSPD:");
	  body.add("DUoM:");
	  body.add("OC:");
	  
	  List<String>actual_head=new ArrayList<String>();
	  for(int i=0;i<rows.size();i++) {
		  List<WebElement>head=rows.get(i).findElements(By.tagName("th"));
		  for(WebElement h:head) {
			  
		  
		  String s=h.getText();
		  actual_head.add(s);
	  }
	  for(String s:header) {
		  int count=0;
		  for(String s1:actual_head) {
			  
			  if(s==s1) {
				  System.out.println(s+" present on the webtable as header");
				  sassert.assertEquals(s1, s);
				  break;
			  }
			  else {
				  count+=1;
				  if(count>=actual_head.size()) {
					  sassert.assertFalse(true);
				  }
				  continue;
			  }
		  }
	  }
	  for(String s:body) {
		  int count=0;
		  List<WebElement>c=rows.get(1).findElements(By.tagName("td"));
		  for(WebElement col:c) {
			  List<WebElement>h=col.findElements(By.className("bomFontClass"));
			  for(WebElement he:h) {
				  String s1=he.getText();
				  if(s==s1) {
					  System.out.println(s+" present in the table body");
					  sassert.assertEquals(s1, s);
				  }
				  else {
					  count+=1;
					  if(count>=h.size()) {
						  System.out.println("Desc not in the webtable");
						  sassert.assertFalse(true);
					  }
				  }
			  }
		  }
	  }
	  }  
	  
  }
  
		
  
	
	  
	  
  
  @BeforeClass
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\selenium_essentials\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterTest() {
	  d.close();
  }

}
