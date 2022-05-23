
package SystemGUI;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class AddUserWindow extends javax.swing.JFrame {

	String fileName = null;
	byte[] person_image = null;

	public AddUserWindow() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jDialog1 = new javax.swing.JDialog();
		jPanel1 = new javax.swing.JPanel();
		nameLabel = new javax.swing.JLabel();
		ageLabel = new javax.swing.JLabel();
		addressLabel = new javax.swing.JLabel();
		noPhoneLabel = new javax.swing.JLabel();
		sexLabel = new javax.swing.JLabel();
		nameText = new javax.swing.JTextField();
		ageText = new javax.swing.JTextField();
		addressText = new javax.swing.JTextField();
		phoneText = new javax.swing.JTextField();
		sexText = new javax.swing.JComboBox<>();
		passwordLabel = new javax.swing.JLabel();
		passwordText = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		idText = new javax.swing.JTextField();
		securityLabel = new javax.swing.JLabel();
		securityText = new javax.swing.JComboBox<>();
		answerLabel = new javax.swing.JLabel();
		answerText = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		cardText = new javax.swing.JTextField();
		btnSave = new javax.swing.JButton();
		btnClear = new javax.swing.JButton();
		quitBtn = new javax.swing.JButton();

		javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
		jDialog1.getContentPane().setLayout(jDialog1Layout);
		jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 400, Short.MAX_VALUE));
		jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Add User");

		jPanel1.setBackground(new java.awt.Color(240, 227, 202));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter User Information:",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 18))); // NOI18N

		nameLabel.setText("Full name:");

		ageLabel.setText("Age:");

		addressLabel.setText("Address:");

		noPhoneLabel.setText("Phone Number:");

		sexLabel.setText("Gender:");

		nameText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nameTextActionPerformed(evt);
			}
		});

		addressText.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addressTextActionPerformed(evt);
			}
		});

		sexText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

		passwordLabel.setText("User Password:");

		jLabel1.setText("User ID:");

		securityLabel.setText("Security Question:");

		securityText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mother Tounge? ",
				"What is your nickname?", "What is your first Childhood friend?", "What is your school name?" }));

		answerLabel.setText("Answer:");

		jLabel2.setText("Card Number:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(82, 82, 82)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cardText))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(answerText))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(securityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												securityText, javax.swing.GroupLayout.PREFERRED_SIZE, 624,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
														165, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(passwordText).addComponent(idText)))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(noPhoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(nameText).addComponent(ageText).addComponent(addressText)
												.addGroup(jPanel1Layout.createSequentialGroup()
														.addComponent(sexText, javax.swing.GroupLayout.PREFERRED_SIZE,
																121, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(0, 503, Short.MAX_VALUE))
												.addComponent(phoneText))))
						.addContainerGap(129, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(nameText).addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
										45, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(16, 16, 16)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(sexText, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(noPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cardText, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(securityLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(securityText, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(answerLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(answerText, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(50, 50, 50)));

		btnSave.setText("Save");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});

		btnClear.setText("Clear");
		btnClear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnClearActionPerformed(evt);
			}
		});

		quitBtn.setText("Quit");
		quitBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				quitBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(121, 121, 121)
						.addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(81, 81, 81)
						.addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 205,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(74, 74, 74)
						.addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, Short.MAX_VALUE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(26, 26, 26)));

		pack();
	}

	private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {
		HomePage hp = new HomePage();
		hp.setVisible(true);
		setVisible(false);
	}

	private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
		nameText.setText("");
		ageText.setText("");
		addressText.setText("");
		phoneText.setText("");
		sexText.setSelectedIndex(0);
		idText.setText("");
		securityText.setSelectedIndex(0);
		answerText.setText("");
		passwordText.setText("");
		cardText.setText("");
	}

	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
		String name = nameText.getText();
		int age = Integer.parseInt(ageText.getText());
		String address = addressText.getText();
		String phone = phoneText.getText();
		String sex = sexText.getSelectedItem().toString();
		String password = passwordText.getText();

		String user_id = idText.getText();
		String question = securityText.getSelectedItem().toString();
		String answer = answerText.getText();

		Customer ctm = new Customer(user_id, password, name, address, age, sex, phone, question, answer);
		CustomerModify.insertCustomer(ctm);

		String card = cardText.getText();
		UserBalance ub = new UserBalance(user_id, card);
		UserBalanceModify.insertUserBalance(ub);
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
			java.util.logging.Logger.getLogger(AddUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddUserWindow().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel addressLabel;
	private javax.swing.JTextField addressText;
	private javax.swing.JLabel ageLabel;
	private javax.swing.JTextField ageText;
	private javax.swing.JLabel answerLabel;
	private javax.swing.JTextField answerText;
	private javax.swing.JButton btnClear;
	private javax.swing.JButton btnSave;
	private javax.swing.JTextField cardText;
	private javax.swing.JTextField idText;
	private javax.swing.JDialog jDialog1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel nameLabel;
	private javax.swing.JTextField nameText;
	private javax.swing.JLabel noPhoneLabel;
	private javax.swing.JLabel passwordLabel;
	private javax.swing.JTextField passwordText;
	private javax.swing.JTextField phoneText;
	private javax.swing.JButton quitBtn;
	private javax.swing.JLabel securityLabel;
	private javax.swing.JComboBox<String> securityText;
	private javax.swing.JLabel sexLabel;
	private javax.swing.JComboBox<String> sexText;
}
