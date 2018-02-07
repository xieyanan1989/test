package test;

public class LotteryCountUtil {

	/**
	 *  彩种注数计算
	 * @param lotteryId 彩种
	 * @param playType	玩法
	 * @param lotteryNumber 投注号码
	 * @return
	 */
	public static int counts(String lotteryId,String playType,String lotteryNumber){
		int count = 0 ;
		switch(lotteryId){
		//辽宁11选5
		case "91":
			count = lnElevenChoseFiveTypes(playType,lotteryNumber);
			break;
		}
		return count;
	}

	/**
	 * 辽宁11选5注数计算
	 * @param playType 玩法
	 * @param lotteryNumber 投注号码
	 * @return 注数
	 */
	private static int lnElevenChoseFiveTypes(String playType, String lotteryNumber) {
		// TODO Auto-generated method stub
		int count = 0;
		switch (playType) {
			//前一
		case "9101":
			count = lnecfone(lotteryNumber);
			break;
			//任二
		case "9102":
			break;
			//任三
		case "9103":
			break;
			//任四
		case "9104":
			break;
			//任五
		case "9105":
			break;
			//任六
		case "9106":
			break;
			//任七
		case "9107":
			break;
			//任八
		case "9108":
			break;
			//前二
		case "9109":
			break;
			//前三
		case "9110":
			break;
			//前二组选
		case "9111":
			break;
			//前三组选
		case "9112":
			break;
			//前二组选胆拖
		case "9113":
			break;
			//前三组选胆拖
		case "9114":
			break;
			//任二胆拖
		case "9115":
			break;
			//任三胆拖
		case "9116":
			break;
			//任四胆拖
		case "9117":
			break;
			//任五胆拖
		case "9118":
			break;
			//任六胆拖
		case "9119":
			break;
			//任七胆拖
		case "9120":
			break;
			//任八胆拖
		case "9121":
			break;	
		}
		return count;
	}

	/**
	 * 辽宁11选5前一
	 * @param lotteryNumber
	 * @return
	 */
	private static int lnecfone(String lotteryNumber) {
		// TODO Auto-generated method stub
		return 0;
	}
}
