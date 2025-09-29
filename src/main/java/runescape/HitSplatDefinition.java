package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public class HitSplatDefinition {
    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "Luu;"
    )
    static final HitSplatDefinition field5521 = new HitSplatDefinition(1);
    @ObfuscatedName("aw")
    @ObfuscatedSignature(
            descriptor = "Luu;"
    )
    static final HitSplatDefinition field5522 = new HitSplatDefinition(3);
    @ObfuscatedName("at")
    @ObfuscatedGetter(
            intValue = -1325038255
    )
    final int field5520;

    HitSplatDefinition(int var1) {
        this.field5520 = var1;
    }

    @ObfuscatedName("ps")
    @ObfuscatedSignature(
            descriptor = "(Lbk;B)V",
            garbageValue = "28"
    )
    static void setLoginState(class43 var0) {
        System.out.println("[LOGIN STATE CHANGE] setLoginState : " + var0.getClass().getName());
        if (class333.loginState != var0) {
            class333.loginState = var0;
        }
    }
}
