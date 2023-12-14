package blobbatobba.pizzamod;

import blobbatobba.pizzamod.block.ModBlocks;
import blobbatobba.pizzamod.item.ModFoodComponents;
import blobbatobba.pizzamod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzaMod implements ModInitializer {
	public static final String MOD_ID = "pizzamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModFoodComponents.registerModItems();

		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
	}
}