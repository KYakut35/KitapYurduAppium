import org.openqa.selenium.By;

public class Elements {


    // Used Elements
    static By laterButton = By.id("com.mobisoft.kitapyurdu:id/btnLaterOn");
    static By searchButton = By.id("com.mobisoft.kitapyurdu:id/navigation_search");
    static By searchBookField = By.id("com.mobisoft.kitapyurdu:id/searchEditText");
    static By firstBookFromSearchList = By.xpath("//android.widget.ListView[@resource-id=\"com.mobisoft.kitapyurdu:id/searchListView\"]/android.widget.LinearLayout[1]");
    static By sortButton = By.id("com.mobisoft.kitapyurdu:id/sortButton");
    static By mostEvaluatedCheckBox = By.xpath("(//android.view.ViewGroup[@resource-id=\"com.mobisoft.kitapyurdu:id/containerView\"])[9]");
    static By selectRandomBook = By.xpath("//android.widget.ImageView[@content-desc=\"Ürün görseli\"]");
    static By isBookImageVisible = By.id("com.mobisoft.kitapyurdu:id/imageViewProduct");
    static By getBookPrice = By.id("com.mobisoft.kitapyurdu:id/textViewSellPriceBottom");
    static By addToCartButton = By.id("com.mobisoft.kitapyurdu:id/addToCartNormalView");
    static By loginButton = By.xpath("//android.widget.RelativeLayout[contains(@content-desc, \"Giriş\")]");
    static By emailField = By.id("com.mobisoft.kitapyurdu:id/textview_mail");
    static By passwordField = By.id("com.mobisoft.kitapyurdu:id/textview_password");
    static By continueLoginButton = By.id("com.mobisoft.kitapyurdu:id/loginButton");
    static By goToCartButton = By.xpath("//android.widget.FrameLayout[contains(@content-desc,\"Sepet\")]");
    static By cartTotal = By.id("com.mobisoft.kitapyurdu:id/textViewTotal");
    static By deleteBookButton = By.xpath("//android.widget.TextView[@text=\"Sil\"]");
    static By deleteBookPopUp = By.xpath("//android.widget.RelativeLayout[@content-desc=\"Sil\"]");
    static By cartMessage = By.id("com.mobisoft.kitapyurdu:id/textViewErrorMessage");
    static By navigateToHomeButton = By.id("com.mobisoft.kitapyurdu:id/navigation_home");
    static By myAccountButton = By.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account");
    static By logoutButton = By.id("com.mobisoft.kitapyurdu:id/ln_logout");
    static By logoutConfirmButton = By.id("com.mobisoft.kitapyurdu:id/confirmButton");



}
