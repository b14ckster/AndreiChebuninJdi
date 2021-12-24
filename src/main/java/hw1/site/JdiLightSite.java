package hw1.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import hw1.site.pages.HomePage;
import hw1.site.pages.MetalColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiLightSite {

    public static HomePage homePage;
    public static MetalColorsPage metalColorsPage;

}
