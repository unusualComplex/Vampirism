package me.uc.vampirism;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("vampirism")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "vamp",
		name = "Vampirism",
		description = "You can now become a creature of the night."
	)
	default String information()
	{
		return "You can now become a creature of the night.";
	}
}
