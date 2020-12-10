package com.specreader.automation.app;
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

public class App {
	WebDriver d;
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
		d.findElement(By.id("searchBox")).sendKeys("91277240");
		d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/form/div/div[1]/div/button")).click();
		d.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);					
		d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/div/div/div/div/table/tbody/tr/td[1]/a/span")).click();			
		System.out.println("---------App-----------");
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	@AfterClass
	
	public void teardown() {
		d.quit();

	}
	@Test
	public void attributes() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[1]/div[1]/div")).isDisplayed())
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
			attribute.add("Replaced Product Name");
			attribute.add("Business Area");
			attribute.add("Product Category Platform");
			attribute.add("Product Technology Platform");
			attribute.add("Product Technology Chassis");
			attribute.add("Franchise");
			attribute.add("Does This Contain a Battery?");
			attribute.add("Is Product Certification or Local Standards Compliance Statement Required");
			attribute.add("Product Dose per Use");
			attribute.add("Product Dose per Use UoM");
			attribute.add("Expected Frequency of Use");
			attribute.add("Expected Frequency of Use UoM");
			attribute.add("Mode of Product Disposal");
			attribute.add("Manufacturing Status");
			attribute.add("Product Extra Variant");
			attribute.add("Base Unit Of Measure");
			attribute.add("On-shelf Product Density");
			attribute.add("Density Unit Of Measure");
			attribute.add("Base Quantity");
			attribute.add("SAP BOM Base QTY");
			attribute.add("Local Description");
			attribute.add("Intended Markets");
			attribute.add("Product Size");
			attribute.add("Unique Formula Identifier");
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
			attribute.add("Class");
			attribute.add("Sub Class");
			attribute.add("Reported Function");
			attribute.add("Base Unit of Measure");
			attribute.add("Local Description");
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
		else {
			System.out.println("attributes elements is present in template but missing in webpage");
		}
	}
	@Test
	public void Weight_Characteristic() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[2]/div[1]/div")).isDisplayed())
			//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
		{
			System.out.println("------------Weight_Characteristic------------");
			List<String>ip=new ArrayList<String>();
			ip.add("Name");
			ip.add("Gross Weight");
			ip.add("Type");
			ip.add("Weight UoM");
			ip.add("Roll-up Net Weight to COP");
			ip.add("Net Weight");
			ip.add("Comments");

			List<String>iplist=new ArrayList<String>();
			WebElement table=d.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/table/thead"));
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
		else {
			System.out.println("Weight_Characteristic elements is present in template but missing in webpage");
		}
	}
	@Test
	public void Storage_Transportation_Labeling_Assessment_Data() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.findElement(By.xpath("//*[@id=\"collapseFour\"]")).isDisplayed())
			//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
		{
			System.out.println("------------Storage_Transportation_Labeling_Assessment_Data------------");
			List<String>ip=new ArrayList<String>();
			ip.add("Technology");
			ip.add("Is Product Marketed as Children’s Product");
			ip.add("Does the Product Require Child Safe Design");
			ip.add("Is Product Exposed to Children");
			ip.add("Evaporation Rate");
			ip.add("Reserve Acidity");
			ip.add("Shipping Hazard Classification");
			ip.add("Shipping Information");
			ip.add("Storage Conditions");

			List<String>p=new ArrayList<String>();
			List<String>perfolist1=new ArrayList<String>();
			WebElement content=d.findElement(By.id("collapseFour"));
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
			for(String s:ip) {
				int count=0;
				for(String s1:perfolist1) {
					if(s.equalsIgnoreCase(s1)) {
						System.out.println(s+" is present on webpage");
						break;
					}
					else {
						count+=1;
						if(count>=l.size()) {
							System.out.println(s+" not in webpage");
						}
						continue;
					}
				}
			}

		}
		else {
			System.out.println("Storage, Transportation, Labeling Assessment Data elements is present in template but missing in webpage");
		}
	}
	@Test
	public void Related_specification() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[8]/div[1]/div")).isDisplayed())
			//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
		{
			System.out.println("------------Related Specifications------------");
			List<String>ip=new ArrayList<String>();
			ip.add("Name");
			ip.add("Title");
			ip.add("Type");
			ip.add("Source");
			ip.add("Revision");
			ip.add("Description");
			ip.add("Specification SubType");
			ip.add("State");
			ip.add("Originator");
			List<String>val=new ArrayList<String>();
			WebElement table=d.findElement(By.xpath("//*[@id=\"collapseTwenty\"]/div/div/table/thead"));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			int rsize=rows.size();
			for(int i=0;i<rsize;i++) {
				List<WebElement>cols=rows.get(i).findElements(By.tagName("th"));
				for(WebElement c:cols) {
					String sc=c.getText();
					val.add(sc);
					//System.out.println(sc);
				}
			}

			for(String s:ip) {
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
		else {
			System.out.println("Related Specifications elements is present in template but missing in webpage");
		}
	}
	@Test
	public void Plants() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[10]/div[1]/div")).isDisplayed())
			//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
		{
			System.out.println("------------Plants------------");
			List<String>ip=new ArrayList<String>();
			ip.add("Plants");
			ip.add("Authorized To Use");
			ip.add("Authorized to Produce");
			ip.add("Activated");

			List<String>iplist=new ArrayList<String>();
			WebElement table=d.findElement(By.xpath("//*[@id=\"collapseSeventeen\"]/div/div/table/thead"));
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
		else {
			System.out.println("Plants elements is present in template but missing in webpage");
		}
	}
	@Test
	public void lifecycle_approval_review() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[11]/div[1]/div")).isDisplayed())
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
			WebElement lifetable=d.findElement(By.xpath("//*[@id=\"collapseTwenty\"]/div/div/table/thead"));
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
		else {
			System.out.println("lifecycle_approval_review elements is present in template but missing in webpage");
		}
	}
	@Test
	public void ownership() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[12]/div[1]/div")).isDisplayed())
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
			WebElement content=d.findElement(By.id("collapseTwentyOne"));
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
		else {
			System.out.println("ownership elements is present in template but missing in webpage");
		}
	}
	@Test
	public void ipclass() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[13]/div[1]/div")).isDisplayed())
		{
			System.out.println("-----------ipclass-------------");
			List<String>ip=new ArrayList<String>();
			ip.add("Name");
			ip.add("Has Class Access?");
			ip.add("Type");
			ip.add("Description");
			ip.add("State");

			List<String>iplist=new ArrayList<String>();
			WebElement table=d.findElement(By.xpath("//*[@id=\"collapseTwentyTwo\"]/div/div/table/thead"));
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
		else {
			System.out.println("ipclass elements is present in template but missing in webpage");
		}
	}
	@Test
	public void organizations() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[14]/div[1]/div")).isDisplayed())
		{
			System.out.println("-----------organizations-------------");
			List<String>organizations=new ArrayList<String>();
			organizations.add("Primary Organization");
			organizations.add("Secondary Organization");
			List<String>p=new ArrayList<String>();
			List<String>perfolist1=new ArrayList<String>();
			WebElement table=d.findElement(By.id("collapseTwentyFive"));
			List<WebElement>l=table.findElements(By.id("pageheaders"));
			for(WebElement col:l) {
				String ss=col.getText();
				p.add(ss);
			}
			for(String s:p) {
				for(String ss:s.split(":")) {
					perfolist1.add(ss);
				}
			}
			for(String s:organizations) {
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
		else {
			System.out.println("organizations elements is present in template but missing in webpage");
		}
	}
	@Test
	public void Performance_Characteristic() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[9]/div[1]/div")).isDisplayed())
		{
			System.out.println("-----------performance characteristics-------------");
			List<String>perfo=new ArrayList<String>();
			perfo.add("Characteristic(Ch) Characteristic Specifics(CS) Path(P)");
			perfo.add("Chg.");
			perfo.add("Test Method (Name) Test Method Logic (TML) Test Method Origin (TMO) Other Test Method Number (TM#) Test Method Specifics (Sp) Test Method Reference Document Name (TMRDN)");//copied from webpage
			perfo.add("Sampling(SM) Subgroup(SG)");
			perfo.add("Plant Testing Level(LVL) Plant Testing:Retesting(RT) Retesting Unit Of Measure(UoM)");//copied from webpage
			perfo.add("Lower Specification Limit (LSL) Lower Routine Release Limit (LRRL) Lower Target (LTGT) Target (TGT) Upper Target (UTGT) Upper Routine Release Limit (URRL) Upper Specification Limit (USL)");//copied from webpage
			perfo.add("Unit of Measure(UoM) Report to Nearest(RTN) Report Type(RT)");
			perfo.add("Release Criteria(RC)");
			perfo.add("Action Required(AC) Criticality Factor(CR) Basis(BA)");
			perfo.add("Test Group(TG) Application(AP) Master Part Title(MPT)");
			perfo.add("CH");
			perfo.add("CS");
			perfo.add("P");
			perfo.add("Name");
			perfo.add("TML");
			perfo.add("TMO");
			perfo.add("TM#");
			perfo.add("SP");
			perfo.add("TMRDN");
			perfo.add("SM");
			perfo.add("SG");
			perfo.add("LVL");
			perfo.add("RT");
			perfo.add("UoM");
			perfo.add("LSL");
			perfo.add("LRRL");
			perfo.add("LTGT");
			perfo.add("TGT");
			perfo.add("UTGT");
			perfo.add("URRL");
			perfo.add("USL");
			perfo.add("UoM");
			perfo.add("RTN");
			perfo.add("RT");
			perfo.add("RC");
			perfo.add("AC");
			perfo.add("CR");
			perfo.add("BA");
			perfo.add("TG");
			perfo.add("AP");
			perfo.add("MPT");

			List<String>perfolist1=new ArrayList<String>();
			WebElement table=d.findElement(By.xpath("//*[@id=\"collapseSixteen\"]/div/div/table/thead"));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			List<WebElement>cols=rows.get(0).findElements(By.tagName("th"));//header column
			for(WebElement col:cols) {
				String ss=col.getText();
				perfolist1.add(ss);
			}
			List<String>p=new ArrayList<String>();
			WebElement table2=d.findElement(By.xpath("//*[@id=\"collapseSixteen\"]/div/div/table/tbody"));
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
			for(String s:perfo) {
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
		}
		else {
			System.out.println("performance characteristics elements is present in template but missing in webpage");
		}
	}

	@Test
	public void billOfMaterials() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[6]/div[1]/div")).isDisplayed())
		{
			System.out.println("-----------Bill Of Materials-------------");
			List<String> bill=new ArrayList<String>();
			bill.add("Name(N) Rev(R)");
			bill.add("Chg");
			bill.add("F/N");
			bill.add("Mininum(Min) Quantity(Qty) Maximum(Max) Base UoM(UoM)");
			bill.add("Net(N) Loss(L) Net Weight(NW) Weight UoM(UoM)");
			bill.add("Function(F) Reported Function(RF)");
			bill.add("EBOM Comments");
			bill.add("Certifications(C) Phase(Pha) State(St)");
			bill.add("Ref Des(RD)");
			bill.add("Title");
			bill.add("Type");
			bill.add("Substitute Parts (SP) Alternate (Alt)");
			bill.add("Qty");
			bill.add("Base Unit of Measure");
			bill.add("Ref Des");
			bill.add("On-shelf Product Density(OSPD) Density Unit of Measure(DUOM)");
			bill.add("N");
			bill.add("R");
			bill.add("SP");
			bill.add("Alt");
			bill.add("Min");
			bill.add("Qty");
			bill.add("Max");
			bill.add("UoM");
			bill.add("N");
			bill.add("L");
			bill.add("NW");
			bill.add("UoM");
			bill.add("F");
			bill.add("RF");
			bill.add("C");
			bill.add("Pha");
			bill.add("St");
			bill.add("OSPD");
			bill.add("DUoM");
			List<String>bill1=new ArrayList<String>();
			WebElement table=d.findElement(By.xpath("//*[@id=\"collapseElevan\"]/div/div/table/thead"));
			List <WebElement> rows=table.findElements(By.tagName("tr"));
			List <WebElement> cols=rows.get(0).findElements(By.tagName("th"));
			for (WebElement col:cols) {
				String ss=col.getText();
				bill1.add(ss);
			}
			List<String> b=new ArrayList<String>();
			WebElement table2=d.findElement(By.xpath("//*[@id=\"collapseElevan\"]/div/div/table/tbody"));
			List <WebElement> rows2=table2.findElements(By.tagName("tr"));
			List <WebElement> cols2=rows2.get(0).findElements(By.className("bomFontClass"));
			for(WebElement col:cols2) {
				String ss=col.getText();
				b.add(ss);
			}
			for(String s:b) {
				for(String ss:s.split(":")) {
					bill1.add(ss);
				}
			}
			for(String s:bill) {
				int count=0;
				for(String s1:bill1) {
					if(s.equalsIgnoreCase(s1)) {
						System.out.println(s+" is present");
						break;
					}
					else {
						count+=1;
						if(count>=bill1.size()) {
							System.out.println(s+" not present");
						}
						continue;
					}
				}
			}
		}
		else {
			System.out.println("bill Of Materials elements is present in template but missing in webpage");
		}
	}
	@Test
	public void substitutes() {
		System.out.println("\n");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[7]/div[1]/div")).isDisplayed())
		{
			System.out.println("-----------substitutes-------------");
			List<String> sub=new ArrayList<String>();
			sub.add("Substitute Parts(SP) REV(R))");
			sub.add("Chg");
			sub.add("Substitution Combination Number(SCN) Title");
			sub.add("Type(T) Specification SubType(SST)");
			sub.add("QTY");
			sub.add("Min(Min) Max(Max)");
			sub.add("Function(F) Reported Function(RF)");
			sub.add("Base Unit of Measure");
			sub.add("Valid Start Date");
			sub.add("Valid Until Date");
			sub.add("Ref Des");
			sub.add("Comments");
			sub.add("Substitute For(SF) Rev(R)");
			sub.add("Title");
			sub.add("Type(T) Specification SubType(SST)");
			sub.add("SP");
			sub.add("REV");
			sub.add("SCN");
			sub.add("Title");
			sub.add("T");
			sub.add("SST");
			sub.add("Min");
			sub.add("Max");
			sub.add("F");
			sub.add("RF");
			sub.add("SF");
			sub.add("REV");
			sub.add("T");
			sub.add("SST");

			List<String>sub11=new ArrayList<String>();
			WebElement table=d.findElement(By.xpath("//*[@id=\"collapseTwelve\"]/div/div/table/thead"));
			List <WebElement> rows=table.findElements(By.tagName("tr"));
			List <WebElement> cols=rows.get(0).findElements(By.tagName("th"));
			for (WebElement col:cols) {
				String ss=col.getText();
				sub11.add(ss);
			}
			List<String> b=new ArrayList<String>();
			WebElement table2=d.findElement(By.xpath("//*[@id=\"collapseTwelve\"]/div/div/table/tbody"));
			List <WebElement> rows2=table2.findElements(By.tagName("tr"));
			List <WebElement> cols2=rows2.get(0).findElements(By.className("bomFontClass"));
			for(WebElement col:cols2) {
				String ss=col.getText();
				b.add(ss);
			}
			for(String s:b) {
				for(String ss:s.split(":")) {
					sub11.add(ss);
				}
			}
			for(String s:sub) {
				int count=0;
				for(String s1:sub11) {
					if(s.equalsIgnoreCase(s1)) {
						System.out.println(s+" is present");
						break;
					}
					else {
						count+=1;
						if(count>=sub11.size()) {
							System.out.println(s+" not present");
						}
						continue;
					}
				}
			}
		}
		else {
			System.out.println("substitutes elements is present in template but missing in webpage");
		}
	}

@Test
public void Files() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[15]/div[1]/div")).isDisplayed())
		//			if(d.findElement(By.linkText("IP Classes")).isDisplayed())
	{
		System.out.println("------------Files------------");
		List<String>ip=new ArrayList<String>();
		ip.add("Name");
		ip.add("Format");
		ip.add("File Size");
		ip.add("Action");

		List<String>iplist=new ArrayList<String>();
		WebElement table=d.findElement(By.xpath("//*[@id=\"collapseTwentySix\"]/div/div/div/table/thead"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> cols=rows.get(0).findElements(By.tagName("th"));
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
	else {
		System.out.println("Files elements is present in template but missing in webpage");
	}
}

@Test
public void MarketClearance() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[5]/div[1]/div")).isDisplayed())
	{
		System.out.println("-----------Market Clearance-------------");
		List<String> sub=new ArrayList<String>();
		sub.add("Market");
		sub.add("Overall Clearance Status");
		sub.add("Product Regulatory Classification");
		sub.add("GPS Approval Status");
		sub.add("Clearance Number");
		sub.add("Market Product Registration Number");
		sub.add("Registration Status (Rs) Registration Expiration Date (Re)");
		sub.add("Registration Renewal Lead Time(Days) (Rr) Registration Renewal Status");
		sub.add("Restrictions");
		sub.add("Registered Product Name");
		sub.add("Packing Site");
		sub.add("Bulk Making / Manufacturing Site (BMS) Comments (C)");
		sub.add("Rs");
		sub.add("Re");
		sub.add("Rr");
		sub.add("Rw");
		sub.add("BMS");
		sub.add("C");
		
		List<String>sub11=new ArrayList<String>();
		WebElement table=d.findElement(By.xpath("//*[@id=\"collapseNine\"]/div/div/table/thead"));
		List <WebElement> rows=table.findElements(By.tagName("tr"));
		List <WebElement> cols=rows.get(1).findElements(By.tagName("th"));
		for (WebElement col:cols) {
			String ss=col.getText();
			sub11.add(ss);
		}
		List<String> b=new ArrayList<String>();
		WebElement table2=d.findElement(By.xpath("//*[@id=\"collapseNine\"]/div/div/table/tbody"));
		List <WebElement> rows2=table2.findElements(By.tagName("tr"));
		List <WebElement> cols2=rows2.get(0).findElements(By.className("bomFontClass"));
		for(WebElement col:cols2) {
			String ss=col.getText();
			b.add(ss);
		}
		for(String s:b) {
			for(String ss:s.split(":")) {
				sub11.add(ss);
			}
		}
		for(String s:sub) {
			int count=0;
			for(String s1:sub11) {
				if(s.equalsIgnoreCase(s1)) {
					System.out.println(s+"is present");
					break;
				}
				else {
					count+=1;
					if(count>=sub11.size()) {
						System.out.println(s+" not present");
					}
					continue;
				}
			}
		}
	}
	else {
		System.out.println("Market Clearance elements is present in template but missing in webpage");
	}
}
@Test
public void SAPBOMasFed() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	if(d.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div/div[5]/div[1]/div")).isDisplayed())
	{
		System.out.println("-----------SAP BOM as Fed-------------");
		List<String> sub=new ArrayList<String>();
		sub.add("Name");
		sub.add("SAP Description");
		sub.add("Type");
		sub.add("Specification SubType");
		sub.add("SAP Type");
		sub.add("Substitute/ Alternate Grouping");
		sub.add("BOM Minimum Quantity(Min) BOM Quantity(BQ)");
		sub.add("BOM Maximum Quantity(Max) Base Unit of Measure(BUoM)");
		sub.add("Authorized(A) Authorized To Use(AU)");
		sub.add("Authorized To Produce(AP) Optional Component (OC)");
		sub.add("Transport Unit(TU) Comments(C)");
		sub.add("Min");
		sub.add("BQ");
		sub.add("Max");
		sub.add("BUoM");
		sub.add("A");
		sub.add("AU");
		sub.add("AP");
		sub.add("OC");
		sub.add("TU");
		sub.add("C");
		
		List<String>sub11=new ArrayList<String>();
		WebElement table=d.findElement(By.xpath("//*[@id=\"collapseEight\"]/div/div/table/thead"));
		List <WebElement> rows=table.findElements(By.tagName("tr"));
		List <WebElement> cols=rows.get(1).findElements(By.tagName("th"));
		for (WebElement col:cols) {
			String ss=col.getText();
			sub11.add(ss);
		}
		List<String> b=new ArrayList<String>();
		WebElement table2=d.findElement(By.xpath("//*[@id=\"collapseEight\"]/div/div/table/tbody"));
		List <WebElement> rows2=table2.findElements(By.tagName("tr"));
		List <WebElement> cols2=rows2.get(0).findElements(By.className("bomFontClass"));
		for(WebElement col:cols2) {
			String ss=col.getText();
			b.add(ss);
		}
		for(String s:b) {
			for(String ss:s.split(":")) {
				sub11.add(ss);
			}
		}
		for(String s:sub) {
			int count=0;
			for(String s1:sub11) {
				if(s.equalsIgnoreCase(s1)) {
					System.out.println(s+"is present");
					break;
				}
				else {
					count+=1;
					if(count>=sub11.size()) {
						System.out.println(s+" not present");
					}
					continue;
				}
			}
		}
	}
	else {
		System.out.println("SAP BOM as Fed elements is present in template but missing in webpage");
	}
}
@Test
public void DangerousGoodsClassification() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Dangerous Goods Classification")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Dangerous Goods Classification elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void GlobalHarmonizedStandard() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Global Harmonized Standard")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Global Harmonized Standard elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void Notes() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Notes")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Notes elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void ProductPartStabilityDocument() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Product Part Stability Document")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Product Part Stability Document elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void MasterPartStabilityDocument() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Master Part Stability Document")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Master Part Stability Document elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void MaterialComposition() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Material & Composition")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Material & Composition elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void MasterSpecifications() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Master Specifications")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Master Specifications elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void ReferenceDocuments() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Reference Documents")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Reference Documents elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void Alternates() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Alternates")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Alternates elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void MaterialsProduced() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Materials Produced")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Materials Produced elements is present in template but missing in webpage");
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
public void RelatedATS() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Related ATS")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Related ATS elements is present in template but missing in webpage");
		System.out.println();
	}
}
@Test
public void Certifications() {
	System.out.println("\n");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		if(d.findElement(By.linkText("Certifications")).isDisplayed())
		{}
	}
	catch(Exception e) {
		System.out.println("Certifications elements is present in template but missing in webpage");
		System.out.println();
	}
}}