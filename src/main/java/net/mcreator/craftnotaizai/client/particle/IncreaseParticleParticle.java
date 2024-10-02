
package net.mcreator.craftnotaizai.client.particle;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.client.model.ModelIncrease;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;

@OnlyIn(Dist.CLIENT)
public class IncreaseParticleParticle extends TextureSheetParticle {
	public static IncreaseParticleParticleProvider provider(SpriteSet spriteSet) {
		return new IncreaseParticleParticleProvider(spriteSet);
	}

	public static class IncreaseParticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public IncreaseParticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			IncreaseParticleParticle particle = new IncreaseParticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
			class IncreaseParticleRenderSequence {
				private ClientLevel world;
				public EntityModel model = new ModelIncrease(Minecraft.getInstance().getEntityModels().bakeLayer(ModelIncrease.LAYER_LOCATION));
				private float scale = (float) 1.3;
				private int rotX = (int) 0;
				private int rotY = (int) 0;
				private int rotZ = (int) 0;

				@SubscribeEvent
				public void render(RenderLevelStageEvent event) {
					if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_PARTICLES) {
						VertexConsumer consumer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityCutoutNoCull(new ResourceLocation("craft_no_taizai:textures/particle/increase_particle.png")));
						Vec3 camPos = event.getCamera().getPosition();
						double x = Mth.lerp(event.getPartialTick(), particle.xo, particle.x) - camPos.x();
						double y = Mth.lerp(event.getPartialTick(), particle.yo, particle.y) - camPos.y();
						double z = Mth.lerp(event.getPartialTick(), particle.zo, particle.z) - camPos.z();
						event.getPoseStack().pushPose();
						event.getPoseStack().translate(x, y, z);
						event.getPoseStack().mulPose(Axis.XP.rotationDegrees(180));
						event.getPoseStack().scale(scale, scale, scale);
						event.getPoseStack().mulPose(Axis.XP.rotationDegrees(rotX));
						event.getPoseStack().mulPose(Axis.YP.rotationDegrees(rotY));
						event.getPoseStack().mulPose(Axis.ZP.rotationDegrees(rotZ));
						model.renderToBuffer(event.getPoseStack(), consumer, particle.getLightColor(event.getPartialTick()), OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
						event.getPoseStack().popPose();
					}
				}

				public void start(ClientLevel world) {
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ClientTickEvent event) {
					if (!particle.isAlive())
						end();
				}

				@SubscribeEvent
				public void dimensionChange(PlayerEvent.PlayerChangedDimensionEvent event) {
					end();
				}

				@SubscribeEvent
				public void loggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
					end();
				}

				private void end() {
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}
			IncreaseParticleRenderSequence sequence = new IncreaseParticleRenderSequence();
			sequence.start(worldIn);
			return particle;
		}
	}

	private final SpriteSet spriteSet;

	protected IncreaseParticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.6f, 0.6f);
		this.quadSize *= 1.4f;
		this.lifetime = (int) Math.max(1, 7 + (this.random.nextInt(6) - 3));
		this.gravity = 0f;
		this.hasPhysics = true;
		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.NO_RENDER;
	}

	@Override
	public void tick() {
		super.tick();
	}
}
