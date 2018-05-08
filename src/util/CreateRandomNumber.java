//乱数生成クラス
//
//こいつもゲーム中腐るほど使うからインスタンスを使い回す
package util;

import java.util.Random;

//final public class CreateRandomNumber {
public class CreateRandomNumber {

	//private static CreateRandomNumber createRNum=new CreateRandomNumber();

	//インスタンスを返却するメソッド
	//public static CreateRandomNumber getInstance(){
	//	return createRNum;
	//}

	/**
	 * 1から入力された値までの乱数を生成
	 *
	 * @param limit 乱数の上限値
	 *
	 * @return retNum 作成された乱数
	 *
	 * */
	public int getRandomInt(int limit){

		Random rand = new Random();
		int retNum;
		retNum = rand.nextInt(limit)+1;
		return retNum;
	}
}
