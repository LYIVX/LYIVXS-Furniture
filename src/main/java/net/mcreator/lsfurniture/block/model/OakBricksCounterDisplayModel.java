package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.display.OakBricksCounterDisplayItem;

public class OakBricksCounterDisplayModel extends GeoModel<OakBricksCounterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OakBricksCounterDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "animations/counter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OakBricksCounterDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "geo/counter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OakBricksCounterDisplayItem entity) {
		return new ResourceLocation("ls_furniture", "textures/block/counter_oak_brick.png");
	}
}
