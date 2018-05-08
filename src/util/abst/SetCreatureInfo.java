package util.abst;

public abstract class SetCreatureInfo {

	/**
	 * 名前の設定
	 *
	 * @param name 設定する名前を入力する
	 *
	 * */
	public void setName(String name){
	}

	/**
	 * レベルの設定
	 *
	 * @param level 設定するレベルを入力する
	 * */
	public void setLevel(int level){
	}

	/**
	 * ヒットポイントの設定
	 *
	 * @param hitpoint ヒットポイントを入力する
	 * */
	public void setHitPoint(int hitpoint){
	}

	/**
	 * 攻撃ダイスの数を設定
	 *
	 * @param atk 攻撃ダイスの数を入力する
	 * */
	public void setNumAtackDice(int atk){
	}

	/**
	 * ダイスの面数を設定
	 *
	 * @param atkMen 攻撃ダイスの面数を入力する
	 * */
	public void setNumAtackDiceMen(int atkMen){
	}

	/**
	 * 攻撃の固定値を設定
	 *
	 * @param fixedAtk 攻撃の固定値
	 * */
	public void setFixedAtack(int fixedAtk){
	}

	/**
	 * 防御ダイスの数を設定
	 *
	 * @param def 攻撃ダイスの数を入力する
	 * */
	public void setNumDefenceDice(int def){
	}

	/**
	 * 防御ダイスの面数を設定
	 *
	 * @param defMen 防御ダイスの面数を入力する
	 * */
	public void setNumDefenceDiceMen(int defMen){
	}

	/**
	 * 防御の固定値を設定
	 *
	 * @param fixedDef 防御の固定値
	 * */
	public void setFixedDefence(int fixedDef){
	}

	/**
	 * 経験値の設定
	 *
	 * @param experience 経験値
	 *
	 * */
	public void setExperience(Long experience){
	}
}
