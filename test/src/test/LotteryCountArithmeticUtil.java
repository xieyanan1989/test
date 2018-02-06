package test;

public class LotteryCountArithmeticUtil {

	/**
	 * 乐透单复式注数计算
	 * 适用于双色球、七乐彩、大乐透、快乐十分、11选5
	 * @param number 	彩民选中号码的长度
	 * @param fixNum	彩种玩法所需要的球个数
	 * @return			注数
	 */
	public static int lottArithmetic(int number,int fixNum) {
		return combine(number,fixNum);
	}
	
	/**
	 * 概率计算公式
	 * @param number	彩民选中号码的长度
	 * @param fixNum	彩种玩法所需要的球个数
	 * @return
	 */
	private static int combine(int number,int fixNum){
		int b =permute(number, fixNum);
        b /= permute(fixNum, fixNum);
        return b;
	}
	/**
	 * 阶乘
	 * @param number
	 * @param fixNum
	 * @return
	 */
	private static int permute(int number, int fixNum) {
		int b = 1;
        for (int c = 0; c < fixNum; c++) {
            b *= (number - c);
        }
        return b;
	}
}
