package come.test;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;

import org.xml.sax.HandlerBase;

class JDBCConnect {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.je.MySQL.DBDriver");
		String url = "http:\\839383883:900: db2:driver";
		String sql = "select * from abc";
		try {
			HashMap hm = new HashMap<>();
			Iterator i = hm.keySet().iterator();
			HashSet<E> hs = new HashSet<>();
			
			Connection con=DriverManager.getConnection(url, "usr","pass");
			PreparedStatement preSt = con.prepareStatement(sql);
			preSt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
