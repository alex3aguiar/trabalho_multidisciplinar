package model;

import java.time.LocalDate;

public class Medico extends PessoaFisica {
	private String crm;

    public Medico(int codigo, String nome, String telefone, LocalDate dataNascimento, String rg, String cpf, 
            char sexo, String celular, String email, Endereco endereco, String crm)
    {
        super(codigo, nome, telefone, dataNascimento, rg, cpf, sexo, celular, email, endereco);
        this.crm = crm;
    }

    public Medico(String nome, String telefone, LocalDate dataNascimento, String rg, String cpf, 
            char sexo, String celular, String email, Endereco endereco, String crm)
    {
        this(-1, nome, telefone, dataNascimento, rg, cpf, sexo, celular, email, endereco, crm);
    }
    
    public void setCrm(String crm) {
		this.crm = crm;
	}
    
    public String getCrm() {
		return crm;
	}
}
