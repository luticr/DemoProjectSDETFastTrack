package com.sdetfasttrack.pages;


import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UploadPage {

    public UploadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='file-upload']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@id='file-submit']")
    public WebElement submitFile;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    public WebElement uploadedFileExt;

    @FindBy(xpath = "//h3[.='File Uploaded!']")
    public WebElement uploadMessage;


    @FindBy(id = "textbox")
    public WebElement enterText;

    @FindBy(xpath = "//div[@class='example']/a")
    public List<WebElement> eachFile;



    //1. Go to http://practice.cybertekschool.com/upload
    //2.Find any file that is not too big in size. And get the path of the file.
    //3.Upload the file
    //4.Assert that file upload message is displayed


    //1. Go to https://www.seleniumeasy.com/test/generate-file-to-download-demo.html
    //2.Enter data in the text area
    //3.Click generate file button generate download link
    //4.Assert that file download button is displayed and Click it.

}
