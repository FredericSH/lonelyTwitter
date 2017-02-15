package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by rfsh on 2017-02-14.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    public boolean hasTweet (Tweet tweet) {
        for (Tweet t: tweets) {
            if (t.getMessage().equals(tweet.getMessage()))
                return true;
        }
        return false;
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public Tweet getTweets(int index) {
    }

    public int getCount() {
        return tweets.size();
    }
}
