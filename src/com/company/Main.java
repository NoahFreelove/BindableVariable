package com.company;

import com.company.Bindable.Core.BindManager;
import com.company.Bindable.Core.Bindable;
import com.company.Bindable.Types.BindableInt;
import com.company.Bindable.Types.BindableString;

public class Main {
    public static void main(String[] args) {
        BindManager bindManager = new BindManager("Bind Manager");

        BindableInt bindableInt = new BindableInt(50, "Int 1", bindManager);
        bindableInt.increment();
        bindableInt.setValue(bindableInt.getValue() + 10);
        BindableString bindableString = new BindableString("String 1", "String1", bindManager);
        bindableString.addBindEvent(Main::test);
        bindManager.setValue("String1", "String 2");
    }

    static void test(Bindable bindable) {
        System.out.println(bindable.getValue());
    }
}
