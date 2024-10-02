package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.RoyalGuardAnimatedEntity;

public class RoyalGuardAnimatedModel extends GeoModel<RoyalGuardAnimatedEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoyalGuardAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/royal_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoyalGuardAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/royal_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoyalGuardAnimatedEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
