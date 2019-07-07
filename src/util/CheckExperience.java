package util;

public class CheckExperience {

	//プレイヤーキャラの情報のインスタンスを取得
	GetAtInfo getAtInfo = new GetAtInfo();
	SetAtInfo setAtInfo = new SetAtInfo();

	/**
	 * 経験値をチェックするメソッド
	 * @param key 現在のPCのレベル
	 * @return レベルアップ時:true レベルアップではない時:false
	 * */
	public boolean checkExperience(int key){
		//次のレベルを計算
		Integer nextLevel = key + 1;
		boolean ret = false;
		//プロパティファイル取得
		LoadProperties loadProp = new LoadProperties();
		//次レベルの経験値を格納する変数
		long experience = -1L;
		//次レベルの経験値を一時的に格納する変数
		int tmp;

		tmp = loadProp.getExperienceTable(nextLevel.toString());

		//プロパティファイルから正常に値が取得できたら変数に格納
		if(tmp != -1){
			experience = tmp;
		}

		//experienceがデフォルトの値以外 かつ プレイヤーキャラの経験値が経験値テーブルの値より多い場合は戻り値をtrueに設定
		if(experience != -1L && getAtInfo.getExperience() >= experience){
			ret = true;
		}
		return ret;
	}
}
