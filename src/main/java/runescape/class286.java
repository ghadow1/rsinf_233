package runescape;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class286 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   public static final class286 field3298 = new class286(0, 0, 4);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   public static final class286 field3297 = new class286(2, 1, 2);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   public static final class286 field3299 = new class286(1, 2, 0);
   @ObfuscatedName("ar")
   static String field3305;
   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field3302;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 380295655
   )
   final int field3300;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1695101721
   )
   final int field3301;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 372524171
   )
   final int field3304;

   class286(int var1, int var2, int var3) {
      this.field3300 = var1;
      this.field3301 = var2;
      this.field3304 = var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(FI)Z",
      garbageValue = "2025845268"
   )
   boolean method6364(float var1) {
      return var1 >= (float)this.field3304;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[Llf;",
      garbageValue = "-1417461611"
   )
   static class286[] method6375() {
      return new class286[]{field3297, field3299, field3298};
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Llf;",
      garbageValue = "-57"
   )
   static class286 method6366(int var0) {
      class286[] var1 = method6375();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class286 var3 = var1[var2];
         if (var0 == var3.field3301) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("jh")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "69"
   )
   static final void method6372(boolean var0) {
      class125.method3557();
      ++client.packetWriter.field1298;
      if (client.packetWriter.field1298 >= 50 || var0) {
         client.packetWriter.field1298 = 0;
         if (!client.hadNetworkError && client.packetWriter.getSocket() != null) {
            class329 var1 = EnumComposition.getPacketBufferNode(ClientPackets.field3639, client.packetWriter.isaacCipher);
            client.packetWriter.addNode(var1);

            try {
               client.packetWriter.flush();
            } catch (IOException var3) {
               client.hadNetworkError = true;
            }
         }

      }
   }

   @ObfuscatedName("lt")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
      garbageValue = "1342694339"
   )
   static final int method6373(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      return class423.method8546(var0, var1, var2, var3, var4, var5, var6, false, -1);
   }

   @ObfuscatedName("nk")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "-857880315"
   )
   static final void method6368(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class119.field1554.method7478(var0)) {
         class293.method6729(class119.field1554.field4037[var0], 0, class119.field1554.field4037[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedName("oa")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)Ljava/lang/String;",
      garbageValue = "-1701904132"
   )
   static String method6374(class369 var0) {
      if (class537.method10543(class373.method8139(var0)) == 0) {
         return null;
      } else {
         return var0.field4169 != null && !var0.field4169.trim().isEmpty() ? var0.field4169 : null;
      }
   }
}
