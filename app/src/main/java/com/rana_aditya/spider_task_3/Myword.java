package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import com.google.gson.annotations.Expose;


public class Myword {



        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("metadata")
        @Expose
        private metadata metadata;
        @SerializedName("results")
        @Expose
        private List<results> results ;
        @SerializedName("word")
        @Expose
        private String word;

    public Myword(String id, com.rana_aditya.spider_task_3.metadata metadata, List<com.rana_aditya.spider_task_3.results> results, String word) {
        this.id = id;
        this.metadata = metadata;
        this.results = results;
        this.word = word;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
