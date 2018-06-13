package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Especialidade;

public class TesteConexao extends Conexao {

	public static void main(String[] args) {

		try {
			Conexao conectar = new Conexao();
			Connection c = conectar.conexao();
			PreparedStatement stmt = c.prepareStatement(sql());
			ResultSet resultSet = stmt.executeQuery();
			System.out.println(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		select(1);
	}

	public static String sql() {
		return "select * from clinicas;";
	}
	
	public static List<Especialidade> select(int codigo) {
		List<Especialidade> listaEspecialidades = new ArrayList<>();
		try {
			Conexao conectar = new Conexao();
			Connection c = conectar.conexao();
			PreparedStatement stmt = c.prepareStatement("SELECT * from Especialidades WHERE  codigo_especialidade like ?");
			stmt.setString(1, "%" + codigo + "%");			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) { 
				Especialidade e = new Especialidade(null);
				e.setCodigo( rs.getInt("codigo") );
				
				listaEspecialidades.add( e );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(listaEspecialidades.indexOf(0));
		return listaEspecialidades;
	}

}
