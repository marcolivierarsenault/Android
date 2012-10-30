package com.example.jdg.ets;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void random(View view) {
    	
    	String[] dele = {
    			"pomme",
    			"orange",
    			"bacon",
    			"chip",
    			"peanut"
    	    	};
    	Random r = new Random();
    	int i1=r.nextInt(dele.length);

    	TextView t=new TextView(this); 

        t=(TextView)findViewById(R.id.textView1); 
        t.setText(dele[i1]);
    }
}
