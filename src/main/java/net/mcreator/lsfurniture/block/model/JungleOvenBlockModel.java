package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.entity.JungleOvenTileEntity;

public class JungleOvenBlockModel extends GeoModel<JungleOvenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JungleOvenTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "animations/oven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JungleOvenTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "geo/oven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JungleOvenTileEntity entity) {
		return new ResourceLocation("ls_furniture", "textures/block/oven_jungle.png");
	}
}
