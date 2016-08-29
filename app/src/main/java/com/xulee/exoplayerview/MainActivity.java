package com.xulee.exoplayerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.exoplayer.util.Util;
import com.xulee.library.player.ExoPlayerView;

public class MainActivity extends AppCompatActivity {

    private ExoPlayerView exoPlayerView;

    private boolean isNext = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exoPlayerView = (ExoPlayerView) findViewById(R.id.player);
//        exoPlayerView.setContentType(Util.TYPE_HLS);
        exoPlayerView.setUri("http://uploads.cutv.com:8088/video/data/201608/16/encode_file/748a1960b6b01a0214f15997bb99067d57b2d3725f8fc.mp4");
        exoPlayerView.setOnCompletedListener(new ExoPlayerView.OnCompletedListener() {
            @Override
            public void onCompleted() {
                if(isNext) {
                    isNext = false;
                    Log.i("TestActivity", "设置播放地址");
                    exoPlayerView.reset();
                    exoPlayerView.setTitle("测试视频2");
                    exoPlayerView.setContentType(Util.TYPE_HLS);
                    exoPlayerView.setUri("http://videofile2.cutv.com/mg/010062_t/2016/08/17/G15/G15fgfflhgjmgiojfjh04r_cug.mp4.m3u8");
                    exoPlayerView.play();
                }
            }
        });
        //video=http://uploads.cutv.com:8088/video/data/201608/16/encode_file/748a1960b6b01a0214f15997bb99067d57b2d3725f8fc.mp4
        //vod: http://videofile2.cutv.com/mg/010062_t/2016/08/17/G15/G15fgfflhgjmgiojfjh04r_cug.mp4.m3u8
    }

    @Override
    protected void onPause() {
        super.onPause();
        exoPlayerView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        exoPlayerView.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        exoPlayerView.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        exoPlayerView.onDestroy();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        exoPlayerView.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}