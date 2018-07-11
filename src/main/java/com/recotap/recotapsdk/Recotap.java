package com.recotap.recotapsdk;

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;

public class Recotap {

    public Recotap(String key) {
        Log.i("EventDetails "+0, key);
    }

    public void getInstance(Context context) {
        Log.i("EventDetails "+1, "Got Instance");
    }

    public void login(HashMap loginDetails) {

        JSONObject object = new JSONObject(loginDetails);

        Log.i("EventDetails "+2, String.valueOf(object));
    }

    public void emit(String eventName, HashMap dataObject) {
        JSONObject object = new JSONObject(dataObject);
        Log.i("EventDetails "+3, eventName + " " + String.valueOf(object));
    }


    public void customEvent(String customEvents) {
        Log.i("EventDetails "+4, String.valueOf(customEvents));
    }

    public void logout() {
        Log.i("EventDetails "+5, "Logged Out!");
    }

}
