package pigg0bot.dogwhistle.modelproviders;

import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.item.Item;
import pigg0bot.dogwhistle.utility.ModelProvider;

public class ItemModelProvider implements ModelProvider {

	@Override
	public ItemModelStandard provide(Item item, String namespace) {
		return new ItemModelStandard(item, namespace);
	}

}
