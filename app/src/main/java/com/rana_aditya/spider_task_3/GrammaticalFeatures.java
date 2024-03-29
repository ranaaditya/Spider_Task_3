package com.rana_aditya.spider_task_3;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrammaticalFeatures {




    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("type")
    @Expose
    private String type;

    public GrammaticalFeatures(String id, String text, String type) {
        this.id = id;
        this.text = text;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
