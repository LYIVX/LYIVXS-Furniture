package net.mcreator.lsfurniture.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.lsfurniture.block.model.OakDrawerDisplayModel;
import net.mcreator.lsfurniture.block.display.OakDrawerDisplayItem;

public class OakDrawerDisplayItemRenderer extends GeoItemRenderer<OakDrawerDisplayItem> {
	public OakDrawerDisplayItemRenderer() {
		super(new OakDrawerDisplayModel());
	}

	@Override
	public RenderType getRenderType(OakDrawerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
