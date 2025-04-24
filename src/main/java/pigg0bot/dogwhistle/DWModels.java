package pigg0bot.dogwhistle;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import pigg0bot.dogwhistle.utility.ModelBuilder;
import pigg0bot.dogwhistle.utility.ModelSupplier;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import java.util.ArrayList;
import java.util.List;

public class DWModels implements ModelEntrypoint {

	public static List<ModelSupplier> itemModelQueue = new ArrayList<>();

	public static void add(ModelSupplier modelSupplier) {
		itemModelQueue.add(modelSupplier);
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		for (ModelSupplier modelSupplier : itemModelQueue) {
			ModelHelper.setItemModel(modelSupplier.item, modelSupplier.get());
		}
		itemModelQueue.clear();
//		ModelHelper.setItemModel(DWItems.DOG_WHISTLE, ModelBuilder.BuildTool(DWItems.DOG_WHISTLE));
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
