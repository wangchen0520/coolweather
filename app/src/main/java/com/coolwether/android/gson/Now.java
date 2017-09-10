package com.coolwether.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hasee on 2017/9/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
