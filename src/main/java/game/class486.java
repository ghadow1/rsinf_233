package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public class class486 {
   @ObfuscatedName("af")
   final int[] field5347;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -2036941375
   )
   int field5346;

   public class486(int var1) {
      this.field5347 = new int[var1];
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "736905991"
   )
   public void method9798(int var1) {
      this.field5347[++this.field5346 - 1] = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "68"
   )
   public int method9787(int var1) {
      return this.field5347[var1];
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "4"
   )
   public int method9790() {
      return this.field5346;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-397086878"
   )
   public void method9793() {
      this.field5346 = 0;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "814224388"
   )
   static int method9789(int var0, class55 var1, boolean var2) {
      if (var0 == 3800) {
         if (class483.field5333 != null) {
            class46.field659[++class124.field1569 - 1] = 1;
            class234.field2805 = class483.field5333;
         } else {
            class46.field659[++class124.field1569 - 1] = 0;
         }

         return 1;
      } else {
         int var3;
         if (var0 == 3801) {
            var3 = class46.field659[--class124.field1569];
            if (client.field365[var3] != null) {
               class46.field659[++class124.field1569 - 1] = 1;
               class234.field2805 = client.field365[var3];
            } else {
               class46.field659[++class124.field1569 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            class46.field660[++class46.field658 - 1] = class234.field2805.field1860;
            return 1;
         } else if (var0 == 3803) {
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1847 ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1850;
            return 1;
         } else if (var0 == 3805) {
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1846;
            return 1;
         } else if (var0 == 3806) {
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1852;
            return 1;
         } else if (var0 == 3807) {
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1853;
            return 1;
         } else if (var0 == 3809) {
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1854;
            return 1;
         } else if (var0 == 3810) {
            var3 = class46.field659[--class124.field1569];
            class46.field660[++class46.field658 - 1] = class234.field2805.field1864[var3];
            return 1;
         } else if (var0 == 3811) {
            var3 = class46.field659[--class124.field1569];
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1856[var3];
            return 1;
         } else if (var0 == 3812) {
            class46.field659[++class124.field1569 - 1] = class234.field2805.field1862;
            return 1;
         } else if (var0 == 3813) {
            var3 = class46.field659[--class124.field1569];
            class46.field660[++class46.field658 - 1] = class234.field2805.field1866[var3];
            return 1;
         } else {
            int var5;
            int var6;
            if (var0 == 3814) {
               class124.field1569 -= 3;
               var3 = class46.field659[class124.field1569];
               var6 = class46.field659[class124.field1569 + 1];
               var5 = class46.field659[class124.field1569 + 2];
               class46.field659[++class124.field1569 - 1] = class234.field2805.method3943(var3, var6, var5);
               return 1;
            } else if (var0 == 3815) {
               class46.field659[++class124.field1569 - 1] = class234.field2805.field1865;
               return 1;
            } else if (var0 == 3816) {
               class46.field659[++class124.field1569 - 1] = class234.field2805.field1861;
               return 1;
            } else if (var0 == 3817) {
               class46.field659[++class124.field1569 - 1] = class234.field2805.method3921((String)class46.field660[--class46.field658]);
               return 1;
            } else if (var0 == 3818) {
               class46.field659[class124.field1569 - 1] = class234.field2805.method3920()[class46.field659[class124.field1569 - 1]];
               return 1;
            } else if (var0 == 3819) {
               class124.field1569 -= 2;
               var3 = class46.field659[class124.field1569];
               var6 = class46.field659[class124.field1569 + 1];
               class384.method8188(var6, var3);
               return 1;
            } else if (var0 == 3820) {
               var3 = class46.field659[--class124.field1569];
               class46.field659[++class124.field1569 - 1] = class234.field2805.field1858[var3];
               return 1;
            } else {
               if (var0 == 3821) {
                  class124.field1569 -= 3;
                  var3 = class46.field659[class124.field1569];
                  boolean var4 = class46.field659[class124.field1569 + 1] == 1;
                  var5 = class46.field659[class124.field1569 + 2];
                  class514.method10263(var5, var3, var4);
               }

               if (var0 == 3822) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field659[++class124.field1569 - 1] = class234.field2805.field1859[var3] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (class86.field1229 != null) {
                     class46.field659[++class124.field1569 - 1] = 1;
                     class161.field1834 = class86.field1229;
                  } else {
                     class46.field659[++class124.field1569 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var3 = class46.field659[--class124.field1569];
                  if (client.field582[var3] != null) {
                     class46.field659[++class124.field1569 - 1] = 1;
                     class161.field1834 = client.field582[var3];
                     class161.field1836 = var3;
                  } else {
                     class46.field659[++class124.field1569 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  class46.field660[++class46.field658 - 1] = class161.field1834.field1919;
                  return 1;
               } else if (var0 == 3853) {
                  class46.field659[++class124.field1569 - 1] = class161.field1834.field1921;
                  return 1;
               } else if (var0 == 3854) {
                  class46.field659[++class124.field1569 - 1] = class161.field1834.field1917;
                  return 1;
               } else if (var0 == 3855) {
                  class46.field659[++class124.field1569 - 1] = class161.field1834.method4076();
                  return 1;
               } else if (var0 == 3856) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field660[++class46.field658 - 1] = ((class153)class161.field1834.field1918.get(var3)).field1779.method11909();
                  return 1;
               } else if (var0 == 3857) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field659[++class124.field1569 - 1] = ((class153)class161.field1834.field1918.get(var3)).field1782;
                  return 1;
               } else if (var0 == 3858) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field659[++class124.field1569 - 1] = ((class153)class161.field1834.field1918.get(var3)).field1781;
                  return 1;
               } else if (var0 == 3859) {
                  var3 = class46.field659[--class124.field1569];
                  class90.method2915(class161.field1836, var3);
                  return 1;
               } else if (var0 == 3860) {
                  class46.field659[++class124.field1569 - 1] = class161.field1834.method4070((String)class46.field660[--class46.field658]);
                  return 1;
               } else if (var0 == 3861) {
                  class46.field659[class124.field1569 - 1] = class161.field1834.method4071()[class46.field659[class124.field1569 - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  class46.field659[++class124.field1569 - 1] = class256.field3085 != null ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
