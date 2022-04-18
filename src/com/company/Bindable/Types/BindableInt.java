package com.company.Bindable.Types;

import com.company.Bindable.Core.BindManager;
import com.company.Bindable.Core.Bindable;

public class BindableInt extends Bindable {

    public BindableInt(Integer defaultValue, String name, BindManager manager) {
        super(defaultValue, name, manager);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void increment(){
        setValue(getValue() + 1);
    }

    public void decrement(){
        setValue(getValue() - 1);
    }

    @Override
    public Integer getValue(){
        return (Integer)super.getValue();
    }
}
