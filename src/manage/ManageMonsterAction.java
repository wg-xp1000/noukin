package manage;

import struct.creature.MonsterInfo;
import util.CreateRandomNumber;

public class ManageMonsterAction {

	private CreateRandomNumber createRandomNumber = new CreateRandomNumber();
	/**
	 * モンスターの行動決定
	 * @param monster 行動を決定するモンスターの情報
	 * @return 0:攻撃<br>
	 * 9:逃走
	 * */
	public int monsterAction(MonsterInfo monster){

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
}
