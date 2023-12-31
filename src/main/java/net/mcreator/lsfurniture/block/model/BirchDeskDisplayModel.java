package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.display.BirchDeskDisplayItem;

public class BirchDeskDisplayModel extends GeoModel<BirchDeskDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BirchDeskDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "animations/desk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BirchDeskDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "geo/desk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BirchDeskDisplayItem entity) {
		return new ResourceLocation("ls_furniture", "textures/block/desk_birch.png");
	}
}
