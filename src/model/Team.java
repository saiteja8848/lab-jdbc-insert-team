package model;

public class Team {

	private long teamId;
	private String name;
	private String coach;
	private City city;

	public Team(long teamId,String name, String coach, City city) {
		this.teamId =teamId;
		this.name = name;
		this.coach = coach;
		this.city = city;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void display() {
		System.out.println(name+"    "+coach+"    "+city.getCityName());
	}
	
}
