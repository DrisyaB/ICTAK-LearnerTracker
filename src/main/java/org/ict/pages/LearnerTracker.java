package org.ict.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LearnerTracker {
	    WebDriver driver;
public LearnerTracker(WebDriver driver) {
		this.driver=driver;
}
public void AdminUsername() throws InterruptedException {
		WebElement Uname=driver.findElement(By.id("username"));
		Uname.sendKeys("admin");
		Thread.sleep(2000);
}
public void AdminPassword() throws InterruptedException {
		WebElement Pword1=driver.findElement(By.id("password"));
		Pword1.sendKeys("admin@123");
	    Thread.sleep(2000);
}
public void AdminLogin() {
		WebElement AdLogin=driver.findElement(By.xpath("//button[@class='btn btn-success w-100']"));
		AdLogin.click();
}
public void InvalidAdminUsername() throws InterruptedException {
		WebElement AdminUname=driver.findElement(By.id("username"));
		AdminUname.sendKeys("adm1");
		Thread.sleep(2000);
}
public void ValidAdminPassword() throws InterruptedException {
		WebElement AdminPword1=driver.findElement(By.id("password"));
		AdminPword1.sendKeys("admin@123");
		Thread.sleep(2000);
}
public String url() {
		String url=driver.getCurrentUrl();
		return url;
}
public String InvalidAd() {
		WebElement text1=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']"));
		String Text1=text1.getText();
		return Text1;
		
}
public void Logo() {
		WebElement ICTAKLogo=driver.findElement(By.xpath("//img[@alt='logo']"));
		ICTAKLogo.click();
}
public String logocheck() {
	    WebElement text13=driver.findElement(By.xpath("//img[@src='/static/media/ictlogo.7ae1d58e8955e2f94655.png']"));
	    String Text13=text13.getText();
	    return Text13;
}
public void AddUser() {
		WebElement UserAdd=driver.findElement(By.xpath("//button[@class=\"mb-3 btn btn-success\"]"));
		UserAdd.click();
}
public void Name() {
		WebElement Name1=driver.findElement(By.xpath("//input[@id='name']"));
		Name1.sendKeys("Sithu");
}
public void Email()	{
	    WebElement mail1=driver.findElement(By.xpath("//input[@id='email']"));
	    mail1.sendKeys("sithu@gmail.com");
}
public void AddUsername()	{
	   WebElement adname=driver.findElement(By.xpath("//input[@id='username']"));
	   adname.sendKeys("Sithu");
}
public void AddPassword()	{
	   WebElement addpass=driver.findElement(By.xpath("//input[@id='password']"));
	   addpass.sendKeys("Pa$$word12");
}
public void Role() {
	   WebElement Addrole=driver.findElement(By.xpath("//select[@class='form-select required']"));
	   Addrole.click();
	   Select dropdown=new Select(Addrole);
	   dropdown.selectByVisibleText("Admin");
}
public void Submit() {
	   WebElement sub=driver.findElement(By.xpath("//button[text()='Submit']"));
	   sub.click();
}
public String submitcheck() {
       WebElement text2=driver.findElement(By.id("swal2-html-container"))	;
       String Text2=text2.getText();
       return Text2;
}
public void BackDashBoard() {	
	   WebElement BackTo=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	   BackTo.click();
}
public String BackToCheck() {
	   WebElement text3=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
	   String Text3=text3.getText();
	   return Text3;
}
public void Adminupdate() {
	   WebElement Update=driver.findElement(By.xpath("//button[@class='btn btn-success btn btn-primary']"));
	   Update.click();
}
public String Adminupcheck() {
	   WebElement text4=driver.findElement(By.xpath("//h3[text()='Add Users']"));
	   String Text4=text4.getText();
	   return Text4;
}
public void Update() {
	   WebElement update=driver.findElement(By.xpath("//select[@class='form-select required']"));
	   update.click();
	   Select selectup=new Select(update);
	   selectup.selectByVisibleText("Admin");
}
/*public String UpdateCheck()	{
	   WebElement text5=driver.findElement(By.xpath("//th[text()='Update']"));
	   String Text5=text5.getText();
	   return Text5;
}*/
public void AdminDelete() {
	   WebElement Delete=driver.findElement(By.xpath("//button[@class='btn btn-danger btn btn-primary']"));
	   Delete.click();
}
public void PofficerUsername() throws InterruptedException {
	   WebElement poUname=driver.findElement(By.id("username"));
	   poUname.sendKeys("pofficer");
	   Thread.sleep(2000);
}
public void PofficerPassword() throws InterruptedException {
	   WebElement poPword1=driver.findElement(By.id("password"));
	   poPword1.sendKeys("pofficer@123");
	   Thread.sleep(2000);
}
public String url2() {
	   String url2=driver.getCurrentUrl();
	   return url2;	
}	
public void ValidPofficerUsername() throws InterruptedException {
	   WebElement ValidUname=driver.findElement(By.id("username"));
	   ValidUname.sendKeys("pofficer");
	   Thread.sleep(2000);
}
public void InvalidPofficerPassword() throws InterruptedException {
	   WebElement InvalidPword1=driver.findElement(By.id("password"));
	   InvalidPword1.sendKeys("pofficer@1");
	   Thread.sleep(2000);
}	
public String InvalidPOcheck() {
	   WebElement text6=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']"));
	   String Text6=text6.getText();
	   return Text6;	
}
public void PlacementUpdate() {
	   WebElement Placementup=driver.findElement(By.xpath("//button[@class='btn btn-success btn btn-primary']"));
	   Placementup.click();
}
public String PlaceUpcheck() {
	   WebElement text7=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/h3"));
	   String Text7=text7.getText();
	   return Text7;
}
public void Learnersform() {
	   WebElement Placementstatus=driver.findElement(By.xpath("//Select[@name='pstatus']"));
	   Placementstatus.click();
	   Select status=new Select(Placementstatus);
	   status.selectByVisibleText("Placed");
}
public void submitform() {
	   WebElement Submit=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	   Submit.click();
}
public void TrainerUsername() throws InterruptedException {
	   WebElement TrainerUname=driver.findElement(By.id("username"));
	   TrainerUname.sendKeys("trainer");
	   Thread.sleep(2000);
}
public void TrainerPassword() throws InterruptedException {
	   WebElement TrainerPword1=driver.findElement(By.id("password"));
	   TrainerPword1.sendKeys("trainer@123");
	   Thread.sleep(2000);
}
public String url3() {
	   String url3=driver.getCurrentUrl();
	   return url3;
}
public void InvalidtrainerUsername() throws InterruptedException {
	   WebElement TrainerUname=driver.findElement(By.id("username"));
	   TrainerUname.sendKeys("trainert1");
	   Thread.sleep(2000);
}
public void InValidtrainerPassword() throws InterruptedException {
	   WebElement TrainerPword1=driver.findElement(By.id("password"));
	   TrainerPword1.sendKeys("ggggdd@123");
	   Thread.sleep(2000);
}
public String Invalidtrainercheck() {
	   WebElement text8=driver.findElement(By.xpath("//div[@class='fade alert alert-danger alert-dismissible show']"));
	   String Text8=text8.getText();
	   return Text8;	
}
public void TrainerLearnerform() {
	   WebElement TrainerLearner=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/a[1]/button"));
	   TrainerLearner.click();
}
public String TrainerLearnercheck() {
	   WebElement text9=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/div/h3"));
	   String Text9=text9.getText();
	   return Text9;
}
public void LearnerId() {
	   WebElement LearnerId=driver.findElement(By.id("learnerid"));
	   LearnerId.sendKeys("45");
}
public void Learnername() {
	   WebElement Name1=driver.findElement(By.id("name"));
	   Name1.sendKeys("Sarangi");
}
public void coursename() {
	   WebElement crsname=driver.findElement(By.xpath("//select[@name='course']"));
	   crsname.click();
	   Select course=new Select(crsname);
	   course.selectByVisibleText("FSD");
}
public void Projectname() {
	   WebElement project=driver.findElement(By.xpath("//select[@name='project']"));
	   project.click();
	   Select pjt=new Select(project);
	   pjt.selectByVisibleText("ICTAK");
}
public void Batchname() {
	   WebElement batch=driver.findElement(By.xpath("//select[@name='batch']"));
	   batch.click();
	   Select batchnam=new Select(batch);
	   batchnam.selectByVisibleText("May_22");
}
public void CourseStatus() {
	   WebElement CrsStatus=driver.findElement(By.xpath("//select[@name='cstatus']"));
	   CrsStatus.click();
	   Select cstatus=new Select(CrsStatus);
	   cstatus.selectByVisibleText("Qualified");
}
public void SubmitButton() {
	   WebElement sbt=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	   sbt.click();
}
public String SubmitbuttonCheck1() {
	   WebElement text10=driver.findElement(By.id("swal2-html-container"));
	   String Text10=text10.getText();
	   return Text10;	
}
public void LearnerId2() {
	   WebElement LearnerId=driver.findElement(By.id("learnerid"));
	   LearnerId.sendKeys(" ");
}
public void Learnername2() {
	   WebElement Name1=driver.findElement(By.id("name"));
	   Name1.sendKeys("daya");
}
public void coursename2() {
	   WebElement crsname=driver.findElement(By.xpath("//select[@name='course']"));
	   crsname.click();
	   Select course=new Select(crsname);
	   course.selectByVisibleText("FSD");
}
public void Projectname2() {
	   WebElement project=driver.findElement(By.xpath("//select[@name='project']"));
	   project.click();
	   Select pjt=new Select(project);
	   pjt.selectByVisibleText("ICTAK");
}
public void Batchname2() {
	   WebElement batch=driver.findElement(By.xpath("//select[@name='batch']"));
	   batch.click();
	   Select batchnam=new Select(batch);
	   batchnam.selectByVisibleText("May_22");
}
public void CourseStatus2() {
	   WebElement CrsStatus=driver.findElement(By.xpath("//select[@name='cstatus']"));
	   CrsStatus.click();
	   Select cstatus=new Select(CrsStatus);
	   cstatus.selectByVisibleText("Qualified");
}
public void SubmitButton2() {
	   WebElement sbt=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	   sbt.click();
}
public String SubmitbuttonCheck2() {
	   WebElement text11=driver.findElement(By.xpath("//p[@class='fw-light fst-italic text-start text-danger']"));
	   String Text11=text11.getText();
	   return Text11;	
}
public void BulkUsersadditionbutton() {
	   WebElement Bulkadditionbtn=driver.findElement(By.xpath("//button[@type='button' and contains(@class, 'btn-success')]/ion-icon[@name='cloud-upload']\r\n" + ""));
	   Bulkadditionbtn.click();
}
public String Bulkbuttoncheck() {
	   WebElement text12=driver.findElement(By.xpath("//label[text()='Upload a CSV File :']"));
	   String Text12=text12.getText();
	   return Text12;
}
public void ChooseFile() {
	   WebElement Choose=driver.findElement(By.name("file"));
	   Choose.sendKeys("C:\\Users\\Dell\\Documents\\Data.csv");
	   Choose.click();
}
public void SubmitFile1(){
	   WebElement Submitfile=driver.findElement(By.xpath("//button[@class='ui grey mini button' and text()='Submit']"));
	   Submitfile.click();
}
public void trainerBacktodashboard() {
	   WebElement trainerbck=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	   trainerbck.click();
}

}




























