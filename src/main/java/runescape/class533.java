package runescape;

import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("uq")
public class class533 implements class532 {
   @ObfuscatedName("aw")
   JSONObject field5558;

   public class533(byte[] var1) throws UnsupportedEncodingException {
      this.method10504(var1);
   }

   public class533(JSONObject var1) {
      this.field5558 = var1;
   }

   public class533(String var1) throws UnsupportedEncodingException {
      this.method10489(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Luj;",
      garbageValue = "36"
   )
   public class531 vmethod10505() {
      return class531.field5555;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "-1695762497"
   )
   public byte[] vmethod10513() throws UnsupportedEncodingException {
      return this.field5558 == null ? new byte[0] : this.field5558.toString().getBytes("UTF-8");
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1944078774"
   )
   void method10504(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.method10489(var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1776478195"
   )
   void method10489(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.field5558 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.field5558 = new JSONObject();
            this.field5558.method11962("arrayValues", var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lorg/json/JSONObject;",
      garbageValue = "-1315535938"
   )
   public JSONObject method10493() {
      return this.field5558;
   }
}
