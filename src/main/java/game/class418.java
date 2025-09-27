package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class418 {
   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field5030;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILco;I)Ldr;",
      garbageValue = "1173117859"
   )
   public static class79 method8493(int var0, class73 var1) {
      Iterator var2 = var1.iterator();

      class79 var3;
      class69 var4;
      do {
         if (!var2.hasNext()) {
            return var1.method2343();
         }

         var3 = (class79)var2.next();
         var4 = (class69)var3.field1169.method8567((long)var0);
      } while(var4 == null || var3.field1172 == -1);

      return var3;
   }
}
