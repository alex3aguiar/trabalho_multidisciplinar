package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaHistoricoPaciente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomePaciente;
	private JTextField txtCodigoPaciente;
	private JTable tableHistoricoPaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHistoricoPaciente frame = new TelaHistoricoPaciente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaHistoricoPaciente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtNomePaciente = new JTextField();
		txtNomePaciente.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtCodigoPaciente = new JTextField();
		txtCodigoPaciente.setColumns(10);
		
		JButton btnExcluirHistoricoPaciente = new JButton("Excluir");
		btnExcluirHistoricoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluirHistoricoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnFecharHistoricoPaciente = new JButton("Fechar");
		btnFecharHistoricoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFecharHistoricoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tableHistoricoPaciente = new JTable();
		tableHistoricoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tableHistoricoPaciente.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(tableHistoricoPaciente, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(lblPaciente)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtNomePaciente, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addGap(42)
								.addComponent(lblCdigo)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtCodigoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(36, Short.MAX_VALUE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnExcluirHistoricoPaciente)
							.addGap(39)
							.addComponent(btnFecharHistoricoPaciente)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPaciente)
						.addComponent(txtNomePaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCdigo)
						.addComponent(txtCodigoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(tableHistoricoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFecharHistoricoPaciente)
						.addComponent(btnExcluirHistoricoPaciente))
					.addContainerGap(101, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
