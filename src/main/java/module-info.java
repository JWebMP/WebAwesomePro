import com.guicedee.client.services.config.IGuiceScanModuleInclusions;
import com.jwebmp.core.base.angular.services.interfaces.NpmrcConfigurator;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.webawesomepro.WebAwesomeProInclusionModule;
import com.jwebmp.webawesomepro.WebAwesomeProPageConfigurator;
import com.jwebmp.webawesomepro.implementations.WebAwesomeProNpmrcConfigurator;

module com.jwebmp.webawesomepro {

    exports com.jwebmp.webawesomepro;
    exports com.jwebmp.webawesomepro.implementations;
    exports com.jwebmp.webawesomepro.components.page.faicon;
    exports com.jwebmp.webawesomepro.components.chart;
    exports com.jwebmp.webawesomepro.components.combobox;
    exports com.jwebmp.webawesomepro.components.fileinput;

    requires transitive com.jwebmp.webawesome;
    requires com.jwebmp.core.base.angular.client;
    requires com.jwebmp.core.angular;
    requires static lombok;

    requires static com.jwebmp.plugins.fontawesome5pro;
    requires static com.jwebmp.plugins.fontawesome5;

    requires transitive com.google.common;

    provides IPageConfigurator with WebAwesomeProPageConfigurator;
    provides IGuiceScanModuleInclusions with WebAwesomeProInclusionModule;
    provides NpmrcConfigurator with WebAwesomeProNpmrcConfigurator;

    opens com.jwebmp.webawesomepro to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesomepro.components.page.faicon to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesomepro.components.chart to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesomepro.components.combobox to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesomepro.components.fileinput to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
}