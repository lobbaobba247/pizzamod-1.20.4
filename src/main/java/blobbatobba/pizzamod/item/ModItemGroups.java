package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static blobbatobba.pizzamod.item.ModFoodComponents.*;
import static blobbatobba.pizzamod.item.ModItems.*;

public class ModItemGroups {
    public  static final ItemGroup PIZZA_COLLECTION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PizzaMod.MOD_ID, "pizza_collection"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pizza_collection"))
                    .icon(() -> new ItemStack(PIZZA)).entries((displayContext, entries) -> {
                        entries.add(BEER);
                        entries.add(TOMATO_SEEDS);
                        entries.add(TOMATO);
                        entries.add(CHEESE);
                        entries.add(PEPPERONI);
                        entries.add(PINEAPPLE);
                        entries.add(Uncooked_PIZZA);
                        entries.add(PIZZA);
                        entries.add(PEPPERONI_PIZZA);
                        entries.add(PINEAPPLE_PIZZA);
                    }).build());



    public static void registerItemGroups() {
        PizzaMod.LOGGER.info("Registering Item Groups for " + PizzaMod.MOD_ID);
    }
}
