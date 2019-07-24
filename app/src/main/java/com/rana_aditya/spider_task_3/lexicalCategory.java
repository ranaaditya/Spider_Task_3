package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class lexicalCategory {


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("entries")
    @Expose
    private entries entries;

    public lexicalCategory(String id, String text, com.rana_aditya.spider_task_3.entries entries) {
        this.id = id;
        this.text = text;
        this.entries = entries;
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

    public com.rana_aditya.spider_task_3.entries getEntries() {
        return entries;
    }

    public void setEntries(com.rana_aditya.spider_task_3.entries entries) {
        this.entries = entries;
    }
}
