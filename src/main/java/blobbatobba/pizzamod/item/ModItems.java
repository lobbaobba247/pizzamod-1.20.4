package blobbatobba.pizzamod.item;

import blobbatobba.pizzamod.PizzaMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PizzaMod.MOD_ID, name), item);
    }
}
