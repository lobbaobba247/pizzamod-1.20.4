package blobbatobba.pizzamod.block;

import blobbatobba.pizzamod.PizzaMod;
import blobbatobba.pizzamod.block.custom.TomatoCropBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {



    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(PizzaMod.MOD_ID, "tomato_crop"), new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BLOCK_OF_PIZZA = new Block(FabricBlockSettings.create().notSolid().strength(1.0f, 1.0f).mapColor(MapColor.TERRACOTTA_BROWN).sounds(BlockSoundGroup.GRAVEL));


    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier(PizzaMod.MOD_ID, "block_of_pizza"), BLOCK_OF_PIZZA);
    }


    public static void registerModBlocks() {
            PizzaMod.LOGGER.info("Registering ModBlocks for " + PizzaMod.MOD_ID);
        }
    }