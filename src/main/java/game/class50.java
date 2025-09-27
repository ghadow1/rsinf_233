package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class50 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1703880999
   )
   int field713;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1961044783
   )
   int field712;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -190793019
   )
   int field711;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 834359437
   )
   int field714;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -877803125
   )
   int field715;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1984162679
   )
   int field719;
   @ObfuscatedName("ao")
   String field717;
   @ObfuscatedName("as")
   String field716;
   @ObfuscatedName("al")
   boolean field720;

   class50() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lhe;",
      garbageValue = "-2011895701"
   )
   public static class206 method1890(int var0) {
      class206 var1 = (class206)class206.field2258.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class206.field2259.method8335(14, var0);
         var1 = new class206();
         if (var2 != null) {
            var1.method4501(new class590(var2));
         }

         class206.field2258.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1370636116"
   )
   static int method1891(int var0, class55 var1, boolean var2) {
      class369 var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
      if (var0 == 2600) {
         class46.field659[++class124.field1569 - 1] = var3.field4260;
         return 1;
      } else if (var0 == 2601) {
         class46.field659[++class124.field1569 - 1] = var3.field4170;
         return 1;
      } else if (var0 == 2602) {
         class46.field660[++class46.field658 - 1] = var3.field4211;
         return 1;
      } else if (var0 == 2603) {
         class46.field659[++class124.field1569 - 1] = var3.field4193;
         return 1;
      } else if (var0 == 2604) {
         class46.field659[++class124.field1569 - 1] = var3.field4172;
         return 1;
      } else if (var0 == 2605) {
         class46.field659[++class124.field1569 - 1] = var3.field4203;
         return 1;
      } else if (var0 == 2606) {
         class46.field659[++class124.field1569 - 1] = var3.field4200;
         return 1;
      } else if (var0 == 2607) {
         class46.field659[++class124.field1569 - 1] = var3.field4202;
         return 1;
      } else if (var0 == 2608) {
         class46.field659[++class124.field1569 - 1] = var3.field4235;
         return 1;
      } else if (var0 == 2609) {
         class46.field659[++class124.field1569 - 1] = var3.field4179;
         return 1;
      } else if (var0 == 2610) {
         class46.field659[++class124.field1569 - 1] = var3.field4180;
         return 1;
      } else if (var0 == 2611) {
         class46.field659[++class124.field1569 - 1] = var3.field4173;
         return 1;
      } else if (var0 == 2612) {
         class46.field659[++class124.field1569 - 1] = var3.field4174;
         return 1;
      } else if (var0 == 2613) {
         class46.field659[++class124.field1569 - 1] = var3.field4178.vmethod11658();
         return 1;
      } else if (var0 == 2614) {
         class46.field659[++class124.field1569 - 1] = var3.field4208 ? 1 : 0;
         return 1;
      } else {
         class360 var4;
         if (var0 == 2617) {
            var4 = var3.method8088();
            class46.field659[++class124.field1569 - 1] = var4 != null ? var4.field4052 : 0;
         }

         if (var0 == 2618) {
            var4 = var3.method8088();
            class46.field659[++class124.field1569 - 1] = var4 != null ? var4.field4053 : 0;
            return 1;
         } else {
            class366 var7;
            if (var0 == 2619) {
               var7 = var3.method7971();
               class46.field660[++class46.field658 - 1] = var7 != null ? var7.method7651().method9329() : "";
               return 1;
            } else if (var0 == 2620) {
               var4 = var3.method8088();
               class46.field659[++class124.field1569 - 1] = var4 != null ? var4.field4055 : 0;
               return 1;
            } else if (var0 == 2621) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7777() : 0;
               return 1;
            } else if (var0 == 2622) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7662() : 0;
               return 1;
            } else if (var0 == 2623) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7663() : 0;
               return 1;
            } else if (var0 == 2624) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null && var7.method7839() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var7 = var3.method7971();
                  class46.field660[++class46.field658 - 1] = var7 != null ? var7.method7796().method9518() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var7 = var3.method7971();
                  int var5 = var7 != null ? var7.method7857() : 0;
                  int var6 = var7 != null ? var7.method7656() : 0;
                  class46.field659[++class124.field1569 - 1] = Math.min(var5, var6);
                  class46.field659[++class124.field1569 - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 2628) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7656() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7666() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7783() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7773() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7689() : 0;
                  return 1;
               } else {
                  class28 var8;
                  if (var0 == 2633) {
                     var8 = var3.method7973();
                     class46.field659[class124.field1569 - 1] = var8 != null ? var8.method419(class46.field659[class124.field1569 - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var8 = var3.method7973();
                     class46.field659[class124.field1569 - 1] = var8 != null ? var8.method420((char)class46.field659[class124.field1569 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null && var7.method7654() ? 1 : 0;
               return 1;
            }
         }
      }
   }
}
