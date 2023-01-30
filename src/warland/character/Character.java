package warland.character;

public class Character {
	//ATRIBUTOS DE PERSONAJE
	private String name; //Nombre del personaje
	private String kind; //Especie del personaje
	private int level; //Nivel del personaje (del 1 al 100)
	private String genre; //Genero del personaje (masculino, femenino, hermafrodita, nulo)
	private int actualLifePoints; //Vida ACTUAL del personaje
	private int totalLifePoints; //Vida TOTAL del personaje
	private int actualMagicPoints; //Puntos mágicos ACTUALES del personaje
	private int totalMagicPoints; //Puntos mágicos TOTALES del personaje
	private long expPoints; //Puntos de experiencia
	private int agility; //Velocidad del personaje, indica si ataca antes o despues, si dobla al enemigo ataca 2 veces por turno
	private int strength; //Fuerza física, indica el poder del ataque melee
	private int wisdom; //Poder mágico, indica el poder del ataque mágico
	private int resistance; //Defensa física, indica la resistencia a ataques melee
	private int protection; //Defensa mágica, indica la resitenca a ataques mágicos
	
	//Constructor de Personajes (recibe nombre, especie y genero)
	public Character(String name, String kind, String genre) {
		this.name = name; //Nombre pasado por args
		this.kind =  kind; //Especie pasada por args
		level = 1; //Empieza nivel 1
		this.genre = genre; //Genero pasado por args
		
		totalLifePoints = 20; //Empieza con 20 LP
		actualLifePoints = totalLifePoints;
		
		totalMagicPoints = 5; //Empieza con 5 MP
		actualMagicPoints = totalMagicPoints; 
		
		expPoints = 0; //Empieza con 0 EXP
		agility = 5; //Empieza con 5 agilidad
		strength = 5; //Empieza con 5 fuerza
		wisdom = 5; //Empieza con 5 sabiduria
		resistance = 5; //Empieza con 5 resistencia
		protection = 5; //Empiezac on 5 proteccion
	}
	
	//GETTERS para acceder a los atributos
	public String getName() {
		return name;
	}
	
	public String getKind() {
		return kind;
	}
	
	public int getLevel() {
		return level;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getTotalLifePoints() {
		return totalLifePoints;
	}
	
	public int getActualLifePoints() {
		return actualLifePoints;
	}
	
	public int getTotalMagicPoints() {
		return totalMagicPoints;
	}
	
	public int getActualMagicPoints() {
		return actualMagicPoints;
	}
	
	public long getExpPoints() {
		return expPoints;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getWisdom() {
		return wisdom;
	}
	
	public int getResistance() {
		return resistance;
	}
	
	public int getProtection() {
		return protection;
	}
	
	//SETTERS para modificar los atributos
	public void levelUp(int increment) {
		level += increment;
	}
	
	public void damage(int points) {
		actualLifePoints -= points;
	}
	
	public void downMagic(int points) {
		actualMagicPoints -= points;
	}
	
}
