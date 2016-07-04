package com.example.conga.asynctask;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {
    public  Button btn_download;
    public  Button btn_downloadImg;
      public ImageView imgdownload;

      DownloadFileTask downloadFile;
    private String dlUrl ="http://shironomonogatari.files.wordpress.com/2011/01/inoue_konoha.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_downloadImg = (Button) findViewById(R.id.btn_downloadimg);
        imgdownload = (ImageView) findViewById(R.id.image);
        btn_downloadImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          //     new DowloadFileMusic().execute(dlUrl);
            }


        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
