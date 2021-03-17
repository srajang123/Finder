package com.koders.finder.models;

import com.koders.finder.constants.Branch;
import com.koders.finder.constants.Year;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class User {
    String name;
    String branch;
    String id;
    int year;
    ArrayList<Achievement> achievements=new ArrayList <Achievement>() ;

    Id ID=new Id();

    public User()
    {
        name="";
        branch="";
        id="";
        year=0;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = Branch.getBranch(branch);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = ID.getId(id);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = Year.getYear(year);
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(Achievement achievement) {
        this.achievements.add(achievement);
    }
}
