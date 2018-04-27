package com.example.prem.designc;

import android.app.LauncherActivity;

/**
 * Created by Prem on 4/27/2018.
 */

public class ListItem {
    private String head;
    private String desc;

    public ListItem(String head, String desc){
        this.head=head;
        this.desc=desc;

    }
    public  String getHead(){
        return head;
    }
    public  String getDesc(){
        return desc;
    }

}
