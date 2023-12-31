package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.display.WarpedWardrobe2DisplayItem;

public class WarpedWardrobe2DisplayModel extends GeoModel<WarpedWardrobe2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WarpedWardrobe2DisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "animations/wardrobe_top.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WarpedWardrobe2DisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "geo/wardrobe_top.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WarpedWardrobe2DisplayItem entity) {
		return new ResourceLocation("ls_furniture", "textures/block/wardrobe_warped.png");
	}
}
