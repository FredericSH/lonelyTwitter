package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * NormalTweet class
 * @author shida
 */

public class NormalTweet extends Tweet {
    /**
     * normal tweet constructor
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * normal tweet constructor
     * @param date
     * @param message
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}
