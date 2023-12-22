package blobbatobba.pizzamod.util;

import blobbatobba.pizzamod.item.ModFoodComponents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(ModFoodComponents.TOMATO, 20),
                        5, 3, 0.05f)));

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 64),
                        new ItemStack(ModFoodComponents.TOMATO, 5),
                        1, 1, 200f)));

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(ModFoodComponents.BEER, 1),
                        1, 1, 0.3f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.NITWIT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(ModFoodComponents.BEER, 20),
                        5, 3, 0.05f)));
    }
}
