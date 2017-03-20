package com.coolwather.android.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Created by chenyuchong on 2017/3/20.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
