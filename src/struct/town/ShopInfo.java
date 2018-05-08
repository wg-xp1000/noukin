package struct.town;

import java.util.ArrayList;

public class ShopInfo {

	/**
	 * お店の情報
	 *
	 * @param shopName お店の名前
	 * @param shopType お店のタイプ
	 * @param shopScale お店の規模
	 * @param saleItems 販売アイテム
	 *
	 * */
	public int shopName;
	public int shopType;
	public int shopScale;
	public ArrayList<Integer> saleItems=new ArrayList<Integer>();
}
