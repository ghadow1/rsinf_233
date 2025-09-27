package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class210 extends class540 {
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field2287;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2290 = new class320(64);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2285 = new class320(64);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2286 = new class320(20);
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -2075450699
   )
   int field2281 = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 256683899
   )
   public int field2288 = 16777215;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1460626681
   )
   public int field2289 = 70;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1651468983
   )
   int field2283 = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1418220271
   )
   int field2291 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -905144213
   )
   int field2299 = -1;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -111835173
   )
   int field2293 = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -436954871
   )
   public int field2294 = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 136591669
   )
   public int field2295 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 502684291
   )
   public int field2292 = -1;
   @ObfuscatedName("ab")
   String field2280 = "";
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -872611611
   )
   public int field2298 = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1561837897
   )
   public int field2297 = 0;
   @ObfuscatedName("aj")
   public int[] field2300;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -213573149
   )
   int field2301 = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 929416189
   )
   int field2284 = -1;

   class210() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;B)V",
      garbageValue = "8"
   )
   void method4569(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4570(var1, var2);
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "-20"
   )
   void method4570(Buffer var1, int var2) {
      if (var2 == 1) {
         this.field2281 = var1.method11222();
      } else if (var2 == 2) {
         this.field2288 = var1.method11278();
      } else if (var2 == 3) {
         this.field2283 = var1.method11222();
      } else if (var2 == 4) {
         this.field2299 = var1.method11222();
      } else if (var2 == 5) {
         this.field2291 = var1.method11222();
      } else if (var2 == 6) {
         this.field2293 = var1.method11222();
      } else if (var2 == 7) {
         this.field2294 = var1.method11452();
      } else if (var2 == 8) {
         this.field2280 = var1.method11361();
      } else if (var2 == 9) {
         this.field2289 = var1.readUnsignedShort();
      } else if (var2 == 10) {
         this.field2295 = var1.method11452();
      } else if (var2 == 11) {
         this.field2292 = 0;
      } else if (var2 == 12) {
         this.field2298 = var1.method11196();
      } else if (var2 == 13) {
         this.field2297 = var1.method11452();
      } else if (var2 == 14) {
         this.field2292 = var1.readUnsignedShort();
      } else if (var2 == 17 || var2 == 18) {
         this.field2301 = var1.readUnsignedShort();
         if (this.field2301 == 65535) {
            this.field2301 = -1;
         }

         this.field2284 = var1.readUnsignedShort();
         if (this.field2284 == 65535) {
            this.field2284 = -1;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.readUnsignedShort();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.method11196();
         this.field2300 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field2300[var5] = var1.readUnsignedShort();
            if (this.field2300[var5] == 65535) {
               this.field2300[var5] = -1;
            }
         }

         this.field2300[var4 + 1] = var3;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Lia;",
      garbageValue = "-1126964426"
   )
   public final class210 method4584() {
      int var1 = -1;
      if (this.field2301 != -1) {
         var1 = class281.method6324(this.field2301);
      } else if (this.field2284 != -1) {
         var1 = class355.field4022[this.field2284];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field2300.length - 1) {
         var2 = this.field2300[var1];
      } else {
         var2 = this.field2300[this.field2300.length - 1];
      }

      return var2 != -1 ? class338.method7103(var2) : null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "41"
   )
   public String method4568(int var1) {
      String var2 = this.field2280;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + class252.method5793(var1, false) + var2.substring(var3 + 2);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Lxt;",
      garbageValue = "386355205"
   )
   public class605 method4573() {
      if (this.field2283 < 0) {
         return null;
      } else {
         class605 var1 = (class605)field2285.method7018((long)this.field2283);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class100.method3145(field2287, this.field2283, 0);
            if (var1 != null) {
               field2285.method7009(var1, (long)this.field2283);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Lxt;",
      garbageValue = "2129741770"
   )
   public class605 method4574() {
      if (this.field2291 < 0) {
         return null;
      } else {
         class605 var1 = (class605)field2285.method7018((long)this.field2291);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class100.method3145(field2287, this.field2291, 0);
            if (var1 != null) {
               field2285.method7009(var1, (long)this.field2291);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Lxt;",
      garbageValue = "-85"
   )
   public class605 method4575() {
      if (this.field2299 < 0) {
         return null;
      } else {
         class605 var1 = (class605)field2285.method7018((long)this.field2299);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class100.method3145(field2287, this.field2299, 0);
            if (var1 != null) {
               field2285.method7009(var1, (long)this.field2299);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lxt;",
      garbageValue = "1771498025"
   )
   public class605 method4576() {
      if (this.field2293 < 0) {
         return null;
      } else {
         class605 var1 = (class605)field2285.method7018((long)this.field2293);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class100.method3145(field2287, this.field2293, 0);
            if (var1 != null) {
               field2285.method7009(var1, (long)this.field2293);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)Lrv;",
      garbageValue = "1"
   )
   public class461 method4577() {
      if (this.field2281 == -1) {
         return null;
      } else {
         class461 var1 = (class461)field2286.method7018((long)this.field2281);
         if (var1 != null) {
            return var1;
         } else {
            class412 var3 = field2287;
            class412 var4 = class90.field1280;
            int var5 = this.field2281;
            class461 var2;
            if (!class587.method11132(var3, var5, 0)) {
               var2 = null;
            } else {
               byte[] var7 = var4.method8335(var5, 0);
               class461 var6;
               if (var7 == null) {
                  var6 = null;
               } else {
                  class461 var8 = new class461(var7, class149.field1763, class191.field2082, class255.field3068, class497.field5390, class504.field5414, class7.field25);
                  class388.method8205();
                  var6 = var8;
               }

               var2 = var6;
            }

            if (var2 != null) {
               field2286.method7009(var2, (long)this.field2281);
            }

            return var2;
         }
      }
   }
}
