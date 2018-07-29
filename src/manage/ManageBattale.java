package manage;

import struct.creature.AtInfo;
import struct.creature.CreatureInfo;
import struct.creature.MonsterInfo;
import util.CreateRandomNumber;
import util.GetAtInfo;
import util.GetMonsterInfo;
import util.SetAtInfo;
import util.SetMonsterInfo;

public class ManageBattale {

	private CreateRandomNumber createRandomNumber = new CreateRandomNumber();

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
		//プレイヤーが攻撃の場合
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


	/**
	 * モンスターの行動決定
	 * @param monster 行動を決定するモンスターの情報
	 * @return 0:攻撃<br>
	 * 9:逃走
	 * */
	private int monsterAction(MonsterInfo monster){

		int maxRun = 5;
		int ret = 0;
		int monsterPersonality = monster.getPersonality();//Personalityは値が高いほど好戦的
		int run = maxRun - monsterPersonality;
		int rand = createRandomNumber.getRandomInt(maxRun);

		//モンスターの性格の値より逃走が高かったら逃走を選択
		if(rand > run){
			ret = 9;
		}
		return ret;
	}

	/**
	 * 逃走成功判定
	 * @param run
	 * @param chase
	 * @return 0:逃走成功<br>
	 * 9：逃走失敗
	 * */
	private int runJudge(CreatureInfo run,CreatureInfo chase){
		int ret = 9;

		//逃走側の素早さ取得
		int runAgi = run.getAgi()/2;
		//追跡側の素早さ取得
		int chaseAgi = chase.getAgi()/2;

		if(runAgi + createRandomNumber.getRandomInt(runAgi) > chaseAgi + createRandomNumber.getRandomInt(chaseAgi)){
			ret = 0;
		}
		return ret;
	}

	/**
	 * 攻撃力取得
	 * @param dice 攻撃ダイスの数
	 * @param surface 攻撃ダイスの面
	 * @return 攻撃力
	 * */
	private int getAtackPower(int dice,int surface){
		int ret = 0;

		for(int i=0;i<dice;i++){
			ret += createRandomNumber.getRandomInt(surface);
		}
		return ret;
	}

	/**
	 * 防御力取得
	 * @param dice 防御ダイスの数
	 * @param surface 防御ダイスの面
	 * @return 防御力
	 * */
	private int getDefencePower(int dice,int surface){
		int ret = 0;

		for(int i=0;i<dice;i++){
			ret += createRandomNumber.getRandomInt(surface);
		}
		return ret;
	}
}
