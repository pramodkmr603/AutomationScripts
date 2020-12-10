package com.specreader.automation.mep;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Mep {// MEP-00000129
		WebDriver d;
		@BeforeClass
		public void setup() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\pramodkmr\\jars\\chromedriver_win32\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://specsqaap.pg.com/login");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
			d.findElement(By.id("username")).sendKeys("Anywheretwo.im");
			d.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
			d.findElement(By.id("password")).sendKeys("Sa061920");
			d.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
			d.findElement(By.id("loginButton")).click();
			d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			d.findElement(By.id("searchBox")).sendKeys("MEP");
			d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
			d.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);					
			d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[4]/td[1]/a")).click();			
			System.out.println("---------Mep-----------");
			d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		
			
		}
		@AfterClass
		
		public void teardown() {
			d.quit();
//			d.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/img")).click();
		}
		@Test
		public void attributes() {
			System.out.println("\n");
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
				if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div")).isDisplayed())
//				if(d.findElement(By.linkText("Attributes")).isDisplayed())
				{
					System.out.println("-----------Attributes-------------");
					List<String>attribute=new ArrayList<String>();
					attribute.add("Description");
					attribute.add("Title");
					attribute.add("Originator");
					attribute.add("Last Update User");
					attribute.add("Type");
					attribute.add("Revision");
					attribute.add("Originated");
					attribute.add("Material Certifications");
					attribute.add("Owner");
					attribute.add("Revision");
					attribute.add("Restricted");
					attribute.add("Release Date");
					attribute.add("Effective Date");
					attribute.add("Expiration Date");
					attribute.add("Previous Revision Obsolete Date");
					attribute.add("Vendor");
					attribute.add("Reason for Change");
					attribute.add("Vendor Number");
					attribute.add("Vendor Plant Location(Street Address Number)");
					attribute.add("Vendor Plant Location(Street Address Name)");
					attribute.add("Vendor Plant Location(City/Town)");
					attribute.add("Vendor Plant Location(State/Province)");
					attribute.add("Vendor Market");
					attribute.add("Vendor ZIP / Postal Code");
					attribute.add("Packaging Material Type");
					attribute.add("Material Restriction");
					attribute.add("Material Restriction Comment");
					attribute.add("Classification");			
					attribute.add("Comments");
					attribute.add("Obsolete Date");
					attribute.add("Obsolete Comment");
					

					List<WebElement>alist=d.findElements(By.id("pageheaders"));
					for(String s:attribute) {
						int count=0;
						for(WebElement w:alist) {
							String s1=w.getText();
							if(s.equalsIgnoreCase(s1)) {
								System.out.println(s+" is present on webpage");	
								break;
							}
							else {
								count+=1;
								if(count>=alist.size()) {
									System.out.println(s+" not in webpage");
								}
								continue;
							}
						}
					}

				}
			}
			catch(Exception e) {
				System.out.println("Attributes web element not found in webpage");
				System.out.println(e.getMessage());
			}
		}
			
		
	@Test
	public void ownership() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {						     
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div")).isDisplayed())
//			if(d.findElement(By.linkText("Ownership")).isDisplayed())
			{
				System.out.println("------------ownership ------------");
				List<String>ownership=new ArrayList<String>();
				ownership.add("Originator");
				ownership.add("Co-Owners");
				ownership.add("Last Update User");
				ownership.add("Segment");
				ownership.add("Approvers");
				ownership.add("Last Update Date");
				List<String>p=new ArrayList<String>();
				List<String>perfolist1=new ArrayList<String>();
				WebElement content=d.findElement(By.id("Six"));
				List<WebElement>l=content.findElements(By.id("pageheaders"));
				for(WebElement col:l) {
					String ss=col.getText();
					p.add(ss);
				}
				for(String s:p) {
					for(String ss:s.split(":")) {
						perfolist1.add(ss);
					}
				}
				for(String s:ownership) {
					int count=0;
					for(String s1:perfolist1) {
						if(s.equalsIgnoreCase(s1)) {
							System.out.println(s+" is present on webpage");
							break;
						}
						else {
							count+=1;
							if(count>=l.size()) {
								System.out.println(s+"not in webpage");
							}
							continue;
						}
					}
				}
			}

		}
		catch(Exception e) {
			System.out.println("Ownership web element not found in webpage");
			System.out.println();
		}
	}

	@Test
	public void ipclass() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {							 //*[@id="root"]/div[2]/div/div[2]/div[2]/div/div[7]/div[1]/div/text()
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div")).isDisplayed())
//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
			{
				System.out.println("-----------ipclass-------------");
				List<String>ip=new ArrayList<String>();
				ip.add("Name");
				ip.add("Has Class Access?");
				ip.add("Type");
				ip.add("Description");
				ip.add("State");

				List<String>iplist=new ArrayList<String>();
				WebElement table=d.findElement(By.xpath("//*[@id=\"Seven\"]"));
				List<WebElement> rows=table.findElements(By.tagName("tr"));
				List<WebElement> cols=rows.get(1).findElements(By.tagName("th"));
				for(WebElement w:cols) {
					String t=w.getText();
					iplist.add(t);
					//System.out.println(t);
				}
				for(String s:ip) {
					int count=0;
					for(String w:iplist) {
						if(s.equalsIgnoreCase(w)) {
							System.out.println(s+" is present on webpage");
							break;
						}
						else {
							count+=1;
							if(count>=iplist.size()) {
								System.out.println(s+" not in webpage");
							}
							continue;
						}
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("IP Classes web element not found in webpage");
			System.out.println();
		}
	}
	@Test
	public void organizations() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[5]/div[1]/div")).isDisplayed())
			{
				System.out.println("-----------organizations-------------");
				List<String>organizations=new ArrayList<String>();
				organizations.add("Primary Organization:");
				organizations.add("Secondary Organization:");

				WebElement table=d.findElement(By.id("Twelve"));
				List<WebElement>l=table.findElements(By.id("pageheaders"));
				for(String s:organizations) {
					int count=0;
					for(WebElement w:l) {
						String s1=w.getText();
						if(s.equalsIgnoreCase(s1)) {
							System.out.println(s+" is present on webpage");
							break;
						}
						else {
							count+=1;
							if(count>=l.size()) {
								System.out.println(s+"not in webpage");
							}
							continue;
						}
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Organizations web element not found in webpage");
			System.out.println();
		}
	}
	@Test
	public void Enterprise_parts() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {							 
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[4]/div[1]/div")).isDisplayed())
//			if(d.findElement(By.linkText("Lifecycle/Approval Powerview")).isDisplayed())
			{
				System.out.println("-----------enterprise parts-------------");
				List<String>life=new ArrayList<String>();
				life.add("PQRs");
				life.add("Name");
				life.add("Revision");
				life.add("Type");
				life.add("Description");
				life.add("State");
				life.add("Name");
				life.add("Revision");

				List<String>val=new ArrayList<String>();
				WebElement lifetable=d.findElement(By.xpath("//*[@id=\"Nine\"]/div/div/table/thead"));
				List<WebElement>rows=lifetable.findElements(By.tagName("tr"));
				int rsize=rows.size();
				for(int i=0;i<rsize;i++) {
					List<WebElement>cols=rows.get(i).findElements(By.tagName("th"));
					for(WebElement c:cols) {
						String sc=c.getText();
						val.add(sc);
						//System.out.println(sc);
					}
				}

				for(String s:life) {
					int count=0;
					for(String w:val) {
						if(s.equalsIgnoreCase(w)) {
							System.out.println(s+" is present on webpage");
							break;
						}
						else {
							count+=1;
							if(count>=val.size()) {
								System.out.println(s+" not in webpage");
							}

							continue;
						}
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Enterprise_parts web element not found in webpage");
			System.out.println();
		}
	}
	//--------------------------below not present------------------
	@Test
	public void REACH() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("REACH")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("REACH elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Materials_and_composition() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Materials_and_composition")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Materials_and_composition elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Related_Specifications() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Related_Specifications")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Related_Specifications elements is present in template but missing in webpage");
			System.out.println();
		}
		
	}
	@Test
	public void ReferenceDocuments() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Reference Documents")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Reference Documents elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Lifecyle_approval_preview() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Lifecyle_approval_preview")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Lifecyle_approval_preview elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Security_Classes() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Security_Classes")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Security_Classes elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Equivalent_sep() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Equivalent SEP")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Equivalent SEP elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Certifications() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Certifications")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Certifications elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Files() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Files")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Files elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	
}
