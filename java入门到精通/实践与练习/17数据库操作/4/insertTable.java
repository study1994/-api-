import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTable {

	public static void main(String[] args) {
		Object data[][] = { { 1, "����", "��", "1997-11-03", "������" }, { 2, "��ǿ", "��", "1989-06-11", "Ӫ����" },
				{ 3, "С��", "��", "1993-05-30", "����" }, { 4, "С��", "Ů", "1991-07-10", "������" },
				{ 5, "����", "Ů", "1982-06-17", "���²�" }, };
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// �������ݿ�������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// ͨ���������ݿ��URL����ȡ���ݿ����Ӷ���
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
		System.out.println("�������");
	}
}
