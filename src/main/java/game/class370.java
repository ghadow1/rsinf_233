package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class370 {
   @ObfuscatedName("ol")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "-1021519632"
   )
   static void method8111(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < class213.field2436; ++var4) {
         class213 var9 = class84.method2800(var4);
         if ((!var1 || var9.field2418) && var9.field2409 == -1 && var9.field2428.toLowerCase().indexOf(var0) != -1) {
            if (var3 >= 250) {
               class249.field3021 = -1;
               class279.field3275 = null;
               return;
            }

            if (var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      class279.field3275 = var2;
      class19.field79 = 0;
      class249.field3021 = var3;
      String[] var8 = new String[class249.field3021];

      for(int var5 = 0; var5 < class249.field3021; ++var5) {
         var8[var5] = class84.method2800(var2[var5]).field2428;
      }

      class201.method4404(var8, class279.field3275);
   }
}
