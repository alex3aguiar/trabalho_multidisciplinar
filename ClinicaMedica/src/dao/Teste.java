package dao;

import model.AlocacaoMedicos;

public class Teste {
	public static void main(String[] args) {
		AlocacaoMedicosImpl a = new AlocacaoMedicosImpl();
		

		
		a.adicionar(new AlocacaoMedicos("2018/06/14", "02:30", 1, 1, 1));
	}
}
