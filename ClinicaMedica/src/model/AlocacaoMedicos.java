package model;

public class AlocacaoMedicos {
	private String dataAlocacao;
	private String horarioAlocacao;
	private int codigoMedico;
	private int codigoEspecialidade;
	private int codigoClinica;
	
	public AlocacaoMedicos(String data, String horario, int codigoMedico, int codigoEspec, int codigoClinica) {
		this.dataAlocacao = data;
		this.horarioAlocacao = horario;
		this.codigoMedico = codigoMedico;
		this.codigoEspecialidade = codigoEspec;
		this.codigoClinica = codigoClinica;
	}

	public String getDataAlocacao() {
		return dataAlocacao;
	}

	public String getHorarioAlocacao() {
		return horarioAlocacao;
	}

	public int getCodigoMedico() {
		return codigoMedico;
	}

	public int getCodigoEspecialidade() {
		return codigoEspecialidade;
	}

	public int getCodigoClinica() {
		return codigoClinica;
	}

	public void setDataAlocacao(String dataAlocacao) {
		this.dataAlocacao = dataAlocacao;
	}

	public void setHorarioAlocacao(String string) {
		this.horarioAlocacao = string;
	}

	public void setCodigoMedico(int codigoMedico) {
		this.codigoMedico = codigoMedico;
	}

	public void setCodigoEspecialidade(int codigoEspecialidade) {
		this.codigoEspecialidade = codigoEspecialidade;
	}

	public void setCodigoClinica(int codigoClinica) {
		this.codigoClinica = codigoClinica;
	}
	
	
}
