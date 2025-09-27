package game;

import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class423 {
   @ObfuscatedName("jx")
   static boolean field5058;
   @ObfuscatedName("ap")
   final HashMap field5061 = new HashMap();
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lrw;"
   )
   class449 field5055 = new class449(0, 0);
   @ObfuscatedName("ao")
   int[] field5056 = new int[2048];
   @ObfuscatedName("as")
   int[] field5052 = new int[2048];
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1851857603
   )
   int field5051 = 0;

   public class423() {
      class68.method2165();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "984165337"
   )
   void method8539(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = class389.method8216(0.0D, (double)((float)var1 / 3.0F), var1);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var9 + var8 * var2] = (int)(256.0D * (var3[var9] * var3[var8] / var4));
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      class605 var11 = new class605(var6, var2, var2);
      this.field5061.put(var1, var11);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)Lxt;",
      garbageValue = "67"
   )
   class605 method8540(int var1) {
      if (!this.field5061.containsKey(var1)) {
         this.method8539(var1);
      }

      return (class605)this.field5061.get(var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-174112304"
   )
   public final void method8548(int var1, int var2) {
      if (this.field5051 < this.field5056.length) {
         this.field5056[this.field5051] = var1;
         this.field5052[this.field5051] = var2;
         ++this.field5051;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-45"
   )
   public final void method8538() {
      this.field5051 = 0;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IILxt;FB)V",
      garbageValue = "-55"
   )
   public final void method8543(int var1, int var2, class605 var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      class605 var6 = this.method8540(var5);
      int var7 = var5 * 2 + 1;
      class449 var8 = new class449(0, 0, var3.field6019, var3.field6020);
      class449 var9 = new class449(0, 0);
      this.field5055.method8943(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field5051; ++var10) {
         var11 = this.field5056[var10];
         var12 = this.field5052[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.field6020 - (float)(var12 - var2) * var4) - var5;
         this.field5055.method8942(var13, var14);
         this.field5055.method8945(var8, var9);
         this.method8544(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.field6018.length; ++var10) {
         if (var3.field6018[var10] == 0) {
            var3.field6018[var10] = -16777216;
         } else {
            var11 = (var3.field6018[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.field6018[var10] = -16777216;
            } else {
               if (var11 > class464.field5243.length) {
                  var11 = class464.field5243.length;
               }

               var12 = class464.field5243[var11 - 1];
               var3.field6018[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lxt;Lxt;Lrw;B)V",
      garbageValue = "-83"
   )
   void method8544(class605 var1, class605 var2, class449 var3) {
      if (var3.field5162 != 0 && var3.field5163 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.field5160 == 0) {
            var4 = var1.field6019 - var3.field5162;
         }

         if (var3.field5159 == 0) {
            var5 = var1.field6020 - var3.field5163;
         }

         int var6 = var4 + var5 * var1.field6019;
         int var7 = var3.field5160 + var2.field6019 * var3.field5159;

         for(int var8 = 0; var8 < var3.field5163; ++var8) {
            for(int var9 = 0; var9 < var3.field5162; ++var9) {
               int[] var10000 = var2.field6018;
               int var10001 = var7++;
               var10000[var10001] += var1.field6018[var6++];
            }

            var6 += var1.field6019 - var3.field5162;
            var7 += var2.field6019 - var3.field5162;
         }

      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "([IB)Lti;",
      garbageValue = "-37"
   )
   public static class519 method8555(int[] var0) {
      class519 var1 = new class519(class574.field5820, true);
      var1.field5505 = var0;
      var1.field5502 = var0.length * -698619497;
      var1.field5503 = var0.length;
      return var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-1289018762"
   )
   static void method8556(int var0, String var1) {
      class52.field730 = var1;
      class52.field733 = var0;
   }

   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
      garbageValue = "65871715"
   )
   static final int method8546(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
      if (client.field521) {
         return -1;
      } else {
         return !class45.method1591(var8, var2) ? -1 : client.field522.method11879(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }
}
