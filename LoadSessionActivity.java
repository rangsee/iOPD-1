package com.example.lenovo.iopd;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class LoadSessionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_load_session);

        Intent intent = new Intent(LoadSessionActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
