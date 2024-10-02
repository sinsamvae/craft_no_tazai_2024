
package net.mcreator.craftnotaizai.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.craftnotaizai.entity.RisingTornadoEntityEntity;

public class RisingTornadoEntityRenderer extends HumanoidMobRenderer<RisingTornadoEntityEntity, HumanoidModel<RisingTornadoEntityEntity>> {
	public RisingTornadoEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RisingTornadoEntityEntity entity) {
		return new ResourceLocation("craft_no_taizai:textures/entities/air.png");
	}
}
