package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class manterConvenioView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					manterConvenioView frame = new manterConvenioView();
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
	public manterConvenioView() {
		setTitle("manter conv\u00EAnnio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 369);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpes = new JMenu("op\u00E7\u00F5es");
		menuBar.add(mnOpes);
		
		JMenuItem mntmAdcionar = new JMenuItem("adcionar");
		mnOpes.add(mntmAdcionar);
		
		JMenuItem mntmConsultar = new JMenuItem("consultar");
		mnOpes.add(mntmConsultar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManterConvenio = new JLabel("manter convenio");
		lblManterConvenio.setBounds(228, 11, 80, 14);
		contentPane.add(lblManterConvenio);
		
		JButton btnNewButton = new JButton("Novo");
		btnNewButton.setBounds(10, 279, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Primeiro");
		btnNewButton_1.setBounds(120, 279, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Anterior");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(219, 279, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pr\u00F3ximo");
		btnNewButton_3.setBounds(326, 279, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u00DAltimo");
		btnNewButton_4.setBounds(443, 279, 89, 23);
		contentPane.add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setBounds(96, 70, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(40, 73, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeFantasia = new JLabel("Nome fantasia");
		lblNomeFantasia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNomeFantasia.setBounds(-16, 104, 90, 35);
		contentPane.add(lblNomeFantasia);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(96, 111, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblCpnj = new JLabel("CPNJ");
		lblCpnj.setBounds(40, 150, 46, 14);
		contentPane.add(lblCpnj);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(96, 147, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setBounds(40, 198, 46, 14);
		contentPane.add(lblContato);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(96, 195, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		lblRazoSocial.setBounds(302, 73, 46, 14);
		contentPane.add(lblRazoSocial);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(358, 70, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(302, 107, 46, 14);
		contentPane.add(lblTelefone);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(358, 104, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblSite = new JLabel("Site");
		lblSite.setBounds(302, 147, 46, 14);
		contentPane.add(lblSite);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(358, 144, 86, 20);
		contentPane.add(textField_6);
	}
}
