package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public enum class84 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1214(0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1211(1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1212(2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1213(3),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ldp;"
   )
   field1216(4);

   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1418971993
   )
   final int field1219;

   class84(int var3) {
      this.field1219 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field1219;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-91"
   )
   public static void method2799() {
      class199.field2174.method7011();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lis;",
      garbageValue = "652149108"
   )
   public static class213 method2800(int var0) {
      class213 var1 = (class213)class213.field2379.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class142.field1720.method8335(10, var0);
         var1 = new class213();
         var1.field2383 = var0;
         if (var2 != null) {
            var1.method4655(new class590(var2));
         }

         var1.method4654();
         if (var1.field2409 != -1) {
            var1.method4657(method2800(var1.field2409), method2800(var1.field2408));
         }

         if (var1.field2429 != -1) {
            var1.method4658(method2800(var1.field2429), method2800(var1.field2419));
         }

         if (var1.field2422 != -1) {
            var1.method4661(method2800(var1.field2422), method2800(var1.field2395));
         }

         if (!class303.field3465 && var1.field2402) {
            if (var1.field2409 == -1 && var1.field2429 == -1 && var1.field2422 == -1) {
               var1.field2428 = var1.field2428 + " (Members)";
            }

            var1.field2386 = "Login to a members' server to use this object.";
            var1.field2418 = false;

            int var3;
            for(var3 = 0; var3 < var1.field2403.length; ++var3) {
               var1.field2403[var3] = null;
            }

            for(var3 = 0; var3 < var1.field2396.length; ++var3) {
               if (var3 != 4) {
                  if (var1.field2420 != null) {
                     var1.field2420[var3] = null;
                  }

                  var1.field2396[var3] = null;
               }
            }

            var1.field2391 = -2;
            var1.field2415 = 0;
            if (var1.field2417 != null) {
               boolean var6 = false;

               for(class544 var4 = var1.field2417.method8601(); var4 != null; var4 = var1.field2417.method8592()) {
                  class208 var5 = class97.method3080((int)var4.field5600);
                  if (var5.field2274) {
                     var4.vmethod10557();
                  } else {
                     var6 = true;
                  }
               }

               if (!var6) {
                  var1.field2417 = null;
               }
            }
         }

         class213.field2379.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("od")
   @ObfuscatedSignature(
      descriptor = "(IIIILxt;Lnq;I)V",
      garbageValue = "565339939"
   )
   static final void method2798(int var0, int var1, int var2, int var3, class605 var4, class354 var5) {
      if (var4 != null) {
         int var6 = client.field424 & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = class225.field2637[var6];
            int var9 = class225.field2636[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               var4.method11742(var10 + var5.field4019 / 2 - var4.field6022 / 2, var5.field4020 / 2 - var11 - var4.field6024 / 2, var0, var1, var5.field4019, var5.field4020, var5.field4017, var5.field4018);
            } else {
               var4.method11705(var0 + var10 + var5.field4019 / 2 - var4.field6022 / 2, var5.field4020 / 2 + var1 - var11 - var4.field6024 / 2);
            }

         }
      }
   }
}
