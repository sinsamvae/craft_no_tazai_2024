package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GrayDemonEntity;

public class GrayDemonModel extends GeoModel<GrayDemonEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrayDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/sinsamvae_graydemon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrayDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/sinsamvae_graydemon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrayDemonEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
