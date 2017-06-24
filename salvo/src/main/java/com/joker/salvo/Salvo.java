package com.joker.salvo;

import android.content.Context;

import com.joker.salvo.net.RequestQueue;

/**
 * 基于Volley设计思想
 * Created by joker on 2017/6/23.
 */

public class Salvo {


    private RequestQueue queue;


    private Salvo() {
    }


    public static Salvo build() {
        return SalvoHolder.sInstance;
    }

    private static class SalvoHolder {
        private static Salvo sInstance = new Salvo();
    }


    public RequestQueue buildRequestQueue(Context context) {
        if (queue != null) {
            return queue;
        }

        return null;
    }


}
