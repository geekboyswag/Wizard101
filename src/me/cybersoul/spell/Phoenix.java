package me.cybersoul.spell;

import me.cybersoul.Battlefield;
import me.cybersoul.Caster;
import me.cybersoul.School;
import me.cybersoul.Spell;
import me.cybersoul.SpellName;
import me.cybersoul.Target;

public class Phoenix extends Spell {

	public Phoenix(Target target, Caster caster, Battlefield battlefield) {
		super(SpellName.PHOENIX, School.FIRE, 33, 75, 5, target, caster, battlefield);
	}
	
}
