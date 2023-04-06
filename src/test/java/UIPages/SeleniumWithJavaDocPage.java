package UIPages;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class SeleniumWithJavaDocPage extends PageObject {

    public String javaDocHeaderIsVisible(){
        return $("#selenium-with-java").getText();
    }
}
