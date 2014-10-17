package jdg.poly;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import jdg.poly.R;

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
    			"Adriana Houle",
    			"Alexandre Blackburn",
    			"Alexis Tisseur",
    			"Anik Trepanier",
    			"Babacar Daoust",
    			"Benjamin Crevier",
    			"Camille Bourdages",
    			"Camille Hamelin",
    			"Camille Salvas",
    			"Catherine Corriveau",
    			"Charlotte Cyr",
    			"Chloé Gariépy",
    			"Daniel Harvey",
    			"Élise Ménard",
    			"Etienne St-Pierre",
    			"Felix Pelletier",
    			"Frederik Coallier",
    			"Gabriel Doré",
    			"Gabrielle Bourdages",
    			"Genevieve Royer",
    			"Guillaume Royer",
    			"Jeanne de Préval",
    			"Jean-Philippe Provost",
    			"Jean-Sébastien Laurin",
    			"Jennifer Nguyen",
    			"Jérémie Lavoie Doyon",
    			"Joannie Beaudoin",
    			"Julie-Anne Belzile",
    			"Louis Pepin",
    			"Louis-Etienne Pratte",
    			"Luc Filliatrault",
    			"Mannu Mata",
    			"Martin Grover",
    			"Mathieu Bouchard",
    			"Mathieu Boudreault",
    			"Mathieu Coupal",
    			"Mathieu Perron",
    			"Marie-Pier Gosselin",
    			"Matthieu Rhulmann",
    			"Maxime Nadeau",
    			"Nabil Fates",
    			"Nora Talab",
    			"Olivier Grant",
    			"Olivier Roy St-Jean",
    			"Philippe Doré",
    			"Philippe Gref",
    			"Philippe Thauvette",
    			"Pierre-Bernard Tiffault",
    			"Rebecca Beaumont",
    			"Samuel Brownrigg",
    			"Sophie Dagenais",
    			"Stephan Fogaing",
    			"Stephanie Schank",
    			"Vincent Simard",
    			"Xavier Coupal"
    			};

    	
    	Random r = new Random();
    	int i1=r.nextInt(dele.length);

    	TextView t=new TextView(this); 

        t=(TextView)findViewById(R.id.textView1); 
        t.setText(dele[i1]);
    }
}
