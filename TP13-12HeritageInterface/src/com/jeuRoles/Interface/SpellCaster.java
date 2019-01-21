package com.jeuRoles.Interface;

import java.util.List;

import com.jeuRoles.model.Being;

public interface SpellCaster {

	public void castSpell(Being b);
	public void castSpell(List<Being> beings);
}
