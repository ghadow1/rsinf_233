package runescape;

import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class262 {
   @ObfuscatedName("af")
   static boolean field3115 = false;
   @ObfuscatedName("aw")
   static File field3117;
   @ObfuscatedName("at")
   static Hashtable field3116 = new Hashtable(16);

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "29"
   )
   static int method5941(int var0) {
      return var0 - 1;
   }

   @ObfuscatedName("ms")
   @ObfuscatedSignature(
      descriptor = "(Loi;B)Z",
      garbageValue = "16"
   )
   static final boolean method5937(class369 var0) {
      if (var0.field4275 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.field4275.length; ++var1) {
            int var2 = class34.method637(var0, var1);
            int var3 = var0.field4191[var1];
            if (var0.field4275[var1] == 2) {
               if (var2 >= var3) {
                  return false;
               }
            } else if (var0.field4275[var1] == 3) {
               if (var2 <= var3) {
                  return false;
               }
            } else if (var0.field4275[var1] == 4) {
               if (var3 == var2) {
                  return false;
               }
            } else if (var3 != var2) {
               return false;
            }
         }

         return true;
      }
   }
}
