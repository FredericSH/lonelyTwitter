package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<CurrentMood> moods;

    public ArrayList<CurrentMood> getMoods() {
        return moods;
    }

    public void setMoods(ArrayList<CurrentMood> moods) {
        this.moods = moods;
    }

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date =  date;
    }

    public abstract Boolean isImportant();

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
