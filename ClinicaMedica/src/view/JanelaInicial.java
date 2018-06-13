package view;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JanelaInicial extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInicial frame = new JanelaInicial();
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
	public JanelaInicial() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu mnVer = new JMenu("Ver");
		menuBar.add(mnVer);
		
		JMenuItem mntmClinicas = new JMenuItem("Clínicas");
		mnVer.add(mntmClinicas);
		
		JMenuItem mntmConsultas = new JMenuItem("Consultas");
		mnVer.add(mntmConsultas);
		
		JMenuItem mntmConvenios = new JMenuItem("Convênios");
		mnVer.add(mntmConvenios);
		
		JMenuItem mntmEmpresas = new JMenuItem("Empresas");
		mnVer.add(mntmEmpresas);
		
		JMenuItem mntmEspecialidades = new JMenuItem("Especialidades");
		mnVer.add(mntmEspecialidades);
		
		JMenuItem mntmMedicos = new JMenuItem("Médicos");
		mnVer.add(mntmMedicos);
		
		JMenuItem mntmPacientes = new JMenuItem("Pacientes");
		mnVer.add(mntmPacientes);
		
		JLabel lblNewLabel = new JLabel("Bem-vindo ao sistema \r\nde cl\u00EDnica m\u00E9dica");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(103, 119, 214, 36);
		contentPane.add(lblNewLabel);
		
		addWindowListener( new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowOpened(e);
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
		});
	}

}
