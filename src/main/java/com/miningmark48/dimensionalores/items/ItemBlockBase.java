package com.miningmark48.dimensionalores.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockBase extends ItemBlock{

    public ItemBlockBase(Block block) {
        super(block);

        setRegistryName(block.getRegistryName());
    }
}
