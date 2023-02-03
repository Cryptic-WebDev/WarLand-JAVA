package warland.score;

//Clase base de Atributos/Stats de personaje
public class Stat {
	private static final String[] STAT_NAMES = { //Constante que contiene los nombres de los stats
			"Strength", "Resistance",
			"Wisdom", "Protection",
			"Agility"};
	
	private String name; //Define el nombre del STAT
	private int score; //Define los puntos del STAT
	
	public Stat(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//GETTERS de Stat
	//Obtener los puntos del stat
	public int getStatScore() {
		return score;
	}
	
	//Obtener el nombre del stat
	public String getStatName() {
		return name;
	}
	
	//SETTERS de Stat
	//Establece el puntuaje del stat
	public void setScore(int score) {
		this.score = score;
	}
}
