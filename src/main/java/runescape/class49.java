package runescape;

import java.math.BigInteger;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bf")
public class class49 {
   @ObfuscatedName("ai")
   static final BigInteger field705 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("aa")
   static final BigInteger field706 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

   @ObfuscatedName("af")
   public static String method1889(long var0) {
      class372.field4315.setTime(new Date(var0));
      int var2 = class372.field4315.get(7);
      int var3 = class372.field4315.get(5);
      int var4 = class372.field4315.get(2);
      int var5 = class372.field4315.get(1);
      int var6 = class372.field4315.get(11);
      int var7 = class372.field4315.get(12);
      int var8 = class372.field4315.get(13);
      return class372.field4314[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class372.field4313[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }
}
