package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public class class467 {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1921810474"
   )
   static void method9559() {
      Iterator var0 = client.field333.iterator();

      while(var0.hasNext()) {
         class79 var1 = (class79)var0.next();

         for(class72 var2 = (class72)var1.method2684().method8690(); var2 != null; var2 = (class72)var1.method2684().method8692()) {
            if (var2.field990 != null) {
               var2.method2249();
            }
         }
      }

   }
}
