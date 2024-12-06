import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.ReportCardObject;
import pageobjects.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;

public class TeamSummaryReport extends TestBase {
	

	ReportCardObject cardObject = new ReportCardObject(driver);
	
	
    public String testname;

    @BeforeMethod
    public void open(Method tname) throws InterruptedException {
        launchbrowser();
        login();
        testname = tname.getName();
        System.out.println("Test Name :" +testname);
        glint.clickReportsheading();
        iwait();
        glint.adhoc();
        driver.navigate().refresh();
        iwait();
        glint.adhoc();
//        glint.clickReportsheading();
        glint.clickAdHoc();
        zoomout();
    }

    @AfterMethod
    public void close() throws IOException {
        takescreenshot(testname);
        closebrowser();
    }

    @Test
    //To Verify team summary report card is available.
    public void TC_001() throws InterruptedException, IOException {
        iwait();
        Assert.assertEquals(report.getreportcardheading(),"Team Summary");
        takescreenshot(testname);

//        Assert.assertEquals(report.getreportheading(),"Team Summary");

    }

    @Test
    // To verify Team summary Report Card showing or not.
    public void TC_002() throws InterruptedException{

        glint.clickTeamsummary();
        Assert.assertEquals(report.getreportcardheading(),"Team Summary");
        report.responserate();
        iwait();
        report.responserate();
    }

    @Test
    //To verify the options in the Team Summary Report
    public void TC_003(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        Assert.assertEquals(report.getsurveyparticipation(),"Survey Participation");
        Assert.assertEquals(report.getcelebratingsuccess(),"Celebrating Success");
        scrollthepage(report.reportheading());
    }
    @Test
    //To Verify the What area should we focus on Module
    public void TC_004() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.changecomparison());
        Assert.assertEquals(report.gettopstrength(),"Top Strengths");
        takescreenshot(testname+"_1");
        scrollthepage(report.topopp());
        Assert.assertEquals(report.gettopopp(),"Top Opportunities");
        takescreenshot(testname+"_2");
        scrollthepage(report.allscores());
        Assert.assertEquals(report.getallscore(),"All Scores");
//        takescreenshot(testname+"_3");
    }
    
    @Test
    //Verify whether the "Primary hierarchy demographic" sections is  getting displayed
    public void TC_005() {
    	glint.clickTeamsummary();
    	iwait();
    	report.responserate();
    	scrollthepage(report.primaryhierechyheading());
    	Assert.assertEquals(report.getprimaryhierachyheading(), "Manager");    
    }
    
    
    
    
    @Test
    //To verify the Response Rate in Survey Participation Section
    public void TC_006(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.getresponsepercentage();
        System.out.println("Response Percentage is "+report.getresponsepercentage());
    }

    @Test
    //To Verify the Total Comments in Survey Participation Section
    public void TC_007(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.getcommentscount();
        System.out.println("Total Comments Count is "+report.getcommentscount());
    }

    @Test
    //To verify Most commented question showing in the Discription or not
    public void TC_008(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        String discription = report.getcommentdiscription();
        String comment = discription.substring(37);
        Assert.assertEquals(comment,"Accountability and Career Path");
        System.out.println("******"+comment+"******");
    }
    @Test
    //To verify the Comments slider working or not
    public void TC_009(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clickviewcommentsbtn();
        iwait();
        report.checkviewcommentslider();
        Assert.assertEquals(report.checkviewcommentslider(),true);
    }
    @Test
    //To verify the View Comments Report Button Working or not
    public void TC_010() throws IOException{
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clickviewcommentsbtn();
        iwait();
        report.checkviewcommentslider();
        report.clickviewcommentreportbtn();

        Assert.assertEquals(comments.commentheading().getText(),"Comments");
        iwait();
        comments.commentsummarycount();
        takescreenshot(testname);

        Assert.assertEquals(comments.commentheading().getText(),"Comments");
        iwait();
        comments.commentsummarycount();

    }
    @Test
    //To Verify the Celebration Success Details correct or not
    public void TC_011(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.responserate());
        mousehover(report.celebratingsuccessmsg());
        iwait();
    }
    @Test
    //To Verify the Key Outcome Details showing or not
    public void TC_012(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.celebratingsuccessmsg());
        Assert.assertEquals(report.getkeyoutcomehead(),"Key Outcome");
        iwait();
    }
    @Test
    //To Verify the key outcome details values
    public void TC_013(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.responserate());
        Assert.assertEquals(report.getkeyoutcomehead(),"Key Outcome");
        iwait();
    }
    @Test
    //To verify the trend graph and appropriate values showing or not
    public void TC_014() throws InterruptedException {

        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.responserate());
//        report.trendgraph();
        iwait();
        
    }

    @Test
    //To Verify the learn more option working or not
    public void TC_015()   {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clicklearnmore();
        Assert.assertEquals(report.getpopuptitle().substring(13),report.getkeyoutcome());
    }

    @Test
    //To Verify the help icon on comparison/ Favorability working or not
    public void TC_016() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clickhelpcomp();
        Assert.assertEquals(report.getpopuptitle(),"Score Comparisons");
        takescreenshot(testname);
        report.clickpopupclose();
        report.clickhelpfav();
        Assert.assertEquals(report.getpopuptitle(),"Favorability Breakdown");
        takescreenshot(testname+"_1");
        report.clickpopupclose();
    }
    @Test
    //To verify the drivers for Top strength/Top Opportunity showing or not
    public void TC_017()   {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        Assert.assertEquals(report.getdriverstrength(),"Ethics");
        Assert.assertEquals(report.getdrivertopopp(),"Career Path");
    }
    @Test
    //To verify the Team Strength Content video showing or not
    public void TC_018()   {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        iwait();
        scrollthepage(report.topstrength());
        report.clicktopstrenghtvideo();
//        report.clicktopstrenghtvideo();
        Assert.assertEquals(report.gettopstrenghtvideotopic(),"Lean_Into_Your_Strengths");
    }

    @Test
    //To verify team strength article showing or not
    public void TC_019()   {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        Assert.assertEquals(report.getregonizeteamstrength(),"Recognize your team’s strengths");
        scrollthepage(report.scoreoverteam());
    }

    @Test
    //To Verify the team strength video playing or not
    public void TC_020() throws InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        Assert.assertEquals(report.getregonizeteamstrength(),"Recognize your team’s strengths");
        scrollthepage(report.scoreoverteam());
        report.recognizeteamstrengthplaybutton();
        report.clickplaybtn();
        iwait();
//Video not playing 
    }
    @Test
    //To Verify all score section drivers are displayed or not
    public void TC_021(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.collabrateonopportunities());
        Assert.assertEquals(report.getallscorescore(),"Score");
        Assert.assertEquals(report.getallscorequestion(),"Question");
        Assert.assertEquals(report.getallscoreprevious(),"vs Previous");
        Assert.assertEquals(report.getallscorecompany(), "vs Company");
//        Assert.assertEquals(report.getallscoreaverage(),"vs Average Question");
        Assert.assertEquals(report.getallscorefavoure(),"Favorability");
        Assert.assertEquals(report.getallscorecomments(),"Comments");
    }
    
    @Test
    //Verify whether the respective primary hierarchy details are getting displayed in the demographic section
    public void TC_022() {
    	glint.clickTeamsummary();
    	iwait();
    	report.responserate();
    	scrollthepage(report.primaryhierechyheading());
    	Assert.assertEquals(report.getuserscore(),"Score");
    	Assert.assertEquals(report.getuserheading(), "Manager");
    	Assert.assertEquals(report.getuservsprevious(), "vs Previous");
    	Assert.assertEquals(report.getuservscompany(), "vs Company");
    	Assert.assertEquals(report.getuserfavorability(), "Favorability");
    	Assert.assertEquals(report.getusercomments(), "Comments");
    	Assert.assertEquals(report.getusername(),"All");
    	
    }

    @Test
    //To Verify tool tip showing the last month value or not while hovering
    public void TC_024() throws InterruptedException{
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.collabrateonopportunities());
        Thread.sleep(4000);
        iwait();
        mouseOver(report.previousmonthscore());
        System.out.println(report.gethoverovertext());
//        Assert.assertEquals(report.gethoverovertext(), "vs Feb"+ "\r\n2019");
        iwait();
    }

    @Test
    //To Verify tool tip showing the favorablity value or not while hovering
    public void TC_025() throws InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.topopp());
        Thread.sleep(4000);
//        driver.navigate().refresh();
        mouseOver(report.favoritebar());        
        Thread.sleep(4000);
        System.out.println(report.getfavorabilitydetails());
        Assert.assertTrue(report.getfavorabilitydetails().contains("Favorable"));
    }
    @Test
    //To Verify detailed arrow button working or not
    public void TC_026() throws InterruptedException{
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.allscores());
        scrollthepage(report.collabrateonopportunities());
        ewait(2,report.detailedarrow());
        report.clickdetailedarrow();
        iwait();
        Assert.assertEquals(summary.getdetailedmainheading(),"Key Outcome");
    }

    @Test
    //To Verify respective summary details showing or not after clicking detail arrow
    public void TC_027() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.allscores());
        String [] allscore = new String[3];
        String [] deatailedpage = new String[3];
        int a=0;
        scrollthepage(report.collabrateonopportunities());
        allscore[0]=report.getallscoreheading();
        allscore[1]=report.getallscorvalue();
        allscore[2]=report.getallcommentcount();
        takescreenshot(testname+"_1");
        ewait(2,report.detailedarrow());
        report.clickdetailedarrow();
        deatailedpage[0]=summary.getdetailedheading();
        deatailedpage[1]=summary.getdetailedscore();
        deatailedpage[2]=summary.getdetailedcommentcount().substring(0, 1);
        for(Object score: allscore){
            Assert.assertEquals(deatailedpage[a],score);
            a++;
        }
        if (a==2){
            Assert.assertTrue(true);
        }
        takescreenshot(testname+"_2");
    }
    @Test
    //To Verify suggested action items are displayed or not in driver summary page
    public void TC_028(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.allscores());
        scrollthepage(report.collabrateonopportunities());
        ewait(2,report.detailedarrow());
        report.clickdetailedarrow();
        scrollthepage(summary.suggestedaction());
        Assert.assertEquals(summary.getsuggestedaction(),"Suggested Actions");
    }
    @Test
    //To Verify suggested learning video items are displayed or not in driver summary page
    public void TC_029(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.allscores());
        scrollthepage(report.collabrateonopportunities());
//        ewait(2,report.detailedarrow());
        report.clickdetailedarrow();
        scrollthepage(summary.suggestedlearning());
        Assert.assertEquals(summary.getsuggestedlearning(),"Suggested Learning");
    }
    @Test
    //To Verify goal creating or not while clicking add action item button
    public void TC_030(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.allscores());
        scrollthepage(report.collabrateonopportunities());
        report.clickdetailedarrow();
        scrollthepage(summary.suggestedaction());
        iwait();
        System.out.println(summary.addactionbutton());
//        Assert.assertEquals(summary.,"Add Action Item");
        summary.clickaddactionbutton();
        Assert.assertEquals(summary.getafteraddactionbutton(),"Update Action Item");
    }
    @Test
    //To Verify correct goal added or not while clicking add action item button
//    public void TC_031(){
//        glint.clickTeamsummary();
//        iwait();
//        report.responserate();
//        scrollthepage(report.allscores());
//        scrollthepage(report.collabrateonopportunities());
//        report.clickdetailedarrow();
//        scrollthepage(summary.suggestedaction());
////        Assert.assertEquals(summary.addactionbutton(),"Add Action Item");
//        summary.clickaddactionbutton();
//        iwait();
//        summary.clickfocusareabutton();
//        summary.clickgoalviewarrow();
//        Assert.assertEquals(summary.getfocusareahead(),summary.getsuggestedaction());
//    }
//    @Test
    //To Verify closing button on driver summary page working or not
    public void TC_032(){
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.collabrateonopportunities());
        report.clickdetailedarrow();
        summary.clickdriversummaryclose();
        iwait();    
        Assert.assertEquals(report.getreporttitle(),"Team Summary");
    }
    @Test
    //To Verify Overflow icon showing or not in every section
    public void TC_033() throws IOException, InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        for (int a=1; a<=6; a++){
            scrollthepage(report.overflowicon(a));
            iwait();
            takescreenshot(testname+"_"+a+"");
        }

    }
    @Test
    //To Verify user able to add or delete sections
    public void TC_034() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.addsectionbutton());
        report.clickaddsectionbutton();
        report.clickaddsectionsurvey();
        ewait(1,report.newsectionheading());
        scrollthepage(report.addsectionbutton());
        String topic = report.getnewsectionheading();
        Assert.assertTrue(topic.contains("Results"));
        takescreenshot(testname+"_1");
        scrollthepage(report.primaryhierechyheading());
        report.clickaddedaecoverflow();
        report.clickremovesection();
    }
    @Test
    //To Verify user able to choose different attributes
    public void TC_035() throws IOException, InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.addsectionbutton());
        report.clickattributebutton();
        iwait();
        scrollthepage(report.marritalstatusoption());
        report.clickmarritalstatusoption();
//        scrollthepage(report.scrollelement());
        takescreenshot(testname+"_1");
        scrollthepage(report.addsectionbutton());
        report.clickattributebutton();
        iwait();
        scrollthepage(report.gender());
        report.clickgender();
        ewait(1,report.addsectionbutton());
//        scrollthepage(report.scrollelement());
    }
    @Test
    //Verify whether clicking the ">" arrow displayed next to the Question aggregates redirects the user to Aggregates details page
    public void TC_038() {
    	glint.clickTeamsummary();
    	iwait();
//    	report.responserate();
    	report.clickkeyoutcomearrow();
    	scrollthepage(report.allscorekeyoutcome());
    	Assert.assertEquals(report.getallscorekeyoutcome(), "All Scores");
    }

    @Test
    //To Verify user able to choose different comparison values and verify that
    public void TC_040() {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clicksettingsbutton();
//        String raditext = report.getradiotext();
//        report.clickcompradio();
        report.clickteamsradio();
        report.clickdonebutton();
        scrollthepage(report.keyoutcomehead());
        ewait(3, report.compvalue());
        String value = report.getcompvalue();
        Assert.assertTrue(value.contains(value));
    }
    @Test
    //To Verify user able to export the report with all format
    public void TC_041() throws IOException, InterruptedException {
        glint.clickTeamsummary();
        iwait();
        String homewindow = driver.getWindowHandle();
        System.out.println("Home window "+homewindow+" End");
        iwait();
        report.responserate();
        ewait(3,report.exportdropdown());
        report.clickexportdropdown();
        report.clickpowerpoint();
        iwait();
//        System.out.println(driver.getWindowHandles());
//        driver.switchTo().window(homewindow);
//        driver.switchTo().window(newwindow);
        System.out.println("Tittle "+driver.getTitle()+" End");
       // iwait();
        iwait();
        takescreenshot(testname+"_1");
        driver.switchTo().window(homewindow);
//        System.out.println("+++++++++++++++++"+report.getdownloadedmsg()+"++++++++++++++++++");
//        System.out.println(report.getdownloadedmsg());        
//        driver.switchTo().window(homewindow);
        ewait(1,report.exportdropdown());
        report.clickexportdropdown();
        report.clickpdf();
        scrollthepage(report.exportbtn());
        report.clickexportbtn();
        iwait();
//        ewait(1,report.pdfheading());
        takescreenshot(testname+"_2");
//        Assert.assertEquals(report.getpdfheading(),"Team Summary");
        driver.switchTo().window(homewindow);
        ewait(1,report.exportdropdown());
        report.clickexportdropdown();
        report.clickimages();
//        ewait(1,report.downloadedmsg());
        takescreenshot(testname+"_3");
//        Assert.assertEquals(report.getdownloadedmsg(),"Report Downloaded!");
        driver.switchTo().window(homewindow);
        ewait(1,report.exportdropdown());
        report.clickexportdropdown();
        report.clickspreadsheet();
        report.clickexportbtn();
//        ewait(1,report.downloadedmsg());
        takescreenshot(testname+"_4");
//        Assert.assertEquals(report.getdownloadedmsg(),"Report Downloaded!");
        driver.switchTo().window(homewindow);
        ewait(1,report.exportdropdown());
        report.clickexportdropdown();
        report.clicksave();
        report.reportname().clear();
        report.enterreportname();
        ewait(1,report.exportbtn());
//        report.exportbtn();
        report.clickexportbtn();
//        ewait(1,report.saveastitle());
        iwait();
        report.savedreporttitile();
        Assert.assertEquals(report.getsavedreporttitle(),"Team Summary Test Copy");
        takescreenshot(testname+"_5");
        report.clickexportdropdown();
        report.clicksaveas();
        report.reportname().clear();
        report.enterreportname();
        report.exportbtn();
        report.clickexportbtn();
//        ewait(1,report.saveastitle());
        iwait();
        report.savedreporttitile();
        Assert.assertEquals(report.getsavedreporttitle(),"Team Summary Test Copy");
//        takescreenshot(testname);

    }
    @Test
    //verify keyoutcome's exports working fine or not
    public void TC_042() throws InterruptedException{
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.responserate());
        report.clickkeyoutcomearrow();
        iwait();
        report.clickkeyoutcomearrow();
       // iwait();
        report.keyoutcomeexportbtn();
        report.clickpowerpoint();
        ewait(1,report.downloadedmsg());
        System.out.println(report.getdownloadedmsg());
        Thread.sleep(2000);
        
    }
    
    @Test
    //Verify whether user is able to save the team summary report
    public void TC_050() throws InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        ewait(3,report.exportdropdown());
        report.clickexportdropdown();
        report.clicksave();
        report.clicksavereportbtn();
        iwait();
        Assert.assertTrue(report.getsavedreporttitle().contains("Team Summary Copy"));//"Team Summary Copy");
        System.out.println(report.getsavedreporttitle());

    }

    @Test
    //Verify whether user is able to generate team summary by applying the different date /attribute/cross program filters
    public void TC_051() throws InterruptedException {
    	glint.clickTeamsummary();
    	iwait();
    	report.responserate();
    	report.clickfilterpanel();
    	report.clickaddfilterbtn();
    	report.clickselectgenderattribute();
    	report.clickselectattributeoption();
    	report.clickfilterdonebtn();
    	report.clickadvancedfilterlink();
    	report.clickadvancedfilterpopupbtn();
    	report.clickplusicon();
//    	report.clickaddfilterforadvanced();
//    	scrollthepage(report.surveyselectadvanced());
    	iwait();
//    	Thread.sleep(5000);
    	report.clicksurvey();
    	report.clickaddfilterforadvanced();
    	report.clickselectgenderattribute();
    	report.clickselectattributeoption();;    	  	
    	report.clickfilterdonebtn();
    	iwait();
    	report.responserate();  
    	System.out.println(report.getfilterdetails());
    	Assert.assertTrue(report.getfilterdetails().contains("Male"));
    }
//    @Test
//    //Verify whether user is able to sort the drivers/teams using the respective column values by clicking on the column header in Team summary report
//    public void TC_052() {
//    	glint.clickTeamsummary();
//    	report.responserate();
//    	scrollthepage(report.allscores());
//    	
//    }
    

}
