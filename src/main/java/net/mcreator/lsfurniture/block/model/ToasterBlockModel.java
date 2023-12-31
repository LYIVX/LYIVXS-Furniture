package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.entity.ToasterTileEntity;

public class ToasterBlockModel extends GeoModel<ToasterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToasterTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "animations/toaster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToasterTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "geo/toaster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToasterTileEntity entity) {
		return new ResourceLocation("ls_furniture", "textures/block/toaster.png");
	}
}
