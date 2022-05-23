
package SystemGUI;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends javax.swing.JFrame {

	public Login() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		idLogin = new javax.swing.JLabel();
		username = new javax.swing.JTextField();
		passwordLogin = new javax.swing.JLabel();
		password = new javax.swing.JPasswordField();
		exitBtn = new javax.swing.JButton();
		signin = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Login");
		setBackground(new java.awt.Color(240, 227, 206));
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		jPanel1.setBackground(new java.awt.Color(240, 227, 202));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Login As Administrator");
		jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		idLogin.setBackground(new java.awt.Color(204, 155, 109));
		idLogin.setFont(new java.awt.Font("Calibri", 1, 18)); 
		idLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		idLogin.setText("ID");
		idLogin.setOpaque(true);

		username.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				usernameActionPerformed(evt);
			}
		});

		passwordLogin.setBackground(new java.awt.Color(204, 155, 109));
		passwordLogin.setFont(new java.awt.Font("Calibri", 1, 18));
		passwordLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		passwordLogin.setText("Password");
		passwordLogin.setOpaque(true);

		exitBtn.setBackground(new java.awt.Color(204, 155, 109));
		exitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); 
		exitBtn.setText("Exit");
		exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				exitBtnMouseExited(evt);
			}
		});
		exitBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitBtnActionPerformed(evt);
			}
		});

		signin.setBackground(new java.awt.Color(204, 155, 109));
		signin.setFont(new java.awt.Font("Tahoma", 0, 24)); 
		signin.setText("Login");
		signin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				signinActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(100, 100, 100)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(idLogin, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(passwordLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 300,
										Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(
								jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 300,
												Short.MAX_VALUE)
										.addComponent(username))
						.addGap(82, 82, 82))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addGap(325, 325, 325)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(signin, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
						.addGap(294, 294, 294)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(55, 55, 55)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(28, 28, 28)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(idLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 50,
												Short.MAX_VALUE)
										.addComponent(username))
								.addGap(33, 33, 33)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(passwordLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 52,
												Short.MAX_VALUE)
										.addComponent(password))
								.addGap(54, 54, 54)
								.addComponent(signin, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
								.addGap(31, 31, 31)
								.addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
								.addGap(119, 119, 119)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void usernameActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {

	}

	private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void signinActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=PROJECT;user=sa;password=123";
			Connection con = DriverManager.getConnection(url);
			String sql = "select * from Admin where admin_id = ? and password = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, username.getText());
			pst.setString(2, password.getText());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "Login successful!");
				HomePage hp = new HomePage();
				hp.setVisible(true);
				setVisible(false);

			} else {
				JOptionPane.showMessageDialog(null, "Username and password incorrect!");
				username.setText("");
				password.setText("");

			}
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);

		}
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	private javax.swing.JButton exitBtn;
	private javax.swing.JLabel idLogin;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField password;
	private javax.swing.JLabel passwordLogin;
	private javax.swing.JButton signin;
	private javax.swing.JTextField username;

	private void close() {
		WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}
}
