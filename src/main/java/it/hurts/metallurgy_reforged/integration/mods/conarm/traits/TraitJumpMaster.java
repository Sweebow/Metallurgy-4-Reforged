package it.hurts.metallurgy_reforged.integration.mods.conarm.traits;

import c4.conarm.lib.traits.AbstractArmorTrait;
import it.hurts.metallurgy_reforged.integration.mods.conarm.MetallurgyConArmorStats;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class TraitJumpMaster extends AbstractArmorTrait{
	
	public TraitJumpMaster() {
		super("jump_master", TextFormatting.GRAY);
	}

	@SubscribeEvent
	public void onArmorTick(PlayerTickEvent event){	
		 if(MetallurgyConArmorStats.isThatArmorTrait(event.player, "jump_master"))
	    		event.player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 100, 1, false, false));
	}

}