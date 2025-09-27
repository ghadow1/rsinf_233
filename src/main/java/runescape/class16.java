package runescape;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class16 implements ThreadFactory {
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field65;
   @ObfuscatedName("af")
   final ThreadGroup field67;
   @ObfuscatedName("aw")
   final AtomicInteger field63;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   final InterfaceParent this$0;

   @ObfuscatedSignature(
      descriptor = "(Lar;)V"
   )
   class16(InterfaceParent var1) {
      this.this$0 = var1;
      this.field63 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field67 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field67, var1, this.this$0.field55 + "-rest-request-" + this.field63.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lxe;"
   )
   public static class616 method219(Throwable var0, String var1) {
      class616 var2;
      if (var0 instanceof class616) {
         var2 = (class616)var0;
         var2.field6090 = var2.field6090 + ' ' + var1;
      } else {
         var2 = new class616(var0, var1);
      }

      return var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "85"
   )
   static final boolean method218(int var0) {
      return var0 == 7 || var0 == 8 || var0 >= 9 && var0 <= 13;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIZIZB)V",
      garbageValue = "-72"
   )
   static void method217(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         class44 var8 = class44.field624[var6];
         class44.field624[var6] = class44.field624[var1];
         class44.field624[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            class44 var11 = class44.field624[var9];
            int var12 = class142.method3731(var11, var8, var2, var3);
            int var10;
            if (var12 != 0) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = class142.method3731(var11, var8, var4, var5);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               class44 var14 = class44.field624[var9];
               class44.field624[var9] = class44.field624[var7];
               class44.field624[var7++] = var14;
            }
         }

         class44.field624[var1] = class44.field624[var7];
         class44.field624[var7] = var8;
         method217(var0, var7 - 1, var2, var3, var4, var5);
         method217(var7 + 1, var1, var2, var3, var4, var5);
      }

   }
}
