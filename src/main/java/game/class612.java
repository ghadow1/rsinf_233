package game;

import java.util.zip.Inflater;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xs")
public class class612 {
   @ObfuscatedName("af")
   Inflater field6074;

   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1000000"
   )
   class612(int var1, int var2, int var3) {
   }

   public class612() {
      this(-1, 1000000, 1000000);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;[BI)V",
      garbageValue = "-1430530410"
   )
   public void method11905(class590 var1, byte[] var2) {
      if (var1.index[var1.buffer * 1216585693] == 31 && var1.index[var1.buffer * 1216585693 + 1] == -117) {
         if (this.field6074 == null) {
            this.field6074 = new Inflater(true);
         }

         try {
            this.field6074.setInput(var1.index, var1.buffer * 1216585693 + 10, var1.index.length - (var1.buffer * 1216585693 + 8 + 10));
            this.field6074.inflate(var2);
         } catch (Exception var4) {
            this.field6074.reset();
            throw new RuntimeException("");
         }

         this.field6074.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
