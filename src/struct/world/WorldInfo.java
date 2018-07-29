package struct.world;

import java.util.HashMap;

import struct.creature.MonsterInfo;
import struct.item.equips.artifact.ArtifactInfo;
import struct.town.TownInfo;

public class WorldInfo {

	private final static WorldInfo worldInfo=new WorldInfo();

	private WorldInfo(){}

	public static WorldInfo getInstance(){
		return worldInfo;
	}
	/**
	 * ワールド情報
	 * シングルトンなのでstaticにしなくてもおっけーっぽい
	 *
	 * @param towns 世界にある街の情報
	 * @param dungeons 世界にあるダンジョンの情報
	 * @param lastDungeon ラストダンジョンの情報
	 * @param monsters 世界に生息してるモンスターの情報
	 * @param height 世界の縦方向の長さ
	 * @param width 世界の横方向の長さ
	 *
	 * */

	public HashMap<Integer,DungeonInfo> dungeons=new HashMap<Integer,DungeonInfo>();
	public HashMap<Integer,TownInfo> towns=new HashMap<Integer,TownInfo>();
	public DungeonInfo lastDungeon=new DungeonInfo();
	public HashMap<Integer,MonsterInfo> monsters=new HashMap<Integer,MonsterInfo>();
	public HashMap<Integer,ArtifactInfo> artifacts=new HashMap<Integer,ArtifactInfo>();
	public int height;
	public int width;
}
