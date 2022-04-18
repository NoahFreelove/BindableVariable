package com.company.Bindable.Types;

import com.company.Bindable.Core.BindManager;
import com.company.Bindable.Core.Bindable;

public class BindableString extends Bindable {

    public BindableString(String defaultValue, String name, BindManager manager) {
        super(defaultValue, name, manager);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getValue(){
        return (String)super.getValue();
    }
}
