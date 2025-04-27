package pigg0bot.dogwhistle.utility;

import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ModelBuilder {

	public static @NotNull Supplier<ItemModel> BuildItem(Item item, String icon_key, ModelProvider modelProvider) {
		return () -> {
			ItemModelStandard tempModel = modelProvider.provide(item, null);
			tempModel.icon = TextureRegistry.getTexture(icon_key);
			return tempModel;
		};
	}

	public static @NotNull Supplier<ItemModel> BuildItem(Item item, ModelProvider modelProvider) {
		return BuildItem(item, item.namespaceID.toString(), modelProvider);
	}



//	public static @NotNull Supplier<ItemModel> BuildTool(Item item, String icon_key) {
//		if (item == null || icon_key == null) {
//			throw new IllegalArgumentException("Parameter must not be null!");
//		}
//
//		return () -> {
//			ItemModelStandard tempModel = new ItemModelStandard(item, null).setRotateWhenRendering().setFull3D();
//			tempModel.icon = TextureRegistry.getTexture(icon_key);
//			return tempModel;
//		};
//	}
//
//	public static @NotNull Supplier<ItemModel> BuildTool(Item item) {
//		return BuildTool(item, item.namespaceID.toString());
//	}



}
