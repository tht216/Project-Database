
package SystemGUI;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class CustomerModify {

	public static void insertCustomer(Customer ctm) {
		Connection connection = null;
		PreparedStatement statement = null;

		try {

			String url = "jdbc:sqlserver://localhost:1433;databaseName=Project;user=sa;password=123";
			connection = DriverManager.getConnection(url);

			String sql = "insert into users(user_id, password, name, address, age, sex, phone_number, securityquestion, answer) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			statement = connection.prepareCall(sql);
			statement.setString(1, ctm.getUser_id());
			statement.setString(2, ctm.getPassword());

			statement.setString(3, ctm.getName());
			statement.setString(4, ctm.getAddress());
			statement.setInt(5, ctm.getAge());
			statement.setString(6, ctm.getSex());
			statement.setString(7, ctm.getPhoneNumber());
			statement.setString(8, ctm.getSecurityQ());
			statement.setString(9, ctm.getAnswer());
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

}
