//数値チェック用のクラス
//
//多分色々なところで使いまわされるからsingletonパターンでインスタンスを使い回す
//
//checkEquals：入力された数値同士が等しいかチェックするメソッド
//checkBetween：第１引数の数値が第２引数と第３引数の間に存在するかチェックするメソッド
//
//
package util;

final public class CheckNum {

	private static final CheckNum checknum=new CheckNum();

	//コンストラクタ
	private CheckNum(){
	}

	//インスタンスを返却するメソッド
	public static CheckNum getInstance(){
		return checknum;
	}

	/**
	 * 指定された数値同士が等しいかのチェックメソッド
	 *
	 * @param checkTarget チェック対象の数値
	 * @param comparison 期待値
	 *
	 * @return ret チェック結果
	 *
	 * */
	public boolean checkEquals(int checkTarget, int comparison){

		//戻り値を格納する変数
		boolean ret=true;

		if(checkTarget!=comparison){
			ret=false;
		}
		return ret;
	}

	/**
	 * 指定された数値が特定の数値同士の間に入ってるかのチェック
	 * （上限と下限は含まない）
	 *
	 * @param checkTarget チェック対象
	 * @param startNum 開始値
	 * @param endNum 終了値
	 *
	 * @return ret チェック結果
	 *
	 * */

	public boolean checkBetween(int checkTarget, int startNum, int endNum){
		boolean ret=false;

		if(checkTarget>startNum&&checkTarget<endNum){
			ret=true;
		}
		return ret;
	}
}
