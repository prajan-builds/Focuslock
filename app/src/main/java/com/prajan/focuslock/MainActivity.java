
package com.prajan.focuslock;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.Gravity;
import android.graphics.Typeface;
import android.graphics.Color;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("FocusLock");
        title.setTextSize(32);
        title.setTextColor(Color.BLACK);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView description = new TextView(this);
        description.setText(
            "Choose what you want to see.\n\n" +
            "FocusLock is your personal Instagram " +
            "distraction blocker.\n\n" +
            "Blocking is not active yet. " +
            "This is our first prototype."
        );
        description.setTextSize(17);
        description.setTextColor(Color.DKGRAY);
        description.setGravity(Gravity.CENTER);
        description.setPadding(0, 24, 0, 24);

        Button settingsButton = new Button(this);
        settingsButton.setText("Accessibility Settings");
        settingsButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                Settings.ACTION_ACCESSIBILITY_SETTINGS
            );
            startActivity(intent);
        });

        layout.addView(title, new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ));

        layout.addView(description, new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ));

        layout.addView(settingsButton, new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ));

        setContentView(layout);
    }
}
