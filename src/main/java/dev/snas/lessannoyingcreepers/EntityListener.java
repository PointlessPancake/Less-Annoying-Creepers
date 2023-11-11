package dev.snas.lessannoyingcreepers;

import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadLocalRandom;

public class EntityListener implements Listener {

    private static final float MAX_EXPLOSION_RADIUS = 2.5F;

    @EventHandler
    public void onCreeperExplode(@NotNull EntityExplodeEvent event) {
        if (event.getEntity() instanceof Creeper) {
            Location explosionLocation = event.getLocation();

            event.blockList().removeIf(block -> block.getLocation().distance(explosionLocation) > (ThreadLocalRandom.current().nextFloat() * 0.5F) + MAX_EXPLOSION_RADIUS - 0.5F);
            event.setYield(100.0F);
        }
    }
}