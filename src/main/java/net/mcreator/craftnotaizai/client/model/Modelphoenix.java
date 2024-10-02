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

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelphoenix<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelphoenix"), "main");
	public final ModelPart bb_main;

	public Modelphoenix(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -4.8109F, -2.0024F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 40).addBox(-1.3F, -0.6469F, -3.0833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(0, 41)
						.addBox(-1.3F, -0.6469F, -2.7433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(23, 43).addBox(-1.7F, -0.6469F, -3.0833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(28, 43)
						.addBox(-1.7F, -0.6469F, -2.7433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(41, 25).addBox(0.7F, -0.6469F, -2.7433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(34, 40)
						.addBox(0.7F, -0.6469F, -3.0833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(39, 40).addBox(0.3F, -0.6469F, -3.0833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(5, 42)
						.addBox(0.3F, -0.6469F, -2.7433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main
				.addOrReplaceChild(
						"cube_r1", CubeListBuilder.create().texOffs(16, 20).addBox(-0.5F, -0.8316F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(22, 14)
								.addBox(-0.1F, -0.8316F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(8, 17).addBox(-2.1F, -0.8316F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)),
						PartPose.offsetAndRotation(0.8F, -0.1135F, -2.1691F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 40).addBox(0.5F, -0.5F, -0.67F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(16, 11).addBox(0.5F, -0.5F, -0.33F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(19, 40)
						.addBox(-1.5F, -0.5F, -0.33F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).texOffs(18, 43).addBox(-1.5F, -0.5F, -0.67F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(0.0F, 0.2531F, -1.4633F, -1.0908F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(42, 13).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)).texOffs(43, 0).addBox(-2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.16F)),
				PartPose.offsetAndRotation(1.0F, 0.4049F, -1.5351F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(40, 9).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(14, 40).addBox(-2.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(1.0F, -0.7545F, -1.0012F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(36, 26).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(0, 37).addBox(-2.5F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(1.0F, -1.4483F, -1.2476F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(33, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 31).addBox(-2.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0609F, -0.5024F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 43).addBox(-0.5F, -0.8316F, -1.0318F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)),
				PartPose.offsetAndRotation(-1.2F, -0.1135F, -2.1691F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, 0.2567F, -1.689F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.6213F, -5.186F, -2.2093F, -0.6037F, 0.3286F, -0.219F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(21, 33).addBox(-1.0F, 0.2567F, -1.689F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9735F, -4.5248F, -1.2138F, -0.6037F, 0.3286F, -0.219F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(30, 33).addBox(-1.0F, 0.2567F, -1.689F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 0).mirror().addBox(-3.0F, 0.2567F, -1.689F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -4.4122F, -0.9558F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(38, 6).addBox(-1.5348F, -0.4913F, -0.5348F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(6.3935F, -4.8563F, -2.1072F, -0.7333F, -0.639F, 0.493F));
		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(8, 36).addBox(-0.4227F, -0.4913F, -0.5437F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(3.6214F, -5.837F, -3.6465F, -0.6229F, -0.4F, 0.2727F));
		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(37, 3).addBox(-0.9545F, -0.4913F, -0.5188F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(3.3612F, -5.5641F, -3.2181F, -1.0299F, 0.8934F, -0.914F));
		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 39).addBox(-1.4812F, -0.4913F, -0.5455F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(3.0551F, -5.2542F, -2.7317F, -0.6037F, 0.3286F, -0.219F));
		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 33).addBox(-1.0148F, -0.4913F, -0.547F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(7.0585F, -4.7142F, -1.8841F, -0.5889F, -0.2564F, 0.1678F));
		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(31, 37).addBox(-1.0F, -0.7346F, -0.7382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).texOffs(24, 37).addBox(-3.8F, -0.7346F, -0.7382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(1.4F, -4.7171F, -2.3415F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(31, 12).addBox(-1.0F, 0.2567F, -1.689F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9735F, -4.5248F, -1.2138F, -0.6037F, -0.3286F, 0.219F));
		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 30).addBox(-0.9852F, -0.4913F, -0.547F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-7.0585F, -4.7142F, -1.8841F, -0.5889F, 0.2564F, -0.1678F));
		PartDefinition cube_r19 = bb_main.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(38, 37).addBox(-0.4652F, -0.4913F, -0.5348F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-6.3935F, -4.8563F, -2.1072F, -0.7333F, 0.639F, -0.493F));
		PartDefinition cube_r20 = bb_main.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 16).addBox(-2.5773F, -0.4913F, -0.5437F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-3.6214F, -5.837F, -3.6465F, -0.6229F, 0.4F, -0.2727F));
		PartDefinition cube_r21 = bb_main.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(37, 19).addBox(-1.0455F, -0.4913F, -0.5188F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-3.3612F, -5.5641F, -3.2181F, -1.0299F, -0.8934F, 0.914F));
		PartDefinition cube_r22 = bb_main.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(39, 22).addBox(-0.5188F, -0.4913F, -0.5455F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
				PartPose.offsetAndRotation(-3.0551F, -5.2542F, -2.7317F, -0.6037F, -0.3286F, 0.219F));
		PartDefinition cube_r23 = bb_main.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(12, 0).addBox(-3.0F, 0.2567F, -1.689F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6213F, -5.186F, -2.2093F, -0.6037F, -0.3286F, 0.219F));
		PartDefinition cube_r24 = bb_main.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 29).addBox(-0.0048F, -1.4639F, -1.9473F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.82F, -5.0517F, 0.3731F, 0.7742F, 0.2633F));
		PartDefinition cube_r25 = bb_main.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-0.404F, -1.6138F, -1.4527F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false),
				PartPose.offsetAndRotation(0.6888F, -6.4564F, -3.5153F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition cube_r26 = bb_main.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(8, 20).addBox(-0.404F, -1.6138F, -1.4527F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.82F, -5.0517F, 0.4215F, 0.3614F, 0.1572F));
		PartDefinition cube_r27 = bb_main.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 20).addBox(-1.0F, -1.6138F, -1.0298F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.82F, -5.0517F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r28 = bb_main.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 46).addBox(-1.596F, -1.6138F, -1.4527F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-0.6888F, -6.4564F, -3.5153F, 0.4215F, -0.3614F, -0.1572F));
		PartDefinition cube_r29 = bb_main.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 8).addBox(-1.596F, -1.6138F, -1.4527F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.82F, -5.0517F, 0.4215F, -0.3614F, -0.1572F));
		PartDefinition cube_r30 = bb_main.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(22, 26).addBox(-0.282F, -1.0248F, -1.7474F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.82F, -5.0517F, -0.0472F, 0.3923F, -0.0181F));
		PartDefinition cube_r31 = bb_main.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 29).addBox(-1.718F, -1.0248F, -1.7474F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.82F, -5.0517F, -0.0472F, -0.3923F, 0.0181F));
		PartDefinition cube_r32 = bb_main.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(11, 26).addBox(-1.5F, -1.0248F, -1.3488F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.82F, -5.0517F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r33 = bb_main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.9002F, 5.2266F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r34 = bb_main.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 6).addBox(-1.5F, 0.0F, -2.5F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.8695F, 3.7978F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r35 = bb_main.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(14, 5).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.0F, -5.468F, -4.3921F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r36 = bb_main.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(17, 36).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -3.0768F, 1.9505F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r37 = bb_main.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(11, 1).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1891F, -3.8139F, 3.2449F, -0.1174F, 0.1193F, 1.3719F));
		PartDefinition cube_r38 = bb_main.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(-2, 4).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1891F, -3.8139F, 3.2449F, -0.1174F, -0.1193F, -1.3719F));
		PartDefinition cube_r39 = bb_main.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 31).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.0F, -3.5796F, 0.7259F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r40 = bb_main.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 2).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, -4.5149F, -2.6954F, -0.5672F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
