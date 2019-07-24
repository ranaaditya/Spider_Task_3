package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InflectionOf {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;

    public InflectionOf(String id, String text) {
        this.id = id;
        this.text = text;
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
}
