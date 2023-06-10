package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connect.ConexaoEntrega;
import view.Entrega;





public class CadastrarEntrega {
	
	public static void salvarEntrega(Entrega e) throws Exception{
		
		Connection conn = null;
		
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO entregaApplication(cpf,nome_entregador, placa, data_entrega,hora_saida, cep, valor) VALUES(?,?,?,?,?,?,?) ";
		
		conn = (Connection) ConexaoEntrega.getConnection();
		
		pstmt = conn.prepareStatement(sql);
//		pstmt.setString(1, e.getcpf());
//		pstmt.setString(1, e.getnome_entregador() );
//		pstmt.setLong(1,e.getplaca());
//		pstmt.setDate(1, e.getdata_entrega());
//		pstmt.setTime(1, e.gethora_saida());
//		pstmt.setString(1, e.getcep());
//		pstmt.setDouble(1, e.getvalor());
		pstmt.executeUpdate();
		pstmt.close();
		
	}   

}
