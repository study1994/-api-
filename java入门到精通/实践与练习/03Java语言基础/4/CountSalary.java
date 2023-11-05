
public class CountSalary {
	public static void main(String[] args) {
		int salary = 4500; // 小李的工资
		int bonus = 1000; // 小李的奖金
		int insurance = 500; // 小李要缴纳的五险一金
		int income = salary + bonus - insurance; // 小李的最终收入
		System.out.println("小李的月收入是" + income);
	}
}
