
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.WhaleEntity;
import net.mcreator.craftnotaizai.client.model.Modelunknown;

import com.mojang.blaze3d.vertex.PoseStack;

public class WhaleRenderer extends MobRenderer<WhaleEntity, Modelunknown<WhaleEntity>> {
	public WhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelunknown(context.bakeLayer(Modelunknown.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(WhaleEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.25f, 1.25f, 1.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhaleEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/unknown.png");
	}
}
