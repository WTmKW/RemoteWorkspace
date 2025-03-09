
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.supo.block.FirstFillerBlock;
import net.mcreator.supo.SupoMod;

public class SupoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SupoMod.MODID);
	public static final RegistryObject<Block> FIRST_FILLER = REGISTRY.register("first_filler", () -> new FirstFillerBlock());
}
