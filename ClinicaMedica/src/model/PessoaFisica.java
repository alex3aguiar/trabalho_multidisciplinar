package model;

import java.time.LocalDate;

public abstract class PessoaFisica extends Pessoa {
	protected LocalDate dataNascimento;
    protected String rg;
    protected String cpf;
    protected char sexo;
    protected String celular;
    protected String email;
    protected Endereco endereco;

    public PessoaFisica(int codigo, String nome, String telefone, LocalDate dataNascimento, String rg, String cpf,
            char sexo, String celular, String email, Endereco endereco)
    {
        super(codigo, nome, telefone);
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getRg() {
        return rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
