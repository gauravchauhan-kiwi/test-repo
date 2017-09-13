package com.blingby.demoselklikapp;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  VideoListFragment videoListFragment= new VideoListFragment();
        videoListFragment.setVideoList(MainActivity.this);
        getFragmentManager().beginTransaction().replace(R.id.main_layout,videoListFragment).commit();*/

    }
}
