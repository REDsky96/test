import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {
	//フィールドを宣言
	String name = null;
	String password = null;

	//ここからメソッドを記載
	public void select(String name,String password) {
	DBConnector db = new DBConnector();

	//ここから開く
	Connection con = db.getConnection();

	//何の情報をもらうか定義する
	String sql ="select * from test_table where user_name=? and password=?";

	//try　catch文でエラーが出たときの対処
	try {

	//以下一行でSQL文に変換できるように設定
	PreparedStatement ps = con.prepareStatement(sql);

	//String sql ="select * from test_table where user_name=? and password=?";の？に入る情報を記載。
	ps.setString(1, name);//数字は最初の？にという意味
	ps.setString (2, password);//数字は2番目の？にという意味

	//select(set)なのでこの文が必要 実行メソッドがexecuteQuery
	ResultSet rs=ps.executeQuery();

	if (rs.next()) {
	System.out.println(rs.getString("user_name"));
	System.out.println(rs.getString("password"));
	}
	} catch (SQLException e ) {
	e.printStackTrace();//この文でエラー内容を表示
	}
	try {
	con.close() ;
	} catch (SQLException e ) {
	e.printStackTrace();
	}
	}

	public void selectAll(){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from test_table";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while (rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	public void selectByName(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql ="select * from test_table where user_name=?";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
		System.out.println(rs.getString("user_name"));
		System.out.println(rs.getString("password"));
		}
		} catch (SQLException e ) {
		e.printStackTrace();
		}
		try {
		con.close() ;
		} catch (SQLException e ) {
		e.printStackTrace();
		}
	}

	public void selectByPassword(String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql ="select * from test_table where password=?";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString (1, password);
		ResultSet rs=ps.executeQuery();

	while (rs.next()) {
		System.out.println(rs.getString("user_name"));
		System.out.println(rs.getString("password"));
		}
		} catch (SQLException e ) {
		e.printStackTrace();
		}
		try {
		con.close() ;
		} catch (SQLException e ) {
		e.printStackTrace();
		}
	}

	public void updateUserNameByUserName(String oldName, String newName){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "update test_table set user_name=? where user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  newName);
			ps.setString(2, oldName);
			int i =ps.executeUpdate();
			if (i>0){
				System.out.println(i + "件更新されました");
			}else{
				System.out.println("該当するデータはありませんでした");
			}
		}catch (SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}


	public void insert(int user_id,String name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="insert into test_table values(?,?,?)";
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, user_id);
		ps.setString(2, name);
		ps.setString (3, password);

		//select (set) ではないのでここでは以下のコードを記述する。deleteでも同様。
		int i=ps.executeUpdate();
		if (i>0) {
		System.out.println(i + "件登録されました");
		}
		} catch (SQLException e ) {
		e.printStackTrace();
		}
		try {
		con.close() ;
		} catch (SQLException e ) {
		e.printStackTrace();
		}
	}


	public void delete(String name){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from test_table where user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);

			//select (set) ではないのでここでは以下のコードを記述する。deleteでも同様。
			int i = ps.executeUpdate();
			if(1>0){
				System.out.println(i+"件削除されました");
			}
			}catch (SQLException e ) {
				e.printStackTrace();
			}
			try {
			con.close() ;
			} catch (SQLException e ) {
			e.printStackTrace();
			}
		}
}

