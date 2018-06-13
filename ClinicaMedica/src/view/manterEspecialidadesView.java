package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class manterEspecialidadesView extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manterEspecialidadesView frame = new manterEspecialidadesView();
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
	public manterEspecialidadesView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 50, 360, 104);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "\"Lorem ipsum dolor sit amet, cons"},
				{"2", "\"Lorem ipsum dolor sit amet, cons"},
				{"3", "\"Lorem ipsum dolor sit amet, cons"},
				{"4", "\"Lorem ipsum dolor sit amet, cons"},
				{"5", "\"Lorem ipsum dolor sit amet, cons"},
				{"6", null},
			},
			new String[] {
				"C\u00F3digo", "Descri\u00E7\u00E3o"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(307);
		scrollPane.setViewportView(table);
		
		JLabel lblEscolhaUmFiltro = new JLabel("Escolha um filtro");
		lblEscolhaUmFiltro.setBounds(48, 11, 92, 14);
		contentPane.add(lblEscolhaUmFiltro);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(134, 8, 99, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(24, 215, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(129, 215, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(239, 215, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(345, 215, 89, 23);
		contentPane.add(btnFechar);
	}

}
