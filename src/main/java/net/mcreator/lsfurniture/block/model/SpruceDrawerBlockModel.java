package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.entity.SpruceDrawerTileEntity;

public class SpruceDrawerBlockModel extends GeoModel<SpruceDrawerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpruceDrawerTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "animations/drawer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpruceDrawerTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "geo/drawer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpruceDrawerTileEntity entity) {
		return new ResourceLocation("ls_furniture", "textures/block/drawer_spruce.png");
	}
}
