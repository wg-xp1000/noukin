package manage;

import struct.CreatureInfo;
import util.CreateRandomNumber;
import util.GetCreatureInfo;

public class ManageEscape {

	public int checkEscape(CreatureInfo run,CreatureInfo chase){

		int ret = -1;//戻り値
		final int resultEscape1 = 0;//逃走成功
		final int resultEscape2 = 1;//逃走失敗

		final double fixed = 0.75;//
		GetCreatureInfo getInfo = new GetCreatureInfo();
		CreateRandomNumber rand = new CreateRandomNumber();

		int runAgi = getInfo.getAgi(run);
		int chaseAgi = getInfo.getAgi(chase);

		int runFixed = (int)Math.round(runAgi * fixed);//逃走側の固定値
		int chaseFixed = (int)Math.round(chaseAgi * fixed);//追跡側の固定値

		int runRandSeed = runAgi - runFixed;//逃走側のランダム用の値
		int chaseRandSeed = chaseAgi - chaseFixed;//追跡側のランダム用の値

		int runRand = rand.getRandomInt(runRandSeed);
		int chaseRand = rand.getRandomInt(chaseRandSeed);

		if((runFixed + runRand) > (chaseFixed + chaseRand)){
			ret = resultEscape1;
		}
		else{
			ret = resultEscape2;
		}

		return ret;

	}
}
