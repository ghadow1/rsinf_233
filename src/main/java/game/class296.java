package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Random;

@ObfuscatedName("lx")
public class class296 implements class309 {
    @ObfuscatedName("af")
    @ObfuscatedGetter(
            intValue = -1120940959
    )
    int field3404;
    @ObfuscatedName("aw")
    @ObfuscatedGetter(
            intValue = -1967860837
    )
    int field3403;
    @ObfuscatedName("at")
    @ObfuscatedGetter(
            intValue = 1973728303
    )
    int field3415;
    @ObfuscatedName("ac")
    @ObfuscatedGetter(
            intValue = 1261586451
    )
    int field3405;
    @ObfuscatedName("ap")
    @ObfuscatedGetter(
            intValue = 462359135
    )
    int field3406;
    @ObfuscatedName("aq")
    @ObfuscatedGetter(
            intValue = 1027011727
    )
    int field3407;
    @ObfuscatedName("ao")
    @ObfuscatedGetter(
            intValue = -1727492911
    )
    int field3402;
    @ObfuscatedName("as")
    @ObfuscatedGetter(
            intValue = -1902155725
    )
    int field3411;
    @ObfuscatedName("al")
    @ObfuscatedGetter(
            intValue = -361083091
    )
    int field3410;
    @ObfuscatedName("au")
    @ObfuscatedGetter(
            intValue = -352972105
    )
    int field3412;
    @ObfuscatedName("ai")
    @ObfuscatedGetter(
            intValue = -1033187523
    )
    int field3408;
    @ObfuscatedName("aa")
    @ObfuscatedGetter(
            intValue = -1707349133
    )
    int field3413;
    @ObfuscatedName("am")
    @ObfuscatedGetter(
            intValue = 97520505
    )
    int field3414;
    @ObfuscatedName("an")
    @ObfuscatedGetter(
            intValue = -195734985
    )
    int field3409;

    class296() {
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(FFFI)Lre;",
            garbageValue = "712802527"
    )
    public static class452 method6761(float var0, float var1, float var2) {
        synchronized (class452.field5171) {
            if (class452.field5173 == 0) {
                return new class452(var0, var1, var2);
            } else {
                class452.field5171[--class452.field5173].method8993(var0, var1, var2);
                return class452.field5171[class452.field5173];
            }
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(JLjava/lang/String;I)I",
            garbageValue = "1478591872"
    )
    static final int method6767(long var0, String var2) {
        Random var3 = new Random();
        class590 var4 = new class590(128);
        class590 var5 = new class590(128);
        int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int) (var0 >> 32), (int) var0};
        var4.writeByte(10);

        int var7;
        for (var7 = 0; var7 < 4; ++var7) {
            var4.writeIntBigEndian(var3.nextInt());
        }

        var4.writeIntBigEndian(var6[0]);
        var4.writeIntBigEndian(var6[1]);
        var4.method11182(var0);
        var4.method11182(0L);

        for (var7 = 0; var7 < 4; ++var7) {
            var4.writeIntBigEndian(var3.nextInt());
        }

        var4.enableRSA(class51.RSA_MODULUS, class51.RSA_EXPONENT);
        var5.writeByte(10);

        for (var7 = 0; var7 < 3; ++var7) {
            var5.writeIntBigEndian(var3.nextInt());
        }

        var5.method11182(var3.nextLong());
        var5.method11286(var3.nextLong());
        class19.copyArray(var5);
        var5.method11182(var3.nextLong());
        var5.enableRSA(class51.RSA_MODULUS, class51.RSA_EXPONENT);
        var7 = class288.method6418(var2);
        if (var7 % 8 != 0) {
            var7 += 8 - var7 % 8;
        }

        class590 var8 = new class590(var7);
        var8.writeNullTermString(var2);
        var8.buffer = var7 * -290410379;
        var8.method11220(var6);
        class590 var9 = new class590(var4.buffer * 1216585693 + var8.buffer * 1216585693 + var5.buffer * 1216585693 + 5);
        var9.writeByte(2);
        var9.writeByte(var4.buffer * 1216585693);
        var9.copyArray(var4.index, 0, var4.buffer * 1216585693);
        var9.writeByte(var5.buffer * 1216585693);
        var9.copyArray(var5.index, 0, var5.buffer * 1216585693);
        var9.writeShortBigEndian(var8.buffer * 1216585693);
        var9.copyArray(var8.index, 0, var8.buffer * 1216585693);
        String var10 = class162.method3992(var9.index);

        try {
            URL var11 = new URL(class214.method4756("services", false) + "m=accountappeal/login.ws");
            URLConnection var12 = var11.openConnection();
            var12.setDoInput(true);
            var12.setDoOutput(true);
            var12.setConnectTimeout(5000);
            OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
            var13.write("data2=" + class240.method5442(var10) + "&dest=" + class240.method5442("passwordchoice.ws"));
            var13.flush();
            InputStream var14 = var12.getInputStream();
            var9 = new class590(new byte[1000]);

            do {
                int var15 = var14.read(var9.index, var9.buffer * 1216585693, 1000 - var9.buffer * 1216585693);
                if (var15 == -1) {
                    var13.close();
                    var14.close();
                    String var16 = new String(var9.index);
                    if (var16.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var16.startsWith("WRONG")) {
                        return 7;
                    } else if (var16.startsWith("RELOAD")) {
                        return 3;
                    } else if (var16.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var9.method11305(var6);

                        while (var9.buffer * 1216585693 > 0 && var9.index[var9.buffer * 1216585693 - 1] == 0) {
                            var9.buffer -= -290410379;
                        }

                        var16 = new String(var9.index, 0, var9.buffer * 1216585693);
                        if (class129.method3588(var16)) {
                            class22.method330(var16, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }

                var9.buffer += -290410379 * var15;
            } while (var9.buffer * 1216585693 < 1000);

            return 5;
        } catch (Throwable var17) {
            var17.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "1342679654"
    )
    static void method6773() {
        Iterator var0 = client.field333.iterator();

        while (var0.hasNext()) {
            class79 var1 = (class79) var0.next();

            for (class72 var2 = (class72) var1.method2684().method8690(); var2 != null; var2 = (class72) var1.method2684().method8692()) {
                var2.method2252();
            }
        }

    }

    @ObfuscatedName("cv")
    @ObfuscatedSignature(
            descriptor = "(Loi;Loi;I)V",
            garbageValue = "1753580939"
    )
    static void method6771(class369 var0, class369 var1) {
        if (var0.field4147 == 0) {
            for (int var2 = var0.field4248; var2 <= var0.field4214; ++var2) {
                class369 var3 = var1.field4286[var2];
                if (var3 != null && var0.field4145 * -217986249 == var3.field4165) {
                    method6771(var3, var1);
                }
            }
        }

        var1.field4286[var0.field4145 * -217986249] = null;
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(Lll;I)V",
            garbageValue = "1896416407"
    )
    public void vmethod6913(class289 var1) {
        if (var1.field3337 > this.field3406) {
            var1.field3337 = this.field3406;
        }

        if (var1.field3335 < this.field3406) {
            var1.field3335 = this.field3406;
        }

        if (var1.field3326 > this.field3407) {
            var1.field3326 = this.field3407;
        }

        if (var1.field3336 < this.field3407) {
            var1.field3336 = this.field3407;
        }

    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(
            descriptor = "(IIII)Z",
            garbageValue = "-739948834"
    )
    public boolean vmethod6897(int var1, int var2, int var3) {
        if (var1 >= this.field3404 && var1 < this.field3403 + this.field3404) {
            return var2 >= (this.field3415 << 6) + (this.field3402 << 3) && var2 <= (this.field3415 << 6) + (this.field3410 << 3) + 7 && var3 >= (this.field3405 << 6) + (this.field3411 << 3) && var3 <= (this.field3405 << 6) + (this.field3412 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("at")
    @ObfuscatedSignature(
            descriptor = "(IIB)Z",
            garbageValue = "-51"
    )
    public boolean vmethod6896(int var1, int var2) {
        return var1 >= (this.field3406 << 6) + (this.field3408 << 3) && var1 <= (this.field3406 << 6) + (this.field3414 << 3) + 7 && var2 >= (this.field3407 << 6) + (this.field3413 << 3) && var2 <= (this.field3407 << 6) + (this.field3409 << 3) + 7;
    }

    @ObfuscatedName("ac")
    @ObfuscatedSignature(
            descriptor = "(IIII)[I",
            garbageValue = "-2061697618"
    )
    public int[] vmethod6899(int var1, int var2, int var3) {
        if (!this.vmethod6897(var1, var2, var3)) {
            return null;
        } else {
            int[] var4 = new int[]{this.field3406 * 64 - this.field3415 * 64 + var2 + (this.field3408 * 8 - this.field3402 * 8), var3 + (this.field3407 * 64 - this.field3405 * 64) + (this.field3413 * 8 - this.field3411 * 8)};
            return var4;
        }
    }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(
            descriptor = "(IIB)Lna;",
            garbageValue = "1"
    )
    public class356 vmethod6898(int var1, int var2) {
        if (!this.vmethod6896(var1, var2)) {
            return null;
        } else {
            int var3 = this.field3415 * 64 - this.field3406 * 64 + (this.field3402 * 8 - this.field3408 * 8) + var1;
            int var4 = this.field3405 * 64 - this.field3407 * 64 + var2 + (this.field3411 * 8 - this.field3413 * 8);
            return new class356(this.field3404, var3, var4);
        }
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(
            descriptor = "(Lwb;I)V",
            garbageValue = "-1979822224"
    )
    public void vmethod6901(class590 var1) {
        this.field3404 = var1.method11196();
        this.field3403 = var1.method11196();
        this.field3415 = var1.method11198();
        this.field3402 = var1.method11196();
        this.field3410 = var1.method11196();
        this.field3405 = var1.method11198();
        this.field3411 = var1.method11196();
        this.field3412 = var1.method11196();
        this.field3406 = var1.method11198();
        this.field3408 = var1.method11196();
        this.field3414 = var1.method11196();
        this.field3407 = var1.method11198();
        this.field3413 = var1.method11196();
        this.field3409 = var1.method11196();
        this.method6755();
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "2053097418"
    )
    void method6755() {
    }
}
