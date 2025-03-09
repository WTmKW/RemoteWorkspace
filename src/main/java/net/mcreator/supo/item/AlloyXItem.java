
package net.mcreator.supo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AlloyXItem extends Item {
	public AlloyXItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
