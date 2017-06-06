package com.dineshmaharjan.custommodule;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;

public class CustomModuleModule extends ReactContextBaseJavaModule {

    public CustomModuleModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "CustomModule";
    }

    @ReactMethod
    public void getModuleList(final Callback callback) {
        try {

            WritableArray list = getList();
            callback.invoke(null, list);

        } catch (Exception e) {
            callback.invoke("Error", null);
        }
    }


   private WritableArray getList() {

        WritableArray listArr = Arguments.createArray();
        listArr.pushString("react-native-fbsdk");
        listArr.pushString("react-native-camera");
        listArr.pushString("react-native-map");

        return listArr;
    }

}