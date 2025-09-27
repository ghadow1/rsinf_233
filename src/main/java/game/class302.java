package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
public class class302 {
   @ObfuscatedName("mk")
   @ObfuscatedGetter(
      intValue = 2107040277
   )
   static int field3460;
   @ObfuscatedName("af")
   String field3458;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1305762797
   )
   int field3456;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1015778207
   )
   int field3459;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   class286 field3457;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IILlf;)V"
   )
   class302(String var1, int var2, int var3, class286 var4) {
      this.field3458 = var1;
      this.field3456 = var2;
      this.field3459 = var3;
      this.field3457 = var4;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1806323724"
   )
   static int method6828(int var0, class55 var1, boolean var2) {
      boolean var3 = true;
      class369 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class119.field1554.method7476(class46.field659[--class124.field1569]);
         var3 = false;
      } else {
         var4 = var2 ? class19.field81 : class141.field1714;
      }

      int var11;
      if (var0 == 1300) {
         var11 = class46.field659[--class124.field1569] - 1;
         if (var11 >= 0 && var11 < 32) {
            var4.method7953(var11, (String)class46.field660[--class46.field658]);
            return 1;
         } else {
            --class46.field658;
            return 1;
         }
      } else {
         int var6;
         if (var0 == 1301) {
            class124.field1569 -= 2;
            var11 = class46.field659[class124.field1569];
            var6 = class46.field659[class124.field1569 + 1];
            var4.field4231 = class119.field1554.method7477(var11, var6);
            return 1;
         } else if (var0 == 1302) {
            var4.field4234 = class46.field659[--class124.field1569] == 1;
            return 1;
         } else if (var0 == 1303) {
            var4.field4232 = class46.field659[--class124.field1569];
            return 1;
         } else if (var0 == 1304) {
            var4.field4285 = class46.field659[--class124.field1569];
            return 1;
         } else if (var0 == 1305) {
            var4.field4227 = (String)class46.field660[--class46.field658];
            return 1;
         } else if (var0 == 1306) {
            var4.field4169 = (String)class46.field660[--class46.field658];
            return 1;
         } else if (var0 == 1307) {
            var4.field4225 = null;
            var4.field4229 = null;
            return 1;
         } else if (var0 == 1308) {
            var4.field4148 = class46.field659[--class124.field1569] == 1;
            return 1;
         } else if (var0 == 1309) {
            --class124.field1569;
            return 1;
         } else if (var0 == 1310) {
            var11 = class46.field659[--class124.field1569] - 1;
            if (var11 >= 0 && var11 <= 9 && var4.field4229 != null) {
               var4.field4229[var11] = null;
               return 1;
            } else {
               return 1;
            }
         } else if (var0 == 1311) {
            var11 = class46.field659[--class124.field1569] - 1;
            var6 = class46.field659[--class124.field1569] - 1;
            if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
               var4.method7947(var6, var11, (String)class46.field660[--class46.field658]);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 1312) {
            var11 = class46.field659[--class124.field1569];
            if (var11 == -1) {
               var4.field4230 = 1195639676;
            } else if (var11 >= 1 && var11 <= 32) {
               var4.field4230 = (var11 - 1) * 1372651743;
            }

            return 1;
         } else {
            int var7;
            byte[] var8;
            if (var0 != 1350) {
               byte var5;
               if (var0 == 1351) {
                  class124.field1569 -= 2;
                  var5 = 10;
                  var8 = new byte[]{(byte)class46.field659[class124.field1569]};
                  byte[] var9 = new byte[]{(byte)class46.field659[class124.field1569 + 1]};
                  class192.method4315(var4, var5, var8, var9);
                  return 1;
               } else if (var0 == 1352) {
                  class124.field1569 -= 3;
                  var11 = class46.field659[class124.field1569] - 1;
                  var6 = class46.field659[class124.field1569 + 1];
                  var7 = class46.field659[class124.field1569 + 2];
                  if (var11 >= 0 && var11 <= 9) {
                     class154.method3847(var4, var11, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var5 = 10;
                  var6 = class46.field659[--class124.field1569];
                  var7 = class46.field659[--class124.field1569];
                  class154.method3847(var4, var5, var6, var7);
                  return 1;
               } else if (var0 == 1354) {
                  --class124.field1569;
                  var11 = class46.field659[class124.field1569] - 1;
                  if (var11 >= 0 && var11 <= 9) {
                     class492.method9861(var4, var11);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var5 = 10;
                  class492.method9861(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var10 = null;
               var8 = null;
               if (var3) {
                  class124.field1569 -= 10;

                  for(var7 = 0; var7 < 10 && class46.field659[var7 + class124.field1569] >= 0; var7 += 2) {
                  }

                  if (var7 > 0) {
                     var10 = new byte[var7 / 2];
                     var8 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var10[var7 / 2] = (byte)class46.field659[var7 + class124.field1569];
                        var8[var7 / 2] = (byte)class46.field659[var7 + class124.field1569 + 1];
                     }
                  }
               } else {
                  class124.field1569 -= 2;
                  var10 = new byte[]{(byte)class46.field659[class124.field1569]};
                  var8 = new byte[]{(byte)class46.field659[class124.field1569 + 1]};
               }

               var7 = class46.field659[--class124.field1569] - 1;
               if (var7 >= 0 && var7 <= 9) {
                  class192.method4315(var4, var7, var10, var8);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-87"
   )
   static final void method6829(int var0, int var1, int var2) {
      if (class187.field2052 < var0) {
         class187.field2052 = (var0 - class187.field2052) * class282.field3290 / 1000 + class187.field2052 + class265.field3150;
         if (class187.field2052 > var0) {
            class187.field2052 = var0;
         }
      }

      if (class187.field2052 > var0) {
         class187.field2052 -= (class187.field2052 - var0) * class282.field3290 / 1000 + class265.field3150;
         if (class187.field2052 < var0) {
            class187.field2052 = var0;
         }
      }

      if (class174.field1940 < var1) {
         class174.field1940 = (var1 - class174.field1940) * class282.field3290 / 1000 + class174.field1940 + class265.field3150;
         if (class174.field1940 > var1) {
            class174.field1940 = var1;
         }
      }

      if (class174.field1940 > var1) {
         class174.field1940 -= (class174.field1940 - var1) * class282.field3290 / 1000 + class265.field3150;
         if (class174.field1940 < var1) {
            class174.field1940 = var1;
         }
      }

      if (class10.field46 < var2) {
         class10.field46 = (var2 - class10.field46) * class282.field3290 / 1000 + class10.field46 + class265.field3150;
         if (class10.field46 > var2) {
            class10.field46 = var2;
         }
      }

      if (class10.field46 > var2) {
         class10.field46 -= (class10.field46 - var2) * class282.field3290 / 1000 + class265.field3150;
         if (class10.field46 < var2) {
            class10.field46 = var2;
         }
      }

   }
}
