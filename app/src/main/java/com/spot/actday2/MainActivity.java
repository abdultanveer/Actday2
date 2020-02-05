package com.spot.actday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends AppCompatActivity {
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);
        /*ListView listView = findViewById(R.id.listview);
        Uri uriSms = Uri.parse("content://sms/inbox");
        //get the call log and [show ph nos]  it in the listview --- contacts -- names
       Cursor cursor = getContentResolver().query(uriSms,
               null,null,null,
        null,null);
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1, cursor,
                new String[]{"body"},
                new int[] {android.R.id.text1});

        listView.setAdapter(adapter);*/

    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    public void handleClicks(View view) {
        DownloadTask downloadTask = new DownloadTask(progressBar);
        downloadTask.execute("url for downloading");

        /*Intent intent = new Intent("act.android.app.training");
        intent.setClassName("com.spot.actapp","com.spot.actapp.CalendarActivity");
        startActivity(intent);*/
    }
}
