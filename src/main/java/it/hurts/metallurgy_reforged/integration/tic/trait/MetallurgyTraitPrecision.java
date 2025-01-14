/*==============================================================================
 = Class: MetallurgyTraitDecay
 = This class is part of Metallurgy 4: Reforged
 = Complete source code is available at https://github.com/Davoleo/Metallurgy-4-Reforged
 = This code is licensed under GNU GPLv3
 = Authors: Davoleo, ItHurtsLikeHell, PierKnight100
 = Copyright (c) 2018-2021.
 =============================================================================*/

package it.hurts.metallurgy_reforged.integration.tic.trait;

import it.hurts.metallurgy_reforged.util.Utils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.traits.AbstractTrait;

import javax.annotation.Nullable;

public class MetallurgyTraitPrecision extends AbstractTrait implements IMetallurgyTrait {

	public MetallurgyTraitPrecision() { //critical attacks deal 2x damage instead of 1.5x
		super("precision_trait", 0xFF575000);
		this.register("metallurgy.trait.precision", "metallurgy.trait.precision.tooltip");
	}
	
	 public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
		 if (isCritical == true) {
			 float preCritDmg = damage / 1.5f;
			 return newDamage + preCritDmg * 0.5f;
		 }
		 return damage;
	 }
	
	@Override
	public void register(String name, @Nullable String tooltip)
	{
		Utils.localizeEscapingCustomSequences(String.format(LOC_Name, name));
		if (tooltip != null)
			Utils.localizeEscapingCustomSequences(String.format(LOC_Name, tooltip));
	}

}
