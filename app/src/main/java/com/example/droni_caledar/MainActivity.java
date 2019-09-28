package com.example.droni_caledar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button DroneEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DroneEvent = (Button)findViewById(R.id.DroneEvent);

        DroneEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://calendar.google.com/calendar?cid=NWJsdWlnOXUzb3Nha2Q3NzdnaGxwcG1yb3NAZ3JvdXAuY2FsZW5kYXIuZ29vZ2xlLmNvbQ"));
                startActivity(intent);
            }
        });
    }

}
