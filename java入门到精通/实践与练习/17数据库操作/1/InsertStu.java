import java.sql.*;

public class InsertStu {
	
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
		InsertStu c = new InsertStu();
		con = c.getConnection();
		try {
			sql = con.prepareStatement("insert into tb_stu(id,name,sex,birthday) values(?,?,?,?)");
			sql.setInt(1, 100);
			sql.setString(2, "李某");
			sql.setString(3, "女");
			sql.setString(4, "1999-10-20");
			sql.executeUpdate();
			System.out.println("数据插入成功。");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}