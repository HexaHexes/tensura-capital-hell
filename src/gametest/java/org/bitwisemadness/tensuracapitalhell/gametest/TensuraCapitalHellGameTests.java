package org.bitwisemadness.tensuracapitalhell.gametest;

import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.neoforged.neoforge.gametest.GameTestHolder;
import net.neoforged.neoforge.gametest.PrefixGameTestTemplate;
import org.bitwisemadness.tensuracapitalhell.TensuraCapitalHell;

/** Smoke test: the mod loads and the gametest harness runs. */
@GameTestHolder(TensuraCapitalHell.MOD_ID)
@PrefixGameTestTemplate(false)
public final class TensuraCapitalHellGameTests {

    private TensuraCapitalHellGameTests() {
    }

    @GameTest(template = "empty")
    public static void mod_loads(GameTestHelper helper) {
        helper.succeed();
    }
}