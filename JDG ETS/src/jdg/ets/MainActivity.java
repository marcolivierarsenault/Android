package jdg.ets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import jdg.ets.R;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
//	ArrayList<String> list = new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
//    	File sdcard = Environment.getExternalStorageDirectory();
//
//    	//Get the text file
//    	File file = new File(sdcard,"name.txt");
//
//
//    	try {
//    	    BufferedReader br = new BufferedReader(new FileReader(file));
//    	    String line;
//
//    	    while ((line = br.readLine()) != null) {
//    	        list.add(line);
//    	    }
//    	    
//    	    if(list.size()==0)
//        		list.add("Fichier Manquant... Doit creer un fichier name.txt sur la sd et mettre les nom dedans.");
//    	}
//    	catch (IOException e) {
//    		list.add("Fichier Manquant... Doit creer un fichier name.txt sur la sd et mettre les nom dedans.");
//    	}
    	
    	
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
    			"Marco Arseneault",
    			"Mathieu Baril",
    			"Keven Beaucage",
    			"PS Beaudoin",
    			"Julien Beaurivage",
    			"Vincent Béliveau-Larose",
    			"Philippe Bérubé",
    			"Alexandre Benmarzouk",
    			"Rafael Bergeron",
    			"Renaud Bertrand Thouin",
    			"Jeremy Boucher",
    			"Luc-Antoine Boulanger",
    			"Viviane catineau",
    			"Francois Chagnon",
    			"Élodie Collin",
    			"mathieu coté",
    			"Antoine Coté",
    			"Philippe Delisle",
    			"Laurent Doré",
    			"Julie Gagnon",
    			"Maxime Giard",
    			"Noel Giguère",
    			"Christian Godard",
    			"Vincent Huneault",
    			"David Jobin",
    			"Alexandre Lacroix",
    			"Médéric Lafleur",
    			"martin Lambert",
    			"Francois Langelier",
    			"Alexandre Larochelle",
    			"Mathieu Lavoie",
    			"Johannie Lemelin",
    			"Pier-yves Lessard",
    			"Maxime Leveille",
    			"Maude Lussier",
    			"Alex Martin",
    			"Vincent Mathieu-Valois",
    			"Frédéric Morin",
    			"Jeason Randlett",
    			"Antoine Ratelle ",
    			"Camille Roch",
    			"Alexandra Rose",
    			"JR Roy",
    			"Olivier Toupin",
    			"Éric Tremblay",
    			"Yohan Trépanier Montpetit"
    			};

    	
    	Random r = new Random();
    	int i1=r.nextInt(dele.length);

    	TextView t=new TextView(this); 

        t=(TextView)findViewById(R.id.textView1); 
        t.setText(dele[i1]);
    }
}
