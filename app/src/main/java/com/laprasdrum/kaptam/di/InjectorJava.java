package com.laprasdrum.kaptam.di;

import android.app.Application;

public class InjectorJava {

    private static KaptamComponent component;

    public static void init(Application application) {
        component = DaggerKaptamComponent.builder()
                .androidModule(new AndroidModule(application))
                .build();
    }

    public static KaptamComponent component() {
        return component;
    }
}
