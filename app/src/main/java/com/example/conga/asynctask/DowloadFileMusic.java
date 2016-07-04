package com.example.conga.asynctask;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by ConGa on 3/03/2016.
 */

    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    public class DowloadFileMusic extends AsyncTask<String, Void, Bitmap> {
    Activity contextCha;
    public ProgressDialog progress;
    public DowloadFileMusic(Activity context){
        contextCha =context;
    }
        public Bitmap doInBackground(String... param) {
//            HttpClient client=new DefaultHttpClient();
//            HttpGet httpGet=new HttpGet(arg0[0]);
            Bitmap bitmap=null;
//            Log.i("lcw", param[0]);
//            try {
//                HttpResponse httpResponse = client.execute(httpGet);
//                if(httpResponse.getStatusLine().getStatusCode()==200){
//                    Log.i("www", httpResponse+"");
//                    HttpEntity entity=httpResponse.getEntity();
//                    byte data[]=EntityUtils.toByteArray(entity);
//                    bitmap=BitmapFactory.decodeByteArray(data, 0, data.length);
//                }
//            } catch (Exception e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//
          return bitmap;
        }

        @Override
        public void onPostExecute(Bitmap result) {

            super.onPostExecute(result);
            Log.i("11111111", "eeee");
            ImageView img = (ImageView) contextCha.findViewById(R.id.image);
            img.setImageBitmap(result);
            progress.dismiss();

        }

        @Override
        public void onPreExecute() {

            super.onPreExecute();
            Toast.makeText(contextCha.getApplicationContext(), "Prepare to handle", Toast.LENGTH_SHORT).show();
        }


}



