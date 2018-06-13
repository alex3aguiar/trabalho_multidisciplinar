package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class manterEmpresasView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manterEmpresasView frame = new manterEmpresasView();
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
	public manterEmpresasView() {
		setTitle("Manter Empresa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(93, 72, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("c\u00F3digo:");
		lblNewLabel.setBounds(37, 75, 35, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeFantasia = new JLabel("Nome fantasia:");
		lblNomeFantasia.setBounds(10, 140, 73, 14);
		contentPane.add(lblNomeFantasia);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 137, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(48, 211, 46, 14);
		contentPane.add(lblCnpj);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(93, 208, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblContato = new JLabel("Contato:");
		lblContato.setBounds(37, 283, 46, 14);
		contentPane.add(lblContato);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(93, 280, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(288, 75, 46, 14);
		contentPane.add(lblEmpresa);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o social:");
		lblRazoSocial.setBounds(288, 140, 46, 14);
		contentPane.add(lblRazoSocial);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(349, 137, 99, 20);
		contentPane.add(textField_5);
		
		JLabel lblTelefone = new JLabel("telefone:");
		lblTelefone.setBounds(288, 211, 46, 14);
		contentPane.add(lblTelefone);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(349, 208, 99, 20);
		contentPane.add(textField_6);
		
		JLabel lblSite = new JLabel("Site:");
		lblSite.setBounds(288, 283, 46, 14);
		contentPane.add(lblSite);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(349, 280, 99, 20);
		contentPane.add(textField_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setSelectedIndex(1);
		comboBox.setEditable(true);
		comboBox.setBounds(344, 72, 104, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("novo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(26, 348, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("primeiro");
		btnNewButton_1.setBounds(139, 348, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Anteiror");
		btnNewButton_2.setBounds(245, 348, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pr\u00F3ximo");
		btnNewButton_3.setBounds(374, 348, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Ultimo");
		btnNewButton_4.setBounds(473, 348, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
