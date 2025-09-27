package runescape;

import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class257 {
   @ObfuscatedName("vu")
   @ObfuscatedGetter(
      intValue = -149712381
   )
   static int field3087;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lea;"
   )
   public class121 field3088;
   @ObfuscatedName("aw")
   public float[] field3086;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   final class267 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lkm;)V"
   )
   class257(class267 var1) {
      this.this$0 = var1;
      this.field3086 = new float[4];
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-35"
   )
   public static void method5884(int var0, int var1) {
      class43.method791(var0, var1, 0, 0);
      class339.field3889.clear();
      class339.field3892.clear();
      if (class339.field3890.isEmpty() || var0 == 0 && var1 == 0) {
         class231.method5344();
      } else {
         class339.field3892.add(new class473((class477)null, class339.field3894));
         class339.field3892.add(new class475((class477)null, 0, false, class339.field3896));
         ArrayList var3 = new ArrayList();
         Iterator var4 = class339.field3890.iterator();

         while(var4.hasNext()) {
            class351 var5 = (class351)var4.next();
            var3.add(var5);
         }

         class339.field3892.add(new class472((class477)null, var3));
      }

   }
}
