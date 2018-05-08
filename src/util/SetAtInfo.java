package util;

import struct.AtInfo;
import struct.item.ItemInfo;
import struct.item.equips.EquipmentItemInfo;
import util.abst.SetCreatureInfo;

public class SetAtInfo extends SetCreatureInfo{

	private AtInfo atInfo = AtInfo.getInstance();

	/**
	 * 名前の設定
	 *
	 * @param name 設定する名前を入力する
	 *
	 * */
	@Override
	public void setName(String name){
		atInfo.name = name;
	}

	/**
	 * レベルの設定
	 *
	 * @param level 設定するレベルを入力する
	 * */
	@Override
	public void setLevel(int level){
		atInfo.level = level;
	}

	/**
	 * ヒットポイントの設定
	 *
	 * @param hitpoint ヒットポイントを入力する
	 * */
	@Override
	public void setHitPoint(int hitpoint){
		atInfo.hitPoint = hitpoint;
	}

	/**
	 * 攻撃ダイスの数を設定
	 *
	 * @param atk 攻撃ダイスの数を入力する
	 * */
	@Override
	public void setNumAtackDice(int atk){
		atInfo.numAtackDice = atk;
	}

	/**
	 * ダイスの面数を設定
	 *
	 * @param atkMen 攻撃ダイスの面数を入力する
	 * */
	@Override
	public void setNumAtackDiceMen(int atkMen){
		atInfo.numAtackDiceMen = atkMen;
	}

	/**
	 * 攻撃の固定値を設定
	 *
	 * @param fixedAtk
	 * */
	@Override
	public void setFixedAtack(int fixedAtk){
		atInfo.fixedAtack = fixedAtk;
	}

	/**
	 * 防御ダイスの数を設定
	 *
	 * @param def 攻撃ダイスの数を入力する
	 * */
	@Override
	public void setNumDefenceDice(int def){
		atInfo.numDefenceDice = def;
	}

	/**
	 * 防御ダイスの面数を設定
	 *
	 * @param defMen 防御ダイスの面数を入力する
	 * */
	@Override
	public void setNumDefenceDiceMen(int defMen){
		atInfo.numDefenceDiceMen = defMen;
	}

	/**
	 * 防御の固定値を設定
	 *
	 * @param fixedDef
	 * */
	@Override
	public void setFixedDefence(int fixedDef){
		atInfo.fixedDefence = fixedDef;
	}

	/**
	 * 経験値の設定
	 *
	 * @param experience 経験値
	 *
	 * */
	@Override
	public void setExperience(Long experience){
		atInfo.experience = experience;
	}

	/**
	 * クリティカル率の設定
	 *
	 * @param critical クリティカル率
	 * */
	public void setCritical(int critical){
		atInfo.critical = critical;
	}

	/**
	 * 筋力の設定
	 *
	 * @param str 筋力
	 * */
	public void setStr(int str){
		atInfo.str = str;
	}

	/**
	 * 技術の設定
	 *
	 * @param dex 技術
	 * */
	public void setDex(int dex){
		atInfo.dex = dex;
	}

	/**
	 * 速さの設定
	 *
	 * @param agi 速さ
	 * */
	public void setAgi(int agi){
		atInfo.agi = agi;
	}

	/**
	 * 体力の設定
	 *
	 * @param vit 体力
	 * */
	public void setVit(int vit){
		atInfo.vit = vit;
	}

	/**
	 * 頭装備の設定
	 *
	 * @param head 頭装備のクラス
	 *
	 * */
	public void setHedEquips(EquipmentItemInfo head){
		atInfo.head = head;
	}


	/**
	 * 胴装備の設定
	 *
	 * @param body 胴装備のクラス
	 * */
	public void setBodyEquips(EquipmentItemInfo body){
		atInfo.body = body;
	}

	/**
	 * 腕装備の設定
	 *
	 * @param arms 腕装備のクラス
	 * */
	public void setArmEquips(EquipmentItemInfo arms){
		atInfo.arms = arms;
	}

	/**
	 * 足装備の設定
	 *
	 * @param legs 足装備のクラス
	 * */
	public void setLegsEquips(EquipmentItemInfo legs){
		atInfo.legs = legs;
	}

	/**
	 * 右手装備の設定
	 *
	 * @param rHand 武器のクラス
	 * */
	public void setWeapon(EquipmentItemInfo weapon){
		atInfo.weapon = weapon;
	}

	/**
	 * 左手装備の設定
	 *
	 * @param lHand 武器のクラス
	 * */
	public void setShield(EquipmentItemInfo shield){
		atInfo.shield = shield;
	}

	/**
	 * 右手の指装備の設定
	 *
	 * @param rFinger 右指装備のクラス
	 * */
	public void setRFingerEquips(EquipmentItemInfo rFinger){
		atInfo.rFinger = rFinger;
	}

	/**
	 * 左手の指装備の設定
	 *
	 * @param lFinger 左指装備のクラス
	 * */
	public void setLFingerEquips(EquipmentItemInfo lFinger){
		atInfo.lFinger = lFinger;
	}

	/**
	 * 荷物の設定
	 *
	 * @param baggage アイテムのクラス
	 * */
	public void setInventory(ItemInfo item){
		atInfo.inventory.add(item);
	}

	/**
	 * 種族の設定
	 *
	 * @param race 種族の設定
	 *
	 * */
	public void setRace(Integer race){
		atInfo.race = race;
	}

	/**
	 * 職業の設定
	 *
	 * @param job 職業のID
	 *
	 * */
	public void setJob(Integer job){
		atInfo.job = job;
	}

	/**
	 * 性格の設定
	 *
	 * @param personality 性格のID
	 * */
	public void setPersonality(Integer personality){
		atInfo.personality = personality;
	}

	/**
	 * PCの現在位置のX座標を設定
	 *
	 * @param X X座標
	 *
	 * */
	public void setX(Integer X){
		atInfo.X = X;
	}

	/**
	 * PCの現在位置のY座標を設定
	 *
	 * @param Y Y座標
	 *
	 * */
	public void setY(Integer Y){
		atInfo.Y = Y;
	}

	/**
	 * ステータスポイントの設定
	 *
	 * @param SP ステータスポイント
	 *
	 * */
	public void setStatusPoint(Integer SP){
		atInfo.statusPoint = SP;
	}

	/**
	 * アイテムを捨てる
	 *
	 * @param item 捨てるアイテムのarraylistの番号
	 *
	 * */
	public void throwAwayItem(Integer inventryNum){
		atInfo.inventory.remove(inventryNum);
	}
}
