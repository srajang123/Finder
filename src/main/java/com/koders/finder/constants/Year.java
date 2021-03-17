package com.koders.finder.constants;

import lombok.NonNull;

public class Year {
    public static final int I=1;
    public static final int II=2;
    public static final int III=3;
    public static final int IV=4;

    public static int getYear(@NonNull int yr)
    {
        int year=0;
        switch(yr){
            case 1:year=I;
                break;
            case 2:year=II;
                break;
            case 3:year=III;
                break;
            case 4:year=IV;
                break;
            default: System.out.println("No Year");
        }
        return year;
    }
}
