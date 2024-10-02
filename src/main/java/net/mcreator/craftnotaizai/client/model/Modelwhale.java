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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelwhale<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelwhale"), "main");
	public final ModelPart body;
	public final ModelPart tail;
	public final ModelPart fin;
	public final ModelPart fin2;

	public Modelwhale(ModelPart root) {
		this.body = root.getChild("body");
		this.tail = root.getChild("tail");
		this.fin = root.getChild("fin");
		this.fin2 = root.getChild("fin2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -38.0F, -53.0F, 26.0F, 39.0F, 70.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, -53.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-1, 228).addBox(-12.0F, -2.5F, -26.0F, 24.0F, 9.0F, 53.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.25F, -0.393F, -24.7321F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 109).addBox(-13.25F, 0.0F, -52.0F, 24.0F, 22.0F, 52.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(129, 7).addBox(-5.0F, -5.0F, -88.75F, 10.0F, 6.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 53.0F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(148, 65).addBox(-11.0F, -17.0F, -2.0F, 22.0F, 34.0F, 44.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.0F, 17.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.0F, 61.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(108, 148).addBox(-10.0F, -15.0F, 2.0F, 20.0F, 29.0F, 44.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tailbone = tail2.addOrReplaceChild("tailbone", CubeListBuilder.create().texOffs(185, 0).addBox(-22.0F, 1.0F, -4.0F, 44.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 43.0F));
		PartDefinition fin = partdefinition.addOrReplaceChild("fin", CubeListBuilder.create().texOffs(0, 192).addBox(-16.7692F, -2.0F, 0.286F, 17.0F, 6.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 15.0F, -50.0F, 0.0F, 1.0071F, 0.0F));
		PartDefinition fin2 = partdefinition.addOrReplaceChild("fin2", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0F, 15.0F, -50.0F, 0.0F, 1.0071F, 0.0F));
		PartDefinition cube_r5 = fin2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 192).addBox(-3.5F, -3.0F, -15.5F, 17.0F, 6.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-29.8205F, 1.0F, -20.8073F, 0.0F, -1.7453F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fin2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
