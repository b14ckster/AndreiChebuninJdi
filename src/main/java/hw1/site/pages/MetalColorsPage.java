package hw1.site.pages;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import hw1.site.pageComponents.Header;
import hw1.site.pageComponents.MetalColorsForm;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Url("metals-colors.html")
@Title("Metal and Colors")
@Getter
public class MetalColorsPage extends WebPage {
    private Header header;
    private MetalColorsForm metalColorsForm;

    @Css("ul.results")
    private WebList results;

    public List<String> getResultAsListString() {
        return this
            .getResults()
            .stream()
            .map(el -> el.getText())
            .collect(Collectors.toList());
    }

}
