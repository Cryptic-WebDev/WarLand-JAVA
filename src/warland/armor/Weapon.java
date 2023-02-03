package warland.armor;

import warland.character.*;


public class Weapon {
	private String name;
	private Object material;
	private int minLevel;
	private Kind kindType;
	
	
	public Weapon(String name, Kind material, int level, Kind kind) {
		this.name = name;
		this.material = material;
		minLevel = level;
		kindType = kind;
		
	}
}
