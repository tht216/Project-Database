
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

public class UserBalanceModify {

	public static void insertUserBalance(UserBalance ub) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			String url = "jdbc:sqlserver://localhost:1433;databaseName=Project;user=sa;password=123";
			connection = DriverManager.getConnection(url);

			String sql = "insert into balance(user_id, balance, card_num) values (?, ?, ?)";
			statement = connection.prepareCall(sql);
			statement.setString(1, ub.getUser_id());
			statement.setLong(2, 0);

			statement.setString(3, ub.getCard_num());
			statement.execute();

		} catch (SQLException ex) {
			Logger.getLogger(CustomerModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(CustomerModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					Logger.getLogger(CustomerModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}

	public static void update(UserBalance ub) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PROJECT;user=sa;password=123");

			String sql = "update balance set balance = ? where user_id = ?";
			statement = connection.prepareCall(sql);

			statement.setLong(1, ub.getBalance());
			statement.setString(2, ub.getUser_id());

			statement.execute();
		} catch (SQLException ex) {
			Logger.getLogger(UserBalanceModify.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ex) {
					Logger.getLogger(UserBalanceModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException ex) {
					Logger.getLogger(UserBalanceModify.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}

}
