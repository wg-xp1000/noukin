package util;

import java.util.ArrayList;

import struct.AtInfo;
import struct.item.ItemInfo;
import struct.item.equips.EquipmentItemInfo;

public class GetAtInfo {

	private AtInfo atInfo = AtInfo.getInstance();

	/**
	 * 名前の取得
	 *
	 * @return PCの名前
	 * */
	public String getName(){
		return atInfo.name;
	}

	/**
	 * レベルの取得
	 *
	 *  @return PCのレベル
	 *
	 * */
	public int getLevel(){
		return atInfo.level;
	}

	/**
	 * ヒットポイントの取得
	 *
	 * @return PCのヒットポイント
	 * */
	public int getHitPoint(){
		return atInfo.hitPoint;
	}

	/**
	 * 攻撃ダイスの数を取得
	 *
	 * @return 攻撃ダイスの数
	 * */
	public int getNumAtackDice(){
		return atInfo.numAtackDice;
	}

	/**
	 * 攻撃ダイスの面数を取得
	 *
	 * @return 攻撃ダイスの面数
	 * */
	public int getNumAtackDiceMen(){
		return atInfo.numAtackDiceMen;
	}

	/**
	 * 攻撃の固定値を取得
	 *
	 * @return 攻撃の固定値
	 * */
	public int getFixedAtack(){
		return atInfo.fixedAtack;
	}

	/**
	 * 防御ダイスの数を取得
	 *
	 * @return 防御ダイスの数
	 *
	 * */
	public int getNumDefenceDice(){
		return atInfo.numDefenceDice;
	}

	/**
	 * 防御ダイスの面数を取得
	 *
	 * @return 防御ダイスの面数
	 * */
	public int getNumDefenceDiceMen(){
		return atInfo.numDefenceDiceMen;
	}

	/**
	 * 防御の固定値を取得
	 *
	 * @return 防御の固定値
	 *
	 * */
	public int getFixedDefence(){
		return atInfo.fixedDefence;
	}

	/**
	 * 経験値の取得
	 *
	 * @return PCの経験値
	 *
	 * */
	public long getExperience(){
		return atInfo.experience;
	}

	/**
	 * クリティカル率の取得
	 *
	 * @return クリティカル率
	 * */
	public int setCritical(){
		return atInfo.critical;
	}

	/**
	 * 筋力の取得
	 *
	 * @return PCの筋力
	 * */
	public int getStr(){
		return atInfo.str;
	}

	/**
	 * 技術の取得
	 *
	 * @return PCの技術
	 * */
	public int getDex(){
		return atInfo.dex;
	}

	/**
	 * 速さの取得
	 *
	 * @return PCの速さ
	 * */
	public int getAgi(){
		return atInfo.agi;
	}

	/**
	 * 体力の取得
	 *
	 * @return PCの体力
	 * */
	public int getVit(){
		return atInfo.vit;
	}

	/**
	 * 頭装備の取得
	 *
	 * @return 頭装備のクラス
	 *
	 * */
	public EquipmentItemInfo getHeadEquips(){
		return atInfo.head;
	}

	/**
	 * 胴装備の取得
	 *
	 * @return 胴装備のクラス
	 * */
	public EquipmentItemInfo getBodyEquips(){
		return atInfo.body;
	}

	/**
	 * 腕装備の取得
	 *
	 * @return 腕装備のクラス
	 * */
	public EquipmentItemInfo getArmEquips(){
		return atInfo.arms;
	}

	/**
	 * 足装備の取得
	 *
	 * @return 足装備のクラス
	 * */
	public EquipmentItemInfo getLegsEquips(){
		return atInfo.legs;
	}

	/**
	 * 右手装備の取得
	 *
	 * @return 武器のクラス
	 * */
	public EquipmentItemInfo getWeapon(){
		return atInfo.weapon;
	}

	/**
	 * 左手装備の取得
	 *
	 * @return 武器のクラス
	 * */
	public EquipmentItemInfo getShield(){
		return atInfo.shield;
	}

	/**
	 * 右手の指装備の取得
	 *
	 * @return 右指装備のクラス
	 * */
	public EquipmentItemInfo getRFingerEquips(){
		return atInfo.rFinger;
	}

	/**
	 * 左手の指装備の取得
	 *
	 * @return 左指装備のクラス
	 * */
	public EquipmentItemInfo getLFingerEquips(){
		return atInfo.lFinger;
	}

	/**
	 * 荷物の取得
	 *
	 * @return インベントリのArrayList
	 * */
	public ArrayList<ItemInfo> getInventory(){
		return atInfo.inventory;
	}

	/**
	 * 種族の取得
	 *
	 * @return 種族の設定
	 *
	 * */
	public int getRace(){
		return atInfo.race;
	}

	/**
	 * 職業の取得
	 *
	 * @return 職業のID
	 *
	 * */
	public int getJob(){
		return atInfo.job;
	}

	/**
	 * 性格の取得
	 *
	 * @return 性格のID
	 * */
	public int getPersonality(){
		return atInfo.personality;
	}

	/**
	 * PCの現在位置のX座標を取得
	 *
	 * @return 現在のX座標
	 *
	 * */
	public int getX(){
		return atInfo.X;
	}

	/**
	 * PCの現在位置のY座標を取得
	 *
	 * @return 現在のY座標
	 *
	 * */
	public int getY(){
		return atInfo.Y;
	}

	/**
	 * ステータスポイントの設定
	 *
	 * @param SP ステータスポイント
	 *
	 * */
	public int getStatusPoint(){
		return atInfo.statusPoint;
	}
}
