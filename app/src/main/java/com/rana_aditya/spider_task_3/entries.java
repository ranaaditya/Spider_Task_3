package com.rana_aditya.spider_task_3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class entries {
    @SerializedName("etymologies")
    @Expose
    private List<String> etymologies;

    public entries(List<String> etymologies) {
        this.etymologies = etymologies;
    }

    public List<String> getEtymologies() {
        return etymologies;
    }

    public void setEtymologies(List<String> etymologies) {
        this.etymologies = etymologies;
    }
}
