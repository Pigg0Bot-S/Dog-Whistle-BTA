package pigg0bot.dogwhistle;

import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.core.item.Item;
import pigg0bot.dogwhistle.item.ItemDogWhistle;
import pigg0bot.dogwhistle.modelproviders.ItemModelProvider;
import pigg0bot.dogwhistle.modelproviders.ToolModelProvider;
import pigg0bot.dogwhistle.utility.ModelBuilder;
import pigg0bot.dogwhistle.utility.ModelProvider;
import pigg0bot.dogwhistle.utility.ModelSupplier;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.ItemInitEntrypoint;

import java.util.function.Supplier;

import static pigg0bot.dogwhistle.DogWhistle.MOD_ID;

public class DWItems implements ItemInitEntrypoint {


	public enum ItemTypes {
		STANDARD(new ItemModelProvider()),
		TOOL(new ToolModelProvider());


		public final ModelProvider providerBase;
		ItemTypes(ModelProvider providerBase) {
			this.providerBase = providerBase;
		}
	}

	static int startingItemId = 24000;


	// Static Items Start
	static Item DOG_WHISTLE;
	// Static Items End

	@Override
	public void afterItemInit() {
		DOG_WHISTLE = makeItem(new ItemDogWhistle("dog.whistle", getNamespaceName("dog_whistle"), startingItemId++, 127), ItemTypes.STANDARD.providerBase);

	}

	public static Item makeItem(Item item, ModelProvider modelProvider) {

		DWModels.add(new ModelSupplier(item, ModelBuilder.BuildItem(item, modelProvider)));
		return constructItem(item);
	}

	public static Item makeItem(Item item) {

		DWModels.add(new ModelSupplier(item, ModelBuilder.BuildItem(item, ItemTypes.STANDARD.providerBase)));
		return constructItem(item);
	}

	public static Item makeItem(String item_id, ModelProvider modelProvider) {

		Item new_item = new Item(item_id.replace("_", "."), getNamespaceName(item_id), startingItemId++);

        return makeItem(new_item, modelProvider);
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
