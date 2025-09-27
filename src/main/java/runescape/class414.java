package runescape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class414 {
   @ObfuscatedName("af")
   public static Comparator field5011 = new class417();
   @ObfuscatedName("aw")
   public static Comparator field5012;
   @ObfuscatedName("at")
   public static Comparator field5013;
   @ObfuscatedName("ac")
   public static Comparator field5015;
   @ObfuscatedName("ap")
   public final List field5014;

   static {
      new class419();
      field5012 = new class422();
      field5013 = new class416();
      field5015 = new class415();
   }

   @ObfuscatedSignature(
      descriptor = "(Lwb;Z)V",
      garbageValue = "1"
   )
   public class414(Buffer var1, boolean var2) {
      int var3 = var1.readUnsignedShort();
      boolean var4 = var1.method11196() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.readUnsignedShort();
      this.field5014 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field5014.add(new class420(var1, var5, var3));
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;ZB)V",
      garbageValue = "-108"
   )
   public void method8467(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field5014, var1);
      } else {
         Collections.sort(this.field5014, Collections.reverseOrder(var1));
      }

   }
}
