package game;

import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
class class342 implements ThreadFactory {
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   static class461 field3947;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lnf;"
   )
   final class340 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lnf;)V"
   )
   class342(class340 var1) {
      this.this$0 = var1;
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;III)Lxc;",
      garbageValue = "-1617159462"
   )
   static class604 method7322(class412 var0, int var1, int var2) {
      return !class587.method11132(var0, var1, var2) ? null : class447.method8930();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lny;IIIII)Lny;",
      garbageValue = "-350539562"
   )
   public static class359 method7325(class359 var0, int var1, int var2, int var3, int var4) {
      class359 var5 = var0;

      class359 var6;
      for(var6 = null; var5 != null; var5 = var5.field4047) {
         if (var5.field4048 >= var1 && var5.field4049 <= var2) {
            if (var6 != null) {
               var6.field4047 = var5.field4047;
            } else {
               var0 = var5.field4047;
            }

            class359 var7;
            if (var5.field4049 < var1) {
               var7 = new class359(var5.field4049, var1 - 1, var5.field4045, var5.field4046);
               if (var6 != null) {
                  var7.field4047 = var6.field4047;
               } else {
                  var7.field4047 = var0;
               }

               if (var6 != null) {
                  var6.field4047 = var7;
               } else {
                  var0 = var7;
               }

               var6 = var7;
            }

            if (var5.field4048 > var2) {
               var7 = new class359(var2 + 1, var5.field4048, var5.field4045, var5.field4046);
               if (var6 != null) {
                  var7.field4047 = var6.field4047;
               } else {
                  var7.field4047 = var0;
               }

               if (var6 != null) {
                  var6.field4047 = var7;
               } else {
                  var0 = var7;
               }
            }
         }

         var6 = var5;
      }

      var5 = null;

      for(var6 = var0; var6 != null && var6.field4049 <= var1; var6 = var6.field4047) {
         var5 = var6;
      }

      var6 = new class359(var1, var2, var3, var4);
      if (var5 != null) {
         var6.field4047 = var5.field4047;
      } else {
         var6.field4047 = var0;
      }

      if (var5 != null) {
         var5.field4047 = var6;
      } else {
         var0 = var6;
      }

      return var0;
   }
}
