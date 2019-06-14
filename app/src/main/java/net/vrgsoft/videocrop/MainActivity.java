package net.vrgsoft.videocrop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.vrgsoft.videcrop.VideoCropActivity;


public class MainActivity extends AppCompatActivity {
    private static final int CROP_REQUEST = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // crop only
                String inputPath = "/storage/emulated/0/WhatsApp/Media/WhatsApp Video/a.mp4";

        //crop_compress
//                  String inputPath = "/storage/emulated/0/Movies/videoplayback.mp4";

        // compress
//        String inputPath = "/storage/emulated/0/y.mp4";




        String outputPath = "/storage/emulated/0/YD.mp4";

        startActivityForResult(VideoCropActivity.createIntent(this, inputPath, outputPath), CROP_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == CROP_REQUEST && resultCode == RESULT_OK){
            //crop successful
        }
    }
}
