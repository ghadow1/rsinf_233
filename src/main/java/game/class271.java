package game;

import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
public abstract class class271 {
   class271() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2094683207"
   )
   public abstract void vmethod6075();

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-752736442"
   )
   public abstract int vmethod6074(int var1, int var2);

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
      garbageValue = "2140197553"
   )
   public static void method6081(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         class339.field3895.clear();
         class339.field3892.clear();
         class292.method6698(var5);
         class298.method6819(var0, var5);
         if (!class339.field3895.isEmpty()) {
            class43.method791(var1, var2, var3, var4);
            class339.field3892.add(new class470((class477)null));
            class339.field3892.add(new class479((class477)null, class339.field3891, class150.field1765, class528.field5550));
            ArrayList var6 = new ArrayList();
            var6.add(new class474(new class476((class477)null, 0, true, class339.field3897)));
            if (!class339.field3890.isEmpty()) {
               ArrayList var7 = new ArrayList();
               var7.add(new class473(new class478((class477)null, var6), class339.field3898));
               ArrayList var9 = new ArrayList();
               Iterator var10 = class339.field3890.iterator();

               while(var10.hasNext()) {
                  class351 var11 = (class351)var10.next();
                  var9.add(var11);
               }

               var7.add(new class473(new class475(new class472((class477)null, var9), 0, false, class339.field3896), class339.field3894));
               class339.field3892.add(new class478((class477)null, var7));
            } else {
               class339.field3892.add(new class473((class477)null, class339.field3898));
               class339.field3892.add(new class478((class477)null, var6));
            }

         }
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lrj;IIIB)V",
      garbageValue = "-90"
   )
   static void method6079(class454 var0, int var1, int var2, int var3) {
      if (!class242.field2957) {
         byte var4 = 50;
         int var5 = class228.method5050();
         int var6 = (class242.field2964 - var1) * var4 / var3;
         int var7 = (class242.field2965 - var2) * var4 / var3;
         int var8 = (class242.field2964 - var1) * var5 / var3;
         int var9 = (class242.field2965 - var2) * var5 / var3;
         class454 var10 = class141.method3729(var0);
         var10.method9101();
         float[] var11 = new float[3];
         var10.method9085((float)var6, (float)var7, (float)var4, var11);
         var6 = (int)var11[0];
         var7 = (int)var11[1];
         int var12 = (int)var11[2];
         var10.method9085((float)var8, (float)var9, (float)var5, var11);
         var8 = (int)var11[0];
         var9 = (int)var11[1];
         var5 = (int)var11[2];
         var10.method9140();
         class405.method8273(var6, var7, var12, var8, var9, var5);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltj;Ltj;IIS)Z",
      garbageValue = "-25854"
   )
   static boolean method6080(class505 var0, class505 var1, int var2, int var3) {
      if (var1 == var0) {
         return var3 == var2;
      } else if (var0 != null && var1 == null) {
         return var0.field5425.method4452() == var2 && var0.vmethod11530() == var3;
      } else {
         return false;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Lti;",
      garbageValue = "-124"
   )
   public static class519 method6073(String var0, String var1) {
      if (var1 != null && !var1.isEmpty()) {
         int var2 = var1.length();
         int var3 = 1;

         int var4;
         for(var4 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var4 += var2) {
            ++var3;
         }

         class519 var5 = new class519(class574.field5824, (Object)null, var3, var3);
         int var6 = 0;
         var4 = 0;

         for(var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
            var5.method10321()[var3++] = var0.substring(var6, var4);
            var4 += var2;
         }

         var5.method10321()[var3] = var0.substring(var6);
         return var5;
      } else {
         throw new RuntimeException();
      }
   }
}
