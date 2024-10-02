package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.JonahNoJunanEntity;

public class JonahNoJunanModel extends GeoModel<JonahNoJunanEntity> {
	@Override
	public ResourceLocation getAnimationResource(JonahNoJunanEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/jonah_no_junan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JonahNoJunanEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/jonah_no_junan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JonahNoJunanEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
