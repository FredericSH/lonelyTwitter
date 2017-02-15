package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by rfsh on 2017-02-14.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test1");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        try {
            tweets.add(tweet);
            // if we don't get an exception then this test should fail
            assertFalse(true);
        }
        catch (IllegalArgumentException e) {
        }
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test2");

        tweets.add(tweet);

        assertEquals(tweets.getCount(), 1);

        tweets.add(new NormalTweet("test3"));
        assertEquals(tweets.getCount(), 2);
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test2");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(tweet.getMessage(), returnedTweet.getMessage());
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test3");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }


    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test4");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
        assertFalse(tweets.hasTweet(new NormalTweet("Not the tweet")));
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test1");
        tweet.setDate(new Date(2017, 01, 23));
        Tweet tweet2 = new NormalTweet("test2");
        tweet2.setDate(new Date(2017, 02, 23));
        Tweet tweet3 = new NormalTweet("test3");
        tweet3.setDate(new Date(2017, 03, 20));

        tweets.add(tweet2);
        tweets.add(tweet3);
        tweets.add(tweet);

        assertEquals(tweets.getTweets(), new ArrayList<Tweet>(Arrays.asList(tweet, tweet2, tweet3)));
    }
}
