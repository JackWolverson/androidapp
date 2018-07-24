
package com.wolverson.jack.igdbapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Esrb {

    @SerializedName("rating")
    @Expose
    private int rating;
    @SerializedName("synopsis")
    @Expose
    private String synopsis;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

}
