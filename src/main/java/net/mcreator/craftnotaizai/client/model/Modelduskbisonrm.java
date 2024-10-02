package net.mcreator.craftnotaizai.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelduskbisonrm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelduskbisonrm"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart leg;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;

	public Modelduskbisonrm(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.leg = root.getChild("leg");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(206, 0).addBox(-15.68F, -21.7156F, -1.12F, 31.36F, 31.36F, 33.6F, new CubeDeformation(0.0F)).texOffs(206, 73).addBox(-15.68F, -23.9556F, 24.64F, 31.36F, 4.48F, 5.04F, new CubeDeformation(0.0F))
						.texOffs(143, 58).addBox(-6.72F, 0.6844F, -3.36F, 13.44F, 2.24F, 2.24F, new CubeDeformation(0.0F)).texOffs(72, 165).addBox(-13.44F, -1.5556F, -3.36F, 8.96F, 2.24F, 2.24F, new CubeDeformation(0.0F)).texOffs(36, 162)
						.addBox(4.48F, -1.5556F, -3.36F, 8.96F, 2.24F, 2.24F, new CubeDeformation(0.0F)).texOffs(52, 42).addBox(-13.44F, 0.6844F, -3.36F, 2.24F, 6.72F, 2.24F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-11.2F, 5.1644F, -3.36F, 22.4F, 2.24F, 2.24F, new CubeDeformation(0.0F)).texOffs(52, 13).addBox(11.2F, 0.6844F, -3.36F, 2.24F, 6.72F, 2.24F, new CubeDeformation(0.0F)).texOffs(48, 54)
						.addBox(-1.68F, -7.1556F, -6.16F, 2.8F, 5.04F, 4.48F, new CubeDeformation(0.0F)).texOffs(0, 132).addBox(-5.04F, -8.8356F, -3.92F, 10.08F, 7.84F, 17.92F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.9084F, -55.0921F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(187, 54).addBox(1.68F, -0.84F, 0.0F, 4.48F, 1.68F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1637F, -8.0153F, -5.6F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 169).addBox(-3.92F, -0.84F, -0.56F, 4.48F, 1.68F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.4356F, -5.6F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 29).addBox(2.8F, -3.64F, -0.56F, 2.24F, 5.04F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.24F, -4.6356F, -5.6F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.12F, -2.52F, -0.56F, 2.24F, 5.04F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.24F, -4.6356F, -5.6F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(206, 90).addBox(-15.68F, -3.36F, 3.36F, 31.36F, 2.24F, 4.48F, new CubeDeformation(0.0F)).texOffs(206, 82).addBox(-15.68F, -1.12F, -1.12F, 31.36F, 4.48F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.8356F, 30.24F, 0.3491F, 0.0F, 0.0F));
		PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offsetAndRotation(19.547F, -27.8716F, 18.8245F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r6 = horns.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(302, 0).addBox(-3.08F, -4.872F, -3.36F, 6.16F, 9.744F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.7178F, -9.6975F, 7.9529F, -1.4399F, 1.0472F, -1.3526F));
		PartDefinition cube_r7 = horns.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(302, 17).addBox(-3.08F, -4.872F, -3.36F, 6.16F, 9.744F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4582F, -4.0158F, 4.5929F, -1.5708F, 1.0472F, -1.3526F));
		PartDefinition cube_r8 = horns.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(274, 291).addBox(-3.08F, -4.872F, -3.36F, 6.16F, 9.744F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.198F, 3.3631F, 0.1512F, -1.7017F, 1.0472F, -1.3526F));
		PartDefinition cube_r9 = horns.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 29).addBox(-4.48F, -4.872F, -1.4F, 8.96F, 9.744F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2922F, 11.1315F, -4.2154F, -2.8362F, 1.0472F, -1.3526F));
		PartDefinition cube_r10 = horns.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(152, 170).addBox(-4.48F, -4.872F, -4.48F, 8.96F, 9.744F, 8.96F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9521F, 7.0087F, -2.224F, -2.3998F, 1.0472F, -1.3526F));
		PartDefinition horns2 = head.addOrReplaceChild("horns2", CubeListBuilder.create(), PartPose.offset(-12.2848F, -27.4253F, 43.2053F));
		PartDefinition cube_r11 = horns2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 0).addBox(-4.48F, -4.872F, -1.4F, 8.96F, 9.744F, 2.8F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3808F, 12.405F, -30.0422F, 2.9671F, 1.0472F, -1.3526F));
		PartDefinition cube_r12 = horns2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(215, 0).addBox(-3.08F, -4.872F, -3.08F, 6.16F, 9.744F, 6.16F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1633F, -11.3838F, -16.8045F, -1.8326F, 1.0472F, -1.3526F));
		PartDefinition cube_r13 = horns2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(321, 104).addBox(-2.52F, -4.872F, -3.36F, 5.04F, 9.744F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6629F, -4.4066F, -20.9247F, -1.3526F, 1.0472F, -1.3526F));
		PartDefinition cube_r14 = horns2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(300, 291).addBox(-3.08F, -4.872F, -3.36F, 6.16F, 9.744F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.1906F, 3.3857F, -25.2579F, -1.2654F, 1.0472F, -1.3526F));
		PartDefinition cube_r15 = horns2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(202, 291).addBox(-4.48F, -4.872F, -4.48F, 8.96F, 9.744F, 8.96F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6568F, 8.5973F, -27.8712F, -0.5672F, 1.0472F, -1.3526F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(125, 103).addBox(-13.1199F, 19.0265F, -41.895F, 24.64F, 4.48F, 62.72F, new CubeDeformation(0.0F)).texOffs(0, 103)
						.addBox(-17.5999F, -25.7735F, -39.655F, 35.84F, 4.48F, 58.24F, new CubeDeformation(0.0F)).texOffs(130, 170).addBox(20.4801F, -19.0535F, -39.655F, 6.72F, 35.84F, 58.24F, new CubeDeformation(0.0F)).texOffs(0, 165)
						.addBox(-26.5599F, -19.0535F, -39.655F, 6.72F, 35.84F, 58.24F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-19.8399F, -21.2935F, -41.895F, 40.32F, 40.32F, 62.72F, new CubeDeformation(0.0F)).texOffs(72, 170)
						.addBox(-17.5999F, -19.0535F, 20.825F, 35.84F, 35.84F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3201F, -17.4265F, 17.255F));
		PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(202, 195).addBox(-17.92F, -2.24F, -2.24F, 35.84F, 4.48F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3201F, 20.8646F, 19.4869F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(202, 178).addBox(-17.92F, -2.24F, -2.24F, 35.84F, 4.48F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3201F, -22.0036F, 19.5952F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(206, 65).addBox(-17.92F, -2.24F, -2.24F, 35.84F, 4.48F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3201F, 17.6799F, 21.641F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(202, 170).addBox(-17.92F, -2.24F, -2.24F, 35.84F, 4.48F, 4.48F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3201F, -19.7636F, 23.475F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(274, 260).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.3238F, -22.4758F, -10.535F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(202, 271).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.614F, -21.8544F, -10.535F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(238, 65).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.8444F, 20.8285F, -10.535F, 0.0F, 0.0F, -1.3526F));
		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(243, 130).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.9463F, 21.3289F, -10.535F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(202, 206).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.467F, 18.0667F, -10.535F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 259).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.3555F, 18.9563F, -10.535F, 0.0F, 0.0F, 1.3526F));
		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(130, 264).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.3555F, -19.1237F, -10.535F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(274, 195).addBox(-3.36F, -3.36F, -29.12F, 6.72F, 6.72F, 58.24F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.5073F, -18.6584F, -10.535F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(100, 259).addBox(-3.36F, -17.92F, -3.36F, 6.72F, 35.84F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.946F, -1.1335F, 20.6321F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(128, 264).addBox(-1.12F, -17.92F, 2.8F, 6.72F, 35.84F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.1999F, -1.1335F, 18.025F, 0.0F, 0.7418F, 0.0F));
		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(72, 259).addBox(-3.36F, -17.92F, -3.36F, 6.72F, 35.84F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.1484F, -1.1335F, 18.0387F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(156, 264).addBox(-3.36F, -17.92F, -3.36F, 6.72F, 35.84F, 6.72F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.4406F, -1.1335F, 18.2275F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(143, 0).addBox(-12.32F, -4.2F, -11.2F, 24.64F, 8.4F, 22.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7999F, 17.49F, -48.2601F, -0.1745F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.8801F, 5.8981F, 33.7436F));
		PartDefinition cube_r33 = tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(271, 240).addBox(-3.36F, 1.12F, -5.6F, 6.72F, 5.6F, 11.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.2554F, 7.1572F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r34 = tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(271, 146).addBox(-2.24F, -1.12F, -5.6F, 4.48F, 4.48F, 11.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8357F, 4.0927F, -1.5272F, 0.0F, 0.0F));
		PartDefinition cube_r35 = tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(274, 271).addBox(-2.24F, -2.24F, -7.84F, 4.48F, 4.48F, 15.68F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0818F, -0.8087F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r36 = tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 286).addBox(-2.24F, -2.24F, -7.84F, 4.48F, 4.48F, 15.68F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.0093F, -10.4412F, -0.7854F, 0.0F, 0.0F));
		PartDefinition leg = partdefinition.addOrReplaceChild("leg",
				CubeListBuilder.create().texOffs(130, 103).addBox(-6.6267F, -29.9133F, -5.88F, 13.44F, 15.68F, 13.44F, new CubeDeformation(0.0F)).texOffs(0, 193).addBox(-6.0667F, -14.2333F, -5.32F, 12.32F, 15.68F, 12.32F, new CubeDeformation(0.0F))
						.texOffs(130, 307).addBox(-4.3867F, -12.5533F, 7.0F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(94, 302).addBox(-4.3867F, -12.5533F, -6.44F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(37, 279)
						.addBox(-7.7467F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(315, 153).addBox(5.6933F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(238, 96)
						.addBox(-5.5067F, 1.4467F, -4.76F, 11.2F, 15.68F, 11.2F, new CubeDeformation(0.0F)).texOffs(282, 170).addBox(-3.2667F, 1.4467F, 6.44F, 6.72F, 15.68F, 2.24F, new CubeDeformation(0.0F)).texOffs(166, 132)
						.addBox(-3.2667F, 1.4467F, -7.0F, 6.72F, 6.72F, 2.24F, new CubeDeformation(0.0F)).texOffs(202, 271).addBox(-5.5067F, 8.1667F, -15.96F, 11.2F, 8.96F, 11.2F, new CubeDeformation(0.0F)).texOffs(100, 324)
						.addBox(-8.3067F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)).texOffs(80, 324).addBox(5.1333F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)),
				PartPose.offset(-18.5733F, 11.9133F, 26.04F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(0, 29).addBox(-6.6267F, -29.9133F, -5.88F, 13.44F, 15.68F, 13.44F, new CubeDeformation(0.0F)).texOffs(0, 165).addBox(-6.0667F, -14.2333F, -5.32F, 12.32F, 15.68F, 12.32F, new CubeDeformation(0.0F))
						.texOffs(328, 0).addBox(-4.3867F, -12.5533F, 7.0F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(238, 307).addBox(-4.3867F, -12.5533F, -6.44F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(315, 130)
						.addBox(-7.7467F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(311, 228).addBox(5.6933F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(0, 259)
						.addBox(-5.5067F, 1.4467F, -4.76F, 11.2F, 15.68F, 11.2F, new CubeDeformation(0.0F)).texOffs(38, 132).addBox(-3.2667F, 1.4467F, 6.44F, 6.72F, 15.68F, 2.24F, new CubeDeformation(0.0F)).texOffs(39, 103)
						.addBox(-3.2667F, 1.4467F, -7.0F, 6.72F, 6.72F, 2.24F, new CubeDeformation(0.0F)).texOffs(274, 215).addBox(-5.5067F, 8.1667F, -15.96F, 11.2F, 8.96F, 11.2F, new CubeDeformation(0.0F)).texOffs(20, 324)
						.addBox(-8.3067F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)).texOffs(0, 324).addBox(5.1333F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)),
				PartPose.offset(-18.5733F, 11.9133F, -14.28F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.6267F, -29.9133F, -5.88F, 13.44F, 15.68F, 13.44F, new CubeDeformation(0.0F)).texOffs(143, 30).addBox(-6.0667F, -14.2333F, -5.32F, 12.32F, 15.68F, 12.32F, new CubeDeformation(0.0F))
						.texOffs(152, 307).addBox(-4.3867F, -12.5533F, 7.0F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(328, 14).addBox(-4.3867F, -12.5533F, -6.44F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(310, 88)
						.addBox(-7.7467F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(310, 65).addBox(5.6933F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(238, 130)
						.addBox(-5.5067F, 1.4467F, -4.76F, 11.2F, 15.68F, 11.2F, new CubeDeformation(0.0F)).texOffs(0, 132).addBox(-3.2667F, 1.4467F, 6.44F, 6.72F, 15.68F, 2.24F, new CubeDeformation(0.0F)).texOffs(179, 30)
						.addBox(-3.2667F, 1.4467F, -7.0F, 6.72F, 6.72F, 2.24F, new CubeDeformation(0.0F)).texOffs(274, 195).addBox(-5.5067F, 8.1667F, -15.96F, 11.2F, 8.96F, 11.2F, new CubeDeformation(0.0F)).texOffs(310, 207)
						.addBox(-8.3067F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)).texOffs(143, 0).addBox(5.1333F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)),
				PartPose.offset(17.2667F, 11.9133F, -14.28F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(0, 103).addBox(-6.6267F, -29.9133F, -5.88F, 13.44F, 15.68F, 13.44F, new CubeDeformation(0.0F)).texOffs(130, 132).addBox(-6.0667F, -14.2333F, -5.32F, 12.32F, 15.68F, 12.32F, new CubeDeformation(0.0F))
						.texOffs(72, 302).addBox(-4.3867F, -12.5533F, 7.0F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(298, 271).addBox(-4.3867F, -12.5533F, -6.44F, 8.96F, 11.76F, 2.24F, new CubeDeformation(0.0F)).texOffs(239, 284)
						.addBox(-7.7467F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(276, 75).addBox(5.6933F, 1.4467F, -2.52F, 2.24F, 15.68F, 6.72F, new CubeDeformation(0.0F)).texOffs(141, 199)
						.addBox(-5.5067F, 1.4467F, -4.76F, 11.2F, 15.68F, 11.2F, new CubeDeformation(0.0F)).texOffs(328, 65).addBox(-3.2667F, 1.4467F, 6.44F, 6.72F, 15.68F, 2.24F, new CubeDeformation(0.0F)).texOffs(169, 103)
						.addBox(-3.2667F, 1.4467F, -7.0F, 6.72F, 6.72F, 2.24F, new CubeDeformation(0.0F)).texOffs(202, 203).addBox(-5.5067F, 8.1667F, -15.96F, 11.2F, 8.96F, 11.2F, new CubeDeformation(0.0F)).texOffs(60, 324)
						.addBox(-8.3067F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)).texOffs(40, 324).addBox(5.1333F, -11.9933F, -3.08F, 2.24F, 11.2F, 7.84F, new CubeDeformation(0.0F)),
				PartPose.offset(19.5067F, 11.9133F, 26.04F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
