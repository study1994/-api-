
public class CountPhoneCharge {
	public static void main(String[] args) {
		double phonecharge = 10; // 当前话费
		double communtime; // 通话时间
		double flux = 10; // 使用10M流量
		double fluxCost = flux * 0.3; // 10M流量的费用
		double communcost = 0.2; // 通话0.2元/分钟
		communtime = (phonecharge - fluxCost) / communcost; // 计算剩余通话时间
		System.out.println("话费余额可通话时长为" + communtime + "分钟");
	}
}
