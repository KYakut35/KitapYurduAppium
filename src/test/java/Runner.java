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
        WebElement randomBook = booksList.get(randomBookIndex); //
        methods.clickElement(randomBook); // Used override clickElement method which using WebElement parameter
        methods.wait(2);

        methods.isDisplayed(Elements.isBookImageVisible,"Book Detail Page "); // Check Big Image visible in screen
        methods.wait(2);

        String bookPriceInBookDetailsPage = methods.getText(Elements.getBookPrice); //Saves bookPrice in detail page
        System.out.println("Book Price in Book Details Page : " + bookPriceInBookDetailsPage);
        methods.wait(2);
        methods.clickElement(Elements.addToCartButton); // click addToCart button
        methods.wait(2);
        methods.clickElement(Elements.loginButton); // click addToCart button
        methods.wait(2);
        methods.writeText(Elements.emailField,"kyakut35@gmail.com"); // click login button
        methods.wait(1);
        methods.writeText(Elements.passwordField,"12345678");
        methods.wait(1);
        methods.clickElement(Elements.continueLoginButton);
        methods.wait(2);

        methods.clickElement(Elements.goToCartButton); // click goToCart button
        methods.wait(2);
        String cartTotalPriceInCartPage = methods.getText(Elements.cartTotal); //Saves bookPrice in cart page
        System.out.println("Cart Total Price in Cart Page : " + cartTotalPriceInCartPage);
        methods.wait(1);
        methods.comparePrice(bookPriceInBookDetailsPage,cartTotalPriceInCartPage); // Comparing two prices
        methods.wait(1);

        methods.clickElement(Elements.deleteBookButton); // click delete button
        methods.wait(2);
        methods.clickElement(Elements.deleteBookPopUp); // click Popup delete button
        methods.wait(2);

        methods.isDisplayed(Elements.cartMessage,"Cart Empty Message"); // Checks cart is empty or not
        methods.wait(2);

        methods.clickElement(Elements.navigateToHomeButton); // click homeButton button
        methods.wait(2);
        methods.clickElement(Elements.myAccountButton); // click myAccount button
        methods.wait(2);
        methods.clickElement(Elements.logoutButton); // click logout button
        methods.wait(2);
        methods.clickElement(Elements.logoutConfirmButton); // click popup logout button

    }


}
