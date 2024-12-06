package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/** This is the file where all the Team summary report page elements are located and given the appropriate action for those elements **/

public class ReportCardObject	extends TestBase{
    public WebDriver driver;


    public ReportCardObject(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    public WebElement reportheading(){    
        WebElement heading = driver.findElement(By.xpath(prop.getProperty("reportheading.xpath")));
        return heading;
    }

    public String getreportcardheading(){
       String heading = reportheading().getText();
       return heading;
    }
    public WebElement reporttitle(){    
        WebElement heading = driver.findElement(By.xpath(prop.getProperty("reporttitle.xpath")));
        return heading;
    }
    public String getreporttitle(){
        String heading = reporttitle().getText();
        return heading;
     }
//    public WebElement saveastitle() {
//    	WebElement title=driver.findElement(By.xpath("/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-engagement-report[1]/glint-report-detail[1]/div[1]/div[1]/section[2]/glint-report-header[1]/div[1]/div[1]/div[1]/h1[1]"));
//    	return title;
//    }
//    public String getsaveastitle() {
//    	return saveastitle().getText();
//    }
    
    public WebElement buttonsavereport() {
    	WebElement savebtn=driver.findElement(By.xpath(prop.getProperty("report.donebtn.xpath")));
    	return savebtn;
    }
    public void clicksavereportbtn() {
    	buttonsavereport().click();
    }
    
    public WebElement savedreporttitile() {
    	WebElement reporttitle=driver.findElement(By.xpath("//h1[@class='reportTitle']"));
    	return reporttitle;
    }
    
    public String getsavedreporttitle() {
    	return savedreporttitile().getText();
    }

    public WebElement responserate(){
        WebElement response = driver.findElement(By.xpath(prop.getProperty("report.responserate.xpath")));
        return response;
    }

    public void getresponserate(){
        responserate().getText();
    }

    public WebElement surveyparticipation(){
        WebElement survey = driver.findElement(By.xpath(prop.getProperty("report.sec.surveyparticipation.xpath")));
        return survey;
    }
    public String getsurveyparticipation(){
        return surveyparticipation().getText();
    }

    public WebElement celebratingsuccess(){
        WebElement celeb = driver.findElement(By.xpath(prop.getProperty("report.sec.celebrationgsuccess.xpath")));
        return celeb;
    }


    public String getcelebratingsuccess(){
        return celebratingsuccess().getText();
    }

    public WebElement topstrength(){
        WebElement strengh = driver.findElement(By.xpath(prop.getProperty("report.sec.topstrength.xpath")));
        return strengh;
    }
    public String gettopstrength(){
        return topstrength().getText();
    }
    public WebElement topopp(){
        WebElement topp = driver.findElement(By.xpath(prop.getProperty("report.sec.topopp.xpath")));
        return topp;
    }
    public String gettopopp(){
        return topopp().getText();
    }

    public WebElement allscores(){
        WebElement allscore = driver.findElement(By.xpath(prop.getProperty("report.sec.allscore.xpath")));
        return allscore;
    }
    public String getallscore(){
        return allscores().getText();
    }

    public WebElement changecomparison(){
        WebElement comparison = driver.findElement(By.xpath(prop.getProperty("report.keyoutscorecomp.xpath")));
        return comparison;
    }
//    public WebElement topoppiframe(){
//        WebElement iframe = driver.findElement(By.xpath("//glint-video[@class='ng-star-inserted']"));
//        return iframe;
//    }
//    

//
//    public WebElement allscoreiframe(){
//        WebElement iframe = driver.findElement(By.xpath("//p[text()='All Scores']"));
//        return iframe;
//    }
    public WebElement responsepercentage(){
        WebElement response = driver.findElement(By.xpath(prop.getProperty("report.responserateprcentage.xpath")));
        return response;
    }
    public String getresponsepercentage(){
        return responsepercentage().getText();
    }
    public WebElement comments(){
        WebElement cmt = driver.findElement(By.xpath(prop.getProperty("report.commentscount.xpath")));
        return cmt;
    }
    public String getcommentscount(){
        return comments().getText();
    }
    public WebElement commentdiscription(){
        WebElement cmtdis = driver.findElement(By.xpath(prop.getProperty("report.commentdescription.xpath")));
        return cmtdis;
    }
    public String getcommentdiscription(){
        return commentdiscription().getText();
    }

    public WebElement viewcommentsbtn(){
        WebElement cmtview = driver.findElement(By.xpath(prop.getProperty("report.viewcommentbtn.xpath")));
        return cmtview;
    }
    public void clickviewcommentsbtn(){
        viewcommentsbtn().click();
    }

    public WebElement viewcommentstab(){
        WebElement cmttab = driver.findElement(By.xpath(prop.getProperty("report.viewcommentreporttab.xpath")));
        return cmttab;
    }
    public boolean checkviewcommentslider(){
        return viewcommentstab().isDisplayed();
    }

    public WebElement viewcommmentreportbtn(){
        WebElement cmttab = driver.findElement(By.xpath(prop.getProperty("report.viewcommentreportbtn.xpath")));
        return cmttab;
    }
    public void clickviewcommentreportbtn(){
        viewcommmentreportbtn().click();
    }
//    public WebElement filterbtn(){
//        WebElement filter = driver.findElement(By.xpath("//span[text()='Filter Results']"));
//        return filter;
//    }
//    public void clickfilterbtn(){
//        filterbtn().click();
//    }

    public WebElement surveyselectiondrop(){
        WebElement selectiondrop = driver.findElement(By.id(prop.getProperty("report.surveyselectdropdown.id")));
        return selectiondrop;
    }
    public void clicksurveyselectiondrop(){
        surveyselectiondrop().click();
    }
    public WebElement surveyoption(){
        WebElement optionlist = driver.findElement(By.id(prop.getProperty("report.selectsurvey.id")));
        return optionlist;
    }
    public void clicksurveyoption(){
        surveyoption().click();
    }

    public WebElement celebratingsuccessmsg(){
        WebElement celeb = driver.findElement(By.xpath(prop.getProperty("report.celebrationseccessmsg.xpat")));
        return celeb;
    }
    public WebElement celebratingsuccesstooltip(){
        WebElement tool = driver.findElement(By.id(prop.getProperty("reprt.celebrationsuccesstooltip.id")));
        return tool;
    }
    public WebElement keyoutcomehead(){
        WebElement head = driver.findElement(By.xpath(prop.getProperty("report.keyoutocmeheading.xpath")));
        return head;
    }
    
    public String getkeyoutcomehead(){
        return keyoutcomehead().getText();
    }
//    public void trendgraph(){
//         WebElement graph = driver.findElement(By.cssSelector("rect[class='highcharts-background'][width='419']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",graph);
//         Actions action = new Actions(driver);
//          action.moveToElement(graph,200,60).click().build().perform();
//    }

    
    public WebElement learnmore(){
        WebElement learn = driver.findElement(By.xpath(prop.getProperty("report.keyoutcomeleanrmore.xpath")));
        return learn;
    }

    public void clicklearnmore(){
        learnmore().click();
    }

    public WebElement titlelearnmore(){
        WebElement learnmoretitle = driver.findElement(By.xpath(prop.getProperty("report.learnmoretitle.xpath")));
        return learnmoretitle;
    }
    public String getpopuptitle(){
       String titlelearn = titlelearnmore().getText();
       return titlelearn;
    }
    public WebElement helpcomparison(){
        WebElement helpcomp = driver.findElement(By.xpath(prop.getProperty("report.comphelpicon.xpath")));
        return  helpcomp;
    }
    public void clickhelpcomp(){
        helpcomparison().click();
    }
    public WebElement helpfavorablity(){
        WebElement helpfav = driver.findElement(By.xpath(prop.getProperty("report.favhelpicon.xpath")));
        return  helpfav;
    }
    public void clickhelpfav(){
        helpfavorablity().click();
    }
    public WebElement popupclose(){
        WebElement close = driver.findElement(By.xpath(prop.getProperty("report.helppopupclosebtn.xpath")));
        return close;
    }
    public void clickpopupclose(){
        popupclose().click();
    }

    public WebElement drivertextstrength(){
       WebElement drivertxt = driver.findElement(By.xpath(prop.getProperty("report.topstrengthdriver.xpath")));
       return drivertxt;
    }
    public String getdriverstrength(){
       return drivertextstrength().getText();
    }
    public WebElement drivertexttopopp(){
        WebElement drivertxt = driver.findElement(By.xpath(prop.getProperty("report.topoppdriver.xpath")));
        return drivertxt;
    }
    public String getdrivertopopp(){
       return drivertexttopopp().getText();
    }

    public WebElement topstrenghtvideo(){
        WebElement video = driver.findElement(By.xpath(prop.getProperty("report.topstrengthvideo.xpath")));
        return video;
    }
    public void clicktopstrenghtvideo(){
         topstrenghtvideo().click();
    }

    public WebElement topstrenghtvideotopic(){
        WebElement videotopic = driver.findElement(By.xpath(prop.getProperty("report.topstrengthvideotopic.xpath")));
        return videotopic;
    }
    public String gettopstrenghtvideotopic(){
       return topstrenghtvideotopic().getText();
    }

    public WebElement filterclicknewd(){
        WebElement filclick = driver.findElement(By.xpath(prop.getProperty("report.filterclick.xpath")));
        return filclick;
    }

    public WebElement regonizeteamstrength(){
        WebElement videotopic = driver.findElement(By.xpath("//h4[text()='Recognize your team’s strengths']"));
        return videotopic;
    }
    public String getregonizeteamstrength(){
        return regonizeteamstrength().getText();
    }

    public WebElement scoreoverteam(){
        WebElement overtime = driver.findElement(By.xpath(prop.getProperty("report.scoreoverteam.xpath")));
        return overtime;
    }

    public WebElement recognizeteamstrengthplay(){
        WebElement videoplay = driver.findElement(By.xpath(prop.getProperty("report.topstrengthvideoclick.xpath")));
        return videoplay;
    }

    public void recognizeteamstrengthplaybutton(){
        recognizeteamstrengthplay().click();
    }
    
    public WebElement playbtn() {
    	WebElement play = driver.findElement(By.xpath("//iframe[@title='Lean_Into_Your_Strengths']"));
    	return play;
    }
    
    public void clickplaybtn() {
    	playbtn().click();
    }

    public WebElement collabrateonopportunities(){
        WebElement collabrate = driver.findElement(By.xpath(prop.getProperty("report.topopptopic.xpath")));
        return collabrate;
    }

    public WebElement allscorescore(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.allscorescore.xpath")));
        return score;
    }

    public String getallscorescore(){
        return allscorescore().getText();
    }
    public WebElement allscorequestion(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.allscorequestion.xpath")));
        return score;
    }
    public String getallscorequestion(){
        return allscorequestion().getText();
    }
    public WebElement allscoreprevious(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.allscoreprevious.xpath")));
        return score;
    }
    public String getallscoreprevious(){
        return allscoreprevious().getText();
    }
    public WebElement allscoreaverage(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.allscoreaverage.xpath")));
        return score;
    }
    public String getallscoreaverage(){
        return allscoreaverage().getText();
    }
    
    public WebElement allscorecompany() {
    	WebElement score= driver.findElement(By.xpath(prop.getProperty("report.allscorecompany.xpath")));
    	return score;
    }
    public String getallscorecompany() {
    	return allscorecompany().getText();
    }
    public WebElement allscorefavoure(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.allscorefavoure.xpath")));
        return score;
    }
    
    public String getallscorefavoure(){
        return allscorefavoure().getText();
    }
    public WebElement allscorecomments(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.allscoreconmments.xpath")));
        return score;
    }
    public String getallscorecomments(){
        return allscorecomments().getText();
    }

    public WebElement previousmonthscore(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.previousmontscore.xpath"))); //(//div[@data-id='COMPARE_WITH_PREVIOUS'])[2]/glint-change-arrow/span")); //(//span[@class='ng-star-inserted'])[26]
        return score;
    }
    public WebElement hoverovervsprevious() {
    	WebElement vsprevious=driver.findElement(By.xpath(prop.getProperty("report.hoverovervsprevious.xpath")));
    	return vsprevious;
    }
    public String gethoverovertext() {
    	return hoverovervsprevious().getText();
    }
    

    public WebElement favoritebar(){
        WebElement bar = driver.findElement(By.xpath(prop.getProperty("report.allscorefavoritebar.xpath")));
        return bar;
    }
    public WebElement favorabilitydetails() {
    	WebElement scoredetails = driver.findElement(By.xpath(prop.getProperty("report.allscorefavouredetails.xpath")));
    	return scoredetails;
    }
    public String getfavorabilitydetails() {
    	return favorabilitydetails().getText();
    }
    
    
    public WebElement allscoreheading(){
        WebElement head = driver.findElement(By.xpath(prop.getProperty("report.allscoreheading.xpath")));
        return head;
    }
    public String getallscoreheading(){
        return allscoreheading().getText();
    }
    public WebElement allscorvalue(){
        WebElement score = driver.findElement(By.xpath(prop.getProperty("report.allscorevalue.xpath")));
        return score;
    }
    public String getallscorvalue(){
        return allscorvalue().getText();
    }
    public WebElement allcommentcount(){
        WebElement count = driver.findElement(By.xpath(prop.getProperty("report.allcommentcount.xpath")));
        return count;
    }
    public String getallcommentcount(){
        return allcommentcount().getText();
    }
    public WebElement detailedarrow(){
        WebElement arrow = driver.findElement(By.xpath(prop.getProperty("report.detailedarrow.xpath")));
        return arrow;
    }
    public void clickdetailedarrow(){
        detailedarrow().click();
    }

    public WebElement overflowicon(int a){
        WebElement icon = driver.findElement(By.xpath(("//div[@class='menuButton overflow glintButton'])["+a+"]")));
        return icon;
    }
    
    public WebElement addedsecoverflowicon(){
        WebElement icon = driver.findElement(By.xpath(prop.getProperty("report.addedsecoverflowicon.xpath")));
        return icon;
    }
    public void clickaddedaecoverflow() {
    	addedsecoverflowicon().click();
    }
    public WebElement addsectionbutton(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.addsectionbutton.id")));
        return button;
    }
    public void clickaddsectionbutton(){
        addsectionbutton().click();
    }

    public WebElement addsectionsurvey(){
        WebElement button = driver.findElement(By.xpath(prop.getProperty("report.addsectionsurveyresult.xpath")));
        return button;
    }
    public void clickaddsectionsurvey(){
        addsectionsurvey().click();
    }
    public WebElement addsectionsurveytopic(){
        WebElement topic = driver.findElement(By.xpath(prop.getProperty("report.addsectionsurveytopic.xpath")));
        return topic;
    }
    public String getaddsectionsurveytopic(){
        return addsectionsurveytopic().getText();
    }
    public WebElement newsectionheading(){
        WebElement topic = driver.findElement(By.xpath(prop.getProperty("report.newsectionheading.xpath")));
        return topic;
    }
    public String getnewsectionheading(){
        return newsectionheading().getText();
    }
    public WebElement removesection(){
        WebElement topic = driver.findElement(By.id(prop.getProperty("reoport.removesection.id")));
        return topic;
    }
    public void clickremovesection(){
        removesection().click();
    }
    public WebElement attributebutton(){
        WebElement button = driver.findElement(By.xpath(prop.getProperty("report.attributebutton.xpath")));
        return button;
    }
    public void clickattributebutton(){
        attributebutton().click();
    }
    public WebElement marritalstatusoption(){
//        WebElement button = driver.findElement(By.xpath("//ul[@id='menu']//span[text()='Marital Status']"));
        WebElement button = driver.findElement(By.id(prop.getProperty("report.maritalstatusattribute.id")));
        return button;
    }
    public void clickmarritalstatusoption(){
        marritalstatusoption().click();
    }
    public String getmarritalstatusotion(){
        return marritalstatusoption().getText();
    }
    public WebElement gender(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.genderattribute.id")));
        return button;
    }
    public void clickgender(){
        gender().click();
    }
    public String getgender(){
        return gender().getText();
    }
    public WebElement scrollelement(){
//        WebElement button = driver.findElement(By.xpath("//ul[@id='menu']//span[text()='Gender']"));
        WebElement button = driver.findElement(By.xpath("(//em[@class='ng-star-inserted'])[14]"));
        return button;
    }
    public WebElement settingsbutton(){
        WebElement button = driver.findElement(By.xpath(prop.getProperty("report.settingsbutton.xpath")));
        return button;
    }
    public void clicksettingsbutton(){
        settingsbutton().click();
    }

    public WebElement compradio(){
        WebElement button = driver.findElement(By.xpath(prop.getProperty("report.compradio.xpath")));
        return button;
    }
    public void clickcompradio(){
        compradio().click();
    }
    
    public WebElement teamsradio() {
    	WebElement button = driver.findElement(By.xpath(prop.getProperty("report.teamradio.xpath")));
    	return button;  	
    }
    public void clickteamsradio() {
    	teamsradio().click();
    }  
    public WebElement donebutton(){
        WebElement button = driver.findElement(By.xpath(prop.getProperty("report.donebtn.xpath")));
        return button;
    }
    public void clickdonebutton(){
        donebutton().click();
    }
    public WebElement compvalue(){
        WebElement value = driver.findElement(By.xpath(prop.getProperty("report.compvalue.xpath")));
        return value;
    }
    public String getcompvalue(){
        return compvalue().getAttribute("textContent");
    }
    public WebElement radiotext(){
        WebElement text = driver.findElement(By.xpath(prop.getProperty("report.radiotext.xpath")));
        return text;
    }
    public String getradiotext(){
        return radiotext().getText();
    }
    public WebElement exportdropdown(){
//        WebElement button = driver.findElement(By.id("dropdownTrigger_glintDropdown_9f99b382-2438-44c0-8579-8367f3588049"));
        WebElement button = driver.findElement(By.xpath(prop.getProperty("report.exportdropdown.xpath")));
        return button;
    }
    public void clickexportdropdown(){
        exportdropdown().click();
    }
    public WebElement powerpoint(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.powerpoint.id")));
        return button;
    }
    public void clickpowerpoint(){
        powerpoint().click();
    }
    public WebElement pdf(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.pdf.id")));
        return button;
    }
    public void clickpdf(){
        pdf().click();
    }
    public WebElement images(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.images.id")));
        return button;
    }
    public void clickimages(){
        images().click();
    }
    public WebElement spreadsheet(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.spreadsheet.id")));
        return button;
    }
    public void clickspreadsheet(){
        spreadsheet().click();
    }
    public WebElement save(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.save.id")));
        return button;
    }
    public void clicksave(){
        save().click();
    }
    public WebElement saveas(){
        WebElement button = driver.findElement(By.id(prop.getProperty("report.saveas.id")));
        return button;
    }
    public void clicksaveas(){
        saveas().click();
    }
    public WebElement downloadedmsg(){
        WebElement msg = driver.findElement(By.xpath(prop.getProperty("report.downloadmsg.xpath")));
        return msg;
    }
    public String getdownloadedmsg(){
        return downloadedmsg().getText();
    }
    public WebElement exportbtn(){
        WebElement btn = driver.findElement(By.xpath(prop.getProperty("report.savebtn.xpath")));
        return btn;
    }
    public void clickexportbtn(){
        exportbtn().click();
    }
    public WebElement pdfheading(){
        WebElement msg = driver.findElement(By.xpath(prop.getProperty("report.pdfheading.xpath")));
        return msg;
    }
    public String getpdfheading(){
        return pdfheading().getText();
    }
    
    public void keyoutcomeexportbtn() {
    	driver.findElement(By.xpath(prop.getProperty("report.keyoutcomeexportbtn.xpath"))).click();
    	//span[text()='Export']/parent::div[1] //span[text()='Export']
    }
//    public WebElement keypowerpoint(){
//        WebElement button = driver.findElement(By.id("option0"));
//        return button;
//    }
//    public void clickkeypowerpoint() {
//    	keypowerpoint().click();
//    	
//    }
    public WebElement reportname(){
        WebElement inputbox = driver.findElement(By.id(prop.getProperty("report.reportname.id")));
        return inputbox;
    }
    public void enterreportname(){
        reportname().sendKeys("Team Summary Copy");
    }
    public WebElement downloadicon(){
        WebElement icon = driver.findElement(By.xpath(prop.getProperty("report.downloadicon.xpath")));
        return icon;
    }
    
    public WebElement keyoutcomedriver() {
    	WebElement key = driver.findElement(By.xpath(prop.getProperty("report.keyoutcomedriver.xpath")));
    	return key;
    }
    
    public String getkeyoutcome() {
    	String keyoutname = keyoutcomedriver().getText();
    	return keyoutname;
    }
    
    public WebElement primaryhierechyheading() {
    	WebElement primary=driver.findElement(By.xpath(prop.getProperty("report.primaryhierarchyheading.xpath")));
        return primary;
    }
    public String getprimaryhierachyheading() {
    	return primaryhierechyheading().getText();
    }
    
    public WebElement username() {
    	WebElement user=driver.findElement(By.xpath(prop.getProperty("report.primaryhierarchyusername.xpath")));
    	return user;
    }
    public String getusername() {
    	return username().getText();
    }

    public WebElement userheading() {
    	WebElement heading=driver.findElement(By.xpath(prop.getProperty("report.userheading.xpath")));
    	return heading;
    }
    public String getuserheading() {
    	return userheading().getText();
    }
    
    public WebElement userscore() {
    	WebElement primaryhierachyscore = driver.findElement(By.xpath(prop.getProperty("report.userscore.xpath")));
    	return primaryhierachyscore;
    }
    public String getuserscore() {
    	return userscore().getText();
    }
    public WebElement uservsprevious() {
    	WebElement vsprevious=driver.findElement(By.xpath(prop.getProperty("report.uservspreiousscore.xpath")));
    	return vsprevious;
    }
    public String getuservsprevious() {
    	return uservsprevious().getText();
    }
    public WebElement uservscompany() {
    	WebElement vscompany=driver.findElement(By.xpath(prop.getProperty("report.uservscompany.xpath")));
    	return vscompany;   			
    }
    public String getuservscompany() {
    	return uservscompany().getText();
    }
    public WebElement userfavorability() {
    	WebElement favorite=driver.findElement(By.xpath(prop.getProperty("report.userfavorability.xpath")));
    	return favorite;
    }
    public String getuserfavorability() {
    	return userfavorability().getText();
    }
    public WebElement usercomments() {
    	WebElement comments=driver.findElement(By.xpath(prop.getProperty("report.usercomments.xpath")));
    	return comments;
    }
    public String getusercomments() {
    	return usercomments().getText();
    }
    public WebElement keyoutcomedetailedarrow() {
    	WebElement arrow= driver.findElement(By.xpath(prop.getProperty("report.keyoutcomedetailedarrow.xpath")));
    	return arrow;
    }
    public void clickkeyoutcomearrow() {
    	keyoutcomedetailedarrow().click();
    }
    public WebElement allscorekeyoutcome() {
    	WebElement allscore=driver.findElement(By.xpath(prop.getProperty("report.keyoutcomeallscore.xpath")));
    	return allscore;
    }
    public String getallscorekeyoutcome() {
    	return allscorekeyoutcome().getText();
    }
    public WebElement filterpanel() {
    	WebElement addfilter=driver.findElement(By.xpath(prop.getProperty("report.filterpanel.xpath")));
    	return addfilter;
    }
    public void clickfilterpanel() {
    	filterpanel().click();
    }
    public WebElement addfilterbtn() {
    	WebElement filter=driver.findElement(By.xpath(prop.getProperty("report.addfilterbtn.xpath")));
    	return filter;
    }
    public void clickaddfilterbtn() {
    	addfilterbtn().click();
    }
    public WebElement selectgenderattribute() {
    	WebElement attribute=driver.findElement(By.xpath(prop.getProperty("report.selectattribute.xpath")));
    	return attribute;
    }
    public void clickselectgenderattribute() {
    	selectgenderattribute().click();    	
    }
    public WebElement selectattributeoption() {
    	WebElement options=driver.findElement(By.xpath(prop.getProperty("report.selectattributeoption.xpath")));
    	return options;
    }
    public void clickselectattributeoption() {
    	selectattributeoption().click();
    }
    public WebElement filterdonebtn() {
    	WebElement done=driver.findElement(By.xpath(prop.getProperty("report.filterdonebtn.xpath")));
    	return done;
    }
    public void clickfilterdonebtn() {
    	filterdonebtn().click();
    }
    public WebElement filtereddetails() {
    	WebElement details=driver.findElement(By.xpath(prop.getProperty("report.filtereddetails.xpath")));
    	return details;
    }
    public String getfilterdetails() {
    	return filtereddetails().getText();
    }
    public WebElement advancedfilterlink() {
    	WebElement advanced=driver.findElement(By.xpath(prop.getProperty("report.advancedfilterlink.xpath")));
    	return advanced;
    }
    public void clickadvancedfilterlink() {
    	advancedfilterlink().click();
    }
    public WebElement advancedfilterpopup() {
    	WebElement popup=driver.findElement(By.xpath(prop.getProperty("report.advancedfilterpopup.xpath")));
    	return popup;
    }
    public void clickadvancedfilterpopupbtn() {
    	advancedfilterpopup().click();
    }
    public WebElement plusicon() {
    	WebElement icon=driver.findElement(By.xpath(prop.getProperty("report.plusicon")));
    	return icon;
    }
    public void clickplusicon() {
    	plusicon().click();
    }
    public WebElement addfilterbtnforadvanced(){
    	WebElement addfilter=driver.findElement(By.xpath(prop.getProperty("report.addfilterbtnforadvanced.xpath")));
    	return addfilter;
    }
    public void clickaddfilterforadvanced() {
    	addfilterbtnforadvanced().click();
    }
//    public WebElement searchsurvey() {
//    	WebElement survey=driver.findElement(By.xpath("(//input[@aria-label='Search'])[3]"));
//    	return survey;
//    }
    public WebElement surveyselectadvanced() {
    	WebElement survey=driver.findElement(By.id(prop.getProperty("report.surveyselectadvanced.id")));
    	return survey;
    	
    }
    public void clicksurvey() {
    	surveyselectadvanced().click();
    }
    public void selectgenderattributeforadvanced() {
    	driver.findElement(By.xpath(prop.getProperty("report.selectgenderattributeforadvanced"))).click();
    	  	
    }
    public void selectattributeoptionforadvanced() {
    	driver.findElement(By.xpath(prop.getProperty("report.selectattributeoptionforadvanced"))).click();
    }

    public void filterdonebtnforadvanced() {
    	driver.findElement(By.xpath(prop.getProperty("report.filterdonebtnforadvanced"))).click();    	
    }
    public void advancedaddfilterbtn() {
    	driver.findElement(By.xpath(prop.getProperty("report.advancedaddfilterbtn"))).click();
    }
}
