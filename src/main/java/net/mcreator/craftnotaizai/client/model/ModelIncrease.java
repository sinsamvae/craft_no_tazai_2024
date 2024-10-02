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

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelIncrease<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "model_increase"), "main");
	public final ModelPart bone2;
	public final ModelPart bone4;
	public final ModelPart bone7;
	public final ModelPart bone10;
	public final ModelPart bone16;
	public final ModelPart bone13;

	public ModelIncrease(ModelPart root) {
		this.bone2 = root.getChild("bone2");
		this.bone4 = root.getChild("bone4");
		this.bone7 = root.getChild("bone7");
		this.bone10 = root.getChild("bone10");
		this.bone16 = root.getChild("bone16");
		this.bone13 = root.getChild("bone13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -2.8939F, -0.3268F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 5)
				.addBox(-0.05F, -1.7654F, -1.1812F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.05F, -1.7664F, 0.3285F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.3998F, -0.0232F));
		PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-0.05F, -0.375F, -0.475F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.7917F, -0.5747F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(3, 18).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9599F, -0.4917F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 2).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.678F, 0.539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9609F, 0.539F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.679F, -0.4917F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1561F, 0.4006F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.157F, -0.3533F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 18).addBox(-0.05F, -0.85F, -0.375F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0569F, 0.3623F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone = bone2.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(5, 9).addBox(-0.75F, -0.5261F, -1.5004F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.75F, -0.5261F, 0.7496F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-0.75F, -1.7278F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.75F, 0.5222F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-0.5F, 1.2222F, -0.3487F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5222F, 0.0004F));
		PartDefinition hexadecagon_r1 = bone.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(5, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, -0.4309F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = bone.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(16, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, 0.4301F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = bone.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(18, 10).addBox(-0.4F, -0.25F, -0.25F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0222F, 0.0048F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = bone.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(17, 5).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, 0.4301F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r5 = bone.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(10, 17).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, -0.4309F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = bone.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(6, 0).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, 0.7951F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = bone.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(6, 3).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, -0.7959F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = bone.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(13, 3).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, 1.039F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r9 = bone.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(7, 13).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, -1.0397F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r10 = bone.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(12, 14).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, -1.0397F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r11 = bone.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(0, 15).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, 1.039F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r12 = bone.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(11, 11).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, -0.7959F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r13 = bone.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(0, 12).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, 0.7951F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.0F, -4.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -2.8939F, -0.3268F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 5)
				.addBox(-0.05F, -1.7654F, -1.1812F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.05F, -1.7664F, 0.3285F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.3998F, -0.0232F));
		PartDefinition cube_r9 = bone5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 9).addBox(-0.05F, -0.375F, -0.475F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.7917F, -0.5747F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r10 = bone5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(3, 18).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9599F, -0.4917F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bone5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(19, 2).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.678F, 0.539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bone5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9609F, 0.539F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bone5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.679F, -0.4917F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone5.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(17, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1561F, 0.4006F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r15 = bone5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.157F, -0.3533F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r16 = bone5.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 18).addBox(-0.05F, -0.85F, -0.375F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0569F, 0.3623F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone6 = bone4.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(5, 9).addBox(-0.75F, -0.5261F, -1.5004F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.75F, -0.5261F, 0.7496F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-0.75F, -1.7278F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.75F, 0.5222F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-0.5F, 1.2222F, -0.3487F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5222F, 0.0004F));
		PartDefinition hexadecagon_r14 = bone6.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(5, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, -0.4309F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r15 = bone6.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(16, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, 0.4301F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r16 = bone6.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(18, 10).addBox(-0.4F, -0.25F, -0.25F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0222F, 0.0048F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r17 = bone6.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(17, 5).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, 0.4301F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r18 = bone6.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(10, 17).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, -0.4309F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r19 = bone6.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(6, 0).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, 0.7951F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r20 = bone6.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(6, 3).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, -0.7959F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r21 = bone6.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(13, 3).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, 1.039F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r22 = bone6.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create().texOffs(7, 13).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, -1.0397F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r23 = bone6.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(12, 14).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, -1.0397F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r24 = bone6.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(0, 15).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, 1.039F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r25 = bone6.addOrReplaceChild("hexadecagon_r25", CubeListBuilder.create().texOffs(11, 11).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, -0.7959F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r26 = bone6.addOrReplaceChild("hexadecagon_r26", CubeListBuilder.create().texOffs(0, 12).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, 0.7951F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 20.0F, 4.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -2.8939F, -0.3268F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 5)
				.addBox(-0.05F, -1.7654F, -1.1812F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.05F, -1.7664F, 0.3285F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.3998F, -0.0232F));
		PartDefinition cube_r17 = bone8.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 9).addBox(-0.05F, -0.375F, -0.475F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.7917F, -0.5747F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r18 = bone8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(3, 18).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9599F, -0.4917F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r19 = bone8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(19, 2).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.678F, 0.539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r20 = bone8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(6, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9609F, 0.539F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r21 = bone8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(14, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.679F, -0.4917F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r22 = bone8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(17, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1561F, 0.4006F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r23 = bone8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(9, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.157F, -0.3533F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r24 = bone8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 18).addBox(-0.05F, -0.85F, -0.375F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0569F, 0.3623F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone9 = bone7.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(5, 9).addBox(-0.75F, -0.5261F, -1.5004F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.75F, -0.5261F, 0.7496F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-0.75F, -1.7278F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.75F, 0.5222F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-0.5F, 1.2222F, -0.3487F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5222F, 0.0004F));
		PartDefinition hexadecagon_r27 = bone9.addOrReplaceChild("hexadecagon_r27", CubeListBuilder.create().texOffs(5, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, -0.4309F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r28 = bone9.addOrReplaceChild("hexadecagon_r28", CubeListBuilder.create().texOffs(16, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, 0.4301F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r29 = bone9.addOrReplaceChild("hexadecagon_r29", CubeListBuilder.create().texOffs(18, 10).addBox(-0.4F, -0.25F, -0.25F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0222F, 0.0048F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r30 = bone9.addOrReplaceChild("hexadecagon_r30", CubeListBuilder.create().texOffs(17, 5).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, 0.4301F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r31 = bone9.addOrReplaceChild("hexadecagon_r31", CubeListBuilder.create().texOffs(10, 17).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, -0.4309F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r32 = bone9.addOrReplaceChild("hexadecagon_r32", CubeListBuilder.create().texOffs(6, 0).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, 0.7951F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r33 = bone9.addOrReplaceChild("hexadecagon_r33", CubeListBuilder.create().texOffs(6, 3).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, -0.7959F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r34 = bone9.addOrReplaceChild("hexadecagon_r34", CubeListBuilder.create().texOffs(13, 3).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, 1.039F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r35 = bone9.addOrReplaceChild("hexadecagon_r35", CubeListBuilder.create().texOffs(7, 13).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, -1.0397F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r36 = bone9.addOrReplaceChild("hexadecagon_r36", CubeListBuilder.create().texOffs(12, 14).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, -1.0397F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r37 = bone9.addOrReplaceChild("hexadecagon_r37", CubeListBuilder.create().texOffs(0, 15).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, 1.039F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r38 = bone9.addOrReplaceChild("hexadecagon_r38", CubeListBuilder.create().texOffs(11, 11).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, -0.7959F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r39 = bone9.addOrReplaceChild("hexadecagon_r39", CubeListBuilder.create().texOffs(0, 12).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, 0.7951F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 16.0F, -1.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -2.8939F, -0.3268F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 5)
				.addBox(-0.05F, -1.7654F, -1.1812F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.05F, -1.7664F, 0.3285F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.3998F, -0.0232F));
		PartDefinition cube_r25 = bone11.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 9).addBox(-0.05F, -0.375F, -0.475F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.7917F, -0.5747F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r26 = bone11.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(3, 18).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9599F, -0.4917F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r27 = bone11.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(19, 2).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.678F, 0.539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r28 = bone11.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(6, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9609F, 0.539F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r29 = bone11.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.679F, -0.4917F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r30 = bone11.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(17, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1561F, 0.4006F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r31 = bone11.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(9, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.157F, -0.3533F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r32 = bone11.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 18).addBox(-0.05F, -0.85F, -0.375F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0569F, 0.3623F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone12 = bone10.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(5, 9).addBox(-0.75F, -0.5261F, -1.5004F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.75F, -0.5261F, 0.7496F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-0.75F, -1.7278F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.75F, 0.5222F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-0.5F, 1.2222F, -0.3487F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5222F, 0.0004F));
		PartDefinition hexadecagon_r40 = bone12.addOrReplaceChild("hexadecagon_r40", CubeListBuilder.create().texOffs(5, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, -0.4309F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r41 = bone12.addOrReplaceChild("hexadecagon_r41", CubeListBuilder.create().texOffs(16, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, 0.4301F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r42 = bone12.addOrReplaceChild("hexadecagon_r42", CubeListBuilder.create().texOffs(18, 10).addBox(-0.4F, -0.25F, -0.25F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0222F, 0.0048F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r43 = bone12.addOrReplaceChild("hexadecagon_r43", CubeListBuilder.create().texOffs(17, 5).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, 0.4301F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r44 = bone12.addOrReplaceChild("hexadecagon_r44", CubeListBuilder.create().texOffs(10, 17).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, -0.4309F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r45 = bone12.addOrReplaceChild("hexadecagon_r45", CubeListBuilder.create().texOffs(6, 0).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, 0.7951F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r46 = bone12.addOrReplaceChild("hexadecagon_r46", CubeListBuilder.create().texOffs(6, 3).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, -0.7959F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r47 = bone12.addOrReplaceChild("hexadecagon_r47", CubeListBuilder.create().texOffs(13, 3).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, 1.039F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r48 = bone12.addOrReplaceChild("hexadecagon_r48", CubeListBuilder.create().texOffs(7, 13).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, -1.0397F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r49 = bone12.addOrReplaceChild("hexadecagon_r49", CubeListBuilder.create().texOffs(12, 14).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, -1.0397F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r50 = bone12.addOrReplaceChild("hexadecagon_r50", CubeListBuilder.create().texOffs(0, 15).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, 1.039F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r51 = bone12.addOrReplaceChild("hexadecagon_r51", CubeListBuilder.create().texOffs(11, 11).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, -0.7959F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r52 = bone12.addOrReplaceChild("hexadecagon_r52", CubeListBuilder.create().texOffs(0, 12).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, 0.7951F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone16 = partdefinition.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, -4.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -2.8939F, -0.3268F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 5)
				.addBox(-0.05F, -1.7654F, -1.1812F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.05F, -1.7664F, 0.3285F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.3998F, -0.0232F));
		PartDefinition cube_r33 = bone17.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 9).addBox(-0.05F, -0.375F, -0.475F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.7917F, -0.5747F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r34 = bone17.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(3, 18).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9599F, -0.4917F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r35 = bone17.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(19, 2).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.678F, 0.539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r36 = bone17.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(6, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9609F, 0.539F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r37 = bone17.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(14, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.679F, -0.4917F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r38 = bone17.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(17, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1561F, 0.4006F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r39 = bone17.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.157F, -0.3533F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r40 = bone17.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 18).addBox(-0.05F, -0.85F, -0.375F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0569F, 0.3623F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone18 = bone16.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(5, 9).addBox(-0.75F, -0.5261F, -1.5004F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.75F, -0.5261F, 0.7496F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-0.75F, -1.7278F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.75F, 0.5222F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-0.5F, 1.2222F, -0.3487F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5222F, 0.0004F));
		PartDefinition hexadecagon_r53 = bone18.addOrReplaceChild("hexadecagon_r53", CubeListBuilder.create().texOffs(5, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, -0.4309F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r54 = bone18.addOrReplaceChild("hexadecagon_r54", CubeListBuilder.create().texOffs(16, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, 0.4301F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r55 = bone18.addOrReplaceChild("hexadecagon_r55", CubeListBuilder.create().texOffs(18, 10).addBox(-0.4F, -0.25F, -0.25F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0222F, 0.0048F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r56 = bone18.addOrReplaceChild("hexadecagon_r56", CubeListBuilder.create().texOffs(17, 5).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, 0.4301F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r57 = bone18.addOrReplaceChild("hexadecagon_r57", CubeListBuilder.create().texOffs(10, 17).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, -0.4309F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r58 = bone18.addOrReplaceChild("hexadecagon_r58", CubeListBuilder.create().texOffs(6, 0).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, 0.7951F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r59 = bone18.addOrReplaceChild("hexadecagon_r59", CubeListBuilder.create().texOffs(6, 3).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, -0.7959F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r60 = bone18.addOrReplaceChild("hexadecagon_r60", CubeListBuilder.create().texOffs(13, 3).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, 1.039F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r61 = bone18.addOrReplaceChild("hexadecagon_r61", CubeListBuilder.create().texOffs(7, 13).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, -1.0397F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r62 = bone18.addOrReplaceChild("hexadecagon_r62", CubeListBuilder.create().texOffs(12, 14).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, -1.0397F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r63 = bone18.addOrReplaceChild("hexadecagon_r63", CubeListBuilder.create().texOffs(0, 15).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, 1.039F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r64 = bone18.addOrReplaceChild("hexadecagon_r64", CubeListBuilder.create().texOffs(11, 11).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, -0.7959F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r65 = bone18.addOrReplaceChild("hexadecagon_r65", CubeListBuilder.create().texOffs(0, 12).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, 0.7951F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, 4.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.05F, -2.8939F, -0.3268F, 0.1F, 6.55F, 0.7F, new CubeDeformation(0.0F)).texOffs(3, 5)
				.addBox(-0.05F, -1.7654F, -1.1812F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.05F, -1.7664F, 0.3285F, 0.1F, 3.25F, 0.9F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.3998F, -0.0232F));
		PartDefinition cube_r41 = bone14.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 9).addBox(-0.05F, -0.375F, -0.475F, 0.1F, 0.75F, 0.95F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.7917F, -0.5747F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r42 = bone14.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(3, 18).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9599F, -0.4917F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r43 = bone14.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(19, 2).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.678F, 0.539F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r44 = bone14.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(6, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.9609F, 0.539F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r45 = bone14.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(14, 19).addBox(-0.05F, -0.625F, -0.35F, 0.1F, 1.25F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.679F, -0.4917F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r46 = bone14.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(17, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1561F, 0.4006F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r47 = bone14.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(9, 19).addBox(-0.05F, -0.75F, -0.25F, 0.1F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.157F, -0.3533F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r48 = bone14.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 18).addBox(-0.05F, -0.85F, -0.375F, 0.1F, 1.7F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0569F, 0.3623F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone15 = bone13.addOrReplaceChild("bone15",
				CubeListBuilder.create().texOffs(5, 9).addBox(-0.75F, -0.5261F, -1.5004F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-0.75F, -0.5261F, 0.7496F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-0.75F, -1.7278F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(12, 8).addBox(-0.75F, 0.5222F, -0.2987F, 1.5F, 0.75F, 0.5967F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-0.5F, 1.2222F, -0.3487F, 1.0F, 0.8F, 0.7F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.5222F, 0.0004F));
		PartDefinition hexadecagon_r66 = bone15.addOrReplaceChild("hexadecagon_r66", CubeListBuilder.create().texOffs(5, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, -0.4309F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r67 = bone15.addOrReplaceChild("hexadecagon_r67", CubeListBuilder.create().texOffs(16, 16).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, 0.4301F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r68 = bone15.addOrReplaceChild("hexadecagon_r68", CubeListBuilder.create().texOffs(18, 10).addBox(-0.4F, -0.25F, -0.25F, 0.8F, 0.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0222F, 0.0048F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r69 = bone15.addOrReplaceChild("hexadecagon_r69", CubeListBuilder.create().texOffs(17, 5).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8116F, 0.4301F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r70 = bone15.addOrReplaceChild("hexadecagon_r70", CubeListBuilder.create().texOffs(10, 17).addBox(-0.65F, -0.375F, -0.2984F, 1.3F, 0.75F, 0.5967F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2671F, -0.4309F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r71 = bone15.addOrReplaceChild("hexadecagon_r71", CubeListBuilder.create().texOffs(6, 0).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, 0.7951F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r72 = bone15.addOrReplaceChild("hexadecagon_r72", CubeListBuilder.create().texOffs(6, 3).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, -0.7959F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r73 = bone15.addOrReplaceChild("hexadecagon_r73", CubeListBuilder.create().texOffs(13, 3).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, 1.039F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r74 = bone15.addOrReplaceChild("hexadecagon_r74", CubeListBuilder.create().texOffs(7, 13).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, -1.0397F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r75 = bone15.addOrReplaceChild("hexadecagon_r75", CubeListBuilder.create().texOffs(12, 14).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2027F, -1.0397F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r76 = bone15.addOrReplaceChild("hexadecagon_r76", CubeListBuilder.create().texOffs(0, 15).addBox(-0.65F, -0.2984F, -0.375F, 1.3F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.6583F, 1.039F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r77 = bone15.addOrReplaceChild("hexadecagon_r77", CubeListBuilder.create().texOffs(11, 11).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5677F, -0.7959F, 0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r78 = bone15.addOrReplaceChild("hexadecagon_r78", CubeListBuilder.create().texOffs(0, 12).addBox(-0.75F, -0.2984F, -0.375F, 1.5F, 0.5967F, 0.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0233F, 0.7951F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone16.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
