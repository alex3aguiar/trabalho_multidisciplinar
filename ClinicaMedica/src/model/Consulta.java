package model;

import java.time.LocalTime;

public class Consulta {
	private int codigo;
	private int codigoPaciente;
	private AlocacaoMedicos alocacaoMedicos;
    private LocalTime duracao;
    private int tipoConsulta;
    private boolean cancelada;
    private String sintomas;
    private String possivelMolestia;
    private String prescricao;
	
    public Consulta(int codigo, int codigoPaciente, AlocacaoMedicos alocacaoMedicos, LocalTime duracao,
			int tipoConsulta, boolean cancelada, String sintomas, String possivelMolestia, String prescricao) {
		this.codigo = codigo;
		this.codigoPaciente = codigoPaciente;
		this.alocacaoMedicos = alocacaoMedicos;
		this.duracao = duracao;
		this.tipoConsulta = tipoConsulta;
		this.cancelada = cancelada;
		this.sintomas = sintomas;
		this.possivelMolestia = possivelMolestia;
		this.prescricao = prescricao;
	}

	public Consulta(int codigoPaciente, AlocacaoMedicos alocacaoMedicos, LocalTime duracao, int tipoConsulta,
			boolean cancelada, String sintomas, String possivelMolestia, String prescricao) {
		this(-1, codigoPaciente, alocacaoMedicos, duracao, tipoConsulta, cancelada, sintomas, possivelMolestia, prescricao);
	}

	public int getCodigo() {
		return codigo;
	}

	public int getCodigoPaciente() {
		return codigoPaciente;
	}

	public AlocacaoMedicos getAlocacaoMedicos() {
		return alocacaoMedicos;
	}

	public LocalTime getDuracao() {
		return duracao;
	}

	public int getTipoConsulta() {
		return tipoConsulta;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public String getSintomas() {
		return sintomas;
	}

	public String getPossivelMolestia() {
		return possivelMolestia;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCodigoPaciente(int codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}

	public void setAlocacaoMedicos(AlocacaoMedicos alocacaoMedicos) {
		this.alocacaoMedicos = alocacaoMedicos;
	}

	public void setDuracao(LocalTime duracao) {
		this.duracao = duracao;
	}

	public void setTipoConsulta(int tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public void setPossivelMolestia(String possivelMolestia) {
		this.possivelMolestia = possivelMolestia;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
    
    
}
