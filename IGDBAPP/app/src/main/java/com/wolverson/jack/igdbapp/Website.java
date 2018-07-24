
package com.wolverson.jack.igdbapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Website {

    @SerializedName("category")
    @Expose
    private int category;
    @SerializedName("url")
    @Expose
    private String url;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
