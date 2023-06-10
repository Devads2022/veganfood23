package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;

import connect.ConexaoEntrega;

public class ListarEntrega {

	public static List<Entrega> listarEntrega1()throws Exception {
		 List<Entrega> listarEntrega = null;
		 Entrega e = null;
		 Connection conn = null;
		 PreparedStatementCreator pstmt = null ;
		 ResultSet result = null;
		 String sql = "Select * from entrega";
		 listarEntrega = new ArrayList<Entrega>();
		 conn = (Connection) ConexaoEntrega.getConnection();
		 pstmt= (PreparedStatementCreator) conn.prepareStatement(sql);
		 result = ((PreparedStatement) pstmt).executeQuery();
		 while (result.next()) {
			 e = new Entrega();
//			 e.setCep(result.getString("Cpf"));
//			 e.setnome_Entregador(result.getString("Nome"));
//			 e.setPlaca(result.getString("Placa"));
//			 e.setData_entrega(result.getString("Data"));
		 }
		 
		// TODO Auto-generated method stub
		
		return null;
	}

	public static List<Entrega> listarEntrega() {
		// TODO Auto-generated method stub
		return null;
	}

}
