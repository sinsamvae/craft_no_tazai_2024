
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.MediumTowerEntity;
import net.mcreator.craftnotaizai.client.model.Modelearthspike;

import com.mojang.blaze3d.vertex.PoseStack;

public class MediumTowerRenderer extends MobRenderer<MediumTowerEntity, Modelearthspike<MediumTowerEntity>> {
	public MediumTowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthspike(context.bakeLayer(Modelearthspike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MediumTowerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(3f, 3f, 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(MediumTowerEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/diamondtower1.png");
	}
}
