package net.mcreator.craftnotaizai.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelthestalker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelthestalker"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart legLeft;
	public final ModelPart legRight;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;

	public Modelthestalker(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.legLeft = root.getChild("legLeft");
		this.legRight = root.getChild("legRight");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(36, 89).addBox(-7.0F, 3.3866F, -17.47F, 13.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(103, 24).addBox(-6.0F, 4.3866F, -16.47F, 11.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(68, 55)
						.addBox(-6.0F, 3.3866F, -18.47F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 55).addBox(-6.0F, 3.3866F, -3.47F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-8.0F, -20.0F, -19.0F, 16.0F, 16.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(76, 89).addBox(-6.0F, -18.0F, -20.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 89)
						.addBox(-6.0F, -18.0F, -2.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 71).addBox(-3.0F, -5.0F, -13.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-2.0F, -5.0F, -7.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -5.0F, -12.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -106.0F, 1.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -11.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(50, 47).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 89).addBox(-6.0F, -15.0F, -10.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, -10.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(42, 79).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -17.0F, 1.5438F, 1.3906F, 1.5457F));
		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(45, 71).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, -1.5689F, 1.183F, -1.5608F));
		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, -4.0F, -0.7141F, -0.9578F, 0.7188F));
		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(27, 71).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -1.0F, -7.0F, 0.0137F, -0.1501F, 0.3911F));
		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(72, 0).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -1.0F, -7.0F, -0.2013F, 0.5306F, -0.4611F));
		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 79).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -1.0F, -16.0F, 0.4905F, -0.9429F, -0.5754F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(51, 76).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -1.0F, -12.0F, 0.015F, -0.0069F, -0.2176F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 81).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, -16.0F, 0.1917F, 0.9151F, 0.1257F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(51, 71).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8206F, -1.5979F, -4.3322F, -0.3866F, 1.0315F, -0.4434F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 84).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -1.0F, -12.0F, 0.0095F, -0.0135F, 0.306F));
		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(8, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -17.0F, -1.3853F, -1.4294F, 1.3979F));
		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(50, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -3.0F, -1.5124F, -1.43F, 1.4807F));
		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(57, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -3.0F, -7.0F, -2.9934F, -0.5699F, 2.9261F));
		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, -16.0F, -0.3264F, -1.0884F, 0.3986F));
		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(50, 42).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -3.0F, -4.0F, -2.7304F, -1.1128F, 2.7221F));
		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -3.0F, -16.0F, -3.0122F, -1.0542F, 2.8566F));
		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(8, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -3.0F, -4.0F, -0.3927F, -1.0908F, 0.3054F));
		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, -7.0F, 0.0F, -0.2182F, 0.3054F));
		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -4.0F, -12.0F, 0.0F, 0.0F, 2.9234F));
		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(8, 42).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -3.0F, -12.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(76, 89).addBox(-6.0F, -14.0F, -10.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -29.0F, -10.0F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(76, 89).addBox(-6.0F, -14.0F, -10.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -4.0F, -10.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(36, 84).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 1.3866F, -12.47F, 0.0095F, -0.0135F, 0.306F));
		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 81).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.3866F, -16.47F, 0.1917F, 0.9151F, 0.1257F));
		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(42, 79).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3866F, -17.47F, 1.5438F, 1.3906F, 1.5457F));
		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 79).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 1.3866F, -16.47F, 0.4905F, -0.9429F, -0.5754F));
		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(51, 76).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.3866F, -12.47F, 0.015F, -0.0069F, -0.2176F));
		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(72, 0).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.3866F, -7.47F, -0.2013F, 0.5306F, -0.4611F));
		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(51, 71).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8206F, 0.7887F, -4.8022F, -0.3866F, 1.0315F, -0.4434F));
		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(45, 71).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.3866F, -4.47F, -1.5689F, 1.183F, -1.5608F));
		PartDefinition cube_r33 = head.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(27, 71).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 1.3866F, -7.47F, 0.0137F, -0.1501F, 0.3911F));
		PartDefinition cube_r34 = head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 1.3866F, -4.47F, -0.7141F, -0.9578F, 0.7188F));
		PartDefinition cube_r35 = head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(57, 7).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 3.3866F, -7.47F, -2.9934F, -0.5699F, 2.9261F));
		PartDefinition cube_r36 = head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(50, 42).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 3.3866F, -4.47F, -2.7304F, -1.1128F, 2.7221F));
		PartDefinition cube_r37 = head.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(50, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.3866F, -3.47F, -1.5124F, -1.43F, 1.4807F));
		PartDefinition cube_r38 = head.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(8, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 3.3866F, -4.47F, -0.3927F, -1.0908F, 0.3054F));
		PartDefinition cube_r39 = head.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 3.3866F, -7.47F, 0.0F, -0.2182F, 0.3054F));
		PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(8, 42).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 3.3866F, -12.47F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 42).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 3.3866F, -16.47F, -3.0122F, -1.0542F, 2.8566F));
		PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(8, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.3866F, -17.47F, -1.3853F, -1.4294F, 1.3979F));
		PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 3.3866F, -16.47F, -0.3264F, -1.0884F, 0.3986F));
		PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 2.3866F, -12.47F, 0.0F, 0.0F, 2.9234F));
		PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(68, 55).addBox(-6.0F, -2.0F, -7.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, 5.3866F, -10.47F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r46 = head.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(68, 55).addBox(-6.0F, -2.0F, -7.0F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.3866F, -10.47F, 0.0F, 1.5708F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(57, 0).addBox(-3.0F, -43.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(57, 0).addBox(-3.0F, -39.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-3.0F, -35.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(57, 0).addBox(-3.0F, -31.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-3.0F, -27.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(110, 110).addBox(-2.0F, -57.0F, -2.0F, 3.0F, 33.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.0F, -25.0F, -7.0F, 22.0F, 24.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(100, 55).addBox(-9.0F, -26.0F, -6.0F, 16.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 105)
						.addBox(-11.0F, -24.0F, 6.0F, 20.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 105).addBox(-11.0F, -24.0F, -8.0F, 20.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 60)
						.addBox(-9.0F, -1.0F, -6.0F, 16.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(108, 0).addBox(-7.0F, -1.0F, -7.0F, 12.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(108, 0)
						.addBox(-7.0F, -1.0F, 6.0F, 12.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(123, 8).addBox(-10.0F, -1.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(123, 8)
						.addBox(7.0F, -1.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(123, 8).addBox(7.0F, 1.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(123, 8)
						.addBox(8.0F, -1.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(123, 8).addBox(7.0F, 3.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(116, 39)
						.addBox(7.0F, 15.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(116, 39).addBox(-10.0F, 15.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(123, 8)
						.addBox(-10.0F, 3.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(123, 8).addBox(-10.0F, 1.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(123, 8)
						.addBox(-11.0F, -1.0F, -6.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(50, 37).addBox(-11.0F, 17.0F, -7.0F, 20.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -55.0F, 0.0F));
		PartDefinition legLeft = partdefinition.addOrReplaceChild("legLeft",
				CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, 18.0F, -5.0F, 9.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(90, 89).addBox(0.0F, 43.0F, -10.0F, 9.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(0.0F, -7.0F, -5.0F, 9.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(122, 67).addBox(9.0F, -6.0F, -4.0F, 1.0F, 23.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 128)
						.addBox(1.0F, -6.0F, -6.0F, 7.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 128).addBox(1.0F, -6.0F, 4.0F, 7.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -26.0F, 0.0F));
		PartDefinition legRight = partdefinition.addOrReplaceChild("legRight",
				CubeListBuilder.create().texOffs(90, 89).addBox(-11.0F, 43.0F, -10.0F, 9.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 71).addBox(-11.0F, 18.0F, -5.0F, 9.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-11.0F, -7.0F, -5.0F, 9.0F, 25.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(122, 110).addBox(-12.0F, -6.0F, -4.0F, 1.0F, 23.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 128)
						.addBox(-10.0F, -6.0F, -6.0F, 7.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 128).addBox(-10.0F, -6.0F, 4.0F, 7.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -26.0F, 0.0F));
		PartDefinition RightArm = partdefinition
				.addOrReplaceChild(
						"RightArm", CubeListBuilder.create().texOffs(70, 0).addBox(-6.0F, 20.0F, -10.0F, 10.0F, 28.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(94, 110).addBox(-7.0F, 21.0F, -9.0F, 1.0F, 26.0F, 7.0F, new CubeDeformation(0.0F))
								.texOffs(70, 0).addBox(-6.0F, -8.0F, -10.0F, 10.0F, 28.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(94, 110).addBox(-7.0F, -7.0F, -9.0F, 1.0F, 26.0F, 7.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-16.0F, -71.0F, 5.0F));
		PartDefinition cube_r47 = RightArm.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(60, 105).addBox(5.0F, -1.0F, -4.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -6.0F, -6.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r48 = RightArm.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 105).addBox(5.0F, -1.0F, -4.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -6.0F, -16.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r49 = RightArm.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(60, 105).addBox(5.0F, -1.0F, -4.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 22.0F, 5.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r50 = RightArm.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 105).addBox(5.0F, -1.0F, -4.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 22.0F, -5.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition LeftArm = partdefinition
				.addOrReplaceChild(
						"LeftArm", CubeListBuilder.create().texOffs(70, 0).addBox(-6.0F, 23.0F, -12.0F, 10.0F, 28.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(78, 105).addBox(4.0F, 24.0F, -11.0F, 1.0F, 26.0F, 7.0F, new CubeDeformation(0.0F))
								.texOffs(70, 0).addBox(-6.0F, -5.0F, -12.0F, 10.0F, 28.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(78, 105).addBox(4.0F, -4.0F, -11.0F, 1.0F, 26.0F, 7.0F, new CubeDeformation(0.0F)),
						PartPose.offset(16.0F, -74.0F, 7.0F));
		PartDefinition cube_r51 = LeftArm.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(42, 105).addBox(-4.0F, -1.0F, -5.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -6.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r52 = LeftArm.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(42, 105).addBox(-4.0F, -1.0F, -5.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -16.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r53 = LeftArm.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(42, 105).addBox(-4.0F, -1.0F, -3.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 25.0F, -6.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r54 = LeftArm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(42, 105).addBox(-4.0F, -1.0F, -3.0F, 1.0F, 26.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 25.0F, -16.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
