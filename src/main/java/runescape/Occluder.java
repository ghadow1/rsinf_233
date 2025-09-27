package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public abstract class Occluder {
   @ObfuscatedName("wc")
   @ObfuscatedSignature(
      descriptor = "Lvj;"
   )
   static class546 platformInfo;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lna;"
   )
   public final class356 field3491;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lna;"
   )
   public final class356 field3488;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1142290253
   )
   int field3490;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1891308037
   )
   int field3489;

   @ObfuscatedSignature(
      descriptor = "(Lna;Lna;)V"
   )
   Occluder(class356 var1, class356 var2) {
      this.field3488 = var1;
      this.field3491 = var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1313098329"
   )
   public abstract int vmethod6870();

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lls;",
      garbageValue = "-1635642188"
   )
   abstract class302 vmethod6866();

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   abstract int vmethod6869();

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1852373606"
   )
   abstract int vmethod6868();

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1791929685"
   )
   boolean method6867(int var1, int var2) {
      if (this.method6882(var1, var2)) {
         return true;
      } else {
         return this.method6871(var1, var2);
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1436979369"
   )
   boolean method6864() {
      return this.vmethod6870() >= 0;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1299692522"
   )
   boolean method6882(int var1, int var2) {
      if (!this.method6864()) {
         return false;
      } else {
         class184 var3 = class198.method4395(this.vmethod6870());
         int var4 = this.vmethod6869();
         int var5 = this.vmethod6868();
         switch(var3.field2011.field2090) {
         case 0:
            if (var1 < this.field3490 - var4 / 2 || var1 > var4 / 2 + this.field3490) {
               return false;
            }
            break;
         case 1:
            if (var1 < this.field3490 || var1 >= var4 + this.field3490) {
               return false;
            }
            break;
         case 2:
            if (var1 <= this.field3490 - var4 || var1 > this.field3490) {
               return false;
            }
         }

         switch(var3.field1999.field2166) {
         case 0:
            if (var2 < this.field3489 || var2 >= var5 + this.field3489) {
               return false;
            }
            break;
         case 1:
            if (var2 <= this.field3489 - var5 || var2 > this.field3489) {
               return false;
            }
            break;
         case 2:
            if (var2 < this.field3489 - var5 / 2 || var2 > var5 / 2 + this.field3489) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1058781978"
   )
   boolean method6871(int var1, int var2) {
      class302 var3 = this.vmethod6866();
      if (var3 == null) {
         return false;
      } else if (var1 >= this.field3490 - var3.field3456 / 2 && var1 <= var3.field3456 / 2 + this.field3490) {
         return var2 >= this.field3489 && var2 <= this.field3489 + var3.field3459;
      } else {
         return false;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lti;Ljava/lang/Object;III)I",
      garbageValue = "2147483647"
   )
   public static int method6894(class519 var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10322()) {
         var3 = var0.method10322();
      }

      int var5;
      if (var0.field5504 == class574.field5820) {
         int[] var11 = var0.method10318();
         var5 = (Integer)var1;

         for(int var6 = var2; var6 < var3; ++var6) {
            if (var5 == var11[var6]) {
               return var6;
            }
         }
      } else if (var0.field5504 == class574.field5816) {
         long[] var10 = var0.method10320();
         long var8 = (Long)var1;

         for(int var7 = var2; var7 < var3; ++var7) {
            if (var10[var7] == var8) {
               return var7;
            }
         }
      } else {
         Object[] var4 = var0.method10321();

         for(var5 = var2; var5 < var3; ++var5) {
            if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
               return var5;
            }
         }
      }

      return -1;
   }
}
