package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.AlocacaoMedicos;


public class AlocacaoMedicosImpl {
	
	private Connection con;
	
	public AlocacaoMedicosImpl() {
		con = Conexao.getConnection();
	}
	
	public boolean adicionar(AlocacaoMedicos alocacaoMedicos) {
		
		String sql = "INSERT INTO ALOCACAO_MEDICOS (data_alocacao, horario_alocacao, codigo_medico,"
				+ " codigo_clinica, codigo_especialidade) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement( sql );
			stmt.setString(1, alocacaoMedicos.getDataAlocacao());
			stmt.setString(2, alocacaoMedicos.getHorarioAlocacao());
			stmt.setInt(3, alocacaoMedicos.getCodigoMedico());
			stmt.setInt(4, alocacaoMedicos.getCodigoEspecialidade());
			stmt.setInt(5, alocacaoMedicos.getCodigoClinica());
			stmt.executeUpdate();
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			Conexao.closeConnection(con, stmt);
		}
	}
	
}
