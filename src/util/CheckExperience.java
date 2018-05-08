package util;

public class CheckExperience {

	//プレイヤーキャラの情報のインスタンスを取得
	GetAtInfo getAtInfo = new GetAtInfo();
	SetAtInfo setAtInfo = new SetAtInfo();

	/**
	 * 経験値をチェックするメソッド<br><br>
	 *
	 * PCの現在の次レベルを変数に設定<br>
	 * 戻り値の初期値を変数に設定<br>
	 * プロパティファイル読込みクラスのインスタンスを作成<br>
	 * 経験値設定変数に-1を初期値として設定<br>
	 * 経験値一時保管用変数を定義<br><br>
	 *
	 * 経験値一時保管用変数にプロパティファイルから次レベルの累積経験値の値を設定<br>
	 * プロパティファイルから正常に値が取得できたら一時保管変数の値を経験値変数に設定<br>
	 * 経験値変数の値が初期値でなく、かつ経験値変数の値よりPCの経験値の値が大きかったら戻り値にtrueを設定<br>
	 * 戻り値を返却<br><br>
	 *
	 * @param key 現在のPCのレベル
	 *
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
