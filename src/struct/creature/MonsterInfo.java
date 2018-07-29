package struct.creature;

public class MonsterInfo extends CreatureInfo{

	/**
	 *
	 * モンスターの情報
	 *
	 * @param name 名前
	 * @param level レベル
	 * @param hitPoint ヒットポイント
	 * @param numAtackDice 攻撃ダイスの数
	 * @param maxAtackDice 攻撃ダイスの面数
	 * @param fixedAtack 攻撃固定値
	 * @param numDefenceDice 防御ダイスの数
	 * @param maxDefenceDice 防御ダイスの面数
	 * @param fixedDefence 防御固定値
	 * @param experience 経験値
	 * @param itemDropPower アイテムのドロップパワー
	 * @param itemCreatePower アイテム生成パワー
	 * @param personality モンスターの性格 1:強気 2:普通 3:弱気
	 * */

	private int itemDropPower;
	public int itemGeneratePower;
	public int personality;

	public int getItemDropPower() {
		return itemDropPower;
	}
	public void setItemDropPower(int itemDropPower) {
		this.itemDropPower = itemDropPower;
	}
	public int getItemGeneratePower() {
		return itemGeneratePower;
	}
	public void setItemGeneratePower(int itemGeneratePower) {
		this.itemGeneratePower = itemGeneratePower;
	}
	public int getPersonality() {
		return personality;
	}
	public void setPersonality(int personality) {
		this.personality = personality;
	}


}
