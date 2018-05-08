package struct.town;

import java.util.HashMap;

public class TownInfo {

	/**
	 * 街の情報
	 *
	 * @param X 街のX座標
	 * @param Y 街のY座標
	 * @param townName 街の名前
	 * @param shopInfo お店の情報
	 *
	 * */

	public int X;
	public int Y;
	public String townName;
	public HashMap<Integer,ShopInfo> shopInfo=new HashMap<Integer,ShopInfo>();

}
