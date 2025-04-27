package pigg0bot.dogwhistle.utility;

import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.core.item.Item;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.function.Supplier;

public class ModelSupplier implements Supplier<Supplier<ItemModel>> {
	public Item item;
	public Supplier<ItemModel> model;

	public ModelSupplier(@NonNull Item item, @NonNull Supplier<ItemModel> model) {
		this.item = item;
		this.model = model;
	}
//
//	ModelSupplier(Item item, String icon_key) {
//		this(item, ModelBuilder.BuildTool(item, icon_key));
//	}
//
//	ModelSupplier(Item item) {
//		this(item, ModelBuilder.BuildTool(item));
//	}

	public Supplier<ItemModel> get() {
		return this.model;
	}
}
