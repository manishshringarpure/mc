package com.creative2.masterofcharades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Praveen on 12/27/2017.
 */

public class CharadeNameActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charades_fullscreen);

        // get intent data
        Intent i = getIntent();

       final TextView _tv = (TextView) findViewById( R.id.timer );
        new CountDownTimer(1*60000, 1000) {

            public void onTick(long millisUntilFinished) {
                _tv.setText("Time Remaining - " +new SimpleDateFormat("ss").format(new Date( millisUntilFinished)));
            }

            public void onFinish() {
                _tv.setText("done! Press Back to retart");
            }
        }.start();

        final TextView charadeText = (TextView) findViewById( R.id.charade_text );
         charadeText.setAllCaps(true);
         charadeText.setText("Cindrella Man");
        // Selected image id
        //int id = i.getExtras().getInt("image");
        //ImageAdapter imageAdapter = new ImageAdapter(this);
        //String imageId = i.getExtras().getString("image");

       // final TextView authorTextView = (TextView) R.string.charade_word);
        //ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        //imageView.setImageURI(Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "" + imageId));
        //imageView.setImageResource(imageAdapter.mThumbIds[position]);


    }
}
