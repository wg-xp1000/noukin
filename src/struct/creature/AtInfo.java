package struct.creature;

import java.util.ArrayList;

import struct.item.ItemInfo;
import struct.item.equips.EquipmentItemInfo;

//＠の情報
public class AtInfo extends CreatureInfo{

	private static AtInfo atInfo = new AtInfo();

	private AtInfo(){}

	public static AtInfo getInstance(){
		return atInfo;
	}

	/**
	 * ＠の情報
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


	private int str;
	private int dex;
	private int vit;

	private EquipmentItemInfo head;
	private EquipmentItemInfo body;
	private EquipmentItemInfo rHand;
	private EquipmentItemInfo lHand;
	private EquipmentItemInfo legs;
	private EquipmentItemInfo weapon;
	private EquipmentItemInfo shield;
	private EquipmentItemInfo rFinger;
	private EquipmentItemInfo lFinger;

	private ArrayList<ItemInfo> inventory=new ArrayList<ItemInfo>(25);
	private int race;
	private int job;
	private int personality;

	private int X;
	private int Y;

	private int statusPoint;

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public EquipmentItemInfo getHead() {
		return head;
	}

	public void setHead(EquipmentItemInfo head) {
		this.head = head;
	}

	public EquipmentItemInfo getBody() {
		return body;
	}

	public void setBody(EquipmentItemInfo body) {
		this.body = body;
	}

	public EquipmentItemInfo getArms() {
		return rHand;
	}

	public void setArms(EquipmentItemInfo arms) {
		this.rHand = arms;
	}

	public EquipmentItemInfo getLegs() {
		return legs;
	}

	public void setLegs(EquipmentItemInfo legs) {
		this.legs = legs;
	}

	public EquipmentItemInfo getWeapon() {
		return weapon;
	}

	public void setWeapon(EquipmentItemInfo weapon) {
		this.weapon = weapon;
	}

	public EquipmentItemInfo getShield() {
		return shield;
	}

	public void setShield(EquipmentItemInfo shield) {
		this.shield = shield;
	}

	public EquipmentItemInfo getrFinger() {
		return rFinger;
	}

	public void setrFinger(EquipmentItemInfo rFinger) {
		this.rFinger = rFinger;
	}

	public EquipmentItemInfo getlFinger() {
		return lFinger;
	}

	public void setlFinger(EquipmentItemInfo lFinger) {
		this.lFinger = lFinger;
	}

	public ArrayList<ItemInfo> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<ItemInfo> inventory) {
		this.inventory = inventory;
	}

	public int getRace() {
		return race;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}

	public int getPersonality() {
		return personality;
	}

	public void setPersonality(int personality) {
		this.personality = personality;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getStatusPoint() {
		return statusPoint;
	}

	public void setStatusPoint(int statusPoint) {
		this.statusPoint = statusPoint;
	}

	public static AtInfo getAtinfo() {
		return atInfo;
	}

	public EquipmentItemInfo getlHand() {
		return lHand;
	}

	public void setlHand(EquipmentItemInfo lHand) {
		this.lHand = lHand;
	}
}
