package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;
import blobbatobba.pizzamod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    // Block Items
    public static final BlockItem BLOCK_OF_PIZZA = new BlockItem(ModBlocks.BLOCK_OF_PIZZA, new FabricItemSettings());

    public static void registerBlockItem() {
        Registry.register(Registries.ITEM, new Identifier(PizzaMod.MOD_ID, "block_of_pizza"), BLOCK_OF_PIZZA);
    }


    // Items

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(PizzaMod.MOD_ID, name), item);
        return item;
    }
}