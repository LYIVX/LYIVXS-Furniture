
package net.mcreator.lsfurniture.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.lsfurniture.init.LsFurnitureModTabs;

public class MangroveBarkItem extends Item {
	public MangroveBarkItem() {
		super(new Item.Properties().tab(LsFurnitureModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
