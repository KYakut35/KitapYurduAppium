import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.*;


public class Runner extends Hook{
    Methods methods = new Methods();



    @Test
    public void openApp() throws InterruptedException {
        methods.wait(10);
        methods.clickElement(Elements.laterButton); //skip popup
        methods.wait(2);
        methods.clickElement(Elements.laterButton); //skip popup
        methods.wait(2);
        methods.clickElement(Elements.searchButton); //click search icon
        methods.wait(2);
        methods.clickElement(Elements.searchBookField); // click search input
        methods.wait(1);
        methods.writeText(Elements.searchBookField,"Harry Potter"); // send keys
        methods.wait(2);
        System.out.println();
        methods.isVisible(Elements.firstBookFromSearchList,"harry potter") ; // Check Harry Potter is contained or not
        methods.wait(2);
        methods.clickElement(Elements.firstBookFromSearchList); // select first dropdown item
        methods.wait(2);
        methods.clickElement(Elements.sortButton); // click sort button
        methods.wait(2);
        methods.clickElement(Elements.mostEvaluatedCheckBox); // click most evaluated checkbox
        methods.wait(2);

        List<WebElement> booksList = methods.findAllElements(Elements.selectRandomBook); // get all elements in screen
        // I cant get all possible books because I don't know how to scroll the emulator.
        Random random = new Random();
        int randomBookIndex = random.nextInt(4);
        WebElement randomBook = booksList.get(randomBookIndex);
        methods.clickElement(randomBook);
        methods.wait(2);

        methods.isDisplayed(Elements.isBookImageVisible,"Book Detail Page ");
        methods.wait(2);

        String bookPriceInBookDetailsPage = methods.getText(Elements.getBookPrice);
        System.out.println("Book Price in Book Details Page : " + bookPriceInBookDetailsPage);
        methods.wait(2);
        methods.clickElement(Elements.addToCartButton);
        methods.wait(2);
        methods.clickElement(Elements.loginButton);
        methods.wait(2);
        methods.writeText(Elements.emailField,"kyakut35@gmail.com");
        methods.wait(1);
        methods.writeText(Elements.passwordField,"12345678");
        methods.wait(1);
        methods.clickElement(Elements.continueLoginButton);
        methods.wait(2);

        methods.clickElement(Elements.goToCartButton);
        methods.wait(2);
        String cartTotalPriceInCartPage = methods.getText(Elements.cartTotal);
        System.out.println("Cart Total Price in Cart Page : " + cartTotalPriceInCartPage);
        methods.wait(1);
        methods.comparePrice(bookPriceInBookDetailsPage,cartTotalPriceInCartPage);
        methods.wait(1);

        methods.clickElement(Elements.deleteBookButton);
        methods.wait(2);
        methods.clickElement(Elements.deleteBookPopUp);
        methods.wait(2);

        methods.isDisplayed(Elements.cartMessage,"Cart Empty Message");
        methods.wait(2);

        methods.clickElement(Elements.navigateToHomeButton);
        methods.wait(2);
        methods.clickElement(Elements.myAccountButton);
        methods.wait(2);
        methods.clickElement(Elements.logoutButton);
        methods.wait(2);
        methods.clickElement(Elements.logoutConfirmButton);

    }


}
