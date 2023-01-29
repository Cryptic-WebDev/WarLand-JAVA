package warland.character;

public class Character {
	//ATRIBUTOS DE PERSONAJE
	private String name; //Nombre del personaje
	private String kind; //Especie del personaje
	private int level; //Nivel del personaje (del 1 al 100)
	private String genre; //Genero del personaje (masculino, femenino, hermafrodita, nulo)
	private int lifePoints; //Vida del personaje
	private int magicPoints; //Puntos mágicos del personaje
	private long expPoints; //Puntos de experiencia
	private int agility; //Velocidad del personaje, indica si ataca antes o despues, si dobla al enemigo ataca 2 veces por turno
	private int strength; //Fuerza física, indica el poder del ataque melee
	private int wisdom; //Poder mágico, indica el poder del ataque mágico
	private int resistance; //Defensa física, indica la resistencia a ataques melee
	private int protection; //Defensa mágica, indica la resitenca a ataques mágicos
	
	public Character(String name, String kind, String genre) {
		this.name = name;
		this.kind =  kind;
		level = 1;
		this.genre = genre;
		lifePoints = 20;
		magicPoints = 5;
		expPoints = 0;
		agility = 5;
		strength = 5;
		wisdom = 5;
		resistance = 5;
		
	}
	
}
