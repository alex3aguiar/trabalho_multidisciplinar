package model;

public class Convenio extends PessoaJuridica {
	public Convenio(int codigo, String nome, String telefone, String razaoSocial, String cnpj, String contato, String site) {
        super(codigo, nome, telefone, razaoSocial, cnpj, contato, site);
    }
    
    public Convenio(String nome, String telefone, String razaoSocial, String cnpj, String contato, String site){
        this(-1, nome, telefone, razaoSocial, cnpj, contato, site);
    }
}
