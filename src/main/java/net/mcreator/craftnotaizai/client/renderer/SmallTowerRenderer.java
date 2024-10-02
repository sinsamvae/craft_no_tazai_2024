
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.SmallTowerEntity;
import net.mcreator.craftnotaizai.client.model.Modelearthspike;

public class SmallTowerRenderer extends MobRenderer<SmallTowerEntity, Modelearthspike<SmallTowerEntity>> {
	public SmallTowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthspike(context.bakeLayer(Modelearthspike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SmallTowerEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/diamondtower1.png");
	}
}
