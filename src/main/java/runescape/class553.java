package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vr")
public class class553 {
   @ObfuscatedName("ap")
   String field5671;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field5673;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 203421533
   )
   int field5670 = 0;
   @ObfuscatedName("as")
   boolean field5675 = false;

   @ObfuscatedSignature(
      descriptor = "(Lpx;)V"
   )
   class553(class412 var1) {
      this.field5673 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "42"
   )
   void method10625(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.field5671) {
            this.field5671 = var1;
            this.field5670 = 0;
            this.field5675 = false;
            this.method10626();
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1597672124"
   )
   int method10626() {
      if (this.field5671 == null) {
         this.field5670 = 100;
         this.field5675 = true;
      } else {
         if (this.field5670 < 33) {
            if (!this.field5673.method8357(class308.field3494.field3496, this.field5671)) {
               return this.field5670;
            }

            this.field5670 = 33;
         }

         if (this.field5670 == 33) {
            if (this.field5673.method8355(class308.field3495.field3496, this.field5671) && !this.field5673.method8357(class308.field3495.field3496, this.field5671)) {
               return this.field5670;
            }

            this.field5670 = 66;
         }

         if (this.field5670 == 66) {
            if (!this.field5673.method8357(this.field5671, class308.field3497.field3496)) {
               return this.field5670;
            }

            this.field5670 = 100;
            this.field5675 = true;
         }
      }

      return this.field5670;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "802740665"
   )
   boolean method10632() {
      return this.field5675;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1044578596"
   )
   int method10628() {
      return this.field5670;
   }
}
