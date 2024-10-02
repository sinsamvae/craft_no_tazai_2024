package net.mcreator.craftnotaizai.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.entity.EarthCrawlerEntity;

public class EarthCrawlerModel extends GeoModel<EarthCrawlerEntity> {
	@Override
	public ResourceLocation getAnimationResource(EarthCrawlerEntity entity) {
		return new ResourceLocation("craft_no_taizai", "animations/croco_fish.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EarthCrawlerEntity entity) {
		return new ResourceLocation("craft_no_taizai", "geo/croco_fish.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EarthCrawlerEntity entity) {
		return new ResourceLocation("craft_no_taizai", "textures/entities/" + entity.getTexture() + ".png");
	}

}
