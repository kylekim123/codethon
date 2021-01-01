package com.example.examplemod.blocks;



import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CobaltBlock extends Block {


    public CobaltBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(6.0F, 8.0F)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
