package com.legacy.aether.client.renders.entities;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import com.legacy.aether.client.models.entities.ValkyrieModel;
import com.legacy.aether.entities.bosses.EntityValkyrie;

public class ValkyrieRenderer extends RenderLiving<EntityValkyrie> 
{

	private static final ResourceLocation TEXTURE = new ResourceLocation("aether_legacy", "textures/entities/valkyrie/valkyrie.png");

	public ValkyrieRenderer(RenderManager rendermanagerIn)
	{
		super(rendermanagerIn, new ValkyrieModel(), 0.3F);
	}

    protected void preRenderCallback(EntityValkyrie valkyrie, float partialTickTime)
    {
        ((ValkyrieModel)this.getMainModel()).sinage = valkyrie.sinage;
        ((ValkyrieModel)this.getMainModel()).gonRound = valkyrie.onGround;
        ((ValkyrieModel)this.getMainModel()).halow = true;
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityValkyrie entity) 
	{
		return TEXTURE;
	}

}
