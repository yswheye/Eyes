package flyn.eyes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.christophesmet.android.views.colorpicker.ColorPickerView;

import flyn.Eyes;

public class StatusBarColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbar_color);
        getSupportActionBar().setTitle("StatusBarColorByCodes");

        ((ColorPickerView) findViewById(R.id.color_picker)).setColorListener(new ColorPickerView.ColorListener() {
            @Override
            public void onColorSelected(int color) {
                Eyes.setStatusBarColor(StatusBarColorActivity.this, color);
            }
        });

        findViewById(R.id.img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Eyes.setStatusBarColor(StatusBarColorActivity.this, ContextCompat.getColor(StatusBarColorActivity.this, R.color.colorPrimary));
            }
        });
    }
}
