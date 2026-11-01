package org.bitwisemadness.tensuracapitalhell;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * The Hell capital - an obsidian bastion in Tensura's underworld. - Humans, Elves, Dwarves.
 *
 * <p>The cities ship as bundled datapack content ({@code data/} in this jar)
 * and register themselves into the central capital tags owned by the
 * {@code tensura_faction_spawn} mod, which handles arrival and placement. This
 * mod adds no runtime behaviour of its own yet; it exists so the capitals
 * install like any mod and version with the rest of the ecosystem.</p>
 */
@Mod(TensuraCapitalHell.MOD_ID)
public final class TensuraCapitalHell {

    public static final String MOD_ID = "tensura_capital_hell";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TensuraCapitalHell(IEventBus modBus) {
        LOGGER.info("Tensura Capital: Hell initialized");
    }
}
