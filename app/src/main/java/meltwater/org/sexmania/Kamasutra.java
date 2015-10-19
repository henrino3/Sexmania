package meltwater.org.sexmania;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Kamasutra extends AppCompatActivity implements CardFragment.OnFragmentInteractionListener {


    public static int IMAGES[] = {
            R.drawable.kamasutra,
            R.drawable.fantastic_rocking_horse,
            R.drawable.the_glowing_triangle,
            R.drawable.cat_wheel

    };

    public static String TITLE[] = {
            "Kamasutra: Bible of sex positions",
            "The Fantastic Rocking Horse",
            "The Glowing Triangle",
            "The Catherine Wheel",

    };
    public static String INFO[] = {
            "Originally it wasn't just a sex positions manual but a whole way of life! However, if it's sex positions you're after then you've come to the right place!\n" +
                    "\n" +
                    "The Kamasutra contains very detailed instructions to different sex positions and we've come up with handy little illustrations to help you get to grips with them! \n" +
                    "\n" +
                    "\"The erotic V\" \n" +
                    "This position demands certain acrobatic capacities!\n" +
                    "The woman sits down on a table edge. The man stands before it and bends his legs so he's in the best \"entering\" position.\n" +
                    "\n" +
                    "Now she braces herself by putting her arms around his neck, pulls first the right, then the left leg up onto his shoulders. She leans back and he directs the thrusting by holding on to her bum!",





            "In the Rocking Horse sex position he sits cross-legged and leans back supporting himself with both arms behind him. She kneels over his lap hugging him with her thighs and lowers herself down. She can then determine the speed and depth of penetration. \n" +
                    "\n" +
                    "It may be easier to maintain the Rocking Horse sex position for the man to lean against a wall or the edge of the bed and help her bounce up and down or just cop a feel while she does all the hard work.",

            "At first glance, the Glowing Triangle position reminds us of the classic missionary position - woman on her back and the man on top. However the trick with this position is that the man goes on all fours then the woman lifts her hips towards his penis so that he can penetrate her. \n" +
                    "\n" +
                    "The man remains in this position while the woman does all the work... so actually not like the missionary at all.",


            "The Catherine Wheel sex position is more complicated than it looks. \n" +
                    "\n" +
                    "First the man and the woman sit down opposite each other. Now she wraps her legs round his torso and he enters her, he then wraps one leg over her to hold her in place. \n" +
                    "\n" +
                    "In order to hold the balance, she braces herself with both hands. He guides the movement propped up on his elbow.",

    };


    PagerContainer mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamasutra);


        mContainer = (PagerContainer) findViewById(R.id.pager_container);

        ViewPager pager = mContainer.getViewPager();
        PagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        //Necessary or the pager will only have one extra page to show
        // make this at least however many pages you can see
        pager.setOffscreenPageLimit(adapter.getCount());
        //A little space between pages
        pager.setPageMargin(15);

        //If hardware acceleration is enabled, you should also remove
        // clipping on the pager for its children.
        pager.setClipChildren(false);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    //Nothing special about this adapter, just throwing up colored views for demo
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return CardFragment.newInstance(position);
        }


        @Override
        public int getCount() {
            return 4;


        }
    }

}
