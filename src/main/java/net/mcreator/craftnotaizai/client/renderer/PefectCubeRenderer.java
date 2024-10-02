
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftnotaizai.entity.PefectCubeEntity;
import net.mcreator.craftnotaizai.client.model.Modelperfectcube;

import com.mojang.blaze3d.vertex.PoseStack;

public class PefectCubeRenderer extends MobRenderer<PefectCubeEntity, Modelperfectcube<PefectCubeEntity>> {
	public PefectCubeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelperfectcube(context.bakeLayer(Modelperfectcube.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(PefectCubeEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(5f, 5f, 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PefectCubeEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/output-onlinepngtools.png");
	}
}
