package com.example.gautam;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OneActivity extends AppCompatActivity {

    String name;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        tvName = findViewById(R.id.tv_name);

        Bundle bundle = getIntent().getExtras();
        name = (String)bundle.get("name");

        tvName.setText(name);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", "Hello");
        setResult(Activity.RESULT_OK, returnIntent);
    }
}
