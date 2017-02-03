package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * ImportantTweet class, extension of tweet class, with boolean isImportant -> true
 * @author shida
 * @see Tweet
 * @see NormalTweet
 */

public class ImportantTweet extends Tweet {
    /**
     * important tweet constructor
     * @param message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * important tweet constructor
     * @param date
     * @param message
     */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
