package com.koders.finder.constants;

import lombok.NonNull;

public class Branch {
    public final static String CSE="Computer Science and Engineering";
    public final static String IT="Information Technology";
    public final static String ME="Mechanical Engineering";
    public final static String ECE="Electronics Engineering";
    public final static String EN="Electrical Engineering";
    public final static String CIVIL="Civil Engineering";

    public static String getBranch(@NonNull String branchId){
        String branch="";
        switch(branchId)
        {
            case "cse": branch=CSE;
                break;
            case "it": branch=IT;
                break;
            case "me": branch=ME;
                break;
            case "ece": branch=ECE;
                break;
            case "en": branch=EN;
                break;
            case "civil": branch=CIVIL;
                break;
            default: System.out.println("No Branch");
        }
        return branch;
    }
}
