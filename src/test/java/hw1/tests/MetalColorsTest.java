package hw1.tests;

import static hw1.site.JdiLightSite.metalColorsPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import hw1.dataProviders.FromJsonDataProvider;
import hw1.entities.MetalColorsEntity;
import org.testng.annotations.Test;

public class MetalColorsTest extends BaseTest {

    @Test(dataProvider = "getMetalColorsEntities", dataProviderClass = FromJsonDataProvider.class)
    public void metalColorsFormTest(MetalColorsEntity entity) {
        metalColorsPage.getMetalColorsForm().setSubmitButton(entity);
        assertThat(metalColorsPage.getResultAsListString())
            .isEqualTo(entity.getEntityAsListString());
    }
}
