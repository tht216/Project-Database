
package SystemGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransactionModify {

	public static List<Transaction> findAll() {
		List<Transaction> transList = new ArrayList<>();

		Connection connection = null;
		Statement statement = null;

		try {
			connection = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PROJECT;user=sa;password=123");

			String sql = "select tickets.user_id as _userID,tickets.train_id as _trainID ,tickets.ticket_id as _ticketID, trains.source as _from, trains.destination as _to,trains.date as _date  from trains, tickets where tickets.train_id = trains.train_id";
			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Transaction trs = new Transaction(resultSet.getString("_userid"), resultSet.getString("_trainid"),
						resultSet.getString("_ticketid"), resultSet.getString("_from"), resultSet.getString("_to"),
						resultSet.getString("_date"));
				transList.add(trs);
			}
		} catch (SQLException ex) {
			Logger.getLogger(TransactionModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(TransactionModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					Logger.getLogger(TransactionModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}

		return transList;
	}

}
