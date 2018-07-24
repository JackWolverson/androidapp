
package com.wolverson.jack.igdbapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pegi {

    @SerializedName("rating")
    @Expose
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
