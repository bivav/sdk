package com.recotap.recotapsdk;

import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;

public class Recotap {

    public Recotap(String key) {
        Log.i("RecotapDetails " + 1, key);
    }

    public void login(HashMap loginDetails) {
        JSONObject jsonObject = new JSONObject(loginDetails);
        Log.i("RecotapDetails " + 2, String.valueOf(loginDetails));
    }

    public void emit(String eventName, HashMap eventData) {

        JSONObject jsonObject = new JSONObject(eventData);

        Log.i("RecotapDetails " + 3, eventName + " " + String.valueOf(jsonObject));
    }

    public void logout() {
        Log.i("RecotapDetails " + 4, "Logged Out!");
    }

}
