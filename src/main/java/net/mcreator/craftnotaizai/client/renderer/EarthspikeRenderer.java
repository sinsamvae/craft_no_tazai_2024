
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.EarthspikeEntity;
import net.mcreator.craftnotaizai.client.model.Modelearthspike;

import com.mojang.blaze3d.vertex.PoseStack;

public class EarthspikeRenderer extends MobRenderer<EarthspikeEntity, Modelearthspike<EarthspikeEntity>> {
	public EarthspikeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthspike(context.bakeLayer(Modelearthspike.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(EarthspikeEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(EarthspikeEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/earthspike.png");
	}
}
