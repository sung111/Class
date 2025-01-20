package quiz;

import java.util.ArrayList;

public class PokemonLeague {

	ArrayList list = new ArrayList();
	
	String name;
	PokemonLeague(String name){
		System.out.println("name :" + name);
		this.name = name;
	}
	
	void add(Pokemon p) {
		this.list.add(p);
	}
	
	void print() {
		for(int i = 0 ; i < list.size(); i++) {
			Pokemon p = (Pokemon)list.get(i);
		}
	}
	
}
