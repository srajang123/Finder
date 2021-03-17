package com.koders.finder.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Id {
    String id;
    private final Pattern idRegex=Pattern.compile("[1-9][0-9][1-9][0-9][A-Z]{2}[0-9]{4}");

    private void setId(String id){
        this.id=id;
    }

    public String getId(String id) {
        setId(id);
        return IdValidator()?this.id:"";
    }

    public boolean IdValidator()
    {
        return idRegex.matcher(id).find();
    }
}
