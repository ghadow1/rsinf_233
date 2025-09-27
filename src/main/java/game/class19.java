package game;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class19 implements Callable {
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   static class369 field81;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = -1196551529
   )
   static int field79;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lai;"
   )
   final class10 field80;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lar;Lai;)V"
   )
   class19(class14 var1, class10 var2) {
      this.this$0 = var1;
      this.field80 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field80.method106()) {
            class164.method4001(10L);
         }
      } catch (IOException var2) {
         return new class20("Error servicing REST query: " + var2.getMessage());
      }

      return this.field80.method85();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Loe;",
      garbageValue = "-51762780"
   )
   public static class385 method299(int var0) {
      class385[] var1 = new class385[]{class385.field4409, class385.field4408, class385.field4410, class385.field4406};
      class385[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class385 var4 = var2[var3];
         if (var0 == var4.field4407) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Lcg;",
      garbageValue = "-121"
   )
   static class55 method297(int var0, int var1, int var2) {
      int var3 = class200.method4401(var1, var0);
      class55 var4 = class85.method2825(var3, var0);
      if (var4 != null) {
         return var4;
      } else {
         var3 = class329.method7048(var2, var0);
         var4 = class85.method2825(var3, var0);
         if (var4 != null) {
            return var4;
         } else {
            int var5 = var0 + -512;
            var4 = class85.method2825(var5, var0);
            return var4 != null ? var4 : null;
         }
      }
   }

   @ObfuscatedName("nh")
   @ObfuscatedSignature(
      descriptor = "(Loi;IIIB)V",
      garbageValue = "-16"
   )
   static final void method298(class369 var0, int var1, int var2, int var3) {
      class125.method3557();
      class354 var4 = var0.method8005(class119.field1554, false);
      if (var4 != null) {
         class601.method11550(var1, var2, var4.field4019 + var1, var2 + var4.field4020);
         if (client.field585 != 2 && client.field585 != 5) {
            int var5 = client.field424 & 2047;
            int var6 = client.field552 / 32 + 48;
            int var7 = 464 - client.field337 / 32;
            class245.field2992.method11713(var1, var2, var4.field4019, var4.field4020, var6, var7, var5, 256, var4.field4017, var4.field4018);

            int var8;
            int var10;
            int var16;
            for(var8 = 0; var8 < client.field577; ++var8) {
               var16 = client.field578[var8] * 4 + 2 - client.field552 / 32;
               var10 = client.field507[var8] * 4 + 2 - client.field337 / 32;
               class84.method2798(var1, var2, var16, var10, client.field580[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var16 = 0; var16 < 104; ++var16) {
                  class436 var14 = class333.field3836.field1167[class333.field3836.field1170][var8][var16];
                  if (var14 != null) {
                     var11 = var8 * 4 + 2 - client.field552 / 32;
                     var12 = var16 * 4 + 2 - client.field337 / 32;
                     class84.method2798(var1, var2, var11, var12, class200.field2185[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < class333.field3836.field1161.method9790(); ++var8) {
               class81 var9 = (class81)class333.field3836.field1160.method8567((long)class333.field3836.field1161.method9787(var8));
               if (var9 != null && var9.vmethod2740()) {
                  class195 var18 = var9.field1184;
                  if (var18 != null && var18.field2099 != null) {
                     var18 = var18.method4365();
                  }

                  if (var18 != null && var18.field2134 && var18.field2144) {
                     var11 = var9.field1055 / 32 - client.field552 / 32;
                     var12 = var9.field1056 / 32 - client.field337 / 32;
                     class84.method2798(var1, var2, var11, var12, class200.field2185[1], var4);
                  }
               }
            }

            var8 = client.field335.field1254;
            int[] var17 = client.field335.field1243;

            for(var10 = 0; var10 < var8; ++var10) {
               class69 var15 = (class69)class333.field3836.field1169.method8567((long)var17[var10]);
               if (var15 != null && var15.vmethod2740() && !var15.field954 && var15 != class76.field1108) {
                  var12 = var15.field1055 / 32 - client.field552 / 32;
                  int var13 = var15.field1056 / 32 - client.field337 / 32;
                  if (var15.method2170()) {
                     class84.method2798(var1, var2, var12, var13, class200.field2185[3], var4);
                  } else if (class76.field1108.field955 != 0 && var15.field955 != 0 && var15.field955 == class76.field1108.field955) {
                     class84.method2798(var1, var2, var12, var13, class200.field2185[4], var4);
                  } else if (var15.method2173()) {
                     class84.method2798(var1, var2, var12, var13, class200.field2185[5], var4);
                  } else if (var15.method2167()) {
                     class84.method2798(var1, var2, var12, var13, class200.field2185[6], var4);
                  } else {
                     class84.method2798(var1, var2, var12, var13, class200.field2185[2], var4);
                  }
               }
            }

            if (client.field455 != 0 && client.field412 % 20 < 10) {
               if (client.field455 == 1 && client.field456 >= 0) {
                  class81 var19 = (class81)class333.field3836.field1160.method8567((long)client.field456);
                  if (var19 != null) {
                     var11 = var19.field1055 / 32 - client.field552 / 32;
                     var12 = var19.field1056 / 32 - client.field337 / 32;
                     class388.method8214(var1, var2, var11, var12, class208.field2276[1], var4);
                  }
               }

               if (client.field455 == 2) {
                  var10 = client.field458 * 4 - class333.field3836.field1164 * 4 + 2 - client.field552 / 32;
                  var11 = client.field459 * 4 - class333.field3836.field1165 * 4 + 2 - client.field337 / 32;
                  class388.method8214(var1, var2, var10, var11, class208.field2276[1], var4);
               }

               if (client.field455 == 10 && client.field457 >= 0) {
                  class69 var20 = (class69)class333.field3836.field1169.method8567((long)client.field457);
                  if (var20 != null) {
                     var11 = var20.field1055 / 32 - client.field552 / 32;
                     var12 = var20.field1056 / 32 - client.field337 / 32;
                     class388.method8214(var1, var2, var11, var12, class208.field2276[1], var4);
                  }
               }
            }

            if (client.field581 != 0) {
               var10 = client.field581 * 4 + 2 - client.field552 / 32;
               var11 = client.field531 * 4 + 2 - client.field337 / 32;
               class84.method2798(var1, var2, var10, var11, class208.field2276[0], var4);
            }

            if (client.field333.method2352(-1) == class518.field5494 && class208.field2276.length >= 4) {
               var10 = var4.field4019 / 2 + var1;
               var11 = var4.field4020 / 2 + var2;
               if (var4.method7394(class35.field231 - var1, class35.field220 - var2)) {
                  var12 = class70.method2238(var1, var2, var4);
                  class51.method1892(var10, var11, var12, class208.field2276[2]);
               }

               if (client.field584 > 0) {
                  class51.method1892(var10, var11, client.field583, class208.field2276[3]);
               }
            }

            if (!class76.field1108.field954) {
               class601.method11558(var4.field4019 / 2 + var1 - 1, var4.field4020 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            class601.method11570(var1, var2, 0, var4.field4017, var4.field4018);
         }

         client.field566[var3] = true;
      }
   }

   @ObfuscatedName("om")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "586957109"
   )
   static final void method296() {
      Iterator var0 = class91.field1287.iterator();

      while(var0.hasNext()) {
         class39 var1 = (class39)var0.next();
         var1.method765();
      }

      if (class22.field90 != null) {
         class22.field90.method9889();
      }

   }

   @ObfuscatedName("po")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "53261324"
   )
   static void copyArray(class590 var0) {
      if (client.field472 != null) {
         var0.copyArray(client.field472, 0, client.field472.length);
      } else {
         byte[] var1 = class55.method2005();
         var0.copyArray(var1, 0, var1.length);
      }
   }
}
