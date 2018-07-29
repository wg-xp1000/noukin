package struct.creature;

//生き物の共通項目
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
	private String name;
	private int level;
	private int hitPoint;
	private int numAtackDice;
	private int numAtackDiceMen;
	private int fixedAtack;
	private int numDefenceDice;
	private int numDefenceDiceMen;
	private int fixedDefence;
	private int experience;
	private int critical;
	private int agi;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHitPoint() {
		return hitPoint;
	}
	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}
	public int getNumAtackDice() {
		return numAtackDice;
	}
	public void setNumAtackDice(int numAtackDice) {
		this.numAtackDice = numAtackDice;
	}
	public int getNumAtackDiceMen() {
		return numAtackDiceMen;
	}
	public void setNumAtackDiceMen(int numAtackDiceMen) {
		this.numAtackDiceMen = numAtackDiceMen;
	}
	public int getFixedAtack() {
		return fixedAtack;
	}
	public void setFixedAtack(int fixedAtack) {
		this.fixedAtack = fixedAtack;
	}
	public int getNumDefenceDice() {
		return numDefenceDice;
	}
	public void setNumDefenceDice(int numDefenceDice) {
		this.numDefenceDice = numDefenceDice;
	}
	public int getNumDefenceDiceMen() {
		return numDefenceDiceMen;
	}
	public void setNumDefenceDiceMen(int numDefenceDiceMen) {
		this.numDefenceDiceMen = numDefenceDiceMen;
	}
	public int getFixedDefence() {
		return fixedDefence;
	}
	public void setFixedDefence(int fixedDefence) {
		this.fixedDefence = fixedDefence;
	}
	public long getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	public int getAgi() {
		return agi;
	}
	public void setAgi(int agi) {
		this.agi = agi;
	}
}
