package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class lexicalEntries {


    @SerializedName("grammaticalFeatures")
    @Expose
    private List<GrammaticalFeatures> grammaticalFeatures ;
    @SerializedName("inflectionOf")
    @Expose
    private List<InflectionOf> inflectionOf ;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("lexicalCategory")
    @Expose
    private com.rana_aditya.spider_task_3.lexicalCategory lexicalCategory;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("entries")
    @Expose
     private List<entries> entries;

    public lexicalEntries(List<GrammaticalFeatures> grammaticalFeatures, List<InflectionOf> inflectionOf, String language, com.rana_aditya.spider_task_3.lexicalCategory lexicalCategory, String text, List<com.rana_aditya.spider_task_3.entries> entries) {
        this.grammaticalFeatures = grammaticalFeatures;
        this.inflectionOf = inflectionOf;
        this.language = language;
        this.lexicalCategory = lexicalCategory;
        this.text = text;
        this.entries = entries;
    }

    public List<GrammaticalFeatures> getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(List<GrammaticalFeatures> grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public List<InflectionOf> getInflectionOf() {
        return inflectionOf;
    }

    public void setInflectionOf(List<InflectionOf> inflectionOf) {
        this.inflectionOf = inflectionOf;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public com.rana_aditya.spider_task_3.lexicalCategory getLexicalCategory() {
        return lexicalCategory;
    }

    public void setLexicalCategory(com.rana_aditya.spider_task_3.lexicalCategory lexicalCategory) {
        this.lexicalCategory = lexicalCategory;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<com.rana_aditya.spider_task_3.entries> getEntries() {
        return entries;
    }

    public void setEntries(List<com.rana_aditya.spider_task_3.entries> entries) {
        this.entries = entries;
    }
}
