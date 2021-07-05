package com.application.posapplication.model;

import java.util.Date;

public class MeetingUploadPageModel {
    private int id;
    private String title;
    private String date;
    private String input;

    public MeetingUploadPageModel(int id, String title, String date, String input){
        this.id = id;
        this.title = title;
        this.date = date;
        this.input = input;
    }

    public MeetingUploadPageModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDate(){
        return date;
    }

    public String getInput(){
        return input;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setInput(String input){
        this.input = input;
    }
}
