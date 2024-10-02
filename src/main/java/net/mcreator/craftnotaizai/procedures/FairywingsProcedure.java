package net.mcreator.craftnotaizai.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.network.CraftNoTaizaiModVariables;
import net.mcreator.craftnotaizai.client.model.Modelnormal_fairy_wings;
import net.mcreator.craftnotaizai.client.model.Modelnew_helbram_wings;
import net.mcreator.craftnotaizai.client.model.Modelkingwings;
import net.mcreator.craftnotaizai.client.model.Modelgloxiana_wings;
import net.mcreator.craftnotaizai.client.model.Modelelaine_wing3;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class FairywingsProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onEventTriggered(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		String skill = "";
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		Entity _evtEntity = _evt.getEntity();
		PlayerRenderer _pr = null;
		PoseStack poseStack = _evt.getPoseStack();
		if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
			ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/empty.png");
			com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer emptyRenderer = new com.kleiders.kleidersplayerrenderer.KleidersSkinRenderer(context,
					(_evtEntity instanceof AbstractClientPlayer ? ((AbstractClientPlayer) _evtEntity).getModelName().equals("slim") : false), _texture);
			_pr = emptyRenderer;
			emptyRenderer.clearLayers();
			emptyRenderer.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).level >= 35) {
			if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fairy == true
					&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Gloxinia == false
					&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Disaster")) {
				if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
					ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
					if (ResourceLocation.tryParse("craft_no_taizai:textures/entities/kings_wing_texturte2.png") != null) {
						_texture = new ResourceLocation("craft_no_taizai:textures/entities/kings_wing_texturte2.png");
					}
					Modelkingwings newModel = new Modelkingwings(context.bakeLayer(Modelkingwings.LAYER_LOCATION));
					newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
					newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
					newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
					newModel.RightArm.copyFrom(_pr.getModel().rightArm);
					newModel.Body.copyFrom(_pr.getModel().body);
					newModel.Head.copyFrom(_pr.getModel().head);
					poseStack.pushPose();
					poseStack.scale(0.9375F, 0.9375F, 0.9375F);
					new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
							_evt.getMultiBufferSource(), _evt.getPackedLight());
					poseStack.popPose();
				}
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fairy == true
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Miracle Wind")) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("craft_no_taizai:textures/entities/elaine-wings.png") != null) {
					_texture = new ResourceLocation("craft_no_taizai:textures/entities/elaine-wings.png");
				}
				Modelelaine_wing3 newModel = new Modelelaine_wing3(context.bakeLayer(Modelelaine_wing3.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fairy == true
				&& (((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Blaze")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Boost")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("IceFang")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Wind Shooter")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Aura Burst")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Bullet Squall")
						|| ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Goen no Jujin"))) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("craft_no_taizai:textures/entities/butterfly_wings.png") != null) {
					_texture = new ResourceLocation("craft_no_taizai:textures/entities/butterfly_wings.png");
				}
				Modelnormal_fairy_wings newModel = new Modelnormal_fairy_wings(context.bakeLayer(Modelnormal_fairy_wings.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fairy == true
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Hunter Wisp")) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("craft_no_taizai:textures/entities/helbram-wing-texture.png") != null) {
					_texture = new ResourceLocation("craft_no_taizai:textures/entities/helbram-wing-texture.png");
				}
				Modelnew_helbram_wings newModel = new Modelnew_helbram_wings(context.bakeLayer(Modelnew_helbram_wings.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
		if ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).fairy == true
				&& (entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).Gloxinia == true
				&& ((entity.getCapability(CraftNoTaizaiModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftNoTaizaiModVariables.PlayerVariables())).magic).equals("Disaster")) {
			if (_evt.getRenderer() instanceof PlayerRenderer && !(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersIgnoreCancel)) {
				ResourceLocation _texture = new ResourceLocation("kleiders_custom_renderer:textures/entities/default.png");
				if (ResourceLocation.tryParse("craft_no_taizai:textures/entities/gloxiana-wing-texture.png") != null) {
					_texture = new ResourceLocation("craft_no_taizai:textures/entities/gloxiana-wing-texture.png");
				}
				Modelgloxiana_wings newModel = new Modelgloxiana_wings(context.bakeLayer(Modelgloxiana_wings.LAYER_LOCATION));
				newModel.LeftLeg.copyFrom(_pr.getModel().leftLeg);
				newModel.RightLeg.copyFrom(_pr.getModel().rightLeg);
				newModel.LeftArm.copyFrom(_pr.getModel().leftArm);
				newModel.RightArm.copyFrom(_pr.getModel().rightArm);
				newModel.Body.copyFrom(_pr.getModel().body);
				newModel.Head.copyFrom(_pr.getModel().head);
				poseStack.pushPose();
				poseStack.scale(0.9375F, 0.9375F, 0.9375F);
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerAnimatedRenderer(context, _texture, newModel).render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(),
						_evt.getMultiBufferSource(), _evt.getPackedLight());
				poseStack.popPose();
			}
		}
	}
}
