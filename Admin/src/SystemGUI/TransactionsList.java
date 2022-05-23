
package SystemGUI;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TransactionsList extends javax.swing.JFrame {
	DefaultTableModel tableModel;

	public TransactionsList() {
		initComponents();
		tableModel = (DefaultTableModel) transTable.getModel();

		showTrans();
	}

	private void showTrans() {
		List<Transaction> transList = TransactionModify.findAll();
		tableModel.setRowCount(0);
		for (Transaction transaction : transList) {
			tableModel.addRow(new Object[] { transaction.getUser_id(), transaction.getTrain_id(),
					transaction.getTicket_id(), transaction.getFrom(), transaction.getTo(), transaction.getDate() });
		}
	}

	private void showTrans2() {
		String dateFrom = fromDateText.getText();
		String dateTo = toDateText.getText();

		List<Transaction> transList = TransactionModify.findAll();
		tableModel.setRowCount(0);

		for (Transaction transaction : transList) {
			String dateTran = transaction.getDate();
			if (dateTran.compareTo(dateFrom) > 0 && dateTo.compareTo(dateTran) > 0) {

				tableModel.addRow(
						new Object[] { transaction.getUser_id(), transaction.getTrain_id(), transaction.getTicket_id(),
								transaction.getFrom(), transaction.getTo(), transaction.getDate() });
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		quitBtn = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		transTable = new javax.swing.JTable();
		fromDateLabel = new javax.swing.JLabel();
		toDateLabel = new javax.swing.JLabel();
		fromDateText = new javax.swing.JTextField();
		toDateText = new javax.swing.JTextField();
		searchBtn = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Transactions List");

		quitBtn.setText("Quit");
		quitBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				quitBtnActionPerformed(evt);
			}
		});

		transTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "User ID", "Train ID", "Ticket ID", "From", "To", "Date" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(transTable);

		fromDateLabel.setText("From Date (yyyy-mm-dd):");

		toDateLabel.setText("To Date (yyyy/mm/dd):");

		searchBtn.setText("Search");
		searchBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane1)
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(309, 309, 309).addComponent(quitBtn,
								javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(136, 136, 136)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(fromDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138,
												Short.MAX_VALUE)
										.addComponent(toDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(fromDateText).addComponent(toDateText,
												javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)))
						.addGroup(layout.createSequentialGroup().addGap(307, 307, 307).addComponent(searchBtn,
								javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(143, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(fromDateText, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
								.addComponent(fromDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(toDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(toDateText, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(quitBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGap(22, 22, 22)));

		pack();
	}

	private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {
		HomePage hp = new HomePage();
		hp.setVisible(true);
		setVisible(false);
	}

	private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {

		tableModel = (DefaultTableModel) transTable.getModel();

		showTrans2();

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
			java.util.logging.Logger.getLogger(TransactionsList.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TransactionsList.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TransactionsList.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TransactionsList.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TransactionsList().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel fromDateLabel;
	private javax.swing.JTextField fromDateText;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton quitBtn;
	private javax.swing.JButton searchBtn;
	private javax.swing.JLabel toDateLabel;
	private javax.swing.JTextField toDateText;
	private javax.swing.JTable transTable;
}
