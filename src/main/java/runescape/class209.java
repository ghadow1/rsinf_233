package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class209 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2278;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2277 = new class320(64);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqm;"
   )
   class426 field2279;

   class209() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1779827996"
   )
   void method4556() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;B)V",
      garbageValue = "7"
   )
   void method4544(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4545(var1, var2);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-1412795924"
   )
   void method4545(Buffer var1, int var2) {
      if (var2 == 249) {
         this.field2279 = class144.method3740(var1, this.field2279);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "2136487675"
   )
   public int method4546(int var1, int var2) {
      return class537.method10547(this.field2279, var1, var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "-36"
   )
   public String method4547(int var1, String var2) {
      return class405.method8274(this.field2279, var1, var2);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lit;IIIIIIII)Lre;",
      garbageValue = "-431770858"
   )
   public static final class452 method4561(class230 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      float var8 = 1.0E-5F;
      class242.field2957 = false;
      class190.method4304(var0.field2747, var0.field2774, var0.field2732, var0.field2750, var5, var6, var7);
      class452 var9 = class296.method6761(0.0F, 1.0F, 0.0F);
      float var10 = class74.method2413(var9, class242.field2962);
      if (Math.abs(var10) < 1.0E-5F) {
         var9.method8992();
         return null;
      } else {
         class452 var11 = class296.method6761((float)var2, (float)var3, (float)var4);
         class452 var12 = class296.method6761(var11.field5175, var11.field5176 - (float)var1, var11.field5169);
         float var13 = -class74.method2413(var9, var12) / var10;
         var9.method8992();
         if (var13 < 0.0F) {
            var12.method8992();
            var11.method8992();
            return null;
         } else {
            class452 var15 = class242.field2962;
            class452 var16 = class334.method7060(var15);
            var16.method9003(var13);
            class452 var17 = class4.method18(var11, var16);
            var16.method8992();
            var12.method8992();
            var11.method8992();
            return var17;
         }
      }
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lpd;I)V",
      garbageValue = "766324511"
   )
   static void method4564(class79 var0, class394 var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var0.field1176.method9790(); ++var3) {
         class505 var4 = (class505)var0.field1171.method8596((long)var0.field1176.method9787(var3));
         if (var4 != null && var4.field5429.field1172 != client.field346 && var4.method10072() == var1) {
            boolean var5 = var2 < client.field384;
            if (var5) {
               ++var2;
               boolean var6 = false;
               if (var1 == class394.field4801) {
                  class449 var8 = class563.method10884(var4.field5422, var4.field5425.method4455());

                  boolean var7;
                  label119: {
                     int var9;
                     for(var9 = 0; var9 < client.field335.field1254; ++var9) {
                        class69 var10 = (class69)var0.field1169.method8567((long)client.field335.field1243[var9]);
                        if (var10 != null && var8.method8976(var10.field1055, var10.field1056)) {
                           var8.method8941();
                           var7 = true;
                           break label119;
                        }
                     }

                     var9 = 0;

                     label102:
                     while(true) {
                        if (var9 >= var0.field1161.method9790()) {
                           for(var9 = 0; var9 < var0.field1176.method9790(); ++var9) {
                              class505 var14 = (class505)var0.field1171.method8596((long)var0.field1176.method9787(var9));
                              if (var14 != null && var14 != var4 && var14.field5429.field1159.field2709 == client.cycle) {
                                 class449 var11 = class563.method10884(var14.field5422, var14.field5425.method4455());
                                 if (var8.method8944(var11)) {
                                    var8.method8941();
                                    var11.method8941();
                                    var7 = true;
                                    break label102;
                                 }

                                 var11.method8941();
                              }
                           }

                           var8.method8941();
                           var7 = false;
                           break;
                        }

                        class81 var13 = (class81)var0.field1160.method8567((long)var0.field1161.method9787(var9));
                        if (var13 != null && var8.method8976(var13.field1055, var13.field1056)) {
                           for(int var12 = 0; var12 < var13.field1184.field2142.length; ++var12) {
                              if (var13.field1184.field2142[var12] != null) {
                                 var8.method8941();
                                 var7 = true;
                                 break label102;
                              }
                           }
                        }

                        ++var9;
                     }
                  }

                  var6 = var7;
               }

               class192.method4314(var0, var4, var6);
            }
         }
      }

   }
}
