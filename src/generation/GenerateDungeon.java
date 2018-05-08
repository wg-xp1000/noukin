package generation;

import java.util.HashMap;

import struct.AtInfo;
import struct.world.DungeonInfo;
import struct.world.WorldInfo;
import util.CreateName;
import util.CreateRandomNumber;
import util.LoadProperties;
import util.SetWorldInfo;

public class GenerateDungeon {

	private LoadProperties loadprop=new LoadProperties();
	private CreateRandomNumber crn=new CreateRandomNumber();
	private WorldInfo worldInfo=WorldInfo.getInstance();
	private CreateName createName=new CreateName();
	private int atLevel=AtInfo.getInstance().level;
	private SetWorldInfo setWorldInfo=new SetWorldInfo();

	final static int zero=0;
	final static int Judge1=80;//振れ幅大のダンジョンの判定
	final static int Judge2=90;//ランダムダンジョンの判定
	final static int maxRandomNum=100;//ダンジョン生成の乱数の最大値
	final static int standardFixed=-5;//標準ダンジョンLv設定用固定値
	final static int standardLvFixed=10;//標準ダンジョンLv設定用固定値
	final static int specialFixed=-10;//振れ幅大ダンジョンLv設定用固定値
	final static int specialLvFixed=25;//振れ幅大ダンジョンLv設定用固定値
	final static int randomLvFixed=60;//ランダムダンジョンLv設定用固定値
	final static int atLowLevel=5;//低レベルの判定用固定値

	//ダンジョン作成数を取得
	private int getDungeonNum(){
		return crn.getRandomInt(loadprop.getCreateNum("maxDungeonNum"));
	}

	//現在保持しているダンジョンを初期化
	private void refleshDungeonInfo(){
		worldInfo.dungeons=null;
	}

	//ダンジョンの座標が街と被ってないかチェックとダブってないかチェック
	private boolean checkDungeonPosition(int[] check){
		//街の数を取得
		int townNum=worldInfo.towns.size();
		int dungeonNum=worldInfo.dungeons.size();
		boolean ret=true;

		//街とダンジョンの座標をチェック
		for(int i=0;i<townNum;i++){
			if(worldInfo.towns.get(i).X==check[0] && worldInfo.towns.get(i).Y==check[1]){
				ret=false;
			}
		}
		//ダンジョン同士の座標をチェック
		for(int i=0;i<dungeonNum;i++){
			if(worldInfo.dungeons.get(i).X==check[0] && worldInfo.dungeons.get(i).Y==check[1]){
				ret=false;
			}
		}
		return ret;
	}

	//ダンジョンの座標取得
	private int[] getDungeonPosition(){

		//戻り値 0がX軸 1がY軸とする
		int[] ret=new int[2];

		do{
		ret[0]=crn.getRandomInt(loadprop.getCreateNum("maxWorldWidth"));
		ret[1]=crn.getRandomInt(loadprop.getCreateNum("maxWorldHeight"));
		}while(checkDungeonPosition(ret)==false);
		return ret;
	}

	//ダンジョン情報の作成
	private DungeonInfo createDungeon(int Level){
		//ダンジョンの基礎情報格納用 0がダンジョンLv 1がダンジョンサイズ 2がダンジョンの深さ
		int[] info1=new int[3];
		//ダンジョンの座標格納用 0がX 1がY
		int[] info2=new int[2];
		String name=null;

		DungeonInfo ret=new DungeonInfo();
		//ダンジョン作成の判定用変数
		int createPower=0;

		////ダンジョン作成開始////
		createPower=crn.getRandomInt(maxRandomNum);

		//ランダム
		if(createPower>=Judge2){
			//ダンジョンLv決定(1～60)
			info1[0]=crn.getRandomInt(randomLvFixed);
			//ダンジョンサイズ決定(5～25)
			info1[1]=loadprop.getCreateNum("minDungeonSize")+crn.getRandomInt(loadprop.getCreateNum("maxDungeonSize"));
			//ダンジョンの深さ決定(3～20)
			info1[2]=loadprop.getCreateNum("minDungeonDepth")+crn.getRandomInt(loadprop.getCreateNum("maxDungeonDepth"));
		}
		//振れ幅大
		else if(createPower>=Judge1){
			//ダンジョンLv決定(プレイヤーレベル-9～プレイヤーレベル+15)
			info1[0]=Level+crn.getRandomInt(specialLvFixed)+specialFixed;
			//ダンジョンサイズ決定(5～25)
			info1[1]=loadprop.getCreateNum("minDungeonSize")+crn.getRandomInt(loadprop.getCreateNum("maxDungeonSize"));
			//ダンジョンの深さ決定(3～20)
			info1[2]=loadprop.getCreateNum("minDungeonDepth")+crn.getRandomInt(loadprop.getCreateNum("maxDungeonDepth"));
		}
		//標準
		else{
			//低レベル時
			if(Level<=atLowLevel){
				//ダンジョンLv決定
				//低レベル時はダンジョンLvにプレイヤーレベルを使用しない(1～5)
				info1[0]=crn.getRandomInt(standardLvFixed)+standardFixed;

				if(info1[0]<=0){
					info1[0]=1;
				}
				//ダンジョンサイズ決定
				//低レベル時はダンジョンサイズの最大値を下げる(4～14)
				info1[1]=loadprop.getCreateNum("minDungeonSize")+(crn.getRandomInt(loadprop.getCreateNum("maxDungeonSize"))/2);
				//ダンジョンの深さ決定
				//低レベル時はダンジョンの深さの最大値を下げる(2～14)
				info1[2]=loadprop.getCreateNum("minDungeonDepth")+(crn.getRandomInt(loadprop.getCreateNum("maxDungeonDepth"))/2);
			}//非低レベル時
			else{
				//ダンジョンLv決定(プレイヤーレベル-4～プレイヤーレベル+5)
				info1[0]=Level+crn.getRandomInt(standardLvFixed)+standardFixed;
				//ダンジョンサイズ決定(5～25)
				info1[1]=loadprop.getCreateNum("minDungeonSize")+crn.getRandomInt(loadprop.getCreateNum("maxDungeonSize"));
				//ダンジョンの深さ決定(3～20)
				info1[2]=loadprop.getCreateNum("minDungeonDepth")+crn.getRandomInt(loadprop.getCreateNum("maxDungeonDepth"));
			}
		}

		//座標取得
		info2=getDungeonPosition();
		//ダンジョン名を1つ取得
		name=createName.createDungeonName();

		ret.X=info2[0];//ダンジョン位置X軸
		ret.Y=info2[1];//ダンジョン位置Y軸
		ret.dungeonName=name;//ダンジョン名
		ret.dungeonLevel=info1[0];//ダンジョンレベル
		ret.dungeonScale=info1[1];//ダンジョン規模
		ret.dungeonDepth=info1[2];//ダンジョン階層

		return ret;
	}

	/**
	 * ダンジョンの設定
	 *
	 * */
	public void setDungeons(){

		//ダンジョン情報格納変数
		HashMap<Integer,DungeonInfo> dungeonList=new HashMap<Integer,DungeonInfo>();
		//ダンジョン情報の初期化
		refleshDungeonInfo();
		//ダンジョン作成数の取得
		int dungeonNum=getDungeonNum();

		//ダンジョン作成
		for(int i=0;i<dungeonNum;i++){
			dungeonList.put(i,createDungeon(atLevel));
		}
		//ダンジョン情報を設定
		setWorldInfo.setDungeonInfo(dungeonList);
	}

}
