package com.jwebmp.webawesomepro.implementations;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.services.interfaces.NpmrcConfigurator;
import com.jwebmp.webawesomepro.WebAwesomeProPageConfigurator;

import java.util.Set;

/**
 * Configures the .npmrc file with the Web Awesome Pro private Cloudsmith registry
 * when {@link WebAwesomeProPageConfigurator#isUseNpm()} is enabled.
 * <p>
 * The generated .npmrc lines set up:
 * <ul>
 *     <li>The scoped registry for @web.awesome.me packages pointing to Cloudsmith</li>
 *     <li>The auth token (from explicit value or ${WEBAWESOME_NPM_TOKEN} env variable)</li>
 * </ul>
 */
public class WebAwesomeProNpmrcConfigurator implements NpmrcConfigurator
{
    @Override
    public Set<String> lines()
    {
        if (WebAwesomeProPageConfigurator.isUseNpm())
        {
            String authToken = Strings.isNullOrEmpty(WebAwesomeProPageConfigurator.getNpmToken())
                    ? "${WEBAWESOME_NPM_TOKEN}"
                    : WebAwesomeProPageConfigurator.getNpmToken();

            return Set.of(
                    "@web.awesome.me:registry=https://npm.cloudsmith.io/fortawesome/webawesome-pro/",
                    "//npm.cloudsmith.io/fortawesome/webawesome-pro/:_authToken=" + authToken
            );
        }

        return Set.of();
    }
}

