package util;

import struct.creature.MonsterInfo;

public class GetMonsterInfo {

	public int getAgi(MonsterInfo mons) {
		int ret = mons.agi;
		return ret;
	}

	public int getHitPoint(MonsterInfo mons) {
		int ret = mons.hitPoint;
		return ret;
	}

	public int getItemDropPower(MonsterInfo mons){
		int ret = mons.itemDropPower;
		return ret;
	}

	public int getItemGeneratePower(MonsterInfo mons){
		int ret = mons.itemGeneratePower;
		return ret;
	}



}
