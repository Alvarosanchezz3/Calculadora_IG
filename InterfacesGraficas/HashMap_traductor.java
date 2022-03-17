package InterfacesGraficas;

import java.util.HashMap;

public interface HashMap_traductor {

	public static String mapa (String palabra) {
		
		HashMap <String,String> hashmap = new HashMap <String,String>();
		
		hashmap.put("Cocodrilo","Crocodile");
		hashmap.put("Elefante","Elephant");
		hashmap.put("Leon","Lion");
		hashmap.put("Hiena","Hyena");
		hashmap.put("Avestruz","Ostrich");
		
		return hashmap.get(palabra);
	}
}
