package Git_Holecek_Keles_Kogler;

public interface TA_LogicClass {
	/**
	 * Methode zur Festlegung welcher Button gedrückt wurde und
	 * welche Buttons deakteviert werden müssen
	 */
	indexOnOff[] whatToChange();
	
	/**
	 * Get all Buttons and Values
	 */
	indexOnOff[] allValues();
}
