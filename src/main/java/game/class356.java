package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public class class356 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1110557383
   )
   public int field4027;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1526442279
   )
   public int field4026;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1470369101
   )
   public int field4025;

   @ObfuscatedSignature(
      descriptor = "(Lna;)V"
   )
   public class356(class356 var1) {
      this.field4027 = var1.field4027;
      this.field4026 = var1.field4026;
      this.field4025 = var1.field4025;
   }

   public class356(int var1, int var2, int var3) {
      this.field4027 = var1;
      this.field4026 = var2;
      this.field4025 = var3;
   }

   public class356() {
      this.field4027 = -1;
   }

   public class356(int var1) {
      if (var1 == -1) {
         this.field4027 = -1;
      } else {
         this.field4027 = var1 >> 28 & 3;
         this.field4026 = var1 >> 14 & 16383;
         this.field4025 = var1 & 16383;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2019438893"
   )
   public void method7470(int var1) {
      if (var1 == -1) {
         this.field4027 = -1;
      } else {
         this.field4027 = var1 >> 28 & 3;
         this.field4026 = var1 >> 14 & 16383;
         this.field4025 = var1 & 16383;
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-619371584"
   )
   public int method7421() {
      return !this.method7462() ? -1 : method7461(this.field4027, this.field4026, this.field4025);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1252148852"
   )
   public int method7426() {
      return method7461(this.field4027, this.field4026 >> 13, this.field4025 >> 13);
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "2"
   )
   public void method7422(int var1, int var2, int var3) {
      int var4 = var1 >> 14 & 255;
      int var5 = var1 & 255;
      this.field4027 = var1 >> 28;
      this.field4026 = (var4 << 13) + var2;
      this.field4025 = var3 + (var5 << 13);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-160803120"
   )
   boolean method7462() {
      return this.field4027 != -1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lna;I)Z",
      garbageValue = "2144353590"
   )
   boolean method7425(class356 var1) {
      if (this.field4027 != var1.field4027) {
         return false;
      } else if (this.field4026 != var1.field4026) {
         return false;
      } else {
         return this.field4025 == var1.field4025;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "-100"
   )
   String method7427(String var1) {
      return this.field4027 + var1 + (this.field4026 >> 6) + var1 + (this.field4025 >> 6) + var1 + (this.field4026 & 63) + var1 + (this.field4025 & 63);
   }

   public String toString() {
      return this.method7427(",");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class356) ? false : this.method7425((class356)var1);
      }
   }

   public int hashCode() {
      return this.method7421();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-2012142743"
   )
   public static int method7461(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1980768950"
   )
   public static int method7413(int var0) {
      return var0 >> 28;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-749084993"
   )
   public static int method7424(int var0) {
      return var0 >> 14 & 16383;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-17"
   )
   public static int method7415(int var0) {
      return var0 & 16383;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "495308240"
   )
   public static int method7412(int var0) {
      return var0 << 6;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-187354178"
   )
   public static int method7417(int var0) {
      return var0 << 7;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "-30607"
   )
   public static int method7418(int var0, int var1) {
      return var0 + (var1 << 6);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1362396848"
   )
   public static int method7416(int var0) {
      return (var0 << 7) + 64;
   }
}
