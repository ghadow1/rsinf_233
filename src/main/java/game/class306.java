package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
public class class306 implements class309 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1952092899
   )
   int field3480;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -860455509
   )
   int field3484;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1365363659
   )
   int field3479;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2112240261
   )
   int field3481;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1502864257
   )
   int field3487;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 2036461915
   )
   int field3482;

   class306() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lll;I)V",
      garbageValue = "1896416407"
   )
   public void vmethod6913(class289 var1) {
      if (var1.field3337 > this.field3487) {
         var1.field3337 = this.field3487;
      }

      if (var1.field3335 < this.field3487) {
         var1.field3335 = this.field3487;
      }

      if (var1.field3326 > this.field3482) {
         var1.field3326 = this.field3482;
      }

      if (var1.field3336 < this.field3482) {
         var1.field3336 = this.field3482;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-739948834"
   )
   public boolean vmethod6897(int var1, int var2, int var3) {
      if (var1 >= this.field3480 && var1 < this.field3480 + this.field3484) {
         return var2 >> 6 == this.field3479 && var3 >> 6 == this.field3481;
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
      return var1 >> 6 == this.field3487 && var2 >> 6 == this.field3482;
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
         int[] var4 = new int[]{this.field3487 * 64 - this.field3479 * 64 + var2, var3 + (this.field3482 * 64 - this.field3481 * 64)};
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
         int var3 = this.field3479 * 64 - this.field3487 * 64 + var1;
         int var4 = this.field3481 * 64 - this.field3482 * 64 + var2;
         return new class356(this.field3480, var3, var4);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-1979822224"
   )
   public void vmethod6901(class590 var1) {
      this.field3480 = var1.method11196();
      this.field3484 = var1.method11196();
      this.field3479 = var1.method11198();
      this.field3481 = var1.method11198();
      this.field3487 = var1.method11198();
      this.field3482 = var1.method11198();
      this.method6846();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2085895626"
   )
   void method6846() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1971343149"
   )
   static int method6859(int var0) {
      return class27.field129[var0];
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "114431228"
   )
   public static void method6841(byte[] var0) {
      synchronized(class482.field5317) {
         if (var0.length == 100 && class482.field5329 < class482.field5322) {
            class482.field5326[++class482.field5329 - 1] = var0;
         } else if (var0.length == 5000 && class482.field5319 < class482.field5316) {
            class482.field5327[++class482.field5319 - 1] = var0;
         } else if (var0.length == 10000 && class482.field5323 < class482.field5324) {
            class482.field5318[++class482.field5323 - 1] = var0;
         } else if (var0.length == 30000 && class482.field5321 < class482.field5325) {
            class482.field5328[++class482.field5321 - 1] = var0;
         } else {
            if (class67.field917 != null) {
               for(int var2 = 0; var2 < class482.field5330.length; ++var2) {
                  if (var0.length == class482.field5330[var2] && class476.field5295[var2] < class67.field917[var2].length) {
                     class67.field917[var2][class476.field5295[var2]++] = var0;
                     return;
                  }
               }
            }

         }
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;I)Lti;",
      garbageValue = "1808539492"
   )
   public static class519 method6858(String[] var0) {
      class519 var1 = new class519(class574.field5824, false);
      var1.field5506 = var0;
      var1.field5502 = var0.length * -698619497;
      var1.field5503 = var0.length;
      return var1;
   }

   @ObfuscatedName("lj")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-898793886"
   )
   static void method6862(int var0, String var1) {
      int var2 = client.field335.field1254;
      int[] var3 = client.field335.field1243;
      boolean var4 = false;
      class613 var5 = new class613(var1, class92.field1292);
      class79 var6 = class76.field1108.method2468();
      if (var6 == null) {
         class90.method2893(4, "", "Unable to find " + var1 + ", current world null.");
      } else {
         for(int var7 = 0; var7 < var2; ++var7) {
            class69 var8 = (class69)var6.field1169.method8567((long)var3[var7]);
            if (var8 != null && var8 != class76.field1108 && var8.field934 != null && var8.field934.equals(var5)) {
               class329 var9;
               if (var0 == 1) {
                  var9 = class130.method3593(class327.field3590, client.field314.field1308);
                  var9.field3664.method11236(var3[var7]);
                  var9.field3664.method11228(0);
                  client.field314.prepData(var9);
               } else if (var0 == 4) {
                  var9 = class130.method3593(class327.field3614, client.field314.field1308);
                  var9.field3664.writeShortBigEndian(var3[var7]);
                  var9.field3664.writeByte(0);
                  client.field314.prepData(var9);
               } else if (var0 == 6) {
                  var9 = class130.method3593(class327.field3558, client.field314.field1308);
                  var9.field3664.method11325(var3[var7]);
                  var9.field3664.writeByte(0);
                  client.field314.prepData(var9);
               } else if (var0 == 7) {
                  var9 = class130.method3593(class327.field3556, client.field314.field1308);
                  var9.field3664.writeShortBigEndian(var3[var7]);
                  var9.field3664.method11229(0);
                  client.field314.prepData(var9);
               }

               var4 = true;
               break;
            }
         }

         if (!var4) {
            class90.method2893(4, "", "Unable to find " + var1);
         }

      }
   }
}
