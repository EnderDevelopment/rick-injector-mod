package com.example.bedrockaddonmod.item;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

public class PortalBombGunItem extends Item {
    public PortalBombGunItem(Properties properties) {
        super(properties);
    }

    @Override
    public void onUseTick(Level level, Player player, ItemStack stack, int remainingUseDuration) {
        if (!level.isClientSide && remainingUseDuration == 1) {
            level.explode(player, player.getX(), player.getY(), player.getZ(), 3.0F, Explosion.BlockInteraction.BREAK);
        }
        super.onUseTick(level, player, stack, remainingUseDuration);
    }
}