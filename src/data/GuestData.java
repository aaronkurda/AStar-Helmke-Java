package data;

import util.Time;

/**
 * Deine Wrapper-Klasse für alle Daten die von einer TreeNode als Stammdaten verwaltet werden sollen.
 * Gilt nur für die Badaufgabe. Muss für Flügzeuge erneuert werden.
 */
public class GuestData implements DataStructureInterface{
    public static GuestData ROOT = new GuestData("ROOT", Time.ZERO, Time.ZERO);
	String bezeichner;
	Time aufstehzeit, dauer;

    /**
     * Erzeugt eine neue Datenstruktur mit einem Bezeichner, einer Aufstehzeit und einer Dauer.
     * @param bez : Bezeichner dieser Datenstruktur.
     * @param wake : Die Aufstehzeit der Person
     * @param dur . Die Aufenthaltsdauer im Bad.
     */
	public GuestData(String bez, Time wake, Time dur) {
		this.bezeichner = bez;
		this.aufstehzeit = wake;
		this.dauer = dur;
	}
	
	@Override
	public String toString() {
		return bezeichner + "," + aufstehzeit + "," + dauer;
	}

	@Override
	public Time getTime() {
		return aufstehzeit;
	}

	@Override
	public Time getDuration() {
		return dauer;
	}

	@Override
	public String getName() {
		return bezeichner;
	}
}
