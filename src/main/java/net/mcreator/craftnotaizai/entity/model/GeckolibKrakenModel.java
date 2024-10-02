package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.GeckolibKrakenEntity;

public class GeckolibKrakenModel extends GeoModel<GeckolibKrakenEntity> {
	@Override
	public ResourceLocation getAnimationResource(GeckolibKrakenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/kraken_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeckolibKrakenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/kraken_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeckolibKrakenEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
