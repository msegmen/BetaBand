package business;

import java.util.*;
public class User {
	private String username;
	private String password;
	private ArrayList<Repertoire> repertoires;
	private ArrayList<Report> reports;
	private ArrayList<Drill> drills;
	private ArrayList<Instrument> instruments;
	
	public User(String username, String password, ArrayList<Repertoire> repertoires,ArrayList<Report> reports,ArrayList<Drill> drills,ArrayList<Instrument> instruments) {
		this.username = username;
		this.password = password;
		this.repertoires = repertoires;
		this.reports = reports;
		this.drills = drills;
		this.instruments = instruments;
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Repertoire> getRepertoires() {
		return repertoires;
	}

	public void setRepertoires(ArrayList<Repertoire> repertoires) {
		this.repertoires = repertoires;
	}

	public ArrayList<Report> getReports() {
		return reports;
	}

	public void setReports(ArrayList<Report> reports) {
		this.reports = reports;
	}

	public ArrayList<Drill> getDrills() {
		return drills;
	}

	public void setDrills(ArrayList<Drill> drills) {
		this.drills = drills;
	}

	public ArrayList<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(ArrayList<Instrument> instruments) {
		this.instruments = instruments;
	}
	
	
}
