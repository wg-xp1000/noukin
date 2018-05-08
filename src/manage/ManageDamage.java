package manage;

import struct.CreatureInfo;
import util.CreateRandomNumber;
import util.GetCreatureInfo;

public class ManageDamage {

	/**
	 * 攻撃側の攻撃ダイスと防御側の防御ダイスを比較
	 *
	 * @param atackSide 攻撃側のクリーチャークラス
	 * @param defenceSide 防御側のクリーチャークラス
	 *
	 * @return ret 与えたダメージを返却する
	 *
	 * */
	public int CheckDamage(CreatureInfo atackSide, CreatureInfo defenceSide){

		int damage = 0;
		int atack = 0;
		int defence = 0;
		final int damage1 = 1;
		final int damage2 = 2;
		final int damage3 = 3;
		final double check1 = 1.5;
		final int check2 = 2;
		double result = 0;//ダメージ判定の格納変数

		GetCreatureInfo getCreatureInfo = new GetCreatureInfo();
		CreateRandomNumber randomNum = new CreateRandomNumber();

		//攻撃のダイス数の数だけループ
		for(int i = 0;i < getCreatureInfo.getNumAtackDice(atackSide);i++){
			//攻撃ダイスの出目を加算していく
			atack += randomNum.getRandomInt(getCreatureInfo.getNumAtackDiceMen(atackSide));
		}
		//攻撃固定値を加算
		atack += getCreatureInfo.getFixedAtack(atackSide);

		//防御のダイス数の数だけループ
		for(int i = 0;i < getCreatureInfo.getNumDefenceDice(defenceSide);i++){
			//防御ダイスの出目を加算していく
			defence += randomNum.getRandomInt(getCreatureInfo.getNumDefenceDiceMen(defenceSide));
		}
		//防御固定値を加算
		defence += getCreatureInfo.getFixedDefence(defenceSide);

		//攻撃力が防御力以上の場合に戻り値にダメージを設定する
		if(atack >= defence){
			result = (double)atack/(double)defence;

			//防御力の倍以上の攻撃力ならダメージ3
			if(result >= check2){
				damage = damage3;
			}
			//防御力の1.5倍以上の攻撃力ならダメージ2
			else if(result >= check1){
				damage = damage2;
			}
			//それ以外はダメージ1
			else{
				damage = damage1;
			}
		}
		return damage;
	}
}
