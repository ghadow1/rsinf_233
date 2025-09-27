package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class259 {
   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field3100;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Lkd;",
      garbageValue = "21"
   )
   public static class265 method5905() {
      return class265.field3133;
   }

   @ObfuscatedName("nv")
   static final void method5906(double var0) {
      class225.method4929(var0);
      ((class237)class225.field2632.field3010).method5387(var0);
      if (class56.field816 != null) {
         class56.field816.method10658();
      }

      class213.field2381.method7011();
      class36.field239.method2652(var0);
   }

   @ObfuscatedName("pj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1580385136"
   )
   static void method5907() {
      if (class153.field1780 != null) {
         client.field432 = client.field412;
         class153.field1780.method8538();
         Iterator var0 = class333.field3836.field1169.iterator();

         while(var0.hasNext()) {
            class69 var1 = (class69)var0.next();
            class153.field1780.method8548((var1.field1055 >> 7) + class333.field3836.field1164, (var1.field1056 >> 7) + class333.field3836.field1165);
         }
      }

   }
}
