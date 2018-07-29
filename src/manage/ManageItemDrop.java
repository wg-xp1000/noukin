package manage;

import struct.creature.MonsterInfo;
import util.CreateRandomNumber;
import util.GetMonsterInfo;
import util.LoadProperties;

public class ManageItemDrop {
	/**
	 * アイテム生成判定
	 *
	 * @param mons 倒したモンスターのクラス
	 *
	 * @return ret アイテムが生成された場合はtrue、アイテムが生成されなかった場合はfalse
	 *
	 * */
	public boolean itemCreateCheck(MonsterInfo mons){

		GetMonsterInfo getMonsterInfo = new GetMonsterInfo();
		CreateRandomNumber crn = new CreateRandomNumber();
		LoadProperties prop = new LoadProperties();

		boolean ret = false;
		int itemDropPower = getMonsterInfo.getItemDropPower(mons);
		int randomNum = crn.getRandomInt(prop.getItepDropPower("gitemDropPower"));

		if(itemDropPower >= randomNum){
			ret = true;
		}
		return ret;
	}

}
