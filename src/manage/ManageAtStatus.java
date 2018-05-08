package manage;

import util.CheckExperience;
import util.GetAtInfo;
import util.SetAtInfo;

/**
 * PCのステータスの管理をするクラス
 *
 * */
public class ManageAtStatus {

	private SetAtInfo setAtInfo = new SetAtInfo();
	private GetAtInfo getAtInfo = new GetAtInfo();
	private final int defaultAtackDiceNum = 2;//素手のときのダイス数
	private final int defaultDefenceDiceNum = 2;//裸のときのダイス数

	/**
	 * 攻撃ダイス数の設定<br><br>
	 *
	 * PCの攻撃ダイス数の設定を行うメソッド<br>
	 * 最初に装備無しの攻撃ダイス数を設定<br>
	 * 武器を装備している場合は武器とステータスからダイス数を計算<br>
	 * 最後にダイス数を設定
	 * */
	public void setAtackDiceNum(){
		//装備無しの場合は攻撃ダイスは2固定
		int diceNum = defaultAtackDiceNum;

		//武器を装備しているか判定
		if(!getAtInfo.getWeapon().equals(null)){
			//武器のダイス数とdexの10分の1を足し算した結果を設定
			diceNum = getAtInfo.getWeapon().numDice + (getAtInfo.getDex()/10);
		}

		//計算結果をPCの攻撃ダイス数に設定
		setAtInfo.setNumAtackDice(diceNum);
	}

	/**
	 * 攻撃ダイスの面の設定<br><br>
	 *
	 * PCの攻撃ダイス面の設定を行うメソッド<br>
	 * 最初にステータスからダイス面を計算<br>
	 * 武器を装備している場合は武器のダイス面と最初に計算した面数を足し算<br>
	 * 最後にダイス面を設定
	 * */
	public void setAtackDiceMen(){
		//装備無しの場合の値を設定 strとdexの5分の1を足し算する
		int diceMen = getAtInfo.getStr() + (getAtInfo.getDex()/5);

		//武器を装備しているか判定
		if(!getAtInfo.getWeapon().equals(null)){
			//武器のダイス面を加算
			diceMen = getAtInfo.getWeapon().numDiceMen + diceMen;
		}

		//計算結果をPCの攻撃ダイス面に設定
		setAtInfo.setNumAtackDiceMen(diceMen);
	}

	/**
	 * 攻撃固定値の設定<br><br>
	 *
	 * PCの攻撃固定値の設定を行うメソッド<br>
	 * 最初にステータスから攻撃固定値を計算<br>
	 * 武器を装備している場合は武器の固定値と最初に計算した固定値を足し算<br>
	 * 腕装備をしている場合は上記までに計算していた固定値に腕装備の固定値を更に足し算<br>
	 * 最後に攻撃固定値を設定
	 * */
	public void setFixedAtack(){
		//装備無しの場合の値を設定 strの2分の1
		int fixedAtack = getAtInfo.getStr()/2;

		//武器を装備しているか判定
		if(!getAtInfo.getWeapon().equals(null)){
			//武器の固定値を加算
			fixedAtack = getAtInfo.getWeapon().fixedValue + fixedAtack;
		}

		//腕装備を装備しているか判定
		if(!getAtInfo.getArmEquips().equals(null)){
			//腕装備の固定値を加算
			fixedAtack = getAtInfo.getArmEquips().fixedValue + fixedAtack;
		}

		//計算の結果をPCの攻撃固定値に設定
		setAtInfo.setFixedAtack(fixedAtack);
	}

	/**
	 * 防御ダイスの数の設定<br><br>
	 *
	 * PCの防御ダイスの数を設定するメソッド<br>
	 * 最初に装備無しの防御ダイス数を設定<br>
	 * 胴装備を装備してる場合は胴装備とステータスからダイス数を計算<br>
	 * 最後に防御ダイス数を設定
	 *
	 * */
	public void setDefenceDiceNum(){
		//胴装備無しの時の防御ダイスを設定
		int diceNum = defaultDefenceDiceNum;

		//胴装備を装備しているか判定
		if(!getAtInfo.getBodyEquips().equals(null)){
			//防具のダイスとdexの10分の1を足し算する
			diceNum = getAtInfo.getBodyEquips().numDice + (getAtInfo.getDex()/10);
		}

		//計算の結果をPCの防御ダイス数に設定
		setAtInfo.setNumDefenceDice(diceNum);
	}

	/**
	 * 防御ダイスの面の設定<br><br>
	 *
	 * PCの防御ダイスの面数を設定するメソッド<br>
	 * 最初にステータスから面数を計算<br>
	 * 胴装備を装備している場合はステータスから計算した面数と胴装備の面数を足し算<br>
	 * 最後に防御ダイス数を設定
	 *
	 * */
	public void setDefenceDiceMen(){
		//防具無しの値を設定 vitとdexの5分の1を足し算する
		int defenceDiceMen = getAtInfo.getVit() + (getAtInfo.getDex()/5);

		//胴装備を装備しているか判定
		if(!getAtInfo.getBodyEquips().equals(null)){
			//防具のダイス面を加算
			defenceDiceMen = getAtInfo.getBodyEquips().numDiceMen + defenceDiceMen;
		}

		//計算結果をPCの防御ダイス面数に設定
		setAtInfo.setNumDefenceDiceMen(defenceDiceMen);
	}

	/**
	 * 防御固定値の設定<br><br>
	 *
	 * PCの防御固定値を設定するメソッド<br>
	 * 最初にステータスから固定値を計算<br>
	 * 胴装備を装備してる場合は胴装備の固定値とステータスから計算した固定値を足し算<br>
	 * 頭装備を装備してる場合はいままでの固定値に更に頭装備の固定値を足し算<br>
	 * 盾を装備してる場合はいままでの固定値に更に盾の固定値を足し算<br>
	 * 最後に固定値を設定
	 *
	 * */
	public void setFixedDefence(){
		//防具無しの場合の値を設定
		int fixedDefence = getAtInfo.getVit()/2;

		//胴装備を装備しているか判定
		if(!getAtInfo.getBodyEquips().equals(null)){
			//胴装備の固定値を加算
			fixedDefence = getAtInfo.getBodyEquips().fixedValue + fixedDefence;
		}

		//頭装備を装備しているか判定
		if(!getAtInfo.getHeadEquips().equals(null)){
			//頭装備の固定値を加算
			fixedDefence = getAtInfo.getHeadEquips().fixedValue + fixedDefence;
		}

		//盾を装備しているか判定
		if(!getAtInfo.getShield().equals(null)){
			//盾の固定値を加算
			fixedDefence = getAtInfo.getShield().fixedValue + fixedDefence;
		}

		//計算結果をPCの防御固定値に設定
		setAtInfo.setFixedDefence(fixedDefence);
	}

	/**
	 * レベルアップ処理
	 *
	 * 戻り値に初期値を設定
	 * PCの現在のレベルを変数に設定
	 * 経験値チェッククラスのインスタンスを作成
	 * 経験値チェックの結果を変数に設定
	 *
	 * 経験チェックの結果がtrueだったらレベルアップ
	 * PCのステータスポイントを1加算
	 *
	 * @return レベルアップしたらtrue レベルアップしなかったらfalse
	 *
	 * */
	public boolean levelUp(){
		//戻り値用変数
		boolean ret = false;
		//PCの現在レベルを格納
		int level = getAtInfo.getLevel();
		//経験値チェックのインスタンス作成
		CheckExperience ExMan = new CheckExperience();
		//経験値をチェックした結果を取得
		boolean checkResult = ExMan.checkExperience(level);

		if(checkResult == true){
			//PCのレベルを上昇させる
			setAtInfo.setLevel(level + 1);
			//PCのステータスポイントに1を加算する
			setAtInfo.setStatusPoint(getAtInfo.getStatusPoint() + 1);
			//戻り値をtrueに設定
			ret = true;
		}
		return ret;
	}
}
