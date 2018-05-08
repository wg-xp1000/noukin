package struct;

//戦闘で使うステータスを共通化
public class CreatureInfo {

	 /**
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
	 * @param critical クリティカル率
	 * @param agi 速度
	 */
	public String name;
	public int level;
	public int hitPoint;
	public int numAtackDice;
	public int numAtackDiceMen;
	public int fixedAtack;
	public int numDefenceDice;
	public int numDefenceDiceMen;
	public int fixedDefence;
	public long experience;
	public int critical;
	public int agi;
}
