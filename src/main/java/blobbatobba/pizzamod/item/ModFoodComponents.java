package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import static blobbatobba.pizzamod.item.ModItems.registerItem;

public class ModFoodComponents {

    private static void addItemsToFood_and_DrinksItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOMATO);
        entries.add(CHEESE);
        entries.add(PIZZA);
        entries.add(Uncooked_PIZZA);
    }

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build())));

    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));

    public static final Item PIZZA = registerItem("pizza", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(20).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600), 1f).build())));

    public static final Item Uncooked_PIZZA = registerItem("uncooked_pizza", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(0)
            .saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600), 1f).build())));





    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for "  + PizzaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModFoodComponents::addItemsToFood_and_DrinksItemGroup);
    }
}
