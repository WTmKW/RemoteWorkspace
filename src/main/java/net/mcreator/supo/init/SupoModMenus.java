
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.supo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.supo.world.inventory.FirstFillerGuiMenu;
import net.mcreator.supo.SupoMod;

public class SupoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SupoMod.MODID);
	public static final RegistryObject<MenuType<FirstFillerGuiMenu>> FIRST_FILLER_GUI = REGISTRY.register("first_filler_gui", () -> IForgeMenuType.create(FirstFillerGuiMenu::new));
}
