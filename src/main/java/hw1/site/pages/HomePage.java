package hw1.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import hw1.site.pageComponents.Header;
import lombok.Getter;

@Url("index.html")
@Title("Home page")
public class HomePage extends WebPage {

    @Getter
    private Header header;

}
