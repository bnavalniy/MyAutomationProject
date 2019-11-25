import components.Header;
import extensions.TestExt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.MainPage;

@Tag("search")
@Tag("all")
@ExtendWith(TestExt.class)
class SearchTest {

    private Header header;
    private MainPage mainPage;

    @BeforeEach
    void setup() {
        header = new Header();
        mainPage = new MainPage();
    }

    @Test
    @DisplayName("search for faded t-shirt")
    void casualDressesPresented() {
        header.findProduct("faded");
        mainPage.fadedtshirtsFinded();
    }
}
