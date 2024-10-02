// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHail_Bullet2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hail_bullet2"), "main");
	private final ModelPart bone6;

	public ModelHail_Bullet2(ModelPart root) {
		this.bone6 = root.getChild("bone6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition bone2 = bone6.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -11.5F, -3.4F));

		PartDefinition bone3 = bone6.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -20.0F, -5.15F));

		PartDefinition bone4 = bone6.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, -10.5F, 2.85F));

		PartDefinition bone5 = bone6.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, -22.0F, 0.85F));

		PartDefinition bone = bone6.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(11, 17)
						.addBox(-2.0F, -2.0F, -1.85F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 8)
						.addBox(-1.75F, -1.75F, -2.6F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 18)
						.addBox(-1.5F, -1.5F, -3.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.5F, -1.5F, -1.1F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(-1.75F, -1.75F, -1.35F, 3.5F, 3.5F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -18.0F, 0.85F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}