package struct.item.equips;

import struct.item.ItemInfo;

//装備品アイテム
public class EquipmentItemInfo extends ItemInfo{

	public int numDice;//ダイスの数
	public int numDiceMen;//ダイス面
	public int fixedValue;//固定値

	//指輪とか品質の高い装備用
	public int str;//補助効果で上昇する筋力
	public int dex;//補助効果で上昇する技術
	public int agi;//補助効果で上昇する速さ
	public int vit;//補助効果で上昇する体力
}
