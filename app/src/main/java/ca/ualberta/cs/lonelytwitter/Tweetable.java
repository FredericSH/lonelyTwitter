package ca.ualberta.cs.lonelytwitter;

/**
 * tweetable interface class
 * @author shida
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
