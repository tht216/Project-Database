
package SystemGUI;

import javax.swing.JOptionPane;

public class AddBalanceWindow extends javax.swing.JFrame {

	public AddBalanceWindow() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		idLabel = new javax.swing.JLabel();
		idText = new
				javax.swing.JTextField();
		balanceLabel = new javax.swing.JLabel();
		balanceText = new javax.swing.JTextField();
		quitBtn = new javax.swing.JButton();
		updateBtn = new javax.swing.JButton();
		clearBtn = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Add Balance");

		jPanel1.setBackground(new java.awt.Color(240, 227, 202));

		idLabel.setText("User ID:");

		balanceLabel.setText("New Balance:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(96, 96, 96)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(balanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(idText).addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE,
										332, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(162, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(idText).addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(balanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(balanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(139, 139, 139)));

		quitBtn.setText("Quit");
		quitBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				quitBtnActionPerformed(evt);
			}
		});

		updateBtn.setText("Update");
		updateBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentShown(java.awt.event.ComponentEvent evt) {
				updateBtnComponentShown(evt);
			}
		});
		updateBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updateBtnActionPerformed(evt);
			}
		});

		clearBtn.setText("Clear");
		clearBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap(78, Short.MAX_VALUE)
								.addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(82, 82, 82)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(quitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
								.addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		pack();
	}

	private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {
		HomePage hp = new HomePage();
		hp.setVisible(true);
		setVisible(false);
	}

	private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {
		long balance = Long.parseLong(balanceText.getText());
		String id = idText.getText();

		UserBalance ub = new UserBalance(id, balance);
		UserBalanceModify.update(ub);

		JOptionPane.showMessageDialog(null, "Update balance successful!");

	}

	private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {
		idText.setText("");
		balanceText.setText("");
	}

	private void updateBtnComponentShown(java.awt.event.ComponentEvent evt) {
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
			java.util.logging.Logger.getLogger(AddBalanceWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddBalanceWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddBalanceWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddBalanceWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddBalanceWindow().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel balanceLabel;
	private javax.swing.JTextField balanceText;
	private javax.swing.JButton clearBtn;
	private javax.swing.JLabel idLabel;
	private javax.swing.JTextField idText;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton quitBtn;
	private javax.swing.JButton updateBtn;
}
