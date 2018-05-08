package manage;

import struct.AtInfo;
import struct.item.ItemTypeInfo;
import struct.item.equips.EquipmentItemInfo;
import util.SetAtInfo;

//アイテムの装備管理
public class ManageEquipItem {

	private AtInfo atInfo = AtInfo.getInstance();
	private SetAtInfo setAtInfo = new SetAtInfo();

	/**
	 * 武器装備の管理
	 *
	 * @param weapon 武器のクラス
	 * */
	public void equipWeapon(EquipmentItemInfo weapon){

		int weaponType = ItemTypeInfo.weapon2.getItemType();

		//装備しようとしてる武器が両手持ちで盾を装備してる場合の処理
		if(weapon.itemType == weaponType && !atInfo.shield.equals(null)){
			setAtInfo.setShield(null);//盾を外す
		}
		setAtInfo.setWeapon(weapon);
	}
	/**
	 * 盾装備の管理
	 *
	 * @param shield 盾のクラス
	 * */
	public void equipShield(EquipmentItemInfo shield){

		int weaponType = ItemTypeInfo.weapon2.getItemType();

		//両手持ち武器を装備している時の処理
		if(atInfo.weapon.itemType == weaponType){
			setAtInfo.setWeapon(null);
		}
		setAtInfo.setShield(shield);
	}

	/**
	 * 頭装備の管理
	 *
	 * @param head 頭装備のクラス
	 * */
	public void equipHead(EquipmentItemInfo head){
		setAtInfo.setHedEquips(head);
	}

	/**
	 * 胴装備の管理
	 *
	 * @param body 胴装備のクラス
	 * */
	public void equipBody(EquipmentItemInfo body){

		setAtInfo.setBodyEquips(body);
	}

	/**
	 * 腕装備の管理
	 *
	 * @param args 腕装備のクラス
	 * */
	public void equipArms(EquipmentItemInfo arms){
		setAtInfo.setArmEquips(arms);
	}

	/**
	 * 足装備の管理
	 *
	 * @param legs 足装備のクラス
	 * */
	public void equipLegs(EquipmentItemInfo legs){
		setAtInfo.setLegsEquips(legs);
	}

	/**
	 * 右指装備の管理
	 *
	 * @param rFinger 指装備のクラス
	 * */
	public void equipRFinger(EquipmentItemInfo rFinger){
		setAtInfo.setRFingerEquips(rFinger);
	}

	/**
	 * 左指装備の管理
	 *
	 * @param lFinger 指装備のクラス
	 * */
	public void equipLfinger(EquipmentItemInfo lFinger){
		setAtInfo.setLFingerEquips(lFinger);
	}
}
