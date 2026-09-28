package com.jwebmp.webawesomepro.components.page.faicon;

import com.jwebmp.plugins.fontawesome5.IFontAwesomeIcon;
import com.jwebmp.plugins.fontawesome5.icons.FontAwesomeFreeRegularIcons;
import com.jwebmp.plugins.fontawesome5.icons.FontAwesomeFreeBrandsIcons;
import com.jwebmp.plugins.fontawesome5.options.IconVariant;
import com.jwebmp.plugins.fontawesome5pro.FontAwesomeSharpIcons;
import com.jwebmp.plugins.fontawesome5pro.FontAwesomeVellumIcons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaIconFATest
{
    @Test
    void rendersFreeRegularAndBrandsCatalogs()
    {
        String regular = new WaIconFA<>(FontAwesomeFreeRegularIcons.heart).toString(true);
        assertTrue(regular.contains("family=\"classic\""), regular);
        assertTrue(regular.contains("variant=\"regular\""), regular);
        String brand = new WaIconFA<>(FontAwesomeFreeBrandsIcons.bluesky).toString(true);
        assertTrue(brand.contains("name=\"bluesky\""), brand);
        assertTrue(brand.contains("family=\"brands\""), brand);
        assertTrue(brand.contains("variant=\"brands\""), brand);
    }

    @Test
    void rendersVellumNameFamilyAndStyleThroughExistingInterface()
    {
        IFontAwesomeIcon icon = FontAwesomeVellumIcons.address_card;
        String html = new WaIconFA<>(icon).toString(true);
        assertTrue(html.contains("name=\"address-card\""), html);
        assertTrue(html.contains("family=\"vellum\""), html);
        assertTrue(html.contains("variant=\"solid\""), html);
    }

    @Test
    void supportsOnlyAvailableExplicitStyles()
    {
        String html = new WaIconFA<>(FontAwesomeSharpIcons.house, IconVariant.Thin).toString(true);
        assertTrue(html.contains("family=\"sharp\""), html);
        assertTrue(html.contains("variant=\"thin\""), html);
        assertThrows(IllegalArgumentException.class,
                () -> new WaIconFA<>(FontAwesomeVellumIcons.house, IconVariant.Thin));
    }
}
