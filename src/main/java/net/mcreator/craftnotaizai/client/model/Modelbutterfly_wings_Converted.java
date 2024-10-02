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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbutterfly_wings_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelbutterfly_wings_converted"), "main");
	public final ModelPart group2;
	public final ModelPart group;

	public Modelbutterfly_wings_Converted(ModelPart root) {
		this.group2 = root.getChild("group2");
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group2 = partdefinition.addOrReplaceChild("group2", CubeListBuilder.create(), PartPose.offset(-32.0F, 24.0F, -5.0F));
		PartDefinition cube_r1 = group2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(32.7268F, -32.0F, -5.4554F, 23.0F, 37.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(-32.0F, 24.0F, -5.0F));
		PartDefinition cube_r2 = group.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-55.7268F, -32.0F, -5.4554F, 23.0F, 37.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(64.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
