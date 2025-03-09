
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.supo.item.AlloyXItem;
import net.mcreator.supo.SupoMod;

public class SupoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SupoMod.MODID);
	public static final RegistryObject<Item> ALLOY_X = REGISTRY.register("alloy_x", () -> new AlloyXItem());
}
