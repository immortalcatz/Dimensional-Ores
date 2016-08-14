package com.miningmark48.dimensionalores.blocks;

import com.miningmark48.dimensionalores.init.ModItems;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockDimSulfurOre extends BlockDOMod{

    public BlockDimSulfurOre(){
        super(Material.ROCK, MapColor.GRAY);
        setHardness(3.0F);
        setResistance(15.0F);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

//    @Override
//    public Item getItemDropped(IBlockState state, Random rand, int fortune)
//    {
//        return ModItems.sulfur;
//    }
//
//    public int quantityDroppedWithBonus(int fortune, Random random)
//    {
//        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
//        {
//            int i = random.nextInt(fortune + 2) - 1;
//
//            if (i < 0)
//            {
//                i = 0;
//            }
//
//            return this.quantityDropped(random) * (i + 1);
//        }
//        else
//        {
//            return this.quantityDropped(random);
//        }
//    }

}
