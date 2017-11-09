package com.example.alexandersmith.rockpaperscissors;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    Button LinkButton;
    Button GameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        LinkButton = (Button)findViewById(R.id.linkButton);
        GameButton = (Button)findViewById(R.id.PlayButton);

    }

    public void onLinkButtonClick(View button){
        String url = "https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors";
        Intent linkIntent = new Intent(Intent.ACTION_VIEW);
        linkIntent.setData(Uri.parse(url));
        startActivity(linkIntent);
    }

    public void onGameButtonPress(View Button){
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);
    }


}
