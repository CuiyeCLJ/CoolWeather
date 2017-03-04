package com.coolweather.android.util;


/**
 * Created by Administrator on 2017.01.22.
 */

public class HttpUtil {
    public static void sendOkHttpUttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
