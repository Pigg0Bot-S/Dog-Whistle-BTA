package pigg0bot.dogwhistle.models;

import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.core.item.Item;

public class ToolModelStandard extends ItemModelStandard {

	ToolModelStandard(Item item, String namespace) {
		super(item, namespace);

		rotateWhenRendering = true;
		bFull3D = true;
	}
}
