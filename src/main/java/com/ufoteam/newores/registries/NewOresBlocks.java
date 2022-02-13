package com.ufoteam.newores.registries;

import com.ufoteam.newores.utils.GlobalUtils;
import com.ufoteam.newores.utils.NewOresNames;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NewOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GlobalUtils.MODID);

    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register(NewOresNames.platinum_ore.toString(), () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.2f, 6f).requiresCorrectToolForDrops()));
}
