package com.jwebmp.webawesomepro;

import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;
import lombok.Getter;
import lombok.Setter;

@PluginInformation(pluginName = "Web Awesome Pro",
        pluginDescription = "Make something awesome with open-source web components",
        pluginUniqueName = "WebAwesomePro",
        pluginVersion = "3.8.0",
        pluginCategories = "ui,web ui, framework,kit",
        pluginSubtitle = "Web Awesome is the biggest open-source library of meticulously designed, highly customizable, and framework-agnostic UI components.",
        pluginSourceUrl = "https://github.com/JWebMP/WebAwesomePro",
        pluginWikiUrl = "https://github.com/JWebMP/WebAwesomePro/wiki",
        pluginGitUrl = "https://github.com/JWebMP/WebAwesomePro",
/*        pluginIconUrl = "bower_components/waypoints/waypointsicon.jpg",
        pluginIconImageUrl = "bower_components/waypoints/waypointslogo.jpg",*/
        pluginOriginalHomepage = "https://backers.webawesome.com/docs/installation",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/webawesomepro",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "web-awesome-pro",
        pluginModuleName = "com.jwebmp.webawesomepro",
        pluginStatus = PluginStatus.DevelopmentStarted
)
public class WebAwesomeProPageConfigurator
        implements IPageConfigurator<WebAwesomeProPageConfigurator> {

    /**
     * When true, Web Awesome Pro will be installed via npm from the private Cloudsmith registry.
     * The .npmrc file will be configured with the required registry and auth token placeholder.
     * The @web.awesome.me/webawesome-pro dependency will be added to package.json.
     * Requires the WEBAWESOME_NPM_TOKEN environment variable to be set.
     */
    @Getter
    @Setter
    private static boolean useNpm = false;

    /**
     * The npm auth token for the Web Awesome Pro private registry.
     * If left empty, the .npmrc will use ${WEBAWESOME_NPM_TOKEN} environment variable placeholder.
     */
    @Getter
    @Setter
    private static String npmToken = "";

    @Override
    public IPage<?> configure(IPage<?> page) {
        return page;
    }

    /**
     * When useNpm is enabled, dynamically adds the @web.awesome.me/webawesome-pro
     * TsDependency to the page body so it is included in the generated package.json.
     */
    @Override
    public IPage<?> configureAngular(IPage<?> page) {
        if (useNpm) {
            page.getBody().addConfiguration(
                    AnnotationUtils.getTsDependency("@web.awesome.me/webawesome-pro", "^3.8.0", "webawesome-pro")
            );
        }
        return page;
    }

    @Override
    public boolean enabled() {
        return true;
    }

}
