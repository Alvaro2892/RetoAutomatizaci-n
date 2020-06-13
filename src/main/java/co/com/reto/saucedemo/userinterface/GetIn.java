package co.com.reto.saucedemo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GetIn
{
    public static final Target USERNAME = Target.the("Enter Username").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Enter Password").located(By.id("password"));
    public static final Target CLICKLOGIN = Target.the("Click Login").located(By.className("btn_action"));
    public static final Target SCROLLSAUCELABS = Target.the("Scroll Sauce Labs").located(By.className("inventory_item_name"));
    public static final Target CLICKADDTOCART = Target.the("Click on ADDTOCART").located(By.xpath("((//button[@class='btn_primary btn_inventory'])[5])"));
    public static final Target SCROLLSHOPPINGCART = Target.the("Scroll SHOPPING CART").located(By.id("header_container"));
    public static final Target CLICKSHOPPINGCART = Target.the("Click on shopping cart").located(By.xpath("(//span[@class='fa-layers-counter shopping_cart_badge'])"));
    public static final Target CLICKCHECKOUT = Target.the("Click on CheckOut").located(By.xpath("(//a[@class='btn_action checkout_button'])"));
    public static final Target ENTERFIRSTNAME = Target.the("Enter first name").located(By.id("first-name"));
    public static final Target ENTERLASTNAME = Target.the("Enter last name").located(By.id("last-name"));
    public static final Target ENTERPOSTALCODE = Target.the("Enter postal code ").located(By.id("postal-code"));
    public static final Target CLICKCONTINUE = Target.the("Click continue").located(By.xpath("(//input[@class='btn_primary cart_button'])"));
    public static final Target CLICKFINISH = Target.the("Click finish").located(By.xpath("(//a[@class='btn_action cart_button'])"));
    public static final Target VERIFYPAG = Target.the("Verify page").located(By.className("complete-header"));

}
