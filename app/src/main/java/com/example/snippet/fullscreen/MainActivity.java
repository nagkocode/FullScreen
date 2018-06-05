
// This is a sample app to implement fullscreen in sticky immersive mode.

package com.example.snippet.fullscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private CustomView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the display to custom view
        view = new CustomView(getApplicationContext());
        setContentView(view);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        if (hasFocus) {

            view.setSystemUiVisibility(
                      View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY       // sticky immersive mode
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE          // layout consistent
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION        // hide the navigation controls (Home, Back, Recent)
                    | View.SYSTEM_UI_FLAG_FULLSCREEN);           // hide status bar
            }

    }
}
