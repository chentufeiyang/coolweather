package com.example.lrb22.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lrb22 on 2017/11/9.
 */

public class Httputil {
            public static  void sendOkHttpRequest(String address, okhttp3.Callback callback){
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder().url(address).build();
                client.newCall(request).enqueue(callback);
            }

}
