package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;

public class ConsultasCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultasCadastrar frame = new ConsultasCadastrar();
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
	public ConsultasCadastrar() {
		setTitle("Cadastrar consultas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 984, 21);
		contentPane.add(menuBar);
		
		JMenu mnOpes = new JMenu("Opções");
		menuBar.add(mnOpes);
		
		JMenuItem mntmAlterar = new JMenuItem("Alterar");
		mnOpes.add(mntmAlterar);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnOpes.add(mntmSalvar);
		
		JMenuItem mntmDeletar = new JMenuItem("Deletar");
		mnOpes.add(mntmDeletar);
		
		JMenuItem mntmFechar = new JMenuItem("Fechar");
		mnOpes.add(mntmFechar);
		
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(10, 33, 46, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(66, 30, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblClinicas = new JLabel("Clínica:");
		lblClinicas.setBounds(10, 71, 46, 14);
		contentPane.add(lblClinicas);
				
		JComboBox<String> cbxClinica = new JComboBox<>();
		cbxClinica.setBounds(66, 68, 168, 20);
		contentPane.add(cbxClinica);
		
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setBounds(244, 71, 46, 14);
		contentPane.add(lblPaciente);
		
		JComboBox<String> cbxPaciente = new JComboBox<>();
		cbxPaciente.setBounds(300, 68, 168, 20);
		contentPane.add(cbxPaciente);
		
		JLabel lblMedico = new JLabel("Médico:");
		lblMedico.setBounds(478, 71, 38, 14);
		contentPane.add(lblMedico);
		
		JComboBox<String> cbxMedico = new JComboBox<>();
		cbxMedico.setBounds(526, 68, 168, 20);
		contentPane.add(cbxMedico);
		
		JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setBounds(704, 71, 74, 14);
		contentPane.add(lblEspecialidade);
		
		JComboBox<String> cbxEspecialidade = new JComboBox<>();
		cbxEspecialidade.setBounds(788, 68, 168, 20);
		contentPane.add(cbxEspecialidade);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 110, 46, 14);
		contentPane.add(lblData);
		
		JSpinner spinData = new JSpinner();
		spinData.setModel(new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY));
		JSpinner.DateEditor de1 = new JSpinner.DateEditor(spinData, "dd/MM/yyyy");
        spinData.setEditor(de1);
		spinData.setBounds(66, 107, 86, 20);
		contentPane.add(spinData);
		
		JLabel lblHorario = new JLabel("Horário:");
		lblHorario.setBounds(244, 110, 46, 14);
		contentPane.add(lblHorario);
		
		JSpinner spinHorario = new JSpinner();
		spinHorario.setModel(new SpinnerDateModel(new Date(1528601807649L), null, null, Calendar.HOUR_OF_DAY));
		JSpinner.DateEditor de2 = new JSpinner.DateEditor(spinHorario, "hh:mm");
        spinHorario.setEditor(de2);
		spinHorario.setBounds(300, 107, 98, 20);
		contentPane.add(spinHorario);
		
		JLabel lblDuracao = new JLabel("Duração:");
		lblDuracao.setBounds(478, 110, 46, 14);
		contentPane.add(lblDuracao);
		
		JComboBox<String> cbxDuracao = new JComboBox<>();
		cbxDuracao.setModel(new DefaultComboBoxModel<String>(new String[] {"00:15", "00:30", "00:45", "01:00"}));
		cbxDuracao.setBounds(526, 107, 62, 20);
		contentPane.add(cbxDuracao);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(732, 110, 46, 14);
		contentPane.add(lblTipo);
		
		JComboBox<String> cbxTipo = new JComboBox<>();
		cbxTipo.setBounds(788, 107, 98, 20);
		contentPane.add(cbxTipo);
		
		JLabel lblSintomas = new JLabel("Síntomas:");
		lblSintomas.setBounds(385, 144, 62, 14);
		contentPane.add(lblSintomas);
		
		JLabel lblPossivelMolestia = new JLabel("Possível moléstia:");
		lblPossivelMolestia.setBounds(370, 265, 98, 14);
		contentPane.add(lblPossivelMolestia);
		
		JLabel lblPrescricao = new JLabel("Prescrição:");
		lblPrescricao.setBounds(385, 406, 62, 14);
		contentPane.add(lblPrescricao);
						
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 538, 150, 23);
		contentPane.add(btnNovo);
		
		JButton btnPrimeiro = new JButton("Primeiro");
		btnPrimeiro.setBounds(210, 538, 150, 23);
		contentPane.add(btnPrimeiro);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(415, 538, 150, 23);
		contentPane.add(btnAnterior);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setBounds(611, 538, 150, 23);
		contentPane.add(btnProximo);
		
		JButton btnUltimo = new JButton("Último");
		btnUltimo.setBounds(806, 538, 150, 23);
		contentPane.add(btnUltimo);
		
		JScrollPane scrollSintomas = new JScrollPane();
		scrollSintomas.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollSintomas.setBounds(10, 169, 946, 74);
		contentPane.add(scrollSintomas);
		
		JTextArea txtAreaSintomas = new JTextArea();
		scrollSintomas.setViewportView(txtAreaSintomas);
		
		JScrollPane scrollPossivelMolestia = new JScrollPane();
		scrollPossivelMolestia.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPossivelMolestia.setBounds(10, 290, 946, 74);
		contentPane.add(scrollPossivelMolestia);
		
		JTextArea txtAreaPossivelMolestia = new JTextArea();
		scrollPossivelMolestia.setViewportView(txtAreaPossivelMolestia);
		
		JScrollPane scrollPrescricao = new JScrollPane();
		scrollPrescricao.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPrescricao.setBounds(10, 431, 946, 74);
		contentPane.add(scrollPrescricao);
		
		JTextArea txtAreaPrescricao = new JTextArea();
		scrollPrescricao.setViewportView(txtAreaPrescricao);
	}
}
