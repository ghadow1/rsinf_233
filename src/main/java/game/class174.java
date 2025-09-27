package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
public class class174 extends class167 {
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = -623256307
   )
   static int field1940;
   @ObfuscatedName("af")
   String field1935;
   @ObfuscatedName("aw")
   byte field1936;
   @ObfuscatedName("at")
   byte field1937;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   final class168 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lga;)V"
   )
   class174(class168 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1665789280"
   )
   void vmethod4108(class590 var1) {
      this.field1935 = var1.method11206();
      if (this.field1935 != null) {
         var1.method11196();
         this.field1936 = var1.method11197();
         this.field1937 = var1.method11197();
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgm;I)V",
      garbageValue = "-358275379"
   )
   void vmethod4104(class171 var1) {
      var1.field1919 = this.field1935;
      if (this.field1935 != null) {
         var1.field1917 = this.field1936;
         var1.field1921 = this.field1937;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[Lmh;",
      garbageValue = "1508631927"
   )
   public static GameServerPacket[] method4107() {
      return new GameServerPacket[]{GameServerPacket.field3718, GameServerPacket.field3668, GameServerPacket.field3684, GameServerPacket.field3670, GameServerPacket.field3698, GameServerPacket.field3708, GameServerPacket.field3794, GameServerPacket.field3674, GameServerPacket.field3675, GameServerPacket.field3676, GameServerPacket.field3677, GameServerPacket.field3678, GameServerPacket.field3679, GameServerPacket.field3680, GameServerPacket.field3681, GameServerPacket.field3705, GameServerPacket.field3789, GameServerPacket.field3727, GameServerPacket.field3667, GameServerPacket.field3686, GameServerPacket.field3687, GameServerPacket.field3688, GameServerPacket.field3689, GameServerPacket.field3690, GameServerPacket.field3691, GameServerPacket.field3692, GameServerPacket.field3755, GameServerPacket.field3694, GameServerPacket.field3695, GameServerPacket.field3768, GameServerPacket.field3767, GameServerPacket.field3770, GameServerPacket.field3699, GameServerPacket.field3700, GameServerPacket.field3701, GameServerPacket.field3762, GameServerPacket.field3703, GameServerPacket.field3704, GameServerPacket.field3753, GameServerPacket.field3702, GameServerPacket.field3707, GameServerPacket.field3730, GameServerPacket.field3709, GameServerPacket.field3710, GameServerPacket.field3711, GameServerPacket.field3712, GameServerPacket.field3738, GameServerPacket.MAP_BUILD_COMPLETE, GameServerPacket.field3715, GameServerPacket.field3772, GameServerPacket.field3719, GameServerPacket.field3797, GameServerPacket.field3732, GameServerPacket.field3720, GameServerPacket.field3799, GameServerPacket.field3722, GameServerPacket.field3757, GameServerPacket.field3804, GameServerPacket.field3748, GameServerPacket.field3726, GameServerPacket.field3696, GameServerPacket.field3728, GameServerPacket.field3729, GameServerPacket.field3716, GameServerPacket.field3737, GameServerPacket.field3672, GameServerPacket.field3733, GameServerPacket.field3734, GameServerPacket.field3776, GameServerPacket.field3736, GameServerPacket.field3781, GameServerPacket.field3735, GameServerPacket.field3739, GameServerPacket.field3740, GameServerPacket.field3741, GameServerPacket.field3682, GameServerPacket.field3743, GameServerPacket.field3744, GameServerPacket.field3745, GameServerPacket.field3746, GameServerPacket.field3747, GameServerPacket.field3759, GameServerPacket.field3693, GameServerPacket.field3750, GameServerPacket.field3751, GameServerPacket.field3752, GameServerPacket.field3742, GameServerPacket.field3754, GameServerPacket.field3685, GameServerPacket.field3756, GameServerPacket.field3671, GameServerPacket.field3758, GameServerPacket.field3683, GameServerPacket.field3760, GameServerPacket.field3761, GameServerPacket.field3721, GameServerPacket.field3787, GameServerPacket.field3803, GameServerPacket.field3765, GameServerPacket.field3766, GameServerPacket.IF_SUBOP, GameServerPacket.field3706, GameServerPacket.field3769, GameServerPacket.field3731, GameServerPacket.field3771, GameServerPacket.field3774, GameServerPacket.field3713, GameServerPacket.field3725, GameServerPacket.field3775, GameServerPacket.field3723, GameServerPacket.field3777, GameServerPacket.field3778, GameServerPacket.field3779, GameServerPacket.field3780, GameServerPacket.field3764, GameServerPacket.field3782, GameServerPacket.field3783, GameServerPacket.field3784, GameServerPacket.field3785, GameServerPacket.field3786, GameServerPacket.field3749, GameServerPacket.field3788, GameServerPacket.field3714, GameServerPacket.field3790, GameServerPacket.field3791, GameServerPacket.field3792, GameServerPacket.field3793, GameServerPacket.field3673, GameServerPacket.field3795, GameServerPacket.field3796, GameServerPacket.field3669, GameServerPacket.field3798, GameServerPacket.field3763, GameServerPacket.field3800, GameServerPacket.field3801, GameServerPacket.field3802, GameServerPacket.field3697, GameServerPacket.field3717, GameServerPacket.field3805, GameServerPacket.field3806, GameServerPacket.field3807};
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([BB)Llr;",
      garbageValue = "11"
   )
   static class301 method4102(byte[] var0) {
      return var0 == null ? new class301() : new class301(class179.method4160(var0).field6018);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1677868753"
   )
   public static void method4109() {
      class365.field4077.method7011();
      class365.field4078.method9820();
      class365.field4072 = 0;
   }
}
