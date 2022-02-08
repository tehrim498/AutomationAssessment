package Assignment.pages;

import org.openqa.selenium.By;

public class HomePage {
    public static final By contactUs = By.id("contact-link");
    public static final By customerService = By.xpath("//select[@name='id_contact']/option[@value='2']");
    public static final By Email = By.id("email");
    public static final By Msg = By.id("message");
    public static final By send = By.id("submitMessage");

}
