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
public class Modeldemonred4<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modeldemonred_4"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart right_leg;
	public final ModelPart left_leg;

	public Modeldemonred4(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.176F, -46.7106F, -10.8992F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 62).addBox(0.0F, -1.675F, -0.75F, 0.0F, 3.35F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7807F, -5.1134F, 5.9399F, -1.8663F, 0.457F, -1.2726F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(103, 127).addBox(-1.0F, -1.675F, -1.0F, 2.0F, 3.35F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7075F, -3.0636F, 0.8594F, -1.7236F, 0.5739F, -1.1676F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(163, 157).addBox(-0.75F, -1.675F, -0.75F, 1.5F, 3.35F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.2261F, -4.1697F, 3.3039F, -1.4543F, 0.2895F, -1.2198F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.175F, -1.5F, 3.0F, 4.35F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5279F, 2.2157F, -2.9741F, -1.7453F, 1.0472F, -1.3526F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 118).addBox(-1.25F, -2.175F, -1.25F, 2.5F, 4.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.232F, -1.0422F, -1.0613F, -1.6672F, 1.0806F, -1.1559F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 164).addBox(-0.75F, -1.675F, -0.75F, 1.5F, 3.35F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6255F, -6.3334F, 2.2718F, -1.2874F, -0.745F, 1.359F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 70).addBox(0.0F, -1.675F, -0.75F, 0.0F, 3.35F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.8006F, -8.4663F, 4.1603F, -1.7032F, -0.9183F, 1.3902F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(141, 133).addBox(-1.0F, -1.675F, -1.0F, 2.0F, 3.35F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4605F, -4.3685F, 0.1515F, -1.6801F, -0.745F, 1.359F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(90, 127).addBox(-1.25F, -2.175F, -1.25F, 2.5F, 4.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5014F, -1.6153F, -1.6307F, -1.7453F, -1.0908F, 1.4399F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 0).addBox(-1.5F, -2.175F, -1.5F, 3.0F, 4.35F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5584F, 1.7658F, -3.0404F, -1.7453F, -1.2217F, 1.5708F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -2.225F, -1.5F, 1.0F, 4.45F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.176F, 9.9198F, -5.7786F, -1.5708F, -1.4399F, 1.5708F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 158).addBox(-4.75F, -0.675F, -7.75F, 9.5F, 1.35F, 15.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.176F, 12.4356F, -1.1008F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(124, 56).addBox(-4.5F, -5.175F, -7.5F, 9.0F, 10.35F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.176F, 7.8356F, -1.1008F, 0.0F, -1.5708F, 0.0F));
		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offset(-0.176F, 14.6522F, -1.0175F));
		PartDefinition cube_r14 = lowerjaw.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(126, 157).mirror().addBox(-4.75F, -0.675F, -7.75F, 9.5F, 1.35F, 15.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.1333F, -0.0833F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r15 = lowerjaw.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(175, 25).mirror().addBox(-4.25F, -0.675F, -7.0F, 8.5F, 1.35F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0667F, 0.1667F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r16 = lowerjaw.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(158, 41).addBox(-4.5F, -1.425F, -7.5F, 9.0F, 2.85F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9333F, -0.0833F, 0.0F, -1.5708F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-0.0824F, -19.5487F, -0.9737F));
		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 176).addBox(-8.4F, -7.975F, -1.775F, 16.8F, 15.95F, 3.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5756F, -14.3214F, 0.9737F, 0.0F, 1.5708F, 0.2182F));
		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(62, 56).addBox(-8.25F, -1.175F, -1.25F, 16.5F, 2.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.799F, -0.9807F, 0.9737F, 0.0F, 1.5708F, 0.3491F));
		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(98, 59).addBox(-8.25F, -0.675F, -1.25F, 16.5F, 1.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.9909F, -4.8507F, 0.9737F, 0.0F, 1.5708F, -0.6981F));
		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(207, 53).addBox(-8.25F, -1.175F, -1.25F, 16.5F, 2.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7461F, -3.544F, 0.9737F, 0.0F, 1.5708F, -0.4363F));
		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(206, 108).addBox(-8.25F, -0.675F, -1.25F, 16.5F, 1.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.1255F, -2.3323F, 0.9737F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(86, 185).addBox(-2.5F, -6.175F, -5.75F, 5.0F, 12.35F, 11.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5174F, -4.1035F, -6.239F, -1.5272F, 1.4399F, -1.5708F));
		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(177, 15).addBox(-7.9F, -1.3F, -2.275F, 15.8F, 2.6F, 4.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.6384F, 3.2363F, 0.9737F, 0.0F, -1.5708F, 0.7854F));
		PartDefinition cube_r24 = body.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(121, 189).addBox(-7.9F, -1.3F, -2.275F, 15.8F, 2.6F, 4.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.8032F, 3.2363F, 0.9737F, 0.0F, 1.5708F, -0.7854F));
		PartDefinition cube_r25 = body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(178, 187).addBox(-7.9F, -2.8F, -2.275F, 15.8F, 5.6F, 4.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.3008F, 6.0043F, 0.9737F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r26 = body.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 197).addBox(-8.45F, -2.5F, -1.275F, 16.9F, 5.0F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.6526F, 10.404F, 0.9737F, 0.0F, 1.5708F, -0.1745F));
		PartDefinition cube_r27 = body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(198, 83).addBox(-8.45F, -2.5F, -1.275F, 16.9F, 5.0F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.9595F, 15.0866F, 0.9737F, 0.0F, 1.5708F, 0.0436F));
		PartDefinition cube_r28 = body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(192, 41).addBox(-7.9F, -2.8F, -2.275F, 15.8F, 5.6F, 4.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.136F, 6.0043F, 0.9737F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition cube_r29 = body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(198, 74).addBox(-8.45F, -2.5F, -1.275F, 16.9F, 5.0F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.4878F, 10.404F, 0.9737F, 0.0F, -1.5708F, 0.1745F));
		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(190, 199).addBox(-8.45F, -2.5F, -1.275F, 16.9F, 5.0F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.7948F, 15.0866F, 0.9737F, 0.0F, -1.5708F, -0.0436F));
		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(195, 98).addBox(-8.45F, -3.0F, -1.275F, 16.9F, 6.0F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.1829F, 20.3729F, 0.9737F, 0.0F, -1.5708F, -0.1745F));
		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(205, 163).addBox(-8.25F, -0.675F, -1.25F, 16.5F, 1.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8261F, -4.8507F, 0.9737F, 0.0F, -1.5708F, 0.6981F));
		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(207, 123).addBox(-8.25F, -1.175F, -1.25F, 16.5F, 2.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5813F, -3.544F, 0.9737F, 0.0F, -1.5708F, 0.4363F));
		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(206, 178).addBox(-8.25F, -0.675F, -1.25F, 16.5F, 1.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.9607F, -2.3323F, 0.9737F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(206, 172).addBox(-8.25F, -1.175F, -1.25F, 16.5F, 2.35F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.6342F, -0.9807F, 0.9737F, 0.0F, -1.5708F, -0.3491F));
		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(43, 185).addBox(-8.4F, -7.975F, -1.775F, 16.8F, 15.95F, 3.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4108F, -14.3214F, 0.9737F, 0.0F, -1.5708F, -0.2182F));
		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 143).addBox(-8.4F, -2.175F, -5.0F, 16.8F, 4.35F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.1648F, -23.1177F, 0.9737F, 0.0F, 1.5708F, 0.5236F));
		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(153, 82).addBox(-8.5F, -2.575F, -4.85F, 17.0F, 5.15F, 9.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0721F, -24.9263F, 0.9737F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(45, 149).addBox(-8.4F, -2.175F, -5.0F, 16.8F, 4.35F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -23.1177F, 0.9737F, 0.0F, -1.5708F, -0.5236F));
		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(155, 187).addBox(-2.5F, -6.175F, -5.75F, 5.0F, 12.35F, 11.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3527F, -4.1035F, -6.239F, -1.5272F, -1.4399F, 1.5708F));
		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(0, 49).addBox(-8.5F, -8.175F, -13.5F, 17.0F, 16.35F, 27.0F, new CubeDeformation(0.0F)).texOffs(76, 22).addBox(-8.5F, 8.175F, -13.5F, 17.0F, 6.35F, 27.0F, new CubeDeformation(0.0F)).texOffs(60, 64)
						.addBox(-8.5F, 14.525F, -14.5F, 17.0F, 8.35F, 29.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-9.0F, 22.525F, -16.5F, 18.0F, 15.35F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0824F, -14.3263F, 0.9737F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -1.675F, -6.5F, 3.0F, 3.35F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3129F, 9.4633F, -7.0095F, -1.4835F, -1.2654F, 1.5708F));
		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 49).addBox(-1.5F, -1.675F, -4.5F, 3.0F, 3.35F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.6921F, 8.8103F, -6.8036F, -1.6581F, -1.2654F, 1.5708F));
		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(196, 113).addBox(-8.45F, -3.0F, -1.275F, 16.9F, 6.0F, 2.55F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.3477F, 20.3729F, 0.9737F, 0.0F, 1.5708F, 0.1745F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.6514F, -31.5618F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r45 = right_arm.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(81, 171).mirror().addBox(-6.25F, -1.675F, -5.25F, 12.5F, 3.35F, 10.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3836F, 3.6736F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r46 = right_arm.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(1, 119).mirror().addBox(-6.5F, -6.175F, -5.5F, 13.0F, 12.35F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3836F, -3.6736F, 0.0F, 0.0F, -1.5708F, -0.0873F));
		PartDefinition right_arm2 = right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1653F, 10.6718F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r47 = right_arm2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(118, 175).addBox(-6.25F, -1.175F, -5.75F, 12.5F, 2.35F, 11.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2669F, 2.4341F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r48 = right_arm2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(137, 18).mirror().addBox(-6.5F, -3.675F, -6.25F, 13.0F, 7.35F, 12.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2669F, -2.4341F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition right_arm3 = right_arm2.addOrReplaceChild("right_arm3", CubeListBuilder.create(), PartPose.offset(-0.3317F, 14.3141F, 0.0F));
		PartDefinition cube_r49 = right_arm3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(102, 127).addBox(-6.5F, -4.675F, -6.0F, 13.0F, 9.35F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3149F, -6.7482F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r50 = right_arm3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(205, 149).addBox(-5.5F, -4.375F, -2.25F, 11.0F, 8.75F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0149F, 1.7707F, 0.0F, 0.0F, -1.5708F, 0.6109F));
		PartDefinition cube_r51 = right_arm3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(186, 208).addBox(-5.5F, -3.675F, -2.25F, 11.0F, 7.35F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0269F, 2.5125F, 0.0F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition cube_r52 = right_arm3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(70, 15).addBox(-5.5F, -5.05F, -2.25F, 11.0F, 10.1F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9014F, 4.595F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r53 = right_arm3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(166, 0).addBox(-6.25F, -1.675F, -5.75F, 12.5F, 3.35F, 11.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5986F, -2.13F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition bone11 = right_arm.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(-0.9493F, 31.1807F, -4.25F));
		PartDefinition cube_r54 = bone12.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(62, 62).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.2182F));
		PartDefinition bone13 = right_arm.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(-0.9037F, 31.1846F, -1.4F));
		PartDefinition cube_r55 = bone14.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 93).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition bone15 = right_arm.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(-0.9766F, 30.7148F, 1.4F));
		PartDefinition cube_r56 = bone16.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(78, 62).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.5672F));
		PartDefinition bone17 = right_arm.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(-0.9037F, 31.1846F, 4.25F));
		PartDefinition cube_r57 = bone18.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition bone19 = right_arm.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone20 = bone19.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offset(-0.0619F, 35.1835F, -4.25F));
		PartDefinition cube_r58 = bone20.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(37, 158).addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.2182F));
		PartDefinition bone21 = right_arm.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offset(0.6653F, 34.9725F, -1.4F));
		PartDefinition cube_r59 = bone22.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(135, 154).mirror().addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition bone23 = right_arm.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offset(1.2263F, 34.1727F, 1.4F));
		PartDefinition cube_r60 = bone24.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(135, 154).mirror().addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.5672F));
		PartDefinition bone25 = right_arm.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offset(0.6653F, 34.9725F, 4.25F));
		PartDefinition cube_r61 = bone26.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(135, 154).mirror().addBox(4.25F, -0.2191F, -2.384F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2864F, -1.4489F, -4.25F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition bone2 = right_arm.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.9061F, 28.3254F, -6.4484F));
		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(45, 93).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0508F, 0.0F, 1.6144F));
		PartDefinition bone4 = right_arm.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone27 = bone4.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offset(0.9852F, 28.408F, -10.0851F));
		PartDefinition cube_r63 = bone27.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(135, 154).mirror().addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0508F, 0.0F, 1.6144F));
		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offsetAndRotation(19.6514F, -31.5618F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r64 = left_arm.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(81, 171).addBox(-6.25F, -1.675F, -5.25F, 12.5F, 3.35F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3836F, 3.6736F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r65 = left_arm.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(1, 119).addBox(-6.5F, -6.175F, -5.5F, 13.0F, 12.35F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3836F, -3.6736F, 0.0F, 0.0F, 1.5708F, 0.0873F));
		PartDefinition left_arm2 = left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1653F, 10.6718F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r66 = left_arm2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(173, 60).addBox(-6.25F, -1.175F, -5.75F, 12.5F, 2.35F, 11.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2669F, 2.4341F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r67 = left_arm2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(137, 18).addBox(-6.5F, -3.675F, -6.25F, 13.0F, 7.35F, 12.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2669F, -2.4341F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition left_arm3 = left_arm2.addOrReplaceChild("left_arm3", CubeListBuilder.create(), PartPose.offset(-0.125F, 9.875F, 0.0F));
		PartDefinition cube_r68 = left_arm3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(51, 127).addBox(-6.5F, -4.675F, -6.0F, 13.0F, 9.35F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1419F, -2.3091F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r69 = left_arm3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(42, 165).addBox(-6.25F, -1.675F, -5.75F, 12.5F, 3.35F, 11.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1419F, 2.3091F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone5 = left_arm.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.586F, 28.2912F, -5.1959F));
		PartDefinition cube_r70 = bone6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(135, 154).addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5712F, 0.1168F, -4.8893F, -2.0508F, 0.0F, -1.6144F));
		PartDefinition cube_r71 = bone6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(57, 102).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3202F, 0.0342F, -1.2525F, -2.0508F, 0.0F, -1.6144F));
		PartDefinition cube_r72 = bone6.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(118, 0).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4788F, 3.231F, 0.9459F, 0.0F, 1.5708F, 0.2182F));
		PartDefinition cube_r73 = bone6.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 17).addBox(-5.5F, -5.05F, -2.25F, 11.0F, 10.1F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7722F, -3.3821F, 5.1959F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone7 = left_arm.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-1.5582F, 22.0848F, 0.0F));
		PartDefinition cube_r74 = bone8.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(121, 198).addBox(-5.5F, -4.375F, -2.25F, 11.0F, 8.75F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.6109F));
		PartDefinition bone9 = left_arm.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(2.4837F, 22.8266F, 0.0F));
		PartDefinition cube_r75 = bone10.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(208, 24).addBox(-5.5F, -3.675F, -2.25F, 11.0F, 7.35F, 4.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition bone28 = left_arm.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offset(0.9037F, 31.1846F, 4.25F));
		PartDefinition cube_r76 = bone29.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(16, 49).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
		PartDefinition bone30 = left_arm.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create(), PartPose.offset(0.9766F, 30.7148F, 1.4F));
		PartDefinition cube_r77 = bone31.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(70, 67).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.5672F));
		PartDefinition bone32 = left_arm.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone33 = bone32.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offset(-0.6653F, 34.9725F, 4.25F));
		PartDefinition cube_r78 = bone33.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(135, 154).addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
		PartDefinition bone34 = left_arm.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone35 = bone34.addOrReplaceChild("bone35", CubeListBuilder.create(), PartPose.offset(-1.2263F, 34.1727F, 1.4F));
		PartDefinition cube_r79 = bone35.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(135, 154).addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.5672F));
		PartDefinition bone36 = left_arm.addOrReplaceChild("bone36", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone37 = bone36.addOrReplaceChild("bone37", CubeListBuilder.create(), PartPose.offset(-0.6653F, 34.9725F, -1.4F));
		PartDefinition cube_r80 = bone37.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(135, 154).addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
		PartDefinition bone38 = left_arm.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone39 = bone38.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offset(0.0619F, 35.1835F, -4.25F));
		PartDefinition cube_r81 = bone39.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(135, 154).addBox(0.0F, -2.05F, -1.75F, 0.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.2182F));
		PartDefinition bone40 = left_arm.addOrReplaceChild("bone40", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.6514F, 55.5618F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone41 = bone40.addOrReplaceChild("bone41", CubeListBuilder.create(), PartPose.offset(19.9096F, -41.6974F, 0.0F));
		PartDefinition bone42 = left_arm.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2582F, 4.7394F, 0.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bone43 = bone42.addOrReplaceChild("bone43", CubeListBuilder.create(), PartPose.offset(0.9037F, 31.1846F, -1.4F));
		PartDefinition cube_r82 = bone43.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(70, 0).addBox(-1.0F, -2.05F, -1.75F, 2.0F, 4.1F, 3.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-10.0035F, 6.9253F, 0.0F));
		PartDefinition cube_r83 = right_leg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 93).addBox(-8.0F, -6.0F, -6.0F, 16.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0035F, 1.0747F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r84 = right_leg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(124, 82).addBox(-7.9F, -3.0F, -1.0F, 15.8F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9246F, -0.5363F, 0.0F, 0.0F, -1.5708F, -0.3927F));
		PartDefinition cube_r85 = right_leg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(204, 0).addBox(-7.9F, -3.0F, -1.0F, 15.8F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9211F, -0.5384F, 0.0F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition left_foot2 = right_leg.addOrReplaceChild("left_foot2", CubeListBuilder.create(), PartPose.offset(0.0035F, 15.6656F, -10.4045F));
		PartDefinition cube_r86 = left_foot2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r87 = left_foot2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r88 = left_foot2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r89 = left_foot2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r90 = left_foot2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(62, 49).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r91 = left_foot2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(0, 70).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r92 = left_foot2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(13, 70).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r93 = left_foot2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(101, 15).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r94 = left_foot2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(118, 4).addBox(-9.05F, -1.5F, -5.6F, 18.1F, 3.0F, 11.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9091F, 9.1545F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r95 = left_foot2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(163, 157).addBox(-7.3F, -1.5F, -5.3F, 14.6F, 3.0F, 10.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0909F, 10.4045F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r96 = left_foot2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(89, 153).addBox(-7.5F, 10.0F, 4.5F, 15.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, -18.5909F, 10.4045F, 0.0F, -1.5708F, 0.0F));
		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(10.0035F, 6.9253F, 0.0F));
		PartDefinition cube_r97 = left_leg.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(57, 102).addBox(-8.0F, -6.0F, -6.0F, 16.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0035F, 1.0747F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r98 = left_leg.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(0, 206).addBox(-7.9F, -3.0F, -1.0F, 15.8F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9211F, -0.5384F, 0.0F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition cube_r99 = left_leg.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(37, 206).addBox(-7.9F, -3.0F, -1.0F, 15.8F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9246F, -0.5363F, 0.0F, 0.0F, 1.5708F, 0.3927F));
		PartDefinition left_foot = left_leg.addOrReplaceChild("left_foot", CubeListBuilder.create(), PartPose.offset(-0.0035F, 15.6656F, -10.4045F));
		PartDefinition cube_r100 = left_foot.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r101 = left_foot.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r102 = left_foot.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r103 = left_foot.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(57, 110).addBox(-2.3F, -1.5F, 0.0F, 4.6F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 0.9091F, -5.7955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r104 = left_foot.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(124, 64).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r105 = left_foot.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(101, 133).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r106 = left_foot.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(138, 39).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r107 = left_foot.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(141, 127).addBox(-1.8F, -1.5F, -1.1F, 3.6F, 3.0F, 2.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 0.9091F, -1.6955F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r108 = left_foot.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(70, 0).addBox(-9.05F, -1.5F, -5.6F, 18.1F, 3.0F, 11.2F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.9091F, 9.1545F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r109 = left_foot.addOrReplaceChild("cube_r109",
				CubeListBuilder.create().texOffs(153, 98).addBox(-7.3F, -1.5F, -5.3F, 14.6F, 3.0F, 10.6F, new CubeDeformation(0.0F)).texOffs(154, 116).addBox(-7.5F, -6.5F, -5.5F, 15.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0909F, 10.4045F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
