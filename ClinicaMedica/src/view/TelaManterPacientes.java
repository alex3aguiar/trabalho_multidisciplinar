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
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;

public class TelaManterPacientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomePaciente;
	private JTextField txtCodigoPaciente;
	private JTextField txtRGPaciente;
	private JTextField txtCPFPaciente;
	private JTextField txtCidadePaciente;
	private JTextField txtTelefonePaciente;
	private JTextField txtNumPaciente;
	private JTextField txtCEPPaciente;
	private JTextField txtEmailPaciente;
	private JTextField txtBairroPaciente;
	private JTextField txtLogradouroPaciente;
	private JTextField txtCelularPaciente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaManterPacientes frame = new TelaManterPacientes();
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
	public TelaManterPacientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Celular:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("E-mail:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label = new JLabel("Nome:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_1 = new JLabel("Código:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_2 = new JLabel("Data de nascimento:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_3 = new JLabel("Sexo:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_4 = new JLabel("RG:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_5 = new JLabel("CPF:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_6 = new JLabel("Estado:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_7 = new JLabel("Cidade:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_8 = new JLabel("Bairro:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_9 = new JLabel("CEP:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_10 = new JLabel("Logradouro:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_11 = new JLabel("Número:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_12 = new JLabel("Telefone:");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnNovoPaciente = new JButton("Novo");
		btnNovoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNovoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnPrimeiroPaciente = new JButton("Primeiro");
		btnPrimeiroPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPrimeiroPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnAnteriorPaciente = new JButton("Anterior");
		btnAnteriorPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnteriorPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnProximoPaciente = new JButton("Pr\u00F3ximo");
		btnProximoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnProximoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnUltimoPaciente = new JButton("\u00DAltimo");
		btnUltimoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUltimoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		txtNomePaciente = new JTextField();
		txtNomePaciente.setColumns(10);
		
		txtCodigoPaciente = new JTextField();
		txtCodigoPaciente.setColumns(10);
		
		txtRGPaciente = new JTextField();
		txtRGPaciente.setColumns(10);
		
		txtCPFPaciente = new JTextField();
		txtCPFPaciente.setColumns(10);
		
		txtCidadePaciente = new JTextField();
		txtCidadePaciente.setColumns(10);
		
		txtTelefonePaciente = new JTextField();
		txtTelefonePaciente.setColumns(10);
		
		txtNumPaciente = new JTextField();
		txtNumPaciente.setColumns(10);
		
		txtCEPPaciente = new JTextField();
		txtCEPPaciente.setColumns(10);
		
		txtEmailPaciente = new JTextField();
		txtEmailPaciente.setColumns(10);
		
		txtBairroPaciente = new JTextField();
		txtBairroPaciente.setColumns(10);
		
		JSpinner spnNascimentoPaciente = new JSpinner();
		spnNascimentoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		spnNascimentoPaciente.setModel(new SpinnerDateModel(new Date(1528599600000L), null, null, Calendar.DAY_OF_YEAR));
		
		JComboBox cmbSexoPaciente = new JComboBox();
		cmbSexoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtLogradouroPaciente = new JTextField();
		txtLogradouroPaciente.setColumns(10);
		
		JComboBox cmbEstadoPaciente = new JComboBox();
		
		txtCelularPaciente = new JTextField();
		txtCelularPaciente.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label)
							.addGap(4)
							.addComponent(txtNomePaciente, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
							.addGap(188)
							.addComponent(label_1)
							.addGap(4)
							.addComponent(txtCodigoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_6)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cmbEstadoPaciente, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_9)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCEPPaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spnNascimentoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtRGPaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_11)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNumPaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(label_5)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtCPFPaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(label_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cmbSexoPaciente, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_12)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtTelefonePaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
									.addGap(46)
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCelularPaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_10)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtLogradouroPaciente, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtCidadePaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
									.addGap(60)
									.addComponent(label_8)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtBairroPaciente, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEmailPaciente, GroupLayout.PREFERRED_SIZE, 462, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addComponent(btnNovoPaciente)
							.addGap(44)
							.addComponent(btnPrimeiroPaciente)
							.addGap(41)
							.addComponent(btnAnteriorPaciente)
							.addGap(43)
							.addComponent(btnProximoPaciente)
							.addGap(48)
							.addComponent(btnUltimoPaciente)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(txtNomePaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(txtCodigoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(cmbSexoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5)
								.addComponent(txtCPFPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_2)
								.addComponent(spnNascimentoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_4)
								.addComponent(txtRGPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6)
								.addComponent(label_7)
								.addComponent(txtCidadePaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8)
								.addComponent(txtBairroPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbEstadoPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_9)
								.addComponent(label_10)
								.addComponent(txtLogradouroPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCEPPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_11)
								.addComponent(txtNumPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_12)
								.addComponent(txtTelefonePaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(txtCelularPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtEmailPaciente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNovoPaciente)
						.addComponent(btnPrimeiroPaciente)
						.addComponent(btnAnteriorPaciente)
						.addComponent(btnProximoPaciente)
						.addComponent(btnUltimoPaciente))
					.addGap(36))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
