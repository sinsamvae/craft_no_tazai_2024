package net.mcreator.craftnotaizai.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftnotaizai.item.CoureChouseItem;

public class CoureChouseItemModel extends GeoModel<CoureChouseItem> {
	@Override
	public ResourceLocation getAnimationResource(CoureChouseItem animatable) {
		return new ResourceLocation("craft_no_taizai", "animations/holy_staff_courechouse.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoureChouseItem animatable) {
		return new ResourceLocation("craft_no_taizai", "geo/holy_staff_courechouse.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoureChouseItem animatable) {
		return new ResourceLocation("craft_no_taizai", "textures/item/triple-staff.png");
	}
}