package struct;

import java.util.ArrayList;

import struct.item.ItemInfo;
import struct.item.equips.EquipmentItemInfo;
import struct.CreatureInfo;

public class AtInfo extends CreatureInfo{

	private static final AtInfo atInfo=new AtInfo();

	private AtInfo(){}

	public static AtInfo getInstance(){
		return atInfo;
	}
	/**
	 * ＠の情報
	 * シングルトンなのでstaticにしなくてもおっけーっぽい
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
	 * @param critical クリティカル率
	 *
	 * @param str 筋力
	 * @param dex 技術
	 * @param agi 速度
	 * @param vit 体力
	 *
	 * @param head 頭装備
	 * @param body 胴装備
	 * @param legs 足装備
	 * @param rHand 右手装備
	 * @param lHand 左手装備
	 * @param rFinger 右手の指装備
	 * @param lFinger 左手の指装備
	 *
	 * @param inventory 所持アイテム 最大25個 装備と共用
	 * @param race 種族
	 * @param personality 性格
	 *
	 * @param X 現在位置のX座標
	 * @param Y 現在位置のY座標
	 *
	 * @param statusPoint 割り振ってないステータスポイント
	 *
	 * */

	public String name;
	public int level;
	public int hitPoint;
	public int numAtackDice;
	public int numAtackDiceMen;
	public int fixedAtack;
	public int numDefenceDice;
	public int numDefenceDiceMen;
	public int fixedDefence;
	public long experience;
	public int critical;

	public int str;
	public int dex;
	public int agi;
	public int vit;

	public EquipmentItemInfo head;
	public EquipmentItemInfo body;
	public EquipmentItemInfo arms;
	public EquipmentItemInfo legs;
	public EquipmentItemInfo weapon;
	public EquipmentItemInfo shield;
	public EquipmentItemInfo rFinger;
	public EquipmentItemInfo lFinger;

	public ArrayList<ItemInfo> inventory=new ArrayList<ItemInfo>(25);
	public int race;
	public int job;
	public int personality;

	public int X;
	public int Y;

	public int statusPoint;
}
