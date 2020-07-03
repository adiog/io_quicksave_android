package io.quicksave.android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;


public class ShareActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        // Get the intent that started this activity
        Intent intent = getIntent();
        Uri data = intent.getData();
        Bundle extras = getIntent().getExtras();
        // Figure out what to do based on the intent type
        if (intent.getType().indexOf("image/") != -1) {
            // Handle intents with image data ...
        } else if (intent.getType().equals("text/plain")) {
            // Handle intents with text ...
          ((TextView) findViewById(R.id.labelStyle)).setText(String.format("%s", intent.getData()));
        }
        ((TextView) findViewById(R.id.labelStyle)).setText(String.format("HANDLING: [%s]", intent.getClipData().getItemAt(0).getText().toString()));
    }
}
