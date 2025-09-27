package game;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public abstract class class501 {
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1334787127
   )
   final int field5406;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 177760187
   )
   int field5401 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "[Ltl;"
   )
   class499[] field5400;
   @ObfuscatedName("aa")
   HashMap field5403;
   @ObfuscatedName("am")
   HashMap field5404;
   @ObfuscatedName("an")
   Comparator field5405 = null;

   class501(int var1) {
      this.field5406 = var1;
      this.field5400 = this.vmethod9991(var1);
      this.field5403 = new HashMap(var1 / 8);
      this.field5404 = new HashMap(var1 / 8);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ltl;",
      garbageValue = "690274569"
   )
   abstract class499 vmethod10007();

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)[Ltl;",
      garbageValue = "-102"
   )
   abstract class499[] vmethod9991(int var1);

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-653797915"
   )
   public void method9971() {
      this.field5401 = 0;
      Arrays.fill(this.field5400, (Object)null);
      this.field5403.clear();
      this.field5404.clear();
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-97"
   )
   public int method9972() {
      return this.field5401;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-915973101"
   )
   public boolean method9995() {
      return this.field5401 == this.field5406;
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(Lxa;I)Z",
      garbageValue = "-1122175628"
   )
   public boolean method9974(class613 var1) {
      if (!var1.method11911()) {
         return false;
      } else {
         return this.field5403.containsKey(var1) ? true : this.field5404.containsKey(var1);
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Lxa;B)Ltl;",
      garbageValue = "-105"
   )
   public class499 method10013(class613 var1) {
      class499 var2 = this.method9976(var1);
      return var2 != null ? var2 : this.method10028(var1);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(Lxa;B)Ltl;",
      garbageValue = "7"
   )
   class499 method9976(class613 var1) {
      return !var1.method11911() ? null : (class499)this.field5403.get(var1);
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(Lxa;B)Ltl;",
      garbageValue = "115"
   )
   class499 method10028(class613 var1) {
      return !var1.method11911() ? null : (class499)this.field5404.get(var1);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Lxa;B)Z",
      garbageValue = "59"
   )
   public final boolean method9978(class613 var1) {
      class499 var2 = this.method9976(var1);
      if (var2 == null) {
         return false;
      } else {
         this.method10014(var2);
         return true;
      }
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)V",
      garbageValue = "1290027649"
   )
   final void method10014(class499 var1) {
      int var2 = this.method9985(var1);
      if (var2 != -1) {
         this.method9989(var2);
         this.method9986(var1);
      }
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(Lxa;I)Ltl;",
      garbageValue = "2049578635"
   )
   class499 method10016(class613 var1) {
      return this.method9979(var1, (class613)null);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(Lxa;Lxa;I)Ltl;",
      garbageValue = "-1518092848"
   )
   class499 method9979(class613 var1, class613 var2) {
      if (this.method9976(var1) != null) {
         throw new IllegalStateException();
      } else {
         class499 var3 = this.vmethod10007();
         var3.method9957(var1, var2);
         this.method9970(var3);
         this.method9988(var3);
         return var3;
      }
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(II)Ltl;",
      garbageValue = "1435899983"
   )
   public final class499 method9982(int var1) {
      if (var1 >= 0 && var1 < this.field5401) {
         return this.field5400[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "32228"
   )
   public final void method10010() {
      if (this.field5405 == null) {
         Arrays.sort(this.field5400, 0, this.field5401);
      } else {
         Arrays.sort(this.field5400, 0, this.field5401, this.field5405);
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Ltl;Lxa;Lxa;B)V",
      garbageValue = "24"
   )
   final void method9987(class499 var1, class613 var2, class613 var3) {
      this.method9986(var1);
      var1.method9957(var2, var3);
      this.method9988(var1);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Ltl;B)I",
      garbageValue = "79"
   )
   final int method9985(class499 var1) {
      for(int var2 = 0; var2 < this.field5401; ++var2) {
         if (this.field5400[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)V",
      garbageValue = "671438280"
   )
   final void method9986(class499 var1) {
      if (this.field5403.remove(var1.field5397) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field5396 != null) {
            this.field5404.remove(var1.field5396);
         }

      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)V",
      garbageValue = "-817960703"
   )
   final void method9970(class499 var1) {
      this.field5400[++this.field5401 - 1] = var1;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Ltl;B)V",
      garbageValue = "-27"
   )
   final void method9988(class499 var1) {
      this.field5403.put(var1.field5397, var1);
      if (var1.field5396 != null) {
         class499 var2 = (class499)this.field5404.put(var1.field5396, var1);
         if (var2 != null && var2 != var1) {
            var2.field5396 = null;
         }
      }

   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1150979506"
   )
   final void method9989(int var1) {
      --this.field5401;
      if (var1 < this.field5401) {
         System.arraycopy(this.field5400, var1 + 1, this.field5400, var1, this.field5401 - var1);
      }

   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-18"
   )
   public final void method9992() {
      this.field5405 = null;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "1191542678"
   )
   public final void method9993(Comparator var1) {
      if (this.field5405 == null) {
         this.field5405 = var1;
      } else if (this.field5405 instanceof class500) {
         ((class500)this.field5405).method9963(var1);
      }

   }
}
