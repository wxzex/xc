/*
 * LiquidBounce Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/CCBlueX/LiquidBounce/
 */
package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.ui.client.hud.designer.GuiHudDesigner

object HudDesigner : Module("HudDesigner", ModuleCategory.RENDER, canBeEnabled = false) {

    private var gui: GuiHudDesigner? = null
    private fun getGUI(): GuiHudDesigner {
        if (gui == null)
            gui = GuiHudDesigner()
        return gui!!
    }
    override fun onEnable() {
        state = false
        mc.displayGuiScreen(getGUI())
    }
}