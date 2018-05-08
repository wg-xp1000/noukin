package util;

import java.util.HashMap;

import struct.town.TownInfo;
import struct.world.DungeonInfo;
import struct.world.MonsterInfo;
import struct.world.WorldInfo;

public class SetWorldInfo {

	WorldInfo worldInfo=WorldInfo.getInstance();

	/**
	 * 街情報の設定
	 *
	 * @param townInfo 街情報を詰めたハッシュマップ
	 * */
	public void setTownInfo(HashMap<Integer,TownInfo> townInfo){
		worldInfo.towns=townInfo;
	}

	/**
	 * ダンジョン情報の設定
	 *
	 * @param dungeonInfo ダンジョン情報を詰めたハッシュマップ
	 * */
	public void setDungeonInfo(HashMap<Integer,DungeonInfo> dungeonInfo){
		worldInfo.dungeons=dungeonInfo;
	}

	/**
	 * モンスター情報の設定
	 *
	 * @param monsterInfo モンスター情報を詰めたハッシュマップ
	 * */
	public void setMonsterInfo(HashMap<Integer,MonsterInfo> monsterInfo){
		worldInfo.monsters=monsterInfo;
	}
}
