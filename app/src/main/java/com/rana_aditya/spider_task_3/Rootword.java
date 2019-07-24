package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rootword {


    @SerializedName("metadata")
    @Expose
    private com.rana_aditya.spider_task_3.metadata metadata;
    @SerializedName("results")
    @Expose
    private List<com.rana_aditya.spider_task_3.results> results = null;

    public Rootword(com.rana_aditya.spider_task_3.metadata metadata, List<com.rana_aditya.spider_task_3.results> results) {
        this.metadata = metadata;
        this.results = results;
    }

    public com.rana_aditya.spider_task_3.metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(com.rana_aditya.spider_task_3.metadata metadata) {
        this.metadata = metadata;
    }

    public List<com.rana_aditya.spider_task_3.results> getResults() {
        return results;
    }

    public void setResults(List<com.rana_aditya.spider_task_3.results> results) {
        this.results = results;
    }
}
