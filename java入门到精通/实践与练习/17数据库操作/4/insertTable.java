import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTable {

	public static void main(String[] args) {
		Object data[][] = { { 1, "张三", "男", "1997-11-03", "开发部" }, { 2, "大强", "男", "1989-06-11", "营销部" },
				{ 3, "小王", "男", "1993-05-30", "财务部" }, { 4, "小胖", "女", "1991-07-10", "开发部" },
				{ 5, "李姨", "女", "1982-06-17", "人事部" }, };
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// 加载数据库驱动类
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 通过访问数据库的URL，获取数据库连接对象
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&zeroDateTimeBehavior=CONVERT_TO_NULL&allowPublicKeyRetrieval=true",
					"root", "123456");
			for (int i = 0; i < data.length; i++) {
				String sql = "insert into tb_emp values(?,?,?,?,?) ";
				PreparedStatement ps = con.prepareStatement(sql);
				for (int j = 0; j < data[i].length; j++) {
					ps.setObject(j + 1, data[i][j]);
				}
				ps.executeUpdate();
				ps.close();
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("插入完毕");
	}
}
