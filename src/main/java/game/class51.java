package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.math.BigInteger;

@ObfuscatedName("bc")
public class class51 {
    @ObfuscatedName("af")
    static final BigInteger RSA_MODULUS = new BigInteger("129532532766201304219175902383320714430917671666768951679602973602931485378410293071336199161450386983211613247382709082722789418456748127290598903394774006751839940185553960522949296343919809136373235842010430356611137845569071774543127347383808868286053482986178279193890586460763883636858727555093584138049");
    @ObfuscatedName("aw")
    static final BigInteger RSA_EXPONENT = new BigInteger("65537");

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(IB)F",
            garbageValue = "-15"
    )
    public static float method1894(int var0) {
        var0 &= 2047;
        return (float) ((double) ((float) var0 / 2048.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("am")
    @ObfuscatedSignature(
            descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
            garbageValue = "435603815"
    )
    static void method1893(String var0, String var1, String var2) {
        class78.method2677(7);
        class66.method2147(var0, var1, var2);
    }

    @ObfuscatedName("ku")
    @ObfuscatedSignature(
            descriptor = "(IIIIIIS)V",
            garbageValue = "8081"
    )
    static void method1895(int var0, int var1, int var2, int var3, int var4, int var5) {
        class81.method2771(class484.field5343, var0, var1, var2, var3, var4, var5);
    }

    @ObfuscatedName("on")
    @ObfuscatedSignature(
            descriptor = "(IIILxt;I)V",
            garbageValue = "189896629"
    )
    static void method1892(int var0, int var1, int var2, class605 var3) {
        int var4 = var2 * 128;
        var4 += client.field424;
        var4 &= 2047;
        byte var5 = 30;
        int var6 = var0 - (int) (class215.method4817(var4) * (double) var5);
        int var10 = class536.field5571[var4 & 2047];
        double var8 = (double) var10 / 65536.0D;
        var10 = var1 + (int) ((double) var5 * var8);
        int var11 = Math.max(var3.field6019, var3.field6020);
        int var12 = var11 / 2;
        var3.method11727(var6 - var12, var10 - var12, var3.field6019, var3.field6020, var3.field6019 / 2, var3.field6020 / 2, (double) method1894(var4), 256);
    }
}
