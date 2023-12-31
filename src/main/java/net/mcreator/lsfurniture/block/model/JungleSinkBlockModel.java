package net.mcreator.lsfurniture.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.lsfurniture.block.entity.JungleSinkTileEntity;

public class JungleSinkBlockModel extends GeoModel<JungleSinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JungleSinkTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "animations/sink.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JungleSinkTileEntity animatable) {
		return new ResourceLocation("ls_furniture", "geo/sink.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JungleSinkTileEntity entity) {
		return new ResourceLocation("ls_furniture", "textures/block/sink_jungle.png");
	}
}
