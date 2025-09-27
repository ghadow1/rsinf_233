package game;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class14 {
   @ObfuscatedName("af")
   final String field55;
   @ObfuscatedName("aw")
   final ThreadFactory field54;
   @ObfuscatedName("at")
   final ThreadPoolExecutor field58;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -391947939
   )
   final int field56;

   public class14(String var1, int var2, int var3) {
      this.field55 = var1;
      this.field56 = var2;
      this.field54 = new class16(this);
      this.field58 = this.method175(var3);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
      garbageValue = "-125"
   )
   final ThreadPoolExecutor method175(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field56), this.field54);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lai;I)Lag;",
      garbageValue = "642811050"
   )
   public class18 method182(class10 var1) {
      if (this.field58.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field58.getCorePoolSize() + " Queue capacity " + this.field56);
         return new class18("Queue full");
      } else {
         class18 var2 = new class18(this.field58.submit(new class19(this, var1)));
         return var2;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "127"
   )
   public final void method177() {
      try {
         this.field58.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "846925215"
   )
   static void method188() {
      class274.field3221 = System.getenv("JX_ACCESS_TOKEN");
      class263.field3124 = System.getenv("JX_REFRESH_TOKEN");
      class304.field3472 = System.getenv("JX_SESSION_ID");
      class186.field2025 = System.getenv("JX_CHARACTER_ID");
      class546.method10584(System.getenv("JX_DISPLAY_NAME"));
   }

   @ObfuscatedName("lh")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-34"
   )
   static void method186() {
      class369.method8102();
      client.field522.field6060[0] = -1;
      client.field522.field6056[0] = "Cancel";
      client.field522.field6062[0] = "";
      client.field522.field6055[0] = 1006;
      client.field522.field6051[0] = false;
      client.field522.field6061[0] = null;
      client.field522.field6052 = 1;
   }

   @ObfuscatedName("pa")
   @ObfuscatedSignature(
      descriptor = "(II)Lwd;",
      garbageValue = "-524460341"
   )
   static class578 method187(int var0) {
      class578 var1 = (class578)client.field451.method7018((long)var0);
      if (var1 == null) {
         var1 = new class578(class286.field3302, var0);
      }

      return var1;
   }
}
