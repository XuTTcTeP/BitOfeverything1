package com.hipter57.bitofeverything.items;

import com.hipter57.bitofeverything.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;

public class ItemModHoe extends ItemHoe {

    public ItemModHoe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
    }
}
