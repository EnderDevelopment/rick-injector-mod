package com.example.bedrockaddonmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RickInjectorItem extends Item {
    public RickInjectorItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (!level.isClientSide) {
            entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000000, 255, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000000, 255, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000000, 255, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1000000, 255, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000000, 255, false, false));
            entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000000, 255, false, false));
        }
        return super.finishUsingItem(stack, level, entity);
    }
}