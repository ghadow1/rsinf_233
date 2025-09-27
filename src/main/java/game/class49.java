package game;

import java.math.BigInteger;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bf")
public class class49 {
   @ObfuscatedName("ai")
   static final BigInteger field705 = new BigInteger("123056383473937170840426596117786913601710378254069677452311202977930808700753135111374687037651159491724905784312176196073315049331145385325870023862070727783412148478494480395189430590307757108389515428910270057561490284632044926703798943461927403405468990364857326474173821831799161596109822205999174215947");
   @ObfuscatedName("aa")
   static final BigInteger field706 = new BigInteger("65537");

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
