package warland.score;

import warland.character.*;
import warland.armor.*;

//Clase para los Modificadores de Stat (Valores + / -)
public class ModifiedStat {
	private Stat modStat;
	private int modifier;
	
	public ModifiedStat(Stat stat) {
		modStat = stat;
		modStat.setScore(modStat.getStatScore() + modifier);
	}
	
	//GETTERS Stats Modificados
	//Obtener
	public int getModifiedStatScore() {
		return modStat.getStatScore();
	}
	
	public String getModifiedStatName() {
		return modStat.getStatName();
	}
}
