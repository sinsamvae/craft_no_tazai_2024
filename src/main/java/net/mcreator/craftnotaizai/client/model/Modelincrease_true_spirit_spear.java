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
public class Modelincrease_true_spirit_spear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_no_taizai", "modelincrease_true_spirit_spear"), "main");
	public final ModelPart bone;
	public final ModelPart blade;
	public final ModelPart base;

	public Modelincrease_true_spirit_spear(ModelPart root) {
		this.bone = root.getChild("bone");
		this.blade = root.getChild("blade");
		this.base = root.getChild("base");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 1.5708F, 1.5708F, -3.1416F));
		PartDefinition blade = bone.addOrReplaceChild("blade", CubeListBuilder.create(), PartPose.offset(-0.5F, -8.0F, -0.5F));
		PartDefinition cube_r1 = blade.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(4.5F, -11.8355F, -0.5661F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -6.1645F, -4.4339F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = blade.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(5, 0).addBox(4.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5343F, -19.9037F, -4.4339F, 0.0F, -1.5708F, -2.3562F));
		PartDefinition cube_r3 = blade.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(4.5F, -8.8355F, -3.5661F, 1.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 2)
				.addBox(4.5F, -9.8355F, -2.5661F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 10).addBox(4.5F, -11.8355F, -1.5661F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -5.1645F, -4.4339F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r4 = blade.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(20, 10).addBox(4.5F, -10.8355F, -1.5661F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -5.1645F, -4.4339F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r5 = blade.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 7).addBox(4.5F, -11.8355F, 0.4339F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -7.9145F, -4.4339F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r6 = blade.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 0).addBox(4.5F, -11.8355F, -0.5661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.1645F, -4.4339F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r7 = blade.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 40).addBox(4.5F, -12.4947F, -6.6802F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3844F, -5.7765F, -4.4339F, 0.0F, -1.5708F, -0.5672F));
		PartDefinition cube_r8 = blade.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 40).addBox(4.5F, -11.4911F, 8.2555F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.459F, -5.2392F, -4.4339F, 0.0F, -1.5708F, 0.5672F));
		PartDefinition base = bone.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 27.0F));
		PartDefinition cube_r9 = base.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(30, 39).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0103F, -14.4059F, -26.9339F, 0.0F, -1.5708F, 2.3562F));
		PartDefinition cube_r10 = base.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 4).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3949F, -0.5681F, -26.9339F, 0.0F, -1.5708F, 2.3562F));
		PartDefinition cube_r11 = base.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(8, 40).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1197F, -2.0F, -26.9339F, 0.0F, -1.5708F, 2.3562F));
		PartDefinition cube_r12 = base.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 32).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.659F, -11.7366F, -26.9339F, 0.0F, -1.5708F, 2.3562F));
		PartDefinition cube_r13 = base.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 16).addBox(-0.5F, -3.5F, -18.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.7367F, -12.253F, -27.9339F, 0.0F, -1.5708F, 0.7854F));
		PartDefinition cube_r14 = base.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(29, 0).addBox(-0.5F, -3.5F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0125F, -11.383F, -27.9339F, 0.0F, -1.5708F, 0.7854F));
		PartDefinition cube_r15 = base.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(26, 27).addBox(3.75F, 0.1645F, -1.3161F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(11, 0).addBox(3.75F, 1.1645F, -2.3161F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -13.1645F, -31.9339F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r16 = base.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(26, 17).addBox(4.5F, 0.1645F, -0.9661F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 33).addBox(3.75F, 3.1645F, -2.7911F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 24)
						.addBox(3.75F, 2.6645F, -1.9911F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 24).addBox(3.75F, 2.6645F, 3.0089F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 23)
						.addBox(3.75F, 3.1645F, 2.7589F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 18).addBox(3.75F, 2.1645F, -1.4661F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -13.1645F, -32.1839F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r17 = base.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 33).addBox(-28.0F, 4.9483F, -3.4036F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6655F, -14.9552F, -0.4339F, 0.0F, -1.5708F, -0.0873F));
		PartDefinition cube_r18 = base.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(35, 8).addBox(-21.0F, -6.9905F, -7.8219F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6056F, -14.3914F, -7.4339F, 0.0F, -1.5708F, 1.9635F));
		PartDefinition cube_r19 = base.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 35).addBox(-1.5F, -2.0F, 1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6579F, -8.4171F, -26.9339F, 0.0F, -1.5708F, -3.0543F));
		PartDefinition cube_r20 = base.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(39, 0).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0675F, -5.9877F, -26.9339F, 0.0F, -1.5708F, -1.9635F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
