package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement carouselElement = $("#homepage-slider");
    private final SelenideElement productList = $(".product_list");

    public void waitForElements() {
        carouselElement.shouldBe(visible);
    }

    public void fadedtshirtsFinded() {
        productList.find(String.valueOf(attribute("title", "Faded Short Sleeve T-shirts")));
    }

}
