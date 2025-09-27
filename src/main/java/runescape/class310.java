package runescape;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class310 extends class289 {
   @ObfuscatedName("an")
   HashSet field3503;
   @ObfuscatedName("ar")
   HashSet field3502;
   @ObfuscatedName("ae")
   List field3504;

   class310() {
   }

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "(Lwb;Lwb;IZI)V",
      garbageValue = "-1997746983"
   )
   void method6915(Buffer var1, Buffer var2, int var3, boolean var4) {
      this.method6420(var1, var3);
      int var5 = var2.readUnsignedShort();
      this.field3503 = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         class284 var7 = new class284();

         try {
            var7.method6361(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field3503.add(var7);
      }

      var6 = var2.readUnsignedShort();
      this.field3502 = new HashSet(var6);

      for(int var10 = 0; var10 < var6; ++var10) {
         class292 var8 = new class292();

         try {
            var8.method6702(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field3502.add(var8);
      }

      this.method6918(var2, var4);
   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "(Lwb;ZI)V",
      garbageValue = "1472075408"
   )
   void method6918(Buffer var1, boolean var2) {
      this.field3504 = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method11222();
         class356 var6 = new class356(var1.read32BitArray());
         boolean var7 = var1.method11196() == 1;
         if (var2 || !var7) {
            this.field3504.add(new class295((class356)null, var6, var5, (class302)null));
         }
      }

   }
}
