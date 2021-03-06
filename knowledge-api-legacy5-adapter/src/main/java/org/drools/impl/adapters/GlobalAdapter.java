package org.drools.impl.adapters;

import org.kie.api.definition.rule.Global;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GlobalAdapter implements org.drools.definition.rule.Global {

    private final Global delegate;

    public GlobalAdapter(Global delegate) {
        this.delegate = delegate;
    }

    public String getName() {
        return delegate.getName();
    }

    public String getType() {
        return delegate.getType();
    }

    public static List<org.drools.definition.rule.Global> adaptGlobals(Collection<org.kie.api.definition.rule.Global> globals) {
        List<org.drools.definition.rule.Global> result = new ArrayList<org.drools.definition.rule.Global>();
        for (org.kie.api.definition.rule.Global global : globals) {
            result.add(new GlobalAdapter(global));
        }
        return result;
    }
}
