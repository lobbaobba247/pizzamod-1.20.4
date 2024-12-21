package blobbatobba.pizzamod.block;

import blobbatobba.pizzamod.PizzaMod;
import blobbatobba.pizzamod.block.custom.TomatoCropBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(PizzaMod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PizzaMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(PizzaMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PizzaMod.LOGGER.info("Registering ModBlocks for " + PizzaMod.MOD_ID);
    }
}
