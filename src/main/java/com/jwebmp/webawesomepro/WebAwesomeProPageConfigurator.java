/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.webawesomepro;

import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

@PluginInformation(pluginName = "Web Awesome Pro",
        pluginDescription = "Make something awesome with open-source web components",
        pluginUniqueName = "WebAwesomePro",
        pluginVersion = "0.0.1",
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

    @Override
    public IPage<?> configure(IPage<?> page) {
        //page.set
        return page;
    }

    @Override
    public boolean enabled() {
        return true;
    }

}
