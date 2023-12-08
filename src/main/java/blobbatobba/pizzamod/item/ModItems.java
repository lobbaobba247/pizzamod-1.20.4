package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PizzaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PizzaMod.LOGGER.info("Registering Mod Items for "  + PizzaMod.MOD_ID);
    }
}
