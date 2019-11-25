import components.Header;
import extensions.TestExt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.DressesPage;
import pages.MainPage;
import pages.WomenPage;

@Tag("shop")
@Tag("all")
@ExtendWith(TestExt.class)
class ShopTest {

    private Header header;
    private MainPage mainPage;


    @BeforeEach
    void setup() {
        header = new Header();
        mainPage = new MainPage();
    }

    @Test
    @DisplayName("User is able to navigate to Dresses Pages")
    void navigateToDressesPage() {
        mainPage.waitForElements();
        DressesPage dressesPage = header
                .waitForElements()
                .chooseDressesCategory();

        dressesPage.waitForElements();
    }

    @Test
    @DisplayName("User is able to navigate to Women Pages")
    void navigateToWomenPage() {
        mainPage.waitForElements();
        WomenPage womenPage = header
                .waitForElements()
                .chooseWomenCategory();

        womenPage.waitForElements();
    }

    @Test
    @DisplayName("Types of women dresses should be visible after mouse hover action")
    void showTypesOfDressBlock() {
        header.typesOfDressesPresented();
    }

    /*@Test
    @DisplayName("User navigate to casual dresses")
    void casualDressesPresented() {
        DressesPage dressesPage = new DressesPage();
        dressesPage.casualDresses();
    }*/


}
