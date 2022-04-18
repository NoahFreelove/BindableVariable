package com.company.Bindable.Types;

import com.company.Bindable.Core.BindManager;
import com.company.Bindable.Core.Bindable;

public class BindableObject extends Bindable {

    public BindableObject(Object defaultValue, String name, BindManager manager) {
        super(defaultValue, name, manager);
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
