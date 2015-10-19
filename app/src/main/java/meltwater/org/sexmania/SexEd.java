package meltwater.org.sexmania;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SexEd extends AppCompatActivity {


    public static int IMAGES[] = {
            R.drawable.slide_1


    };
    public static String TITLE[] = {
            "Your Desire Is Often Related to Where you are in Your Menstrual Cycle"

    };
    public static String INFO[] = {
            "It’s no coincidence that many women experience an increase in sexual desire around the time they ovulate. That’s when testosterone levels are at their peak and, well, testosterone makes you frisky -- just ask any guy. In fact, it’s a pretty neat trick of biology that we would want sex right around the time we’re most likely to get pregnant!"

    };

//    public

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sex_ed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
