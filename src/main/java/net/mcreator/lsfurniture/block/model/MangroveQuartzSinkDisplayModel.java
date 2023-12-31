package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.display.MangroveQuartzSinkDisplayItem;

public class MangroveQuartzSinkDisplayModel extends GeoModel<MangroveQuartzSinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MangroveQuartzSinkDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "animations/sink.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangroveQuartzSinkDisplayItem animatable) {
		return new ResourceLocation("ls_furniture", "geo/sink.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangroveQuartzSinkDisplayItem entity) {
		return new ResourceLocation("ls_furniture", "textures/block/sink_mangrove_quartz.png");
	}
}
