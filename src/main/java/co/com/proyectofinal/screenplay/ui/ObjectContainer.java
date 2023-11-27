package co.com.proyectofinal.screenplay.ui;

import org.openqa.selenium.By;

public class ObjectContainer {

       public static By DOG_CATEGORY = By.xpath("/html/body/div[1]/div[4]/a[2]");
       public static By PRODUCT_DALMATION = By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[4]/td[1]/a");
       public static By BTN_ADD_TO_CART = By.xpath("//tbody/tr[2]/td[5]/a[1]");
       public static By INPUT_QUANTITY = By.name("EST-9");
       public static By BTN_UPDATE_CART = By.name("updateCartQuantities");
       public static By BTN_PROCEED_TO_CHECKOUT = By.xpath("/html/body/div[2]/div[2]/div[1]/a");
       public static By SMS_LOGIN = By.xpath("//p[contains(text(),'Please enter your username and password.')]");
       public static By BTN_SIGN_IN = By.xpath("//a[contains(text(),'Sign In')]");
       public static By BTN_REGISTER_NOW = By.xpath("//a[contains(text(),'Register Now!')]");
       public static By BTN_SAVE_ACCOUNTS = By.name("newAccount");
}
