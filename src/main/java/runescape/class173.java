package runescape;

import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gf")
public class class173 extends class151 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = 4885358522093636575L
   )
   long field1934;
   @ObfuscatedName("aw")
   String field1933;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   class173(class154 var1) {
      this.this$0 = var1;
      this.field1934 = -1L;
      this.field1933 = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(Buffer var1) {
      if (var1.method11196() != 255) {
         var1.offset -= -290410379;
         this.field1934 = var1.method11203();
      }

      this.field1933 = var1.method11206();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.method3987(this.field1934, this.field1933);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
      garbageValue = "1656120730"
   )
   static float[] method4097(JSONObject var0, String var1) throws JSONException {
      float[] var2 = new float[4];

      try {
         JSONArray var3 = var0.getJSONArray(var1);
         var2[0] = (float)var3.optDouble(0, 0.0D);
         var2[1] = (float)var3.optDouble(1, 0.0D);
         var2[2] = (float)var3.optDouble(2, 1.0D);
         var2[3] = (float)var3.optDouble(3, 1.0D);
      } catch (JSONException var4) {
         var2[0] = 0.0F;
         var2[1] = 0.0F;
         var2[2] = 1.0F;
         var2[3] = 1.0F;
      }

      return var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([Lqc;II)Lqc;",
      garbageValue = "-1006641339"
   )
   public static class430 findEnumerated(class430[] var0, int var1) {
      class430[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class430 var4 = var2[var3];
         if (var1 == var4.vmethod11658()) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "([[[IIIIB)V",
      garbageValue = "101"
   )
   static final void method4095(int[][][] var0, int var1, int var2, int var3) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            var0[var1][var4 + var2][var3 + var5] = 0;
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
         }
      }

      if (var3 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
         }
      }

      if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
      } else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
      } else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1382873766"
   )
   public static void method4098(int var0, int var1, int var2, int var3) {
      if (class339.field3890.size() > 1 && class339.field3890.get(0) != null && ((class351)class339.field3890.get(0)).field4012.method7146() && class339.field3890.get(1) != null && ((class351)class339.field3890.get(1)).field4012.method7146()) {
         class43.method791(var0, var1, var2, var3);
         class339.field3892.add(new class471((class477)null));
         ArrayList var4 = new ArrayList();
         var4.add(new class473(new class476((class477)null, 1, false, class339.field3897), class339.field3898));
         var4.add(new class473(new class475((class477)null, 0, false, class339.field3896), class339.field3894));
         class339.field3892.add(new class478((class477)null, var4));
         if (class339.field3889.get(0) != null && class339.field3889.get(1) != null) {
            class351 var5 = (class351)class339.field3889.get(0);
            class339.field3889.set(0, class339.field3890.get(1));
            class339.field3889.set(1, var5);
         }
      }

   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1574950540"
   )
   static void method4099() {
      if (class516.varcs != null && class516.varcs.hasUnwrittenChanges()) {
         class516.varcs.write();
      }

      class52.method1909();
      class365.method7601();
      if (class398.mouseRecorder != null) {
         class398.mouseRecorder.isRunning = false;
      }

      class398.mouseRecorder = null;
      client.packetWriter.close();
      if (class122.field1566 != null) {
         try {
            class122.field1566.method5891();
         } catch (Exception var2) {
         }
      }

      class122.field1566 = null;
      class556.method10845();
      class35.method726();
      client.field333.method2387();
      client.field334.method8685();
      class56.field816 = null;
      class257.method5884(0, 0);
      class159.method3892();
      client.field446 = false;
      class296.method6773();
      if (class70.field963 != null) {
         class70.field963.method3051();
      }

      class297.field3418.method8454();
      class137.method3667();
      if (class114.field1507 != null) {
         class114.field1507.method3504();
      }

      class22.method326();
      class260.field3111 = null;
      class260.field3108 = null;
      class260.field3107 = null;
      class193.method4316();
      class75.field1073 = null;
      client.field602.clear();
      client.field604 = 0;
      class297.field3418 = new class413();
      class114.field1507 = new class120(class521.field5519.field349, 233);

      try {
         class27.method412("oldschool", class184.field1997, Players.field5353.name, 0, 25);
      } catch (IOException var1) {
         throw new RuntimeException(var1);
      }

      class75.field1073 = new class515(255, class260.field3111, class260.field3108, 750000);
      class122.field1566 = new class258();
      class521.field5519.method658();
      class68.method2161(class70.field969);
      class121.updateGameState(0);
   }
}
