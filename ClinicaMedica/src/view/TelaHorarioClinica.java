package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaHorarioClinica extends JFrame {

	private JPanel contentPane;
	private JTable tableHorarioClinica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHorarioClinica frame = new TelaHorarioClinica();
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
	public TelaHorarioClinica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblClnica = new JLabel("Cl\u00EDnica:");
		lblClnica.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblMdico = new JLabel("M\u00E9dico:");
		lblMdico.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox cmbClinica = new JComboBox();
		cmbClinica.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JComboBox cmbEspecialidade = new JComboBox();
		cmbEspecialidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JComboBox cmbMedico = new JComboBox();
		cmbMedico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnFecharHorarioClinica = new JButton("Fechar");
		btnFecharHorarioClinica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFecharHorarioClinica.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		tableHorarioClinica = new JTable();
		tableHorarioClinica.setModel(new DefaultTableModel(
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
		tableHorarioClinica.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(tableHorarioClinica, GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblClnica)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbClinica, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblEspecialidade)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbEspecialidade, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblMdico)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbMedico, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnFecharHorarioClinica))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblClnica)
						.addComponent(lblEspecialidade)
						.addComponent(cmbClinica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbEspecialidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMdico)
						.addComponent(cmbMedico, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(tableHorarioClinica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnFecharHorarioClinica)
					.addContainerGap(137, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
