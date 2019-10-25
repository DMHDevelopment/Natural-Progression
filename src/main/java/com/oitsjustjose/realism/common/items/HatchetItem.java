package com.oitsjustjose.realism.common.items;

import com.oitsjustjose.realism.common.utils.RealismGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class HatchetItem extends AxeItem
{
    public HatchetItem()
    {
        super(new FlintItemTier(), 1.8F, 0F, new Item.Properties().addToolType(ToolType.AXE, 0)
                .group(RealismGroup.getInstance()).maxStackSize(1).maxDamage(16));
    }
}