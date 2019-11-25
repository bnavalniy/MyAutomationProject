package components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.DressesPage;
import pages.WomenPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Header {
    private final SelenideElement logoElement = $("#header_logo");
    private final SelenideElement contactLink = $("#contact-link");
    private final SelenideElement loginLink = $(".login");
    private final SelenideElement searchBlock = $("#searchbox");
    private final SelenideElement searchInput = searchBlock.$(".search_query");
    private final SelenideElement searchButton = searchBlock.$(".button-search");
    private final SelenideElement topMenu = $("#block_top_menu");
    private final ElementsCollection topMenuLinks = topMenu.$$(".menu-content>li>a");
    private final SelenideElement womenCategoryTab = topMenuLinks.find(attribute("title", "Women"));
    private final SelenideElement dressesCategoryTab = topMenuLinks.find(attribute("title", "Dresses"));
    private final SelenideElement tShirtsCategoryTab = topMenuLinks.find(attribute("title", "T-shirts"));

    private final SelenideElement casualDressesLink = $(By.linkText("Casual Dresses"));
    private final SelenideElement eveningDressesLink = $(By.linkText("Evening Dresses"));
    private final SelenideElement summerDressesLink = $(By.linkText("Summer Dresses"));



    public Header waitForElements() {
        logoElement.shouldBe(visible);
        contactLink.shouldBe(visible);
        loginLink.shouldBe(visible);
        searchInput.shouldBe(visible);
        searchButton.shouldBe(visible);
        womenCategoryTab.shouldBe(visible);
        dressesCategoryTab.shouldBe(visible);
        tShirtsCategoryTab.shouldBe(visible);
        return this;
    }

    public DressesPage chooseDressesCategory() {
        dressesCategoryTab.click();
        return new DressesPage();
    }

    public DressesPage typesOfDressesPresented() {
        dressesCategoryTab.hover();
        //dressesCategoryTab.click();
        casualDressesLink.shouldBe(visible);
        eveningDressesLink.shouldBe(visible);
        summerDressesLink.shouldBe(visible);
        return new DressesPage();
    }

    public WomenPage chooseWomenCategory() {
        womenCategoryTab.click();
        return new WomenPage();
    }

    public void findProduct(String searchQuery) {
        searchInput.setValue(searchQuery);
        searchButton.click();
    }

}
