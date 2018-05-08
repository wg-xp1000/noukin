package manage;

import struct.AtInfo;
import struct.world.MonsterInfo;
import util.GetAtInfo;
import util.GetMonsterInfo;
import util.SetAtInfo;
import util.SetMonsterInfo;


public class ManageBattale {

	/**
	 * 敵の行動を乱数生成で制御できるようにする予定
	 *
	 *
	 * */
	public int battle(MonsterInfo enemy){

		GetAtInfo getAtInfo = new GetAtInfo();
		SetAtInfo setAtInfo = new SetAtInfo();
		GetMonsterInfo getMonsterInfo = new GetMonsterInfo();
		SetMonsterInfo setMonsterInfo = new SetMonsterInfo();
		ManageDamage manageDamage = new ManageDamage();
		AtInfo atInfo = AtInfo.getInstance();
		int monsterDamage = 0;
		int atDamage = 0;
		int ret;
		final int battleResult1 = 0;//戦闘継続
		final int battleResult2 = 1;//PC勝利
		final int battleResult3 = 2;//PC敗北

		//素早さの比較
		if(getAtInfo.getAgi() >= getMonsterInfo.getAgi(enemy) ){
			//モンスターの被ダメージを計算
			monsterDamage = manageDamage.CheckDamage(atInfo, enemy);
			//モンスターのHPを計算
			setMonsterInfo.setHitPoint(getMonsterInfo.getHitPoint(enemy) - monsterDamage);

			//モンスターが生きてた場合
			if(getMonsterInfo.getHitPoint(enemy) > 0){
				//PCの被ダメージを計算
				atDamage = manageDamage.CheckDamage(enemy, atInfo);
				//PCのHPを計算
				setAtInfo.setHitPoint(getAtInfo.getHitPoint() - atDamage);

				//反撃でPCが死んだ場合
				if(getAtInfo.getHitPoint() <= 0){
					ret = battleResult3;
				}
				else{
					//どっちも死んでない場合
					ret = battleResult1;
				}
			}
			else{
				//モンスターを倒した場合
				ret = battleResult2;
			}
		}
		else{
			//PCの被ダメージを計算
			atDamage = manageDamage.CheckDamage(atInfo, enemy);
			//PCのHPを計算
			setAtInfo.setHitPoint(getAtInfo.getHitPoint() - atDamage);

			//PCが生きてた場合
			if(getAtInfo.getHitPoint() > 0){
				//モンスターの被ダメージを計算
				monsterDamage = manageDamage.CheckDamage(atInfo, enemy);
				//モンスターのHPを計算
				setMonsterInfo.setHitPoint(getMonsterInfo.getHitPoint(enemy) - monsterDamage);

				//反撃でモンスターが死んだ場合
				if(getMonsterInfo.getHitPoint(enemy) <= 0){
					ret = battleResult2;
				}
				else{
					//どっちも死んでない場合
					ret = battleResult1;
				}
			}
			else{
				//PCが死んだ場合
				ret = battleResult3;
			}
		}
		return ret;
	}
}
