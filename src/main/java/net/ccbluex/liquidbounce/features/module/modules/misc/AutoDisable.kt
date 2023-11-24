/*
package net.ccbluex.liquidbounce.features.module.modules.misc

import net.ccbluex.liquidbounce.event.EventTarget
import net.ccbluex.liquidbounce.event.PacketEvent
import net.ccbluex.liquidbounce.event.WorldEvent
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleManager.modules
import net.ccbluex.liquidbounce.ui.client.hud.HUD
import net.ccbluex.liquidbounce.ui.client.hud.element.elements.Notification
import net.minecraft.network.play.server.S08PacketPlayerPosLook


object AutoDisable : Module("AutoDisable", ModuleCategory.MISC, canBeEnabled = false) {

    @EventTarget
    fun onPacket(event: PacketEvent) {
        if (event.packet is S08PacketPlayerPosLook) disableModules(DisableEvent.FLAG)
    }

    @EventTarget
    fun onWorld(event: WorldEvent) {
        disableModules(DisableEvent.WORLD_CHANGE)
    }


    private fun disableModules(enumDisable: DisableEvent) {
        var moduleNames = 0
        val notifications = mutableListOf<Notification>()

        modules.filter { autoDisables.contains(enumDisable) && it.state }.forEach {
            it.toggle()
            moduleNames++
            notifications.add(Notification(it.name + " has been disabled"))
        }

        if (moduleNames > 0) {
            notifications.forEach { HUD.addNotification(it) }
        }
    }

    fun handleGameEnd() {
        disableModules(DisableEvent.GAME_END)
    }

    enum class DisableEvent {
        FLAG,
        WORLD_CHANGE,
        GAME_END
    }}
*/ //TODO