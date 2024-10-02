// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellightingbeast<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lightingbeast"), "main");
	private final ModelPart bone;

	public Modellightingbeast(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 1.5708F));

		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-6.0F, -4.0F, -24.0F, 12.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.5F, -20.0F, -10.0F, 28.0F, 28.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(76, 76)
						.addBox(3.0F, -24.0F, -4.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(3.0F, -6.0F, -22.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 2.0F));

		PartDefinition mirrored = head.addOrReplaceChild("mirrored",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, 0.0F, -46.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 76)
						.addBox(-5.0F, -18.0F, -28.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 24.0F));

		PartDefinition jaw = bone.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(56, 56).addBox(-6.0F, 0.0F,
				-16.0F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -6.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}