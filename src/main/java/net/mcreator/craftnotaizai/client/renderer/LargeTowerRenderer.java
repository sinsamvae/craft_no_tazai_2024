
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.LargeTowerEntity;
import net.mcreator.craftnotaizai.client.model.Modelearthspike;

import com.mojang.blaze3d.vertex.PoseStack;

public class LargeTowerRenderer extends MobRenderer<LargeTowerEntity, Modelearthspike<LargeTowerEntity>> {
	public LargeTowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthspike(context.bakeLayer(Modelearthspike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(LargeTowerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(5f, 5f, 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LargeTowerEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/diamondtower1.png");
	}
}
