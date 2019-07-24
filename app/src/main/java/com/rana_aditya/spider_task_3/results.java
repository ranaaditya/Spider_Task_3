package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class results {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("lexicalEntries")
    @Expose
    private List<lexicalEntries> lexicalEntries;
    @SerializedName("word")
    @Expose
    private String word;

    public results(String id, String language, List<lexicalEntries> lexicalEntries, String word) {
        this.id = id;
        this.language = language;
        this.lexicalEntries = lexicalEntries;
        this.word = word;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<com.rana_aditya.spider_task_3.lexicalEntries> getLexicalEntries() {
        return lexicalEntries;
    }

    public void setLexicalEntries(List<com.rana_aditya.spider_task_3.lexicalEntries> lexicalEntries) {
        this.lexicalEntries = lexicalEntries;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
