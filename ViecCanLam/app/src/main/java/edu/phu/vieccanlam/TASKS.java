package edu.phu.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {
    String name;
    String date;
    String message;
    String priority;

    public TASKS(String message, String name, String date, String priority) {
        this.message = message;
        this.name = name;
        this.date = date;
        this.priority = priority;
    }

    public TASKS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    //
    public HashMap<String, String> toFirebaseObject() {
        HashMap<String, String> tasksObject = new HashMap<String, String>();
        tasksObject.put("name",name);
        tasksObject.put("date",date);
        tasksObject.put("message",message);
        tasksObject.put("priority",priority);
        return tasksObject;
    }
}
