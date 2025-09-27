package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wf")
public class PacketBuffer extends Buffer {
   @ObfuscatedName("af")
   static final int[] field5912 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lxj;"
   )
   IsaacCipher field5913;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1488236839
   )
   int field5914;

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "115"
   )
   public void vmethod11176() {
      super.vmethod11176();
      this.field5913 = null;
      this.field5914 = 0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "([IB)V",
      garbageValue = "39"
   )
   public void newIsaacCipher(int[] var1) {
      this.field5913 = new IsaacCipher(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lxj;I)V",
      garbageValue = "1930015"
   )
   public void method11151(IsaacCipher var1) {
      this.field5913 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1261406242"
   )
   public void method11144(int var1) {
      super.array[(super.offset += -290410379) * 1216585693 - 1] = (byte)(var1 + this.field5913.method11831());
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "898450700"
   )
   public int readByteIsaac() {
      return super.array[(super.offset += -290410379) * 1216585693 - 1] - this.field5913.method11831() & 255;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-37"
   )
   public boolean method11142() {
      int var1 = super.array[super.offset * 1216585693] - this.field5913.method11832() & 255;
      return var1 >= 128;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1651101195"
   )
   public int method11136() {
      int var1 = super.array[(super.offset += -290410379) * 1216585693 - 1] - this.field5913.method11831() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[(super.offset += -290410379) * 1216585693 - 1] - this.field5913.method11831() & 255);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "872104041"
   )
   public void method11137(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.array[(super.offset += -290410379) * 1216585693 - 1] - this.field5913.method11831());
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   public void method11145() {
      this.field5914 = super.offset * 1142750952;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-2060660998"
   )
   public int method11146(int var1) {
      int var2 = this.field5914 >> 3;
      int var3 = 8 - (this.field5914 & 7);
      int var4 = 0;

      for(this.field5914 += var1; var1 > var3; var3 = 8) {
         var4 += (super.array[var2++] & field5912[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.array[var2] & field5912[var3];
      } else {
         var4 += super.array[var2] >> var3 - var1 & field5912[var1];
      }

      return var4;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1774101019"
   )
   public void method11147() {
      super.offset = (this.field5914 + 7) / 8 * -290410379;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-231673324"
   )
   public int method11167(int var1) {
      return var1 * 8 - this.field5914;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "85688322"
   )
   public int method11149(int var1) {
      return var1 - super.offset * 1216585693;
   }
}
