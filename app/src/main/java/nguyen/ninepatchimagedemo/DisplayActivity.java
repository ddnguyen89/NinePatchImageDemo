package nguyen.ninepatchimagedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 660253185 on 11/6/2017.
 */

public class DisplayActivity extends MainActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.title.setText("Display Screen");
        this.icon.setImageResource(R.mipmap.ic_launcher);
    }
}
