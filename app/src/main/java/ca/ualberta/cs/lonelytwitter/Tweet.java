package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Tweet Class provides methods necessary for creating tweets
 * @see Tweetable
 */

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    /**
     * tweet constructor
     * @param message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * tweet constructor
     * @param date
     * @param message
     */
    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * gets date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * gets message
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * sets message
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
