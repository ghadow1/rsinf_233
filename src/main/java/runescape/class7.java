package runescape;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class7 {
   @ObfuscatedName("al")
   public static byte[][] field25;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lwb;"
   )
   final Buffer field21;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lac;"
   )
   final class3 field19;
   @ObfuscatedName("at")
   ExecutorService field24 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("ac")
   Future field22;

   @ObfuscatedSignature(
      descriptor = "(Lwb;Lac;)V"
   )
   public class7(Buffer var1, class3 var2) {
      this.field21 = var1;
      this.field19 = var2;
      this.method44();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-1"
   )
   public boolean method43() {
      return this.field22.isDone();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "381"
   )
   public void method52() {
      this.field24.shutdown();
      this.field24 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lwb;",
      garbageValue = "-1239446823"
   )
   public Buffer method54() {
      try {
         return (Buffer)this.field22.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "14689"
   )
   void method44() {
      this.field22 = this.field24.submit(new class1(this, this.field21, this.field19));
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-249506631"
   )
   static void method58(int var0) {
      class62 var1 = (class62)class62.field867.method8623((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.field868.length; ++var2) {
            var1.field868[var2] = -1;
            var1.field869[var2] = 0;
         }

      }
   }
}
