package com.example.exercisejsonprocessingtwo.models.dtos;

import com.google.gson.annotations.Expose;

public class SupplierLocalDto {

    @Expose
    private Long Id;
    @Expose
    private String Name;
    @Expose
    private int partsCount;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPartsCount() {
        return partsCount;
    }

    public void setPartsCount(int partsCount) {
        this.partsCount = partsCount;
    }
}
