package flyn.eyes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import flyn.Eyes;

public class StatusBarTranslucent extends AppCompatActivity {

    boolean isHide;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbar_translucent);
        Eyes.translucentStatusBar(this, false);

        findViewById(R.id.toggle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isHide = !isHide;
                Eyes.translucentStatusBar(StatusBarTranslucent.this, isHide);
            }
        });
    }
}
