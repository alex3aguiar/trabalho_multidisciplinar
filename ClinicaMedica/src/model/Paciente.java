package model;

import java.time.LocalDate;

public class Paciente extends PessoaFisica {
	private int codigoEmpresa;
	
	public Paciente(int codigo, String nome, String telefone, LocalDate dataNascimento, String rg, String cpf,
            char sexo, String celular, String email, Endereco endereco, int codigoEmpresa)
    {
        super(codigo, nome, telefone, dataNascimento, rg, cpf, sexo, celular, email, endereco);
        this.codigoEmpresa = codigoEmpresa;
    }

    public Paciente(String nome, String telefone, LocalDate dataNascimento, String rg, String cpf,
            char sexo, String celular, String email, Endereco endereco, int codigoEmpresa)
    {
        this(-1, nome, telefone, dataNascimento, rg, cpf, sexo, celular, email, endereco, codigoEmpresa);
    }

	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
}
