package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.HornofCernunnosEntity;

public class HornofCernunnosModel extends GeoModel<HornofCernunnosEntity> {
	@Override
	public ResourceLocation getAnimationResource(HornofCernunnosEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/horn_of_cernunnos.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HornofCernunnosEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/horn_of_cernunnos.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HornofCernunnosEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
