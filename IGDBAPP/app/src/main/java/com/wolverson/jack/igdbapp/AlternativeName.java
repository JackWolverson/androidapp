
package com.wolverson.jack.igdbapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlternativeName {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("comment")
    @Expose
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
