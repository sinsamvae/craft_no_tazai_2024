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
public class Modelevilhound<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelevilhound"), "main");
	public final ModelPart bone;

	public Modelevilhound(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));
		PartDefinition tail = bone.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 23).addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -12.0F, 10.0F));
		PartDefinition leg4 = bone.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 28).addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -8.0F, -4.0F));
		PartDefinition leg3 = bone.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(8, 28).addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, -4.0F));
		PartDefinition leg2 = bone.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(16, 28).addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -8.0F, 7.0F));
		PartDefinition leg1 = bone.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(30, 31).addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, 7.0F));
		PartDefinition mane = bone.addOrReplaceChild("mane", CubeListBuilder.create(), PartPose.offset(-1.0F, -10.0F, 2.0F));
		PartDefinition mane_rotation = mane.addOrReplaceChild("mane_rotation", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.5F, -0.5F, 8.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.5F, -2.5F, 1.5708F, 0.0F, 0.0F));
		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, 2.0F));
		PartDefinition body_rotation = body.addOrReplaceChild("body_rotation", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 13).addBox(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 0).addBox(-0.5F, -0.02F, -5.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -10.5F, -7.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
