package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.UploadPage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

public class UploadDownloadTests {


    UploadPage uploadPage = new UploadPage();


    @Test
    public void uploadTest() {

        //1. Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        //2.Find any file that is not too big in size. And get the path of the file.
        //3.Upload the file
        //4.Assert that file upload message is displayed
    }
}
