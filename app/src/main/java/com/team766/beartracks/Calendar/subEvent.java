package com.team766.beartracks.Calendar;

import com.team766.beartracks.Roster.Person;

import java.util.HashMap;
import java.util.List;

/**
 * Created by tommypacker on 8/3/15.
 */
public class subEvent {

    private String end;
    private String start;
    private HashMap<String, Person> people;
    private String title;
    private String type;
    private String description;
    private String time;

    public subEvent(){}

    public String getDescription(){
        return description;
    }

    public String getTime(){
        return time;
    }

    public String getEnd(){
        return end;
    }

    public String getStart(){
        return start;
    }

    public String getTitle(){
        return title;
    }

    public HashMap<String, Person> getPeople(){
        return people;
    }

    public String getType(){
        return type;
    }

}
