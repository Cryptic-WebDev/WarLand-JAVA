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
	//Obtener nombre
	public String getName() {
		return name;
	}
	
	//Obtener especie
	public String getKind() {
		return kind;
	}
	
	//Obtener nivel
	public int getLevel() {
		return level;
	}
	
	//Obtener género
	public String getGenre() {
		return genre;
	}
	
	//Obtener los puntos de vida totales
	public int getTotalLP() {
		return totalLifePoints;
	}
	
	//Obtener los puntos de vida actuales
	public int getActualLP() {
		return actualLifePoints;
	}
	
	//Obtener los puntos de magia totales
	public int getTotalMP() {
		return totalMagicPoints;
	}
	
	//Obtener los puntos demagia actuales
	public int getActualMP() {
		return actualMagicPoints;
	}
	
	//Obtener los puntos de experiencia
	public long getExpPoints() {
		return expPoints;
	}
	
	//Obtener los puntos de agilidad
	public int getAgility() {
		return agility;
	}
	
	//Obtener los puntos de fuerza (ataque físico)
	public int getStrength() {
		return strength;
	}
	
	//Obtener los puntos de sabiduría (ataque mágico)
	public int getWisdom() {
		return wisdom;
	}
	
	//Obtener los puntos de resistencia (defensa física)
	public int getResistance() {
		return resistance;
	}
	
	//Obtener los puntos de protección (defensa magica)
	public int getProtection() {
		return protection;
	}
	
	//SETTERS para modificar los atributos
	//Incrementar nivel
	public void levelUp(int increment) {
		if (level + increment >= 100) {
			level += increment;
		}
	}
	
	//Bajar los puntos de vida (daño)
	public void damage(int points) {
		if (actualLifePoints - points >= 0) {
			actualLifePoints -= points;
		} else {
			actualLifePoints = 0;
		}
	}
	
	//Restaura los puntos de vida actuales
	public void restoreLP(int points) {
		if (points + actualLifePoints <= totalLifePoints) {
			actualLifePoints += points;
		} else {
			actualLifePoints = totalLifePoints;
		}
	}
	
	//Aumentar los puntos de vida totales
	public void setLP(int increment) {
		totalLifePoints += increment;
	}
	
	//Bajar los puntos mágicos
	public void downMP(int points) {
		if (actualMagicPoints - points >= 0) {
			actualMagicPoints -= points;
		} else {
			actualMagicPoints = 0;
		}
	}
	
	//Aumentar los puntos magicos totales
	public void setMP(int increment) {
		totalMagicPoints += increment;
	}
	
	//Aumenta la experiencia
	public void setEXP(int increment) {
		expPoints += increment;
		if (expPoints > (level * 100)) {
		}
	}
	
	//Aumenta los puntos de agilidad
	public void setAgility(int increment) {
		agility += increment;
	}
	
	//Aumenta el ataque físico
	public void setStrength(int increment) {
		strength += increment;
	}
	
	//Aumenta el ataque mágico
	public void setWisdom(int increment) {
		wisdom += increment;
	}
	
	//Aumenta la defensa física
	public void setResistance(int increment) {
		resistance += increment;
	}
	
	//Aumenta la defensa mágica
	public void setProtection(int increment) {
		protection += increment;
	}
	
	
	
}
