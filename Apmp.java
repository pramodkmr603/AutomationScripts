package com.specreader.automation.apmp;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
public class Apmp {//APMP-00000009
	WebDriver d;
	@Test
	public void attributes() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[1]/div[1]/div")).isDisplayed())
				//			if(d.findElement(By.linkText("Attributes")).isDisplayed())
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
				attribute.add("Phase");
				attribute.add("Owner");
				attribute.add("Segment");
				attribute.add("Structured Release Criteria Required");
				attribute.add("Release Date");
				attribute.add("Effective Date");
				attribute.add("Expiration Date");
				attribute.add("Previous Revision Obsolete Date");
				attribute.add("Manufacturing Status");
				attribute.add("Reason for Change");
				attribute.add("Brand");
				attribute.add("Preferred Material");
				attribute.add("Class");
				attribute.add("Sub Class");
				attribute.add("Reported Function");
				attribute.add("Specification Sub Type");
				attribute.add("Base Unit of Measure");
				attribute.add("Local Description");
				attribute.add("Packaging Material Type");
				attribute.add("Legacy Environmental Class");
				attribute.add("Other Names");
				attribute.add("Packaging Size");
				attribute.add("Packaging Component Type");
				attribute.add("Packaging Technology");
				attribute.add("Packaging Size UOM");
				attribute.add("Decoration Details");
				attribute.add("Part Color");
				attribute.add("Shipping Information");
				attribute.add("Labeling Information");
				attribute.add("Storage Conditions");
				attribute.add("Storage Temperature Limits - °C");
				attribute.add("Storage Humidity Limits - %");
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
	public void Weight_Characteristic() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div")).isDisplayed())
				//			if(d.findElement(By.linkText("Ownership")).isDisplayed())
			{
				System.out.println("------------Weight_Characteristic------------");
				List<String>wc=new ArrayList<String>();
				wc.add("Gross Weight");
				wc.add("Weight UoM");
				List<String>p=new ArrayList<String>();
				List<String>p2=new ArrayList<String>();
				WebElement content=d.findElement(By.id("collapseOne"));
				List<WebElement>l=content.findElements(By.id("pageheaders"));
				for(WebElement col:l) {
					String ss=col.getText();
					p.add(ss);
				}
				for(String s:p) {
					for(String ss:s.split(":")) {
						p2.add(ss);
					}
				}
				for(String s:wc) {
					int count=0;
					for(String s1:p2) {
						if(s.equalsIgnoreCase(s1)) {
							System.out.println(s+" is present on webpage");	
							break;
						}
						else {
							count+=1;
							if(count>=p2.size()) {
								System.out.println(s+" not in webpage");
							}
							continue;
						}
					}
				}
			}

		}
		catch(Exception e) {
			System.out.println("Weight Characteristic web element not found in webpage");
			System.out.println();
		}
	}
	@Test
	public void ipclass() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {							 //*[@id="root"]/div[2]/div/div[2]/div[2]/div/div[7]/div[1]/div/text()
			if(d.findElement(By.xpath("//*[@id=\"collapseTwelve\"]")).isDisplayed())
				//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
			{
				System.out.println("------------ipclass------------");
				List<String>ip=new ArrayList<String>();
				ip.add("Name");
				ip.add("Has Class Access?");
				ip.add("Type");
				ip.add("Description");
				ip.add("State");

				List<String>iplist=new ArrayList<String>();
				WebElement table=d.findElement(By.xpath("//*[@id=\"collapseTwelve\"]"));
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
	public void lifecycle_approval_review() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {							 
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[5]/div[1]/div")).isDisplayed())
				//			if(d.findElement(By.linkText("Lifecycle/Approval Powerview")).isDisplayed())
			{
				System.out.println("------------lifecycle approval review ------------");
				List<String>life=new ArrayList<String>();
				life.add("Tasks/Signatures");
				life.add("Name");
				life.add("Approver");
				life.add("Title");
				life.add("Approval Status");
				life.add("Approval/Due Date");
				life.add("Comments/Instructions");

				List<String>val=new ArrayList<String>();
				WebElement lifetable=d.findElement(By.xpath("//*[@id=\"collapseTen\"]/div/div/table/thead"));
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
			System.out.println("Lifecycle/Approval Powerview web element not found in webpage");
			System.out.println();
		}
	}
	@Test
	public void ownership() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {						     
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[6]/div[1]/div")).isDisplayed())
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
				WebElement content=d.findElement(By.id("collapseElevan"));
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
	public void plants() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[4]/div[1]/div")).isDisplayed())
				//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
			{
				System.out.println("-----------plants-------------");
				List<String>p=new ArrayList<String>();
				p.add("Plants");
				p.add("Authorized");

				List<String>plist=new ArrayList<String>();
				WebElement table=d.findElement(By.xpath("//*[@id=\"collapseSeven\"]/div/div/table/thead"));
				List<WebElement> rows=table.findElements(By.tagName("tr"));
				List<WebElement> cols=rows.get(1).findElements(By.tagName("th"));
				for(WebElement w:cols) {
					String t=w.getText();
					plist.add(t);
					//System.out.println(t);
				}
				for(String s:p) {
					int count=0;
					for(String w:plist) {
						if(s.equalsIgnoreCase(w)) {
							System.out.println(s+" is present on webpage");
							break;
						}
						else {
							count+=1;
							if(count>=plist.size()) {
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
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[8]/div[1]/div")).isDisplayed())
				//			if(d.findElement(By.linkText("Organizations")).isDisplayed())
			{
				System.out.println("-----------organizations-------------");
				List<String>organizations=new ArrayList<String>();
				organizations.add("Primary Organization:");
				organizations.add("Secondary Organization:");

				WebElement table=d.findElement(By.id("collapseFourteen"));
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
	public void substance_materials() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div")).isDisplayed())
				//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
			{
				System.out.println("-----------substance materials-------------");
				List<String>sm=new ArrayList<String>();
				sm.add("Name");
				sm.add("Quantity UoM");
				sm.add("Target Percentage Weight by	Weight");
				sm.add("Manufacturer");
				sm.add("Title(T) Type (TY)");
				sm.add("Seq");
				sm.add("Description");
				sm.add("Trade Name");
				sm.add("Legacy Environmental Class");
				sm.add("Layer/Composition Description");
				sm.add("Minimum Percentage Weight by Weight");
				sm.add("Maximum Percentage Weight by Weight");
				sm.add("Post-Consumer Recycled Content(%) Post-Industrial Recycled Content(%)(Ind)");
				sm.add("Comments(C) State(St)");
				sm.add("T");
				sm.add("TY");
				sm.add("Con");
				sm.add("Ind");
				sm.add("C");
				sm.add("St");
				List<String>perfolist1=new ArrayList<String>();
				WebElement table=d.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div/table/thead"));
				List<WebElement>rows=table.findElements(By.tagName("tr"));
				List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));//header column
				for(WebElement col:cols) {
					String ss=col.getText();
					perfolist1.add(ss);
				}
				List<String>p=new ArrayList<String>();
				WebElement table2=d.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div/table/tbody"));
				List<WebElement>rows2=table2.findElements(By.tagName("tr"));
				List<WebElement>colsd2=rows2.get(0).findElements(By.className("bomFontClass"));
				for(WebElement col:colsd2) {
					String ss=col.getText();
					p.add(ss);
				}
				for(String s:p) {
					for(String ss:s.split(":")) {
						perfolist1.add(ss);
					}
				}
				for(String s:sm) {
					int count=0;
					for(String s1:perfolist1) {
						if(s.equalsIgnoreCase(s1)) {
							System.out.println(s+" is present on webpage");	
							break;
						}
						else {
							count+=1;
							if(count>=perfolist1.size()) {
								System.out.println(s+" not in webpage");
							}
							continue;
						}
					}
				}
			}}
		catch(Exception e) {
			System.out.println("substance_materialsweb element not found in webpage");
			System.out.println();
		}
	}
	//--------------------------below not present-----------------------------
	@Test
	public void Notes() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Notes")).isDisplayed()) {}
		}
		catch(Exception e) {
			System.out.println("Notes elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void RelatedSpecifications() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Related Specifications")).isDisplayed())
			{}
		}
		catch(Exception e) {
			System.out.println("Related Specifications elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void ReferenceDocuments() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Reference documents")).isDisplayed())
			{}
		}
		catch(Exception e) {
			System.out.println("Reference documents elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void SecurityClasses() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("Security Classes")).isDisplayed())
			{}
		}
		catch(Exception e) {
			System.out.println("Security Classes elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@Test
	public void Files() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			if(d.findElement(By.linkText("files")).isDisplayed())
			{}
		}
		catch(Exception e) {
			System.out.println("files elements is present in template but missing in webpage");
			System.out.println();
		}
	}
	@BeforeClass
	public void beforeClass() throws InterruptedException {
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
		d.findElement(By.id("searchBox")).sendKeys("APMP");
		d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
		d.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);					
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr[4]/td[1]/a")).click();			
		System.out.println("---------Apmp-----------");
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

	@AfterClass
	public void afterClass() {
		d.quit();
		//		d.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/img")).click();

	}

}



