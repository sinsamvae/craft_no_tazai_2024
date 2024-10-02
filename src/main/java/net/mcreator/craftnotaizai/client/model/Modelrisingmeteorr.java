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

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelrisingmeteorr<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelrisingmeteorr"), "main");
	public final ModelPart bone;

	public Modelrisingmeteorr(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(320, 0).addBox(-1.0F, -120.0F, 16.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 244).addBox(1.0F, -120.0F, 16.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 244)
						.addBox(3.0F, -120.0F, 16.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(316, 244).addBox(-3.0F, -120.0F, 16.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(312, 122)
						.addBox(-5.0F, -120.0F, 14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(312, 0).addBox(-5.0F, -120.0F, 12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(308, 244)
						.addBox(-7.0F, -120.0F, 10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(304, 122).addBox(-7.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(304, 0)
						.addBox(-9.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(300, 244).addBox(-11.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(296, 122)
						.addBox(-13.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(296, 0).addBox(-15.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(292, 244)
						.addBox(-15.0F, -120.0F, 6.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(288, 122).addBox(-13.0F, -120.0F, 4.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(288, 0)
						.addBox(-11.0F, -120.0F, 2.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(284, 244).addBox(-9.0F, -120.0F, 0.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(280, 122)
						.addBox(-9.0F, -120.0F, -2.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(280, 0).addBox(-11.0F, -120.0F, -4.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(276, 244)
						.addBox(-11.0F, -120.0F, -6.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(272, 122).addBox(-13.0F, -120.0F, -8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(272, 0)
						.addBox(-13.0F, -120.0F, -10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(268, 244).addBox(-15.0F, -120.0F, -12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(264, 122)
						.addBox(-15.0F, -120.0F, -14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(264, 0).addBox(-13.0F, -120.0F, -14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(260, 244)
						.addBox(-11.0F, -120.0F, -14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(256, 122).addBox(-9.0F, -120.0F, -12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(256, 0)
						.addBox(-7.0F, -120.0F, -12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(252, 244).addBox(-5.0F, -120.0F, -10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(248, 122)
						.addBox(-3.0F, -120.0F, -10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(244, 244).addBox(-1.0F, -120.0F, -8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(236, 244)
						.addBox(1.0F, -120.0F, -8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(228, 244).addBox(3.0F, -120.0F, -10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(220, 244)
						.addBox(5.0F, -120.0F, -10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(212, 244).addBox(7.0F, -120.0F, -12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(204, 244)
						.addBox(9.0F, -120.0F, -12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(196, 244).addBox(11.0F, -120.0F, -14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(188, 244)
						.addBox(13.0F, -120.0F, -14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(180, 244).addBox(15.0F, -120.0F, -14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(172, 244)
						.addBox(15.0F, -120.0F, -12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(164, 244).addBox(13.0F, -120.0F, -10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(156, 244)
						.addBox(13.0F, -120.0F, -8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(148, 244).addBox(11.0F, -120.0F, -6.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(140, 244)
						.addBox(11.0F, -120.0F, -4.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(132, 244).addBox(9.0F, -120.0F, -2.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 244)
						.addBox(9.0F, -120.0F, -2.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 244).addBox(9.0F, -120.0F, 0.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 244)
						.addBox(11.0F, -120.0F, 2.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(108, 244).addBox(13.0F, -120.0F, 4.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 244)
						.addBox(15.0F, -120.0F, 6.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 244).addBox(15.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 244)
						.addBox(13.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 244).addBox(11.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 244)
						.addBox(9.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 244).addBox(7.0F, -120.0F, 8.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 244)
						.addBox(7.0F, -120.0F, 10.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 244).addBox(5.0F, -120.0F, 12.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 244)
						.addBox(5.0F, -120.0F, 14.0F, 2.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(212, 122).addBox(-3.0F, -120.0F, 14.0F, 8.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(208, 0)
						.addBox(-3.0F, -120.0F, 12.0F, 8.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(160, 122).addBox(-5.0F, -120.0F, 10.0F, 12.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(156, 0)
						.addBox(-5.0F, -120.0F, 8.0F, 12.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, -120.0F, 6.0F, 28.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-11.0F, -120.0F, 4.0F, 24.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 122).addBox(-9.0F, -120.0F, 2.0F, 20.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 122)
						.addBox(-7.0F, -120.0F, 0.0F, 16.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 122).addBox(-7.0F, -120.0F, -2.0F, 16.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(-9.0F, -120.0F, -4.0F, 20.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 0).addBox(-9.0F, -120.0F, -6.0F, 20.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(188, 122)
						.addBox(-11.0F, -120.0F, -8.0F, 10.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(184, 0).addBox(3.0F, -120.0F, -8.0F, 10.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(232, 122)
						.addBox(7.0F, -120.0F, -10.0F, 6.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(244, 0).addBox(11.0F, -120.0F, -12.0F, 4.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 244)
						.addBox(-13.0F, -120.0F, -12.0F, 4.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(228, 0).addBox(-11.0F, -120.0F, -10.0F, 6.0F, 120.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
