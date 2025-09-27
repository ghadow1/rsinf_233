package runescape;

import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class122 implements Comparator {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljh;"
   )
   protected static class258 field1566;
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   static class604[] field1565;
   @ObfuscatedName("af")
   final boolean field1563;

   public class122(boolean var1) {
      this.field1563 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;S)I",
      garbageValue = "5007"
   )
   int method3531(class503 var1, class503 var2) {
      return this.field1563 ? var1.field5410 - var2.field5410 : var2.field5410 - var1.field5410;
   }

   public int compare(Object var1, Object var2) {
      return this.method3531((class503)var1, (class503)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lti;Lti;I)V",
      garbageValue = "724094962"
   )
   public static void method3537(class519 var0, class519 var1) {
      if (var0 != null && var0.method10322() > 1) {
         class374.method8144(var0);
         if (var1 != null) {
            class374.method8144(var1);
         }

         int var2 = var0.method10322();
         if (var1 != null && var1.method10322() < var2) {
            throw new RuntimeException();
         } else {
            if (var0.field5504 == class574.field5820) {
               if (var1 == null) {
                  class249.method5777(var0.method10318(), class520.field5509, 0, var2 - 1);
               } else if (class574.field5820 == var1.field5504) {
                  class249.method5777(var0.method10318(), var1.method10318(), 0, var2 - 1);
               } else if (class574.field5816 == var1.field5504) {
                  class199.method4400(var0.method10318(), var1.method10320(), 0, var2 - 1);
               } else {
                  class367.method7899(var0.method10318(), var1.method10321(), 0, var2 - 1);
               }
            } else if (var0.field5504 == class574.field5816) {
               if (var1 == null) {
                  Arrays.sort(var0.method10320(), 0, var2);
               } else if (class574.field5820 == var1.field5504) {
                  class536.method10531(var0.method10320(), var1.method10318(), 0, var2 - 1);
               } else if (class574.field5816 == var1.field5504) {
                  class420.method8509(var0.method10320(), var1.method10320(), 0, var2 - 1);
               } else {
                  class44.method1533(var0.method10320(), var1.method10321(), 0, var2 - 1);
               }
            } else {
               if (var0.field5504 != class574.field5824) {
                  throw new RuntimeException();
               }

               if (var1 == null) {
                  Arrays.sort(var0.method10321(), 0, var2);
               } else if (class574.field5820 == var1.field5504) {
                  class567.method10959((String[])((String[])var0.method10321()), var1.method10318(), 0, var2 - 1);
               } else if (class574.field5816 == var1.field5504) {
                  class272.method6111((String[])((String[])var0.method10321()), var1.method10320(), 0, var2 - 1);
               } else {
                  class164.method4008((String[])((String[])var0.method10321()), var1.method10321(), 0, var2 - 1);
               }
            }

         }
      }
   }

   @ObfuscatedName("mb")
   @ObfuscatedSignature(
      descriptor = "(ILtj;Ldr;I)I",
      garbageValue = "-403843777"
   )
   static int method3535(int var0, class505 var1, class79 var2) {
      int var3 = -1;
      if (var0 == client.field346) {
         var3 = var2.field1170;
      } else if (client.field346 == -1) {
         var3 = var1.field5425.method4452();
      } else {
         class505 var4 = client.field333.method2347();
         class79 var5 = var4.field5429;
         if (var5.field1170 == var4.field5425.method4452()) {
            if (var0 == -1) {
               var3 = var4.vmethod11530();
            } else {
               var3 = var1.field5425.method4452();
            }
         }
      }

      return var3;
   }

   @ObfuscatedName("nm")
   @ObfuscatedSignature(
      descriptor = "([Loi;IIIII)V",
      garbageValue = "-1402844009"
   )
   static final void method3536(class369[] var0, int var1, int var2, int var3, int var4) {
      for(int var5 = var1; var5 <= var2; ++var5) {
         class369 var6 = var0[var5];
         if (var6 != null && var3 == var6.field4164 && var4 == var6.field4165 && (!var6.field4143 || !class364.method7524(var6))) {
            if (var6.field4147 == 0) {
               if (!var6.field4143 && class364.method7524(var6) && var6 != class343.field3950) {
                  continue;
               }

               method3536(var0, var6.field4248, var6.field4214, var6.field4144, var6.field4145 * -217986249);
               if (var6.field4286 != null) {
                  method3536(var6.field4286, 0, var6.field4286.length - 1, var6.field4144, -1);
               }

               if (var6.field4145 * -217986249 == -1) {
                  class64 var7 = (class64)client.field422.method8623((long)var6.field4144);
                  if (var7 != null) {
                     class185.method4215(var7.field888);
                  }
               }
            }

            if (var6.field4147 == 6) {
               int var8;
               if (var6.field4196 != -1 || var6.field4197 != -1) {
                  boolean var11 = class262.method5937(var6);
                  if (var11) {
                     var8 = var6.field4197;
                  } else {
                     var8 = var6.field4196;
                  }

                  if (var8 != -1) {
                     class215 var9 = class177.method4155(var8);
                     if (!var9.method4768()) {
                        for(var6.field4135 += client.field389; var6.field4135 > var9.field2460[var6.field4284]; class89.method2877(var6)) {
                           var6.field4135 -= var9.field2460[var6.field4284];
                           ++var6.field4284;
                           if (var6.field4284 >= var9.field2474.length) {
                              var6.field4284 -= var9.field2493;
                              if (var6.field4284 < 0 || var6.field4284 >= var9.field2474.length) {
                                 var6.field4284 = 0;
                              }
                           }
                        }
                     } else {
                        var6.field4284 += client.field389;
                        int var10 = var9.method4769();
                        if (var6.field4284 >= var10) {
                           var6.field4284 -= var9.field2493;
                           if (var6.field4284 < 0 || var6.field4284 >= var10) {
                              var6.field4284 = 0;
                           }
                        }

                        class89.method2877(var6);
                     }
                  }
               }

               if (var6.field4205 != 0 && !var6.field4143) {
                  int var12 = var6.field4205 >> 16;
                  var8 = var6.field4205 << 16 >> 16;
                  var12 *= client.field389;
                  var8 *= client.field389;
                  var6.field4200 = var12 + var6.field4200 & 2047;
                  var6.field4235 = var8 + var6.field4235 & 2047;
                  class89.method2877(var6);
               }
            }
         }
      }

   }
}
