package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends NavigationBar{
    public ContactsPage(){
        PageFactory.initElements(Driver.get(),this);
    }
     public WebElement getUserRow(String email){
        String xpath = "(//tbody)[1]//tr/td[4][contains(text(), ‘alex@dadsson.com’)]/..";
        return Driver.get().findElement(By.xpath(xpath));
     }
}
