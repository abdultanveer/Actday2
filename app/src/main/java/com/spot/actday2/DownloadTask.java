package com.spot.actday2;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;

public class DownloadTask extends AsyncTask<String,Integer,Void> {
ProgressBar mProgressBar;
    public DownloadTask(ProgressBar progressBar) {
        mProgressBar = progressBar;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected Void doInBackground(String... url) {
        try {
            for(int progress =1; progress <20; progress++) {
                publishProgress(progress * 5);
                Thread.sleep(300);
            }

            } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
        super.onProgressUpdate(progress);
        mProgressBar.setProgress(progress[0]);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        mProgressBar.setVisibility(View.GONE);
    }
}
