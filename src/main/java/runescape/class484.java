package runescape;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
public class class484 {
   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "Ldr;"
   )
   static class79 field5343;
   @ObfuscatedName("ac")
   final Map field5340 = new HashMap();
   @ObfuscatedName("ap")
   final Map field5341 = new HashMap();
   @ObfuscatedName("aq")
   final DecimalFormat field5337 = new DecimalFormat();

   public class484() {
      this.field5337.setMaximumFractionDigits(2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
      garbageValue = "1464656204"
   )
   public void method9739(HttpsURLConnection var1) {
      Iterator var2 = this.field5340.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Map;",
      garbageValue = "207078211"
   )
   public Map method9740() {
      return this.field5340;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "-58"
   )
   public void method9741(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.field5340.put(var1, var2 != null ? var2 : "");
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1372912086"
   )
   public void method9742(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.field5340.remove(var1);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lst;Ljava/lang/String;B)V",
      garbageValue = "-5"
   )
   void method9743(class483 var1, String var2) {
      String var3 = String.format("%s %s", var1.method9735(), var2);
      this.method9741("Authorization", var3);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-445346272"
   )
   public void method9750(String var1) {
      this.method9743(class483.field5334, var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1252777053"
   )
   public void method9744(String var1) {
      this.method9743(class483.field5332, var1);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Luj;I)V",
      garbageValue = "-1747556450"
   )
   public void method9745(class531 var1) {
      this.field5340.put("Content-Type", var1.method10477());
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1881694441"
   )
   public void method9748() {
      this.field5340.remove("Content-Type");
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Luj;I)V",
      garbageValue = "1052145646"
   )
   public void method9747(class531 var1) {
      this.method9775(var1, 1.0F);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Luj;FI)V",
      garbageValue = "-574481301"
   )
   void method9775(class531 var1, float var2) {
      this.field5341.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.method9749();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1945821523"
   )
   void method9749() {
      this.field5340.remove("Accept");
      if (!this.field5341.isEmpty()) {
         this.field5340.put("Accept", this.method9778());
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "207769223"
   )
   String method9778() {
      ArrayList var1 = new ArrayList(this.field5341.entrySet());
      Collections.sort(var1, new class485(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((class531)var4.getKey()).method10477());
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.field5337.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }
}
