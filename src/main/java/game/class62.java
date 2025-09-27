package game;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class62 extends class544 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqw;"
   )
   static class428 field867 = new class428(32);
   @ObfuscatedName("aw")
   int[] field868 = new int[]{-1};
   @ObfuscatedName("at")
   int[] field869 = new int[]{0};

   class62() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1968910673"
   )
   static void method2113() {
      try {
         File var0 = new File(class82.field1203, "random.dat");
         int var2;
         if (var0.exists()) {
            class260.field3104 = new class566(new class565(var0, "rw", 25L), 24, 0);
         } else {
            label38:
            for(int var1 = 0; var1 < class385.field4411.length; ++var1) {
               for(var2 = 0; var2 < class597.field5981.length; ++var2) {
                  File var3 = new File(class597.field5981[var2] + class385.field4411[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     class260.field3104 = new class566(new class565(var3, "rw", 25L), 24, 0);
                     break label38;
                  }
               }
            }
         }

         if (class260.field3104 == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            var2 = var4.read();
            var4.seek(0L);
            var4.write(var2);
            var4.seek(0L);
            var4.close();
            class260.field3104 = new class566(new class565(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
      }

   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      descriptor = "(Lpw;Ljava/lang/String;B)V",
      garbageValue = "-32"
   )
   static void method2100(class409 var0, String var1) {
      class61 var2 = new class61(var0, var1);
      client.field602.add(var2);
      client.field604 += var2.field864;
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1934380272"
   )
   static final void method2120() {
      for(class53 var0 = (class53)client.field334.method8690(); var0 != null; var0 = (class53)client.field334.method8692()) {
         if (client.field412 > var0.field777) {
            var0.vmethod10557();
         } else if (client.field412 >= var0.field789) {
            var0.method1962(client.field333, client.field412, client.field389);
            class333.field3836.field1159.method5112(var0.field778, (int)var0.field773, (int)var0.field781, (int)var0.field782, 60, var0, var0.field776, -1L, false);
         }
      }

   }

   @ObfuscatedName("og")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1042235089"
   )
   static final void method2122() {
      client.field352 = client.field404;
      class133.field1614 = true;
   }
}
