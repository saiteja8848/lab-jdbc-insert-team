package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main {

	public static void main(String args[]) throws SQLException {
		City city = null;
		CityDAO cityDao = null;
		Team team = null;
		TeamDAO teamDao = null;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter team Id:");
		long teamId = input.nextLong();
		input.nextLine();
		System.out.println("Enter team name:");
		String teamName = input.nextLine();
		System.out.println("Enter coach name:");
		String coachName = input.nextLine();
		System.out.println("Enter CityID:");
		long cityId = input.nextLong();
		input.nextLine();
		System.out.println("Enter the cityName:");
		String cityName = input.nextLine();

		city = new City();
		city.setCityId(cityId);
		city.setCityName(cityName);
		cityDao = new CityDAO();

		team = new Team(teamId,teamName, coachName, city);
       team.display();
		teamDao = new TeamDAO();
		teamDao.createTeam(team);
		

	}

}
