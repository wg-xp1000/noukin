package util;

import struct.creature.MonsterInfo;
import struct.item.ItemInfo;

public class CreateItem {

	final private int TEN = 10;
	final private int HUND = 100;
	final private int HIGH = 3;
	final private int EGO = 4;
	final private int RAND = 5;

	final private int DICE_CHANCE = 3;
	final private int HP_CHANCE = 4;

	/**
	 * アイテム生成をするメソッド
	 *
	 * @param mons 倒したモンスターのクラス
	 *
	 * @return item 生成されたアイテムのクラス
	 *
	 * */
	public ItemInfo createItem(MonsterInfo mons){
		ItemInfo item = new ItemInfo();
		GetMonsterInfo getMonsInfo = new GetMonsterInfo();
		int generatePower = getMonsInfo.getItemGeneratePower(mons);
		int quality = getQuality(generatePower);
		int extension[];


		if(quality == HIGH || quality == EGO || quality == RAND){
			extension = getExtension(quality);
		}

		/*
		 * さくせーちゅう
		 *
		 * */
		return item;
	}


	/**
	 * アイテムの品質を設定するメソッド
	 *
	 * @param power アイテム生成パワー
	 *
	 * @return 品質の値 0:呪い 1:低品質 2:普通 3:高品質 4:エゴ 5:アーティファクト 6:固定アーティファクト
	 *
	 * */
	private int getQuality(int power){
		int ret = 1;//低品質
		LoadProperties prop = new LoadProperties();

		//呪いのアイテム
		if(power >= prop.getItemGeneratePower("curseItem")){
			ret = ret - 1;
		}
		//普通の品質のアイテム
		else if(power >= prop.getItemGeneratePower("rank1ItemGeneratePower")){
			ret = ret + 1;

			//高品質のアイテム
			if(power >= prop.getItemGeneratePower("rank2ItemGeneratePower")){
				ret = ret + 1;

				//エゴアイテム
				if(power >= prop.getItemGeneratePower("rank3ItemGeneratePower")){
					ret = ret + 1;

					//ランダムアーティファクト
					if(power >= prop.getItemGeneratePower("rank4ItemGeneratePower")){
						ret = ret + 1;

						//固定アーティファクト
						if(power >= prop.getItemGeneratePower("rank5ItemGeneratePower")){
							ret = ret + 1;
						}
					}
				}
			}

		}
		return ret;
	}

	/**
	 * 高品質以上のアイテムへの追加効果設定
	 *
	 * @param quality アイテムの品質レベル
	 *
	 * @return ret アイテムへの付加効果を設定した配列
	 *
	 * */
	private int[] getExtension(int quality){

		//1:ダイス数への追加 2:ダイス面への追加 3:固定値への追加 4:strへの追加 5:dexへの追加 6:agiへの追加 7:vitへの追加 8:HPへの追加
		int[]  ret = {0,0,0,0,0,0,0,0,0};

		//追加効果付加の確率
		int chance = quality * TEN;
		CreateRandomNumber crn = new CreateRandomNumber();

		//戻り値の配列の数だけループ
		for(int i = 0; i < ret.length;i++){
			if(chance >= crn.getRandomInt(HUND)){

				//ダイス数の追加
				if(i == 0){
					switch (quality){

					//高品質の場合
					case HIGH:
						if((crn.getRandomInt(DICE_CHANCE) - 2) > 0){
							ret[i] = 1;//３分の１でダイス数+1
						}
						break;

					//エゴアイテムの場合
					case EGO:
						if((crn.getRandomInt(DICE_CHANCE) - 1) > 0){
							ret[i] = 1;//３分の２でダイス数+1
						}
						break;

					case RAND:
						ret[i] = crn.getRandomInt(DICE_CHANCE - 1);//ダイス数+1かダイス数+2
						break;
					}
				}
				//HPの追加 エゴアイテム以上じゃないと付かない
				else if(i == 8){

					switch(quality){

					//エゴアイテムの場合
					case EGO:
						if((crn.getRandomInt(HP_CHANCE) - 3) > 0){
							ret[i] = 1;//４分の１でHP+1
						}
						break;

					case RAND:
						if((crn.getRandomInt(HP_CHANCE) - 2) > 0){
							ret[i] = 1;//２分の１でHP+1
						}
						break;
					}
				}
				//それ以外
				else{
					switch (quality){

					//高品質の場合
					case HIGH:
						ret[i] = crn.getRandomInt(quality) - 1;
						break;

					//エゴアイテムの場合
					case EGO:
						ret[i] = crn.getRandomInt(quality);
						break;

					//ランダムアーティファクトの場合
					case RAND:
						ret[i] = crn.getRandomInt(quality);
						break;
					}
				}
			}
		}
		return ret;
	}
}