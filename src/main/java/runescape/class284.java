package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class284 extends class298 {
   class284() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1711668224"
   )
   void method6361(Buffer var1) {
      int var2 = var1.method11196();
      if (var2 != class304.field3471.field3468) {
         throw new IllegalStateException("");
      } else {
         super.field3425 = var1.method11196();
         super.field3428 = var1.method11196();
         super.field3433 = var1.readUnsignedShort() * 4096;
         super.field3426 = var1.readUnsignedShort() * 4096;
         super.field3431 = var1.readUnsignedShort();
         super.field3429 = var1.readUnsignedShort();
         super.field3432 = var1.method11222();
         super.field3427 = var1.method11222();
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1975102326"
   )
   void vmethod6791(Buffer var1) {
      super.field3428 = Math.min(super.field3428, 4);
      super.field3430 = new short[1][64][64];
      super.field3434 = new short[super.field3428][64][64];
      super.field3435 = new byte[super.field3428][64][64];
      super.field3436 = new byte[super.field3428][64][64];
      super.field3437 = new class300[super.field3428][64][64][];
      int var2 = var1.method11196();
      if (var2 != class303.field3463.field3464) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.method11196();
         int var4 = var1.method11196();
         if (var3 == super.field3431 && var4 == super.field3429) {
            for(int var5 = 0; var5 < 64; ++var5) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  this.method6787(var5, var6, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class284)) {
         return false;
      } else {
         class284 var2 = (class284)var1;
         return super.field3431 == var2.field3431 && super.field3429 == var2.field3429;
      }
   }

   public int hashCode() {
      return super.field3431 | super.field3429 << 8;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "504954944"
   )
   public static void method6354() {
      class186.field2023 = null;
      class186.field2024 = null;
      class186.field2022 = 0;
   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      descriptor = "(S)J",
      garbageValue = "128"
   )
   static long method6363() {
      return client.field509;
   }

   @ObfuscatedName("ov")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "104"
   )
   static final void method6353() {
      Iterator var0 = client.field333.iterator();

      while(var0.hasNext()) {
         class79 var1 = (class79)var0.next();

         for(int var2 = 0; var2 < client.field335.field1254; ++var2) {
            class69 var3 = (class69)class333.field3836.field1169.method8567((long)client.field335.field1243[var2]);
            if (var3 != null) {
               var3.method2220();
            }
         }
      }

   }
}
