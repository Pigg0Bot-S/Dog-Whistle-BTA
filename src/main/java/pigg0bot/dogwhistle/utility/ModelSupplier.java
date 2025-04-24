package pigg0bot.dogwhistle.utility;

import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.core.item.Item;

import java.util.function.Supplier;

public class ModelSupplier implements Supplier<Supplier<ItemModel>> {
	public Item item;
	public Supplier<ItemModel> model;

	public ModelSupplier(Item item, Supplier<ItemModel> model) {
		this.model = model;
	}

	ModelSupplier(Item item, String icon_key) {
		this(item, ModelBuilder.BuildTool(item, icon_key));
	}

	ModelSupplier(Item item) {
		this(item, ModelBuilder.BuildTool(item));
	}

	public Supplier<ItemModel> get() {
		return this.model;
	}
}
