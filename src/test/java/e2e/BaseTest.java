package e2e;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class BaseTest {

    @Test
    public void goToBasePage(){
        String baseUrl = "http://www.onet.pl";
        open(baseUrl);
    }
}
