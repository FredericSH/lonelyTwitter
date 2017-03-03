package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    TextView body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        body = (TextView) findViewById(R.id.edit_tweet_body);
    }

    @Override
    public void onStart(){
        super.onStart();

        NormalTweet tweet = (NormalTweet) getIntent().getSerializableExtra("selected");

        body.setText(tweet.getMessage());
    }
}
