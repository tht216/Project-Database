
package SystemGUI;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class HomePage extends javax.swing.JFrame {

	public HomePage() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jFrame1 = new javax.swing.JFrame();
		jDialog1 = new javax.swing.JDialog();
		addUserBtn = new javax.swing.JButton();
		addBalanceBtn = new javax.swing.JButton();
		logOut = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
		jFrame1.getContentPane().setLayout(jFrame1Layout);
		jFrame1Layout.setHorizontalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jFrame1Layout.setVerticalGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Home Page");

		addUserBtn.setBackground(new java.awt.Color(204, 155, 159));
		addUserBtn.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
		addUserBtn.setText("Add User");
		addUserBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addUserBtnActionPerformed(evt);
			}
		});

		addBalanceBtn.setBackground(new java.awt.Color(204, 155, 159));
		addBalanceBtn.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
		addBalanceBtn.setText("Add Balance");
		addBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addBalanceBtnActionPerformed(evt);
			}
		});

		logOut.setBackground(new java.awt.Color(204, 155, 159));
		logOut.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
		logOut.setText("Log Out");
		logOut.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logOutActionPerformed(evt);
			}
		});

		jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\NaNa\\Desktop\\SEM 2\\lab CA\\thumb-1920-46301.jpg")); // NOI18N

		jButton1.setBackground(new java.awt.Color(204, 155, 159));
		jButton1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
		jButton1.setText("View Transactions");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(addBalanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(126, 126, 126)
						.addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(addBalanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(265, Short.MAX_VALUE))
				.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

		pack();
	}

	private void logOutActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		Login li = new Login();
		li.setVisible(true);
	}

	private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		AddUserWindow auw = new AddUserWindow();
		auw.setVisible(true);
	}

	private void addBalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		AddBalanceWindow abw = new AddBalanceWindow();
		abw.setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);

		TransactionsList tl = new TransactionsList();
		tl.setVisible(true);
	}

	private void close() {
		WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
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
			java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new HomePage().setVisible(true);
			}
		});
	}

	private javax.swing.JButton addBalanceBtn;
	private javax.swing.JButton addUserBtn;
	private javax.swing.JButton jButton1;
	private javax.swing.JDialog jDialog1;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JButton logOut;
}
