package dao;

import java.sql.SQLException;
import java.sql.Statement;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO {

	public void createTeam(Team team) throws SQLException {
		if (ConnectionManager.getConnection() != null) {
			Statement stmt = ConnectionManager.getConnection().createStatement();

			String sql1 = "INSERT INTO CITY VALUES(" + team.getCity().getCityId() + "," + "'"
					+ team.getCity().getCityName() + "'" + ")";
			int i = stmt.executeUpdate(sql1);
			if (i > 0)
				System.out.println("city inserted");

			String sql = "INSERT INTO TEAM VALUES(" + team.getTeamId() + "," + "'" + team.getName() + "'" + "," + "'"
					+ team.getCoach() + "'" + "," + team.getCity().getCityId() + ")";

			int j = stmt.executeUpdate(sql1);
			if (j > 0)
				System.out.println("team inserted");

		}

	}

}
