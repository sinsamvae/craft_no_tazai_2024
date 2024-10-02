// Made with Blockbench 4.9.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkraken<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kraken"), "main");
	private final ModelPart body;
	private final ModelPart tentacle1;
	private final ModelPart tentacle2;
	private final ModelPart tentacle3;
	private final ModelPart tentacle4;
	private final ModelPart tentacle5;
	private final ModelPart tentacle6;
	private final ModelPart tentacle7;
	private final ModelPart tentacle8;

	public Modelkraken(ModelPart root) {
		this.body = root.getChild("body");
		this.tentacle1 = root.getChild("tentacle1");
		this.tentacle2 = root.getChild("tentacle2");
		this.tentacle3 = root.getChild("tentacle3");
		this.tentacle4 = root.getChild("tentacle4");
		this.tentacle5 = root.getChild("tentacle5");
		this.tentacle6 = root.getChild("tentacle6");
		this.tentacle7 = root.getChild("tentacle7");
		this.tentacle8 = root.getChild("tentacle8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-20.2568F, 11.1052F, -23.7265F, 47.0F, 62.0F, 47.0F, new CubeDeformation(0.0F)).texOffs(244, 61)
				.addBox(-24.4568F, 28.5052F, 14.2985F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(244, 89)
				.addBox(-23.4568F, 28.5052F, -28.4515F, 13.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
				.addBox(-16.0818F, -23.0948F, -19.9015F, 39.0F, 35.0F, 39.0F, new CubeDeformation(0.0F))
				.texOffs(126, 153)
				.addBox(-10.9068F, -54.5198F, -16.0765F, 30.0F, 32.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1126F, -101.1302F, -2.9041F, 0.0F, -1.5708F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(224, 203).addBox(-7.5F, -4.0F, -11.0F, 15.0F, 8.0F, 22.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9432F, 13.4878F, -23.3331F, 0.5672F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2",
				CubeListBuilder.create().texOffs(117, 109).addBox(-7.5F, -4.0F, -11.5F, 15.0F, 8.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9432F, -9.0762F, -23.5093F, 0.5672F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3",
				CubeListBuilder.create().texOffs(216, 146).addBox(-7.5F, -4.0F, -11.5F, 15.0F, 8.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9432F, -38.7079F, -19.7105F, 0.5672F, 0.0F, 0.0F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4",
				CubeListBuilder.create().texOffs(220, 0).addBox(-7.5F, -4.0F, -11.5F, 15.0F, 8.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9432F, -34.5958F, 21.8925F, -0.5672F, 0.0F, 0.0F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5",
				CubeListBuilder.create().texOffs(186, 233).addBox(-7.5F, -4.0F, -11.0F, 15.0F, 8.0F, 22.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9432F, -9.1936F, 24.3915F, -0.5672F, 0.0F, 0.0F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6",
				CubeListBuilder.create().texOffs(220, 31).addBox(-7.5F, -3.5F, -11.5F, 15.0F, 7.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9432F, 14.0848F, 22.6264F, -0.5672F, 0.0F, 0.0F));

		PartDefinition tentacle1 = partdefinition.addOrReplaceChild("tentacle1",
				CubeListBuilder.create().texOffs(212, 69).addBox(-4.25F, -19.5F, -3.75F, 8.0F, 69.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.2F, -10.5F, 1.0313F, 0.0F, -1.5708F, 0.0F));

		PartDefinition tentacle2 = partdefinition.addOrReplaceChild("tentacle2",
				CubeListBuilder.create().texOffs(96, 183).addBox(-3.25F, -19.5F, -3.75F, 7.0F, 69.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.3935F, -10.5F, -16.3895F, 0.0F, -2.3562F, 0.0F));

		PartDefinition tentacle3 = partdefinition.addOrReplaceChild("tentacle3",
				CubeListBuilder.create().texOffs(188, 0).addBox(-4.25F, -19.5F, -3.75F, 8.0F, 69.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.075F, -10.5F, -18.0938F, 0.0F, -3.1416F, 0.0F));

		PartDefinition tentacle4 = partdefinition.addOrReplaceChild("tentacle4",
				CubeListBuilder.create().texOffs(156, 225).addBox(-4.25F, -19.5F, -3.75F, 8.0F, 69.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.1472F, -10.5F, -15.1432F, 0.0F, 2.3562F, 0.0F));

		PartDefinition tentacle5 = partdefinition.addOrReplaceChild("tentacle5",
				CubeListBuilder.create().texOffs(64, 183).addBox(-4.25F, -19.5F, -3.75F, 8.0F, 69.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.2875F, -10.5F, -0.075F, 0.0F, 1.5708F, 0.0F));

		PartDefinition tentacle6 = partdefinition.addOrReplaceChild("tentacle6",
				CubeListBuilder.create().texOffs(32, 183).addBox(-4.25F, -19.5F, -3.75F, 8.0F, 69.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.1217F, -10.5F, 15.0391F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tentacle7 = partdefinition.addOrReplaceChild("tentacle7", CubeListBuilder.create()
				.texOffs(126, 225).addBox(-4.25F, -19.5F, -3.75F, 8.0F, 69.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.075F, -10.5F, 19.05F));

		PartDefinition tentacle8 = partdefinition.addOrReplaceChild("tentacle8",
				CubeListBuilder.create().texOffs(0, 183).addBox(-4.25F, -19.5F, -3.75F, 8.0F, 69.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.3109F, -10.5F, 17.8498F, 0.0F, -0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tentacle8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.tentacle1.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.tentacle8.yRot = headPitch / (180F / (float) Math.PI);
		this.tentacle6.yRot = headPitch / (180F / (float) Math.PI);
		this.tentacle7.yRot = headPitch / (180F / (float) Math.PI);
		this.tentacle4.yRot = headPitch / (180F / (float) Math.PI);
		this.tentacle5.yRot = headPitch / (180F / (float) Math.PI);
		this.tentacle2.yRot = headPitch / (180F / (float) Math.PI);
		this.tentacle3.yRot = headPitch / (180F / (float) Math.PI);
	}
}