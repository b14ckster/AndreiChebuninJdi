package hw1.site.pageComponents;

import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import lombok.Getter;

@Getter
public class SummaryBlock {

    @FindBy(name = "custom_radio_odd")
    private RadioButtons oddRadioButton;

    @FindBy(name = "custom_radio_even")
    private RadioButtons evenRadioButton;
}
