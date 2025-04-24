package pigg0bot.dogwhistle;

import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.core.item.Item;
import pigg0bot.dogwhistle.item.ItemDogWhistle;
import pigg0bot.dogwhistle.utility.ModelBuilder;
import pigg0bot.dogwhistle.utility.ModelSupplier;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.ItemInitEntrypoint;

import java.util.function.Supplier;

import static pigg0bot.dogwhistle.DogWhistle.MOD_ID;

public class DWItems implements ItemInitEntrypoint {

	static int startingItemId = 24000;


	// Static Items Start
	static ItemDogWhistle DOG_WHISTLE;
	// Static Items End

	@Override
	public void afterItemInit() {
		DOG_WHISTLE = makeItem(new ItemDogWhistle("dog.whistle", getNamespaceName("dog_whistle"), startingItemId++), ModelBuilder.BuildItem());

	}

	public static Item makeItem(Item item, Supplier<ItemModel> model) {

		DWModels.add(new ModelSupplier(item, model));
		return constructItem(item);
	}

	public static Item makeItem(Item item) {

		DWModels.add(new ModelSupplier(item, ModelBuilder.BuildItem(item)));
		return constructItem(item);
	}

	public static Item makeItem(String item_id, Supplier<ItemModel> model) {

		Item new_item = new Item(item_id.replace("_", "."), getNamespaceName(item_id), startingItemId++);

        return makeItem(new_item, model);
	}

	public static Item makeItem(String item_id) {

		Item new_item = new Item(item_id.replace("_", "."), getNamespaceName(item_id), startingItemId++);

		return makeItem(new_item);
	}



	private static Item constructItem(Item item) {
		return new ItemBuilder(MOD_ID).build(item);
	}

	private static String getNamespaceName(String item_id) {
		return String.format("%s:item/%s", MOD_ID, item_id);
	}
}
