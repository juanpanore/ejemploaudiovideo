package com.udea.edu.co.movil.ejeaudiovideo;


import android.support.v4.app.Fragment;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity implements OnClickListener {

	Button play;
	Button pause;
	MediaPlayer mpaudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = new LinearLayout(this);
        play=new Button(this);
        play.setText("Play");
        play.setOnClickListener(this);
        pause=new Button(this);
        pause.setText("Pause");
        pause.setOnClickListener(this);
        layout.addView(play);
        layout.addView(pause);
        setContentView(layout);
        mpaudio = MediaPlayer.create(this, R.raw.victory);
 
    }
   
    @Override
	public void onClick(View v) {
		
    	if (v==play) {
    		
			mpaudio.start();
		}else if (v==pause) {
			mpaudio.pause();
		}
		
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

	

}
