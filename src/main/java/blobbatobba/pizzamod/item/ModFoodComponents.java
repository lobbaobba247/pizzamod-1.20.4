package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static blobbatobba.pizzamod.item.ModItems.registerItem;

public class ModFoodComponents {


    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build())));

    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(0.25f).build())));

    public static final Item PINEAPPLE_PIZZA = registerItem("pineapple_pizza", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(0).saturationModifier(0f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20, 10000),1f).build())));

    public static final Item BEER = registerItem("beer", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f)
            .alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 6000, 3, true, false, false), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 5, true, false, false), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 6000, 0, true, false, false), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 6000, 3, true, false, false), 1f).build())));

    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build())));

    public static final Item PEPPERONI = registerItem("pepperoni", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).meat().build())));

    public static final Item PIZZA = registerItem("pizza", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(20).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600), 1f).build())));

    public static final Item Uncooked_PIZZA = registerItem("uncooked_pizza", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(0)
            .saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 10), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600), 1f).build())));

    public static final Item PEPPERONI_PIZZA = registerItem("pepperoni_pizza", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(20).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 600), 1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 600), 1f).build())));


    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for " + PizzaMod.MOD_ID);

    }
}
