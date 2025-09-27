package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
public class class331 implements class326 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   public static final class331 field3821 = new class331(14, 0);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   public static final class331 field3811 = new class331(15, 20);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   public static final class331 field3812 = new class331(16, -2);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   public static final class331 field3813 = new class331(18, -2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   public static final class331 field3814 = new class331(19, -2);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   public static final class331 field3816 = new class331(21, 37);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   static final class331 field3815 = new class331(27, 0);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lmf;"
   )
   public static final class331 field3817 = new class331(32, 66);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Lmf;"
   )
   static final class331[] field3818 = new class331[33];
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 448156373
   )
   public final int field3819;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 394075073
   )
   public final int field3820;

   static {
      class331[] var0 = new class331[]{field3815, field3814, field3817, field3812, field3816, field3813, field3821, field3811};
      class331[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         field3818[var1[var2].field3819] = var1[var2];
      }

   }

   class331(int var1, int var2) {
      this.field3819 = var1;
      this.field3820 = var2;
   }
}
