package com.jwebmp.webawesomepro;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class WebAwesomeProInclusionModule implements IGuiceScanModuleInclusions<WebAwesomeProInclusionModule> {
    @Override
    public Set<String> includeModules() {
        Set<String> set = new HashSet<>();
        set.add("com.jwebmp.webawesomepro");
        return set;
    }
}
