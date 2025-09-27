package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
public class class479 extends class477 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field5310;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field5309;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field5311;

   @ObfuscatedSignature(
      descriptor = "(Lsi;Lpx;Lpx;Lpx;)V"
   )
   public class479(class477 var1, class412 var2, class412 var3, class412 var4) {
      super(var1);
      this.field5310 = var2;
      this.field5309 = var3;
      this.field5311 = var4;
      super.field5303 = "LoadSongTask";
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public boolean vmethod9673() {
      int var1 = 0;
      Iterator var2 = class339.field3890.iterator();

      while(true) {
         while(var2.hasNext()) {
            class351 var3 = (class351)var2.next();
            if (var3 != null && var3.field4012.field3904 > 1 && var3.field4012.method7256()) {
               this.method9659("Attempted to load patches of already loading midiplayer!");
               return true;
            }

            if (var3 != null && !var3.field4008) {
               try {
                  if (var3.field4014 != null && var3.field4007 != -1 && var3.field4004 != -1) {
                     if (var3.field4003 == null) {
                        var3.field4003 = class348.method7372(var3.field4014, var3.field4007, var3.field4004);
                        if (var3.field4003 == null) {
                           continue;
                        }
                     }

                     if (var3.field4006 == null) {
                        var3.field4006 = new class100(this.field5311, this.field5309);
                     }

                     if (var3.field4012.method7169(var3.field4003, this.field5310, var3.field4006)) {
                        ++var1;
                        var3.field4008 = true;
                        var3.field4012.method7141();
                     }
                  } else {
                     ++var1;
                  }
               } catch (Exception var5) {
                  class508.method10161((String)null, var5);
                  this.method9659(var5.getMessage());
                  return true;
               }
            } else {
               ++var1;
            }
         }

         if (var1 == class339.field3890.size()) {
            return true;
         }

         return false;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-217428198"
   )
   static int method9675(int var0, class55 var1, boolean var2) {
      int var3;
      int var6;
      int var9;
      if (var0 == 3400) {
         class124.field1569 -= 2;
         var3 = class46.field659[class124.field1569];
         var9 = class46.field659[class124.field1569 + 1];
         class190 var10 = class185.method4211(var3);
         if (var10.field2068 != 's') {
         }

         for(var6 = 0; var6 < var10.field2075; ++var6) {
            if (var9 == var10.field2072[var6]) {
               class46.field660[++class46.field658 - 1] = var10.field2074[var6];
               var10 = null;
               break;
            }
         }

         if (var10 != null) {
            class46.field660[++class46.field658 - 1] = var10.field2069;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var3 = class46.field659[--class124.field1569];
            class190 var4 = class185.method4211(var3);
            class46.field659[++class124.field1569 - 1] = var4.method4289();
            return 1;
         } else {
            return 2;
         }
      } else {
         class124.field1569 -= 4;
         var3 = class46.field659[class124.field1569];
         var9 = class46.field659[class124.field1569 + 1];
         int var5 = class46.field659[class124.field1569 + 2];
         var6 = class46.field659[class124.field1569 + 3];
         class190 var7 = class185.method4211(var5);
         if (var3 == var7.field2067 && var9 == var7.field2068) {
            for(int var8 = 0; var8 < var7.field2075; ++var8) {
               if (var6 == var7.field2072[var8]) {
                  if (var9 == 115) {
                     class46.field660[++class46.field658 - 1] = var7.field2074[var8];
                  } else {
                     class46.field659[++class124.field1569 - 1] = var7.field2073[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (var7 != null) {
               if (var9 == 115) {
                  class46.field660[++class46.field658 - 1] = var7.field2069;
               } else {
                  class46.field659[++class124.field1569 - 1] = var7.field2071;
               }
            }

            return 1;
         } else {
            if (var9 == 115) {
               class46.field660[++class46.field658 - 1] = "null";
            } else {
               class46.field659[++class124.field1569 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
