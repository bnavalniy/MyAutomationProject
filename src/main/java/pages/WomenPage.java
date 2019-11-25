package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WomenPage {
    private final SelenideElement leftBlockCategories = $("#categories_block_left");
    private final SelenideElement topsLink = leftBlockCategories.find(By.linkText("Tops"));
    private final SelenideElement dressesLink = leftBlockCategories.find(By.linkText("Dresses"));

    public void waitForElements() {
        topsLink.shouldBe(visible);
        dressesLink.shouldBe(visible);
    }
}
