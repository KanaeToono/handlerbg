package com.example.conga.asynctask;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ConGa on 3/03/2016.
 */
public  class DownloadFileTask extends AsyncTask <Void , Integer ,Void> {
    Activity contextCha;
 public DownloadFileTask(Activity context){
        contextCha =context;
 }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        for( int i =0 ; i <=100 ; i++){
            SystemClock.sleep(1000);
            publishProgress(i);
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        ProgressBar progressBar = (ProgressBar) contextCha.findViewById(R.id.progressBar1);
        int value = values[0];
        progressBar.setProgress(value);
        TextView txtmsg=(TextView)
                contextCha.findViewById(R.id.textView1);
        txtmsg.setText(value+"%");
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Toast.makeText(contextCha.getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
    }
}
