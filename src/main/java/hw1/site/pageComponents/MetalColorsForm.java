package hw1.site.pageComponents;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.ui.html.elements.common.Button;
import hw1.entities.MetalColorsEntity;
import lombok.Getter;

@FindBy(className = "uui-main-container page-inside")
@Getter
public class MetalColorsForm extends Form<MetalColorsEntity> {

    @Css("div#summary-block")
    private SummaryBlock summary;

    @Css("div#elements-block input")
    private Checklist elements;

    @JDropdown(
        root = "#colors",
        list = "li"
        )
    private Dropdown colors;

    @JDropdown(
        root = "#metals",
        list = "li"
    )
    private Dropdown metals;

    @JDropdown(
        root = "#vegetables",
        list = "li"
    )
    private Dropdown vegetables;

    @Css("#submit-button")
    private Button submitButton;

    public void setSubmitButton(MetalColorsEntity entity) {
        vegetables.select("Vegetables");

        summary.getOddRadioButton().select(entity.getSummary().get(0).toString());
        summary.getEvenRadioButton().select(entity.getSummary().get(1).toString());
        elements.select(entity.getElements().toArray(String[]::new));
        colors.select(entity.getColor());
        metals.select(entity.getMetals());
        entity.getVegetables().forEach(
            vegetable -> vegetables.select(vegetable)
        );
        this.submitButton.click();
    }

}
