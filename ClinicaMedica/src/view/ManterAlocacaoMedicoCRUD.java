package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class ManterAlocacaoMedicoCRUD extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManterAlocacaoMedicoCRUD frame = new ManterAlocacaoMedicoCRUD();
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
	public ManterAlocacaoMedicoCRUD() {
		setTitle("Definir aloca\u00E7\u00E3o de m\u00E9dico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 418);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClnica = new JLabel("Cl\u00EDnica");
		lblClnica.setBounds(32, 33, 46, 14);
		contentPane.add(lblClnica);
		
		String []localClinica = new String[]{"Arthur Alvim", "Itaquera", "Brás", "Sé", "Luz"};
		JComboBox comboBox = new JComboBox(localClinica);
		comboBox.setBounds(77, 30, 111, 20);
		contentPane.add(comboBox);
		
		String []especialidade = new String[]{"Dentista", "Oftalmologista", "Otorrinolaringologista"};
		JLabel lblEspecialidade = new JLabel("Especialidade");
		lblEspecialidade.setBounds(219, 33, 72, 14);
		contentPane.add(lblEspecialidade);
		
		JComboBox comboBox_1 = new JComboBox(especialidade);
		comboBox_1.setBounds(290, 30, 111, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblMdico = new JLabel("M\u00E9dico");
		lblMdico.setBounds(441, 33, 40, 14);
		contentPane.add(lblMdico);
		
		String []medicos = new String[]{"Alex", "Guilherme", "Paulo", "Ricardo"};
		
		JComboBox comboBox_2 = new JComboBox(medicos);
		comboBox_2.setBounds(480, 30, 111, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblHoraDeIncio = new JLabel("Hora (in\u00EDcio)");
		lblHoraDeIncio.setBounds(32, 103, 67, 14);
		contentPane.add(lblHoraDeIncio);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1528714800000L), null, null, Calendar.HOUR));
		spinner.setBounds(109, 100, 98, 20);
		contentPane.add(spinner);
	}
}
