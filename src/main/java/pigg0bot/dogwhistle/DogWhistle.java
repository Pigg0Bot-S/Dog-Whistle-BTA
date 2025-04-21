package pigg0bot.dogwhistle;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class DogWhistle implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "dogwhistle";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("DogWhistle initialized.");
    }

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {
		int startingItemId = 24000;

		Item dogWhistle = new ItemBuilder(MOD_ID)
			.setIcon("dogwhistle:item/dog_whistle")
			.build(new Item("dog.whistle", String.format("%s:item/%s", MOD_ID, "dog_whistle"), startingItemId++));

	}

	@Override
	public void afterGameStart() {

	}
}
