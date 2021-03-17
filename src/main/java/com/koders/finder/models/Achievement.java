package com.koders.finder.models;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Achievement {
    private String name;
    private String type;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
