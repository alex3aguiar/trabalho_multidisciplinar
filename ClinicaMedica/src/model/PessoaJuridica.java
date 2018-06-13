package model;

public abstract class PessoaJuridica extends Pessoa {
	protected String razaoSocial;
    protected String cnpj;
    protected String contato;
    protected String site;

    public PessoaJuridica(int codigo, String nome, String telefone, String razaoSocial, String cnpj, String contato, String site) {
        super(codigo, nome, telefone);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.contato = contato;
        this.site = site;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getContato() {
        return contato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getSite() {
        return site;
    } 
}
