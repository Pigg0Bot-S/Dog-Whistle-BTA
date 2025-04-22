package pigg0bot.dogwhistle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pigg0bot.dogwhistle.utility.ModelBuilder;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.util.ItemInitEntrypoint;
import turniplabs.halplibe.util.ModelEntrypoint;


import java.util.function.Supplier;


public class DogWhistle implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint, ItemInitEntrypoint, ModelEntrypoint {
    public static final String MOD_ID = "dogwhistle";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Item dogWhistle;
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






	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void afterItemInit() {
		int startingItemId = 24000;

		dogWhistle = new ItemBuilder(MOD_ID)
			.build(new Item("dog.whistle", String.format("%s:item/%s", MOD_ID, "dog_whistle"), startingItemId++));
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		ModelHelper.setItemModel(dogWhistle, ModelBuilder.BuildTool(dogWhistle));
	}

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
