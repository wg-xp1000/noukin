package struct.item;

public enum ItemTypeInfo {
	weapon1(1),//片手武器
	weapon2(2),//両手武器
	shield(3),//盾
	head(4),//頭防具
	body(5),//胴装備
	legs(6),//足装備
	finger(7),//指装備
	consumption(8),//消耗品
	etc(9);//その他アイテム

	private final int itemType;

	private ItemTypeInfo(int itemType){
		this.itemType = itemType;
	}

	public int getItemType(){
		return this.itemType;
	}

}
