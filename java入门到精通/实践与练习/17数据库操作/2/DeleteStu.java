import java.sql.*;

public class DeleteStu {
	static Connection con;
	static PreparedStatement sql;
	static ResultSet res;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载数据库驱动类
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 通过访问数据库的URL，获取数据库连接对象
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		DeleteStu c = new DeleteStu();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("delete from tb_stu where birthday < ?");
			sql.setString(1, "1996-01-01");
			sql.executeUpdate();
			System.out.println("数据删除完毕");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
