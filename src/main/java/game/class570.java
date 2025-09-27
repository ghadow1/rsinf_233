package game;

import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
final class class570 implements class569 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;Lwb;I)V",
      garbageValue = "1264095929"
   )
   public void vmethod11041(Object var1, class590 var2) {
      this.method10978((Integer)var1, var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)Ljava/lang/Object;",
      garbageValue = "-944661961"
   )
   public Object vmethod11037(class590 var1) {
      return var1.method11202();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Integer;Lwb;I)V",
      garbageValue = "783821411"
   )
   void method10978(Integer var1, class590 var2) {
      var2.writeIntBigEndian(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
      garbageValue = "2058676137"
   )
   static void method10977(File var0, File var1) {
      try {
         class565 var2 = new class565(class260.field3109, "rw", 10000L);
         class590 var3 = new class590(500);
         var3.writeByte(3);
         var3.writeByte(var1 != null ? 1 : 0);
         var3.method11397(var0.getPath());
         if (var1 != null) {
            var3.method11397("");
         }

         var2.method10909(var3.index, 0, var3.buffer * 1216585693);
         var2.method10891();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}
