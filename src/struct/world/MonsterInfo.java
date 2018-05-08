package struct.world;

import struct.CreatureInfo;

public class MonsterInfo extends CreatureInfo{

	/**
	 *
	 * モンスターの情報
	 *
	 * @param name 名前
	 * @param level レベル
	 * @param hitPoint ヒットポイント
	 * @param numAtackDice 攻撃ダイスの数
	 * @param maxAtackDice 攻撃ダイスの面数
	 * @param fixedAtack 攻撃固定値
	 * @param numDefenceDice 防御ダイスの数
	 * @param maxDefenceDice 防御ダイスの面数
	 * @param fixedDefence 防御固定値
	 * @param experience 経験値
	 * @param itemDropPower アイテムのドロップパワー
	 * @param itemCreatePower アイテム生成パワー
	 * @param personality モンスターの性格 1:強気 2:普通 3:弱気
	 * */

	public String name;
	public Integer level;
	public Integer hitPoint;
	public Integer numAtackDice;
	public Integer numAtackDiceMen;
	public Integer fixedAtack;
	public Integer numDefenceDice;
	public Integer numDefenceDiceMen;
	public Integer fixedDefence;
	public int experience;
	public int itemDropPower;
	public int itemGeneratePower;
	public int personality;

}
