package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.display.WarpedCupboardDisplayItem;

public class WarpedCupboardDisplayModel extends GeoModel<WarpedCupboardDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WarpedCupboardDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "animations/cupboard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WarpedCupboardDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "geo/cupboard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WarpedCupboardDisplayItem entity) {
		return new ResourceLocation("ls_furniture", "textures/block/cupboard_warped.png");
	}
}
