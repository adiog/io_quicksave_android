package io.quicksave.android;

import android.content.Intent;

public class DemoItem {

    public String description;
    public Intent intent;

    public DemoItem(String description, Intent intent) {
        this.description = description;
        this.intent = intent;
    }

    @Override
    public String toString() {
        return description;
    }
}