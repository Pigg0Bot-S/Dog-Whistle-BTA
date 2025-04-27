package pigg0bot.dogwhistle.utility;

import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.item.Item;

public interface ModelProvider {
	ItemModelStandard provide(Item item, String namespace);
}
