package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DressesPage {
    private final SelenideElement leftPanelElement = $("#left_column");
    private final SelenideElement categoriesBlock = leftPanelElement.$("#categories_block_left");
    private final SelenideElement filtersBlock = leftPanelElement.$("#layered_block_left");
    private final SelenideElement casualDressesLink = $(By.linkText("Casual Dresses"));
    /*private final SelenideElement itemScope = $(".product_list");
    private final ElementsCollection productList = productListConteiner
*/
    public void waitForElements() {
        categoriesBlock.shouldBe(visible);
        filtersBlock.shouldBe(visible);
    }

    /*public void casualDresses() {
        casualDressesLink.click();

    }*/
}
