package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public enum class384 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Loc;"
   )
   field4404(0, 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Loc;"
   )
   field4402(1, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Loc;"
   )
   field4401(2, 2);

   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2068269419
   )
   public final int field4399;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 31266747
   )
   int field4400;

   class384(int var3, int var4) {
      this.field4399 = var3;
      this.field4400 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field4400;
   }

   @ObfuscatedName("ou")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1075065140"
   )
   static final void method8188(int var0, int var1) {
      if (client.field582[var0] != null) {
         if (var1 >= 0 && var1 < client.field582[var0].method4076()) {
            class153 var2 = (class153)client.field582[var0].field1918.get(var1);
            if (var2.field1782 == -1) {
               class329 var3 = EnumComposition.getPacketBufferNode(ClientPackets.field3602, client.packetWriter.isaacCipher);
               var3.out.writeByte(3 + class288.method6418(var2.field1779.method11909()));
               var3.out.writeByte(var0);
               var3.out.writeShortBigEndian(var1);
               var3.out.writeNullTermString(var2.field1779.method11909());
               client.packetWriter.addNode(var3);
            }
         }
      }
   }
}
