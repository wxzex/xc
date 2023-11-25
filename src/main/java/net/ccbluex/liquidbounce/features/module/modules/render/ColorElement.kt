/*
 * LiquidBounce+ Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/WYSI-Foundation/LiquidBouncePlus/
 *
 * This code belongs to WYSI-Foundation. Please give credits when using this in your repository.
 */
package net.ccbluex.liquidbounce.features.module.modules.render

import net.ccbluex.liquidbounce.value.IntegerValue

class ColorElement : IntegerValue {
    constructor(counter: Int, m: Material, basis: IntegerValue) : super(
        "Color" + counter + "-" + m.colorName,
        255,
        IntRange(0, 255),
        true,
        { basis.get() > counter })

    constructor(counter: Int, m: Material) : super("Color" + counter + "-" + m.colorName, 255, 0, 255)

    override fun onChanged(oldValue: Int, newValue: Int) {
        ColorMixer.regenerateColors(true)
    }

    enum class Material(val colorName: String) {
        RED("Red"),
        GREEN("Green"),
        BLUE("Blue")

    }
}