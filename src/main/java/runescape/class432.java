package runescape;

import java.util.Locale;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class432 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   public static final class432 field5100;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   static final class432 field5096;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   public static final class432 field5094;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   static final class432 field5095;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   static final class432 field5092;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   public static final class432 field5097;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lqh;"
   )
   static final class432 field5098;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Lqh;"
   )
   static final class432[] field5093;
   @ObfuscatedName("lq")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   static class604[] field5104;
   @ObfuscatedName("as")
   final String field5099;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -753098375
   )
   final int field5101;
   @ObfuscatedName("ai")
   final String field5102;

   static {
      field5100 = new class432("EN", "en", "English", class433.field5120, 0, "GB");
      field5096 = new class432("DE", "de", "German", class433.field5120, 1, "DE");
      field5094 = new class432("FR", "fr", "French", class433.field5120, 2, "FR");
      field5095 = new class432("PT", "pt", "Portuguese", class433.field5120, 3, "BR");
      field5092 = new class432("NL", "nl", "Dutch", class433.field5107, 4, "NL");
      field5097 = new class432("ES", "es", "Spanish", class433.field5107, 5, "ES");
      field5098 = new class432("ES_MX", "es-mx", "Spanish (Latin American)", class433.field5120, 6, "MX");
      class432[] var0 = method8659();
      field5093 = new class432[var0.length];
      class432[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class432 var3 = var1[var2];
         if (field5093[var3.field5101] != null) {
            throw new IllegalStateException();
         }

         field5093[var3.field5101] = var3;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqy;ILjava/lang/String;)V"
   )
   class432(String var1, String var2, String var3, class433 var4, int var5, String var6) {
      this.field5099 = var1;
      this.field5102 = var2;
      this.field5101 = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field5101;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "945116391"
   )
   String method8650() {
      return this.field5102;
   }

   public String toString() {
      return this.method8650().toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lqh;",
      garbageValue = "-1095462795"
   )
   static class432[] method8659() {
      return new class432[]{field5097, field5094, field5096, field5095, field5100, field5092, field5098};
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Lqh;",
      garbageValue = "-776001967"
   )
   public static class432 method8648(int var0) {
      return var0 >= 0 && var0 < field5093.length ? field5093[var0] : null;
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "(I)Lvj;",
      garbageValue = "1408246229"
   )
   static class546 method8661() {
      return Occluder.platformInfo;
   }
}
