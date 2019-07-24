package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class metadata {


    @SerializedName("provider")
    @Expose
    private String provider;

    @SerializedName("schema")
    @Expose
    private String schema;
    @SerializedName("operation")
    @Expose
    private String operation;

    public metadata(String provider, String schema, String operation) {
        this.provider = provider;
        this.schema = schema;
        this.operation = operation;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
