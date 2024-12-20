import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.webawesomepro.WebAwesomeProInclusionModule;
import com.jwebmp.webawesomepro.WebAwesomeProPageConfigurator;

module com.jwebmp.webawesomepro {

    exports com.jwebmp.webawesomepro.components.page;

    requires transitive com.jwebmp.webawesome;
    requires static lombok;

    provides IPageConfigurator with WebAwesomeProPageConfigurator;
    provides IGuiceScanModuleInclusions with WebAwesomeProInclusionModule;

    opens com.jwebmp.webawesomepro to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesomepro.components.page to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
}