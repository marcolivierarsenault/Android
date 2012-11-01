package jdg.laval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import jdg.laval.R;

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
    			"Andrea D'Oria",
    			"Andre Lafortune",
    			"Jerome Loisel",
    			"Michael Robichaud",
    			"Simon Roy",
    			"Philippe Talbot",
    			"Roxanne Tremblay",
    			"David Brault",
    			"Vanessa Lyras",
    			"Charles-Olivier Amyot",
    			"Julien April",
    			"Eric Bard",
    			"Marjorie Bergeron",
    			"Alexandre Bergeron Tessier",
    			"Jean-Michel Breton",
    			"Catherine Bussières",
    			"Samuel Côté",
    			"Louis-David Coulombe",
    			"John Dinan",
    			"Vincent Dupuis",
    			"Mathieu Durand-Jézéquel",
    			"Sarah-Lee Fortin",
    			"Alex Frenette-Tremblay",
    			"Samuel Gauvin",
    			"Samuel Genest",
    			"Christian Grégoire",
    			"Olivier Groleau-Hamel",
    			"Joé Habel",
    			"Charles  V. Lemieux",
    			"Matthieu Lafleur",
    			"Patrice Lajoie",
    			"Danny Leblanc-Blais",
    			"Hugo Lemieux",
    			"Anouk Neveu-Laflamme",
    			"Louis-Philippe Noël",
    			"Éric Normandeau-Gagnon",
    			"Dominic Otis",
    			"Amélie Paquet-Brisebois",
    			"Benoit Pelletier",
    			"Amélie Plante",
    			"Vincent Rodrigue",
    			"Amélie Saucier",
    			"Vincent Séguin",
    			"Pierre-Luc Théberge",
    			"Sarah-Claude Vanlandeghem",
    			"Audrey Veillette"
    			};

    	
    	Random r = new Random();
    	int i1=r.nextInt(dele.length);

    	TextView t=new TextView(this); 

        t=(TextView)findViewById(R.id.textView1); 
        t.setText(dele[i1]);
    }
}
