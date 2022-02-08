package Assignment.pages;

import org.openqa.selenium.By;

public class CartPage {
    public static final By dress = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    public static final By dresstype = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a");
//    public static final By incart = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]");
    public static final By checkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    public static final By printeddress = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
    public static final By incartt = By.xpath("//*[@id=\"add_to_cart\"]");

    public static final By ProductName= By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
    public static final By ProductPrice= By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[1]/span");

    public static final By CartProductName= By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/p/a");
    public static final By CartProductPrice= By.xpath("//*[@id=\"total_product_price_3_13_0\"]");

    public static String productdressName;
    public static String productdressprice;



//    public static String cartdressName;
//    public static String cartdressprice;

    //*[@id="layer_cart"]/div[1]/div[2]/div[4]/a/span




}
