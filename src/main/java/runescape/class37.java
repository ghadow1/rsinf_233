package runescape;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class37 extends class544 {
   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field253;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 122370785
   )
   int field248;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 203370847
   )
   int field246;
   @ObfuscatedName("at")
   int[] field247;
   @ObfuscatedName("ac")
   int[] field249;
   @ObfuscatedName("ap")
   Field[] field245;
   @ObfuscatedName("aq")
   int[] field250;
   @ObfuscatedName("ao")
   Method[] field251;
   @ObfuscatedName("as")
   byte[][][] field252;

   class37() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "3"
   )
   public static void method740(int var0) {
      class35.field227 = var0;
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(Lwv;Ljava/lang/Object;I)V",
      garbageValue = "191753758"
   )
   static void method739(class574 var0, Object var1) {
      if (var0 == null) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch(var0.field5819) {
         case 0:
            class46.field659[++class124.field1569 - 1] = (Integer)var1;
            break;
         case 1:
            class46.field660[++class46.field658 - 1] = var1;
            break;
         default:
            throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }

      }
   }
}
