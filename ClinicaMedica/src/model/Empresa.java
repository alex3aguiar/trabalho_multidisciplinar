package model;

public class Empresa extends PessoaJuridica {
	private int codigoConvenio;
    
    public Empresa(int codigo, String nome, String telefone, String razaoSocial, String cnpj,
            String contato, String site, int codigoConvenio)
    {
        super(codigo, nome, telefone, razaoSocial, cnpj, contato, site);
        this.codigoConvenio = codigoConvenio;
    }
    
    public Empresa(String nome, String telefone, String razaoSocial, String cnpj,
            String contato, String site, int codigoConvenio)
    {
        this(-1, nome, telefone, razaoSocial, cnpj, contato, site, codigoConvenio);
    }

	public int getCodigoConvenio() {
		return codigoConvenio;
	}

	public void setCodigoConvenio(int codigoConvenio) {
		this.codigoConvenio = codigoConvenio;
	}
}
