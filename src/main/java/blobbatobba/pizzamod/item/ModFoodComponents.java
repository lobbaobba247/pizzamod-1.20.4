package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

import static blobbatobba.pizzamod.item.ModItems.registerItem;

public class ModFoodComponents {

    private static void addItemsToFood_and_DrinksItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOMATO);
    }

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build())));

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for "  + PizzaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModFoodComponents::addItemsToFood_and_DrinksItemGroup);
    }
}
