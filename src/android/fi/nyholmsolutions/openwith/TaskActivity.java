package fi.nyholmsolutions.openwith;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TaskActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = this.getIntent();
        Intent newIntent = new Intent(this, app.trolle.MainActivity.class);
        newIntent.setAction(intent.getAction());
        newIntent.setFlags(intent.getFlags());
        newIntent.setDataAndType(intent.getData(), intent.getType());
        newIntent.setClipData(intent.getClipData());
        newIntent.putExtras(intent);
        newIntent.putExtra("destination", "current_task");
        startActivity(newIntent);
    }
}
