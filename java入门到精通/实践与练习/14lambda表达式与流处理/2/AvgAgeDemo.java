import java.util.List;
import java.util.stream.Collectors;

public class AvgAgeDemo {

	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList(); // 获取公共类的测试数据
		double avgAge = list.stream().collect(Collectors.averagingDouble(Employee::getAge));
		list.stream().filter(people -> people.getAge() > avgAge).forEach(e -> System.out.println(e));
	}
}
