package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.InsectFEntity;

public class InsectFModel extends GeoModel<InsectFEntity> {
	@Override
	public ResourceLocation getAnimationResource(InsectFEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/insect_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InsectFEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/insect_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InsectFEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
