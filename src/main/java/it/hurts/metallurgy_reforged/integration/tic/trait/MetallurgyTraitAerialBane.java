/*==============================================================================
 = Class: MetallurgyTraitDecay
 = This class is part of Metallurgy 4: Reforged
 = Complete source code is available at https://github.com/Davoleo/Metallurgy-4-Reforged
 = This code is licensed under GNU GPLv3
 = Authors: Davoleo, ItHurtsLikeHell, PierKnight100
 = Copyright (c) 2018-2021.
 =============================================================================*/

package it.hurts.metallurgy_reforged.integration.tic.trait;

import javax.annotation.Nullable;

import it.hurts.metallurgy_reforged.util.Utils;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class MetallurgyTraitAerialBane extends AbstractTrait implements IMetallurgyTrait {

	public MetallurgyTraitAerialBane() { //player deals 1.35x damage against targets in the air
		super("aerialbane_trait", 0xFF575000);
		this.register("metallurgy.trait.aerialbane", "metallurgy.trait.aerialbane.tooltip");
	}

	@Override
	public float damage(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damage, float newDamage, boolean isCritical) {
		if (!target.onGround) {
			return (newDamage * 1.35f);
		}
		return newDamage;
	}

	@Override
	public void register(String name, @Nullable String tooltip) {
		Utils.localizeEscapingCustomSequences(String.format(LOC_Name, name));
		if (tooltip != null)
			Utils.localizeEscapingCustomSequences(String.format(LOC_Name, tooltip));
	}

}
