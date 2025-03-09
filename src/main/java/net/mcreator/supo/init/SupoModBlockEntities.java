
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.supo.block.entity.FirstFillerBlockEntity;
import net.mcreator.supo.SupoMod;

public class SupoModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SupoMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FIRST_FILLER = register("first_filler", SupoModBlocks.FIRST_FILLER, FirstFillerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
