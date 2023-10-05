package org.ict.scripts;


import java.io.IOException;

import org.ict.constants.AutomationConstants;
import org.ict.pages.LearnerTracker;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase {
LearnerTracker tracker;
@Test(priority=1)
    public void ValidAdminLogin() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.AdminUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	String adminurl=tracker.url();
	Assert.assertEquals(adminurl,AutomationConstants.ExpAdminURL);
}
@Test(priority=2)
    public void InvalidAdminLogin1() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.InvalidAdminUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	String admtext=tracker.InvalidAd();
	Assert.assertEquals(admtext,AutomationConstants.text1);
}
@Test(priority=3)
	public void logo() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.AdminUsername();
	Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
	tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	tracker.Logo();
	tracker.logocheck();
	String Logcheck=tracker.logocheck();
	Assert.assertEquals(Logcheck,AutomationConstants.text13);
	
}
@Test(priority=4)
	public void add() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.AdminUsername();
	Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
	tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.AddUser();
	//String Addname=ExcelUtility.getData(1, 0);
	tracker.Name();
	//String Addemail=ExcelUtility.getData(1, 1);
	tracker.Email();
	//String Addusername=ExcelUtility.getData(1, 2);
	tracker.AddUsername();
	//String Addpassword=ExcelUtility.getData(1, 3);
	tracker.AddPassword();
	tracker.Role();
	Thread.sleep(2000);
	tracker.Submit();
	Thread.sleep(2000);
	String submitcheck1=tracker.submitcheck();
	Assert.assertEquals(submitcheck1,AutomationConstants.text2);
}
@Test(priority=5)

    public void Back() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.AdminUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
    tracker.AddUser();
    Thread.sleep(2000);
    tracker.BackDashBoard();
    Thread.sleep(2000);
    String BackToBoard=tracker.BackToCheck();
    Assert.assertEquals(BackToBoard,AutomationConstants.text3);
}

@Test(priority=6)
    public void ClickAdmUpdate() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.AdminUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	Thread.sleep(2000);
    tracker.Adminupdate();
    Thread.sleep(2000);
    String updatecheck=tracker.Adminupcheck();
    Assert.assertEquals(updatecheck, AutomationConstants.text4);
}
@Test(priority=7) 
    public void Updateform() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.AdminUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.Adminupdate();
    Thread.sleep(2000);
    tracker.Update();
    Thread.sleep(2000);
    tracker.Submit();
    System.out.println("Updated Successfully");
    //String updateform =tracker.UpdateCheck();
   // Assert.assertEquals(updateform,AutomationConstants.text5);
}
@Test(priority=8)
    public void delete() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.AdminUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.AdminPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
    tracker.AdminDelete();
}
@Test(priority=9)
    public void ValidPofficerLogin() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.PofficerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.PofficerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	String POurl=tracker.url();
	Assert.assertEquals(POurl,AutomationConstants.ExpPoURL);
}
@Test(priority=10)
    public void InValidPofficerLogin() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.ValidPofficerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.InvalidPofficerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	String InvalidPO=tracker.InvalidPOcheck();
	Assert.assertEquals(InvalidPO,AutomationConstants.text6);
}
@Test(priority=11)
    public void PlacementUpdateClick() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.PofficerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.PofficerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
    tracker.PlacementUpdate();
    Thread.sleep(3000);
    String Plupdate=tracker.PlaceUpcheck();
	Assert.assertEquals(Plupdate,AutomationConstants.text7);
}
@Test(priority=12)
    public void Learnerform() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.PofficerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.PofficerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
    tracker.PlacementUpdate();
    Thread.sleep(3000);
    tracker.Learnersform();
    tracker.submitform();
}
@Test(priority=13)
    public void ValidtrainerLogin() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.TrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.TrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	String trainerurl=tracker.url();
	Assert.assertEquals(trainerurl,AutomationConstants.ExptrainerURL);

}
@Test(priority=14)
    public void InValidtrainerLogin() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.InvalidtrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.InValidtrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	String trainertext=tracker.InvalidAd();
	Assert.assertEquals(trainertext,AutomationConstants.text8);
}
@Test(priority=15)
    public void trainerformchecking() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.TrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.TrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.TrainerLearnerform();
	String trainerformcheck=tracker.TrainerLearnercheck();
	Assert.assertEquals(trainerformcheck,AutomationConstants.text9);
}
@Test(priority=16)
    public void Learnerformdetails() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.TrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.TrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.TrainerLearnerform();
	Thread.sleep(3000);
	tracker.LearnerId();
    tracker.Learnername();
    tracker.coursename();
    tracker.Projectname();
    tracker.Batchname();
    tracker.CourseStatus();
    tracker.SubmitButton();
    String submitcheck1=tracker.SubmitbuttonCheck1();
	Assert.assertEquals(submitcheck1,AutomationConstants.text10);
}
@Test(priority=17)
    public void Learnerformdetails2nagative() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.TrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.TrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.TrainerLearnerform();
	Thread.sleep(3000);
	tracker.LearnerId2();
    tracker.Learnername2();
    tracker.coursename2();
    tracker.Projectname2();
    tracker.Batchname2();
    tracker.CourseStatus2();
    tracker.SubmitButton2();
    String submitcheck2=tracker.SubmitbuttonCheck2();
	Assert.assertEquals(submitcheck2,AutomationConstants.text11);

}
@Test(priority=18)
    public void BulkLearner() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.TrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.TrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.BulkUsersadditionbutton();
	String Bulkbuttoncheck=tracker.Bulkbuttoncheck();
	Assert.assertEquals(Bulkbuttoncheck,AutomationConstants.text12);
}
@Test(priority=19)
    public void Choosefile() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.TrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.TrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.BulkUsersadditionbutton();
	Thread.sleep(3000);
	tracker.ChooseFile();
	Thread.sleep(3000);
	tracker.SubmitFile1();
	Thread.sleep(3000);
}
@Test(priority=20)
    public void trainerbck() throws IOException, InterruptedException {
	tracker=new LearnerTracker(driver);
	//String User=ExcelUtility.getData(0, 0);
	//String Pass=ExcelUtility.getData(0, 1);
	Thread.sleep(3000);
    //tracker.AdminUsername(User);
	tracker.TrainerUsername();
    Thread.sleep(3000);
	//tracker.AdminPassword(Pass);
    tracker.TrainerPassword();
	Thread.sleep(3000);
	tracker.AdminLogin();
	Thread.sleep(3000);
	tracker.TrainerLearnerform();
	Thread.sleep(3000);
    tracker.trainerBacktodashboard();


}

}
