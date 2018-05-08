package util;

import struct.CreatureInfo;
public class GetCreatureInfo {

	public int getNumAtackDice(CreatureInfo creature){
		return creature.numAtackDice;
	}

	public int getNumAtackDiceMen(CreatureInfo creature){
		return creature.numAtackDiceMen;
	}

	public int getFixedAtack(CreatureInfo creature){
		return creature.fixedAtack;
	}

	public int getNumDefenceDice(CreatureInfo creature){
		return creature.numDefenceDice;
	}

	public int getNumDefenceDiceMen(CreatureInfo creature){
		return creature.numDefenceDiceMen;
	}

	public int getFixedDefence(CreatureInfo creature){
		return creature.fixedDefence;
	}

	public int getCritical(CreatureInfo creature){
		return creature.critical;
	}

	public int getAgi(CreatureInfo creature){
		return creature.agi;
	}
}
