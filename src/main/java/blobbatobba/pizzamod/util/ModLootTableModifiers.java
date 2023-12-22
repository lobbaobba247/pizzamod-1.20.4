package blobbatobba.pizzamod.util;

import blobbatobba.pizzamod.item.ModFoodComponents;
import blobbatobba.pizzamod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier SHORT_GRASS_ID
            = new Identifier("minecraft", "blocks/short_grass");

    private static final Identifier TALL_GRASS_ID
            = new Identifier("minecraft", "blocks/tall_grass");



    public static void modifyLootTables() {
                LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
                    if(SHORT_GRASS_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.75f)) // Drops 75% of the time
                                .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                        tableBuilder.pool(poolBuilder.build());
                    }
                    if(TALL_GRASS_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1))
                                .conditionally(RandomChanceLootCondition.builder(0.75f)) // Drops 75% of the time
                                .with(ItemEntry.builder(ModFoodComponents.PINEAPPLE))
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                        tableBuilder.pool(poolBuilder.build());
                    }

                });
    }
}
