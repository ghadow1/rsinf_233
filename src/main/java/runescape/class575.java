package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wj")
final class class575 implements class569 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lwb;I)V",
      garbageValue = "1264095929"
   )
   public void vmethod11041(Object var1, Buffer var2) {
      this.method11036((String)var1, var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)Ljava/lang/Object;",
      garbageValue = "-944661961"
   )
   public Object vmethod11037(Buffer var1) {
      return var1.method11207();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lwb;B)V",
      garbageValue = "63"
   )
   void method11036(String var1, Buffer var2) {
      var2.writeNullTermString(var1);
   }
}
