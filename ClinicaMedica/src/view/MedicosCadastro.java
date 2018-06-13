package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class MedicosCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCodigo;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtCep;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtTelefone;
	private JTextField txtCelular;
	private JTextField txtCrm;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicosCadastro frame = new MedicosCadastro();
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
	public MedicosCadastro() {
		setTitle("Cadastrar médicos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 408);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 23, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(57, 20, 338, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(444, 23, 46, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(500, 20, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data de nascimento:");
		lblDataNascimento.setBounds(10, 58, 109, 14);
		contentPane.add(lblDataNascimento);
		
		JSpinner spinDataNascimento = new JSpinner();
		spinDataNascimento.setModel(new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY));
		JSpinner.DateEditor de_spinDataNascimento = new JSpinner.DateEditor(spinDataNascimento, "dd/MM/yyyy");
        spinDataNascimento.setEditor(de_spinDataNascimento);
		spinDataNascimento.setBounds(129, 52, 86, 20);
		contentPane.add(spinDataNascimento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(242, 58, 40, 14);
		contentPane.add(lblSexo);
		
		JComboBox<String> cbxSexo = new JComboBox<>();
		cbxSexo.setModel(new DefaultComboBoxModel<String>(new String[] {"Masculino", "Feminino", "Outro"}));
		cbxSexo.setBounds(280, 55, 86, 20);
		contentPane.add(cbxSexo);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(10, 93, 46, 14);
		contentPane.add(lblRg);
		
		txtRg = new JTextField();
		txtRg.setBounds(57, 90, 158, 20);
		contentPane.add(txtRg);
		txtRg.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(242, 93, 33, 14);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(280, 87, 176, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(478, 93, 46, 14);
		contentPane.add(lblEstado);
		
		JComboBox<String> cbxEstado = new JComboBox<>();
		cbxEstado.setModel(new DefaultComboBoxModel<String>(new String[] {
				"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT",
				"PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}));
		cbxEstado.setBounds(534, 90, 52, 20);
		contentPane.add(cbxEstado);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 135, 46, 14);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(57, 132, 193, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(271, 135, 46, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(309, 132, 351, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 177, 46, 14);
		contentPane.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(44, 174, 128, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(186, 177, 64, 14);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(259, 174, 401, 20);
		contentPane.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		JLabel lblNumero = new JLabel("Número:");
		lblNumero.setBounds(10, 220, 46, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(65, 217, 94, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(185, 220, 46, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(241, 217, 181, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(444, 220, 46, 14);
		contentPane.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(491, 217, 169, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblCrm = new JLabel("CRM:");
		lblCrm.setBounds(10, 258, 46, 14);
		contentPane.add(lblCrm);
		
		txtCrm = new JTextField();
		txtCrm.setBounds(67, 255, 121, 20);
		contentPane.add(txtCrm);
		txtCrm.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(235, 258, 40, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(285, 255, 375, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setBounds(10, 307, 89, 23);
		contentPane.add(btnNovo);
		
		JButton btnPrimeiro = new JButton("Primeiro");
		btnPrimeiro.setBounds(126, 307, 89, 23);
		contentPane.add(btnPrimeiro);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(278, 307, 89, 23);
		contentPane.add(btnAnterior);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setBounds(432, 307, 89, 23);
		contentPane.add(btnProximo);
		
		JButton btnUltimo = new JButton("Último");
		btnUltimo.setBounds(571, 307, 89, 23);
		contentPane.add(btnUltimo);
	}
}
