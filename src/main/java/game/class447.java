package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public final class class447 {
   @ObfuscatedName("af")
   public static final char[] field5151 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @ObfuscatedName("aw")
   static long[] field5150 = new long[12];
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   static class604[] field5149;

   static {
      for(int var0 = 0; var0 < field5150.length; ++var0) {
         field5150[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Lxc;",
      garbageValue = "-21"
   )
   public static class604 method8930() {
      class604 var0 = new class604();
      var0.field6005 = class606.field6025;
      var0.field6008 = class581.field5847;
      var0.field6009 = class149.field1763[0];
      var0.field6011 = class191.field2082[0];
      var0.field6007 = class255.field3068[0];
      var0.field6010 = class497.field5390[0];
      var0.field6006 = class504.field5414;
      var0.field6012 = class7.field25[0];
      class388.method8205();
      return var0;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lti;Lti;IIII)V",
      garbageValue = "535461303"
   )
   public static void method8929(class519 var0, class519 var1, int var2, int var3, int var4) {
      class218.method4826(var0, (class574)null, false);
      class574 var5 = var0.field5504;
      class218.method4826(var1, var5, true);
      int var6 = var0.method10322();
      int var7 = var1.method10322();
      if (var4 == -1) {
         var4 = var0.method10322() - var2;
      }

      if (var4 != 0 && (var1 != var0 || var3 != var2)) {
         if (var2 >= 0 && var2 + var4 <= var6 && var3 >= 0 && var3 + var4 <= var7) {
            class82.method2773(var0, var2, var1, var3, var4);
         } else {
            throw new RuntimeException();
         }
      }
   }
}
