package game;

import java.util.Arrays;
import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class230 extends class233 {
   @ObfuscatedName("al")
   static final int[] field2748 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   @ObfuscatedName("au")
   static final int[] field2758 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   @ObfuscatedName("ai")
   static final int[] field2689 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   @ObfuscatedName("aa")
   static final int[] field2690 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
   @ObfuscatedName("am")
   static final int[] field2691 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
   @ObfuscatedName("an")
   static final int[] field2692 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
   @ObfuscatedName("ar")
   static final int[] field2693 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
   @ObfuscatedName("ag")
   public static boolean field2697 = false;
   @ObfuscatedName("dt")
   static final int[][] field2760 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   @ObfuscatedName("da")
   static final int[][] field2761 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   @ObfuscatedName("av")
   final int field2698;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Ljz;"
   )
   public final class244 field2699 = new class244();
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Ljz;"
   )
   final class244 field2700 = new class244();
   @ObfuscatedName("ax")
   final int field2701;
   @ObfuscatedName("ak")
   final int field2702;
   @ObfuscatedName("aj")
   final int field2703;
   @ObfuscatedName("az")
   final int field2752;
   @ObfuscatedName("bt")
   final int field2705;
   @ObfuscatedName("bs")
   final int field2706;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 1515787825
   )
   final int field2707;
   @ObfuscatedName("bi")
   final int field2708;
   @ObfuscatedName("bd")
   public int field2709;
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "[[[Lii;"
   )
   class223[][][] field2730;
   @ObfuscatedName("bb")
   public int field2711 = 0;
   @ObfuscatedName("bo")
   public int field2726 = 0;
   @ObfuscatedName("bl")
   public int field2713 = 0;
   @ObfuscatedName("by")
   public int field2714 = 0;
   @ObfuscatedName("bg")
   public float field2687 = 1.0F;
   @ObfuscatedName("bx")
   public boolean field2716 = true;
   @ObfuscatedName("bq")
   int field2749 = -1;
   @ObfuscatedName("bz")
   int field2775 = -1;
   @ObfuscatedName("bn")
   public float field2719 = -1.0F;
   @ObfuscatedName("be")
   public int field2720 = -1;
   @ObfuscatedName("bh")
   public int field2683 = -1;
   @ObfuscatedName("bk")
   boolean field2722 = false;
   @ObfuscatedName("bp")
   int field2723;
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "[Ljk;"
   )
   class236[] field2724;
   @ObfuscatedName("bv")
   int field2725;
   @ObfuscatedName("bj")
   int field2696;
   @ObfuscatedName("bm")
   int field2727;
   @ObfuscatedName("bf")
   int[][][] field2728;
   @ObfuscatedName("bw")
   int field2765 = 0;
   @ObfuscatedName("bc")
   int field2704 = 0;
   @ObfuscatedName("cw")
   int[][][] field2731;
   @ObfuscatedName("cz")
   int field2721;
   @ObfuscatedName("cf")
   int field2679 = 0;
   @ObfuscatedName("cg")
   int field2733;
   @ObfuscatedName("ci")
   int field2734;
   @ObfuscatedName("cp")
   int field2735;
   @ObfuscatedName("cm")
   int field2744;
   @ObfuscatedName("cc")
   int field2717;
   @ObfuscatedName("cj")
   int field2738;
   @ObfuscatedName("ce")
   int field2739;
   @ObfuscatedName("cr")
   int field2740;
   @ObfuscatedName("cb")
   int field2742;
   @ObfuscatedName("cu")
   int field2743;
   @ObfuscatedName("cq")
   int field2712;
   @ObfuscatedName("cn")
   int field2745;
   @ObfuscatedName("cl")
   int field2746;
   @ObfuscatedName("cx")
   float field2747;
   @ObfuscatedName("cv")
   float field2774;
   @ObfuscatedName("ca")
   float field2732;
   @ObfuscatedName("cy")
   float field2750;
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "[Ljm;"
   )
   class253[] field2751 = new class253[5];
   @ObfuscatedName("co")
   boolean field2776 = false;
   @ObfuscatedName("ck")
   int field2686 = 0;
   @ObfuscatedName("ct")
   int field2741 = 0;
   @ObfuscatedName("ch")
   int field2755 = 0;
   @ObfuscatedName("cs")
   int field2756 = 4;
   @ObfuscatedName("dd")
   int[] field2685;
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "[[Ljk;"
   )
   class236[][] field2715;
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   class436 field2759 = new class436();
   @ObfuscatedName("dc")
   int field2762;
   @ObfuscatedName("dp")
   int field2763;
   @ObfuscatedName("dw")
   int field2710;
   @ObfuscatedName("db")
   int field2769;
   @ObfuscatedName("dq")
   int field2766;
   @ObfuscatedName("dh")
   int field2767;
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "[Ljm;"
   )
   class253[] field2768 = new class253[32];
   @ObfuscatedName("dy")
   int field2772 = 0;
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lio;"
   )
   class217 field2770;
   @ObfuscatedName("dz")
   int field2771;
   @ObfuscatedName("dg")
   int field2737;
   @ObfuscatedName("dl")
   int[] field2773;
   @ObfuscatedName("dv")
   int field2754;
   @ObfuscatedName("dk")
   int field2764;
   @ObfuscatedName("dn")
   int field2729;
   @ObfuscatedName("df")
   int field2777;
   @ObfuscatedName("dx")
   BitSet field2778;
   @ObfuscatedName("di")
   BitSet field2779;
   @ObfuscatedName("dj")
   BitSet field2780;
   @ObfuscatedName("du")
   BitSet field2781;
   @ObfuscatedName("do")
   int field2782;
   @ObfuscatedName("ef")
   int field2783;

   @ObfuscatedSignature(
      descriptor = "(IIIIILio;[[[I)V"
   )
   public class230(int var1, int var2, int var3, int var4, int var5, class217 var6, int[][][] var7) {
      this.field2770 = class217.field2512;
      this.field2771 = 0;
      this.field2737 = 0;
      this.field2773 = new int[9];
      this.field2725 = var2;
      this.field2696 = var3;
      this.field2727 = var4;
      this.field2730 = new class223[var2][var3][var4];
      this.field2731 = new int[var2][var3 + 1][var4 + 1];
      this.field2728 = var7;
      this.field2772 = var5;
      this.field2770 = var6;
      this.field2698 = var1;
      if (var1 != -1) {
         this.field2701 = 0;
         this.field2778 = null;
         this.field2779 = null;
         this.field2702 = 0;
         this.field2703 = 0;
         this.field2752 = 0;
         this.field2705 = 0;
         this.field2780 = null;
         this.field2781 = null;
         this.field2706 = 0;
         this.field2707 = 0;
         this.field2708 = 0;
      } else {
         this.field2701 = 8386816;
         this.field2778 = new BitSet(this.field2701);
         this.field2779 = new BitSet(this.field2701);
         this.field2702 = 1048352;
         this.field2703 = 32761;
         this.field2752 = 181;
         this.field2705 = 9644832;
         this.field2780 = new BitSet(this.field2705);
         this.field2781 = new BitSet(this.field2705);
         this.field2706 = 1071648;
         this.field2707 = 1;
         this.field2708 = 183;
         this.field2685 = new int[this.field2756];
         this.field2715 = new class236[this.field2756][500];
         this.field2724 = new class236[500];
      }

      class228.method5052(var5);
      this.method5101();
   }

   @ObfuscatedName("ac")
   public void method5101() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field2725; ++var1) {
         for(var2 = 0; var2 < this.field2696; ++var2) {
            for(int var3 = 0; var3 < this.field2727; ++var3) {
               this.field2730[var1][var2][var3] = null;
            }
         }
      }

      if (this.field2685 != null) {
         for(var1 = 0; var1 < this.field2756; ++var1) {
            for(var2 = 0; var2 < this.field2685[var1]; ++var2) {
               this.field2715[var1][var2] = null;
            }

            this.field2685[var1] = 0;
         }
      }

      if (this.field2724 != null) {
         Arrays.fill(this.field2724, (Object)null);
      }

      this.field2723 = 0;

      for(var1 = 0; var1 < this.field2704; ++var1) {
         this.field2768[var1] = null;
      }

      this.field2704 = 0;

      for(var1 = 0; var1 < this.field2751.length; ++var1) {
         this.field2751[var1] = null;
      }

   }

   @ObfuscatedName("ap")
   public void method5275(int var1) {
      this.field2765 = var1;

      for(int var2 = 0; var2 < this.field2696; ++var2) {
         for(int var3 = 0; var3 < this.field2727; ++var3) {
            if (this.field2730[var1][var2][var3] == null) {
               this.field2730[var1][var2][var3] = new class223(var1, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("aq")
   public void method5103(int var1, int var2) {
      class223 var3 = this.field2730[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class223 var5 = this.field2730[var4][var1][var2] = this.field2730[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field2605;

            for(int var6 = 0; var6 < var5.field2603; ++var6) {
               class253 var7 = var5.field2604[var6];
               long var9 = var7.field3052;
               int var11 = (int)(var9 >>> 16 & 7L);
               boolean var8 = var11 == 2;
               if (var8 && var7.field3055 == var1 && var2 == var7.field3057) {
                  --var7.field3048;
               }
            }
         }
      }

      if (this.field2730[0][var1][var2] == null) {
         this.field2730[0][var1][var2] = new class223(0, var1, var2);
      }

      this.field2730[0][var1][var2].field2621 = var3;
      this.field2730[3][var1][var2] = null;
   }

   @ObfuscatedName("ao")
   public void method5191(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class236 var9 = new class236();
      var9.field2829 = var3 / 128;
      var9.field2816 = var4 / 128;
      var9.field2822 = var5 / 128;
      var9.field2818 = var6 / 128;
      var9.field2819 = var2;
      var9.field2815 = var3;
      var9.field2821 = var4;
      var9.field2825 = var5;
      var9.field2834 = var6;
      var9.field2824 = var7;
      var9.field2830 = var8;
      this.field2715[var1][this.field2685[var1]++] = var9;
   }

   @ObfuscatedName("as")
   public void method5223(int var1, int var2, int var3, int var4) {
      class223 var5 = this.field2730[var1][var2][var3];
      if (var5 != null) {
         this.field2730[var1][var2][var3].field2614 = var4;
      }
   }

   @ObfuscatedName("al")
   public void method5187(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class245 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class245(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2730[var22][var2][var3] == null) {
               this.field2730[var22][var2][var3] = new class223(var22, var2, var3);
            }
         }

         this.field2730[var1][var2][var3].field2600 = var21;
      } else if (var4 != 1) {
         class239 var23 = new class239(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2730[var22][var2][var3] == null) {
               this.field2730[var22][var2][var3] = new class223(var22, var2, var3);
            }
         }

         this.field2730[var1][var2][var3].field2601 = var23;
      } else {
         var21 = new class245(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2730[var22][var2][var3] == null) {
               this.field2730[var22][var2][var3] = new class223(var22, var2, var3);
            }
         }

         this.field2730[var1][var2][var3].field2600 = var21;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIIILiz;JI)V"
   )
   public void method5107(int var1, int var2, int var3, int var4, class233 var5, long var6, int var8) {
      if (var5 != null) {
         class220 var9 = new class220();
         var9.field2573 = var5;
         var9.field2570 = var2 * 8192 + 4096;
         var9.field2572 = var3 * 128 + 64;
         var9.field2569 = var4;
         var9.field2571 = var6;
         var9.field2574 = var8;
         if (this.field2730[var1][var2][var3] == null) {
            this.field2730[var1][var2][var3] = new class223(var1, var2, var3);
         }

         this.field2730[var1][var2][var3].field2611 = var9;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IIIILiz;JLiz;Liz;)V"
   )
   public void method5108(int var1, int var2, int var3, int var4, class233 var5, long var6, class233 var8, class233 var9) {
      class218 var10 = new class218();
      var10.field2516 = var5;
      var10.field2514 = var2 * 128 + 64;
      var10.field2518 = var3 * 128 + 64;
      var10.field2520 = var4;
      var10.field2519 = var6;
      var10.field2517 = var8;
      var10.field2513 = var9;
      int var11 = 0;
      class223 var12 = this.field2730[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field2603; ++var13) {
            if ((var12.field2604[var13].field3061 & 256) == 256 && var12.field2604[var13].field3062 instanceof class241) {
               class241 var14 = (class241)var12.field2604[var13].field3062;
               var14.method5459();
               if (var14.field2801 > var11) {
                  var11 = var14.field2801;
               }
            }
         }
      }

      var10.field2515 = var11;
      if (this.field2730[var1][var2][var3] == null) {
         this.field2730[var1][var2][var3] = new class223(var1, var2, var3);
      }

      this.field2730[var1][var2][var3].field2608 = var10;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIIILiz;Liz;IIJI)V"
   )
   public void method5271(int var1, int var2, int var3, int var4, class233 var5, class233 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class250 var12 = new class250();
         var12.field3028 = var9;
         var12.field3031 = var11;
         var12.field3027 = var2 * 128 + 64;
         var12.field3034 = var3 * 128 + 64;
         var12.field3026 = var4;
         var12.field3032 = var5;
         var12.field3024 = var6;
         var12.field3025 = var7;
         var12.field3029 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field2730[var13][var2][var3] == null) {
               this.field2730[var13][var2][var3] = new class223(var13, var2, var3);
            }
         }

         this.field2730[var1][var2][var3].field2609 = var12;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIILiz;Liz;IIIIJI)V"
   )
   public void method5238(int var1, int var2, int var3, int var4, class233 var5, class233 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class252 var14 = new class252();
         var14.field3037 = var11;
         var14.field3038 = var13;
         var14.field3039 = var2 * 128 + 64;
         var14.field3040 = var3 * 128 + 64;
         var14.field3041 = var4;
         var14.field3036 = var5;
         var14.field3045 = var6;
         var14.field3046 = var7;
         var14.field3042 = var8;
         var14.method5789(var9, var10);

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field2730[var15][var2][var3] == null) {
               this.field2730[var15][var2][var3] = new class223(var15, var2, var3);
            }
         }

         this.field2730[var1][var2][var3].field2610 = var14;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILiz;IJI)Z"
   )
   public boolean method5147(int var1, int var2, int var3, int var4, int var5, int var6, class233 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var5 * 64 + var2 * 128;
         int var13 = var6 * 64 + var3 * 128;
         return this.method5264(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIIIILiz;IJZ)Z"
   )
   public boolean method5112(int var1, int var2, int var3, int var4, int var5, class233 var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var5 + var2;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method5264(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IIIIILiz;IJIIII)Z"
   )
   public boolean method5113(int var1, int var2, int var3, int var4, int var5, class233 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method5264(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIILiz;IZJI)Z"
   )
   boolean method5264(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class233 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field2696 || var16 >= this.field2727) {
               return false;
            }

            class223 var23 = this.field2730[var1][var15][var16];
            if (var23 != null && var23.field2603 >= 5) {
               return false;
            }
         }
      }

      class253 var21 = new class253();
      var21.field3052 = var12;
      var21.field3061 = var14;
      var21.field3048 = var1;
      var21.field3053 = var6;
      var21.field3054 = var7;
      var21.field3049 = var8;
      var21.field3062 = var9;
      var21.field3051 = var10;
      var21.field3055 = var2;
      var21.field3057 = var3;
      var21.field3050 = var2 + var4 - 1;
      var21.field3058 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var17 = var3; var17 < var3 + var5; ++var17) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var17 > var3) {
               var18 += 8;
            }

            if (var17 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.field2730[var19][var16][var17] == null) {
                  this.field2730[var19][var16][var17] = new class223(var19, var16, var17);
               }
            }

            class223 var22 = this.field2730[var1][var16][var17];
            var22.field2604[var22.field2603] = var21;
            var22.field2612[var22.field2603] = var18;
            var22.field2615 |= var18;
            ++var22.field2603;
         }
      }

      if (var11) {
         if (this.field2704 >= this.field2768.length) {
            this.field2768 = (class253[])((class253[])Arrays.copyOf(this.field2768, this.field2768.length * 2));
         }

         this.field2768[this.field2704++] = var21;
      }

      return true;
   }

   @ObfuscatedName("av")
   public void method5115() {
      for(int var1 = 0; var1 < this.field2704; ++var1) {
         class253 var2 = this.field2768[var1];
         this.method5116(var2);
         this.field2768[var1] = null;
      }

      this.field2704 = 0;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljm;)V"
   )
   void method5116(class253 var1) {
      for(int var2 = var1.field3055; var2 <= var1.field3050; ++var2) {
         for(int var3 = var1.field3057; var3 <= var1.field3058; ++var3) {
            class223 var4 = this.field2730[var1.field3048][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field2603; ++var5) {
                  if (var4.field2604[var5] == var1) {
                     --var4.field2603;

                     for(int var6 = var5; var6 < var4.field2603; ++var6) {
                        var4.field2604[var6] = var4.field2604[var6 + 1];
                        var4.field2612[var6] = var4.field2612[var6 + 1];
                     }

                     var4.field2604[var4.field2603] = null;
                     break;
                  }
               }

               var4.field2615 = 0;

               for(var5 = 0; var5 < var4.field2603; ++var5) {
                  var4.field2615 |= var4.field2612[var5];
               }
            }
         }
      }

   }

   @ObfuscatedName("ab")
   public void method5117(int var1, int var2, int var3, int var4) {
      class223 var5 = this.field2730[var1][var2][var3];
      if (var5 != null) {
         class252 var6 = var5.field2610;
         if (var6 != null) {
            var6.method5789(var4 * var6.field3043 / 16, var4 * var6.field3044 / 16);
         }
      }
   }

   @ObfuscatedName("ax")
   public void method5118(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      if (var4 != null) {
         var4.field2609 = null;
      }
   }

   @ObfuscatedName("ak")
   public void method5119(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      if (var4 != null) {
         var4.field2610 = null;
      }
   }

   @ObfuscatedName("aj")
   public void method5120(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field2603; ++var5) {
            class253 var6 = var4.field2604[var5];
            long var8 = var6.field3052;
            int var10 = (int)(var8 >>> 16 & 7L);
            boolean var7 = var10 == 2;
            if (var7 && var2 == var6.field3055 && var3 == var6.field3057) {
               this.method5116(var6);
               return;
            }
         }

      }
   }

   @ObfuscatedName("az")
   public void method5121(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      if (var4 != null) {
         var4.field2611 = null;
      }
   }

   @ObfuscatedName("bt")
   public void method5154(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      if (var4 != null) {
         var4.field2608 = null;
      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(III)Ljf;"
   )
   public class250 method5123(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      return var4 == null ? null : var4.field2609;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(III)Ljr;"
   )
   public class252 method5261(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      return var4 == null ? null : var4.field2610;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(III)Ljm;"
   )
   public class253 method5226(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field2603; ++var5) {
            class253 var6 = var4.field2604[var5];
            long var8 = var6.field3052;
            int var10 = (int)(var8 >>> 16 & 7L);
            boolean var7 = var10 == 2;
            if (var7 && var2 == var6.field3055 && var3 == var6.field3057) {
               return var6;
            }
         }

         return null;
      }
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(III)Lir;"
   )
   public class220 method5126(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      return var4 != null && var4.field2611 != null ? var4.field2611 : null;
   }

   @ObfuscatedName("ba")
   public long method5127(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      return var4 != null && var4.field2609 != null ? var4.field2609.field3028 : 0L;
   }

   @ObfuscatedName("bb")
   public long method5128(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      return var4 != null && var4.field2610 != null ? var4.field2610.field3037 : 0L;
   }

   @ObfuscatedName("bo")
   public long method5341(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field2603; ++var5) {
            class253 var6 = var4.field2604[var5];
            long var8 = var6.field3052;
            int var10 = (int)(var8 >>> 16 & 7L);
            boolean var7 = var10 == 2;
            if (var7 && var2 == var6.field3055 && var3 == var6.field3057) {
               return var6.field3052;
            }
         }

         return 0L;
      }
   }

   @ObfuscatedName("bl")
   public long method5215(int var1, int var2, int var3) {
      class223 var4 = this.field2730[var1][var2][var3];
      return var4 != null && var4.field2611 != null ? var4.field2611.field2571 : 0L;
   }

   @ObfuscatedName("by")
   public int method5169(int var1, int var2, int var3, long var4) {
      class223 var6 = this.field2730[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field2609 != null && var6.field2609.field3028 == var4) {
         return var6.field2609.field3031 & 255;
      } else if (var6.field2610 != null && var6.field2610.field3037 == var4) {
         return var6.field2610.field3038 & 255;
      } else if (var6.field2611 != null && var6.field2611.field2571 == var4) {
         return var6.field2611.field2574 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field2603; ++var7) {
            if (var6.field2604[var7].field3052 == var4) {
               return var6.field2604[var7].field3061 & 255;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("bg")
   public void method5132(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2725; ++var4) {
         for(int var5 = 0; var5 < this.field2696; ++var5) {
            for(int var6 = 0; var6 < this.field2727; ++var6) {
               class223 var7 = this.field2730[var4][var5][var6];
               if (var7 != null) {
                  class250 var8 = var7.field2609;
                  class219 var10;
                  if (var8 != null && var8.field3032 instanceof class219) {
                     class219 var9 = (class219)var8.field3032;
                     this.method5134(var9, var4, var5, var6, 1, 1);
                     if (var8.field3024 instanceof class219) {
                        var10 = (class219)var8.field3024;
                        this.method5134(var10, var4, var5, var6, 1, 1);
                        class219.method4831(var9, var10, 0, 0, 0, false);
                        var8.field3024 = var10.method4854(var10.field2554, var10.field2555, var1, var2, var3);
                     }

                     var8.field3032 = var9.method4854(var9.field2554, var9.field2555, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field2603; ++var12) {
                     class253 var14 = var7.field2604[var12];
                     if (var14 != null && var14.field3062 instanceof class219) {
                        class219 var11 = (class219)var14.field3062;
                        this.method5134(var11, var4, var5, var6, var14.field3050 - var14.field3055 + 1, var14.field3058 - var14.field3057 + 1);
                        var14.field3062 = var11.method4854(var11.field2554, var11.field2555, var1, var2, var3);
                     }
                  }

                  class220 var13 = var7.field2611;
                  if (var13 != null && var13.field2573 instanceof class219) {
                     var10 = (class219)var13.field2573;
                     this.method5133(var10, var4, var5, var6);
                     var13.field2573 = var10.method4854(var10.field2554, var10.field2555, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Liu;III)V"
   )
   void method5133(class219 var1, int var2, int var3, int var4) {
      int var6 = var3 + 1;
      int var7 = var4 - 1;
      int var8 = var4 + 1;

      for(int var9 = var3; var9 <= var6; ++var9) {
         if (var9 >= 0 && var9 < this.field2696) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (var10 >= 0 && var10 < this.field2727 && (var9 >= var6 || var10 >= var8)) {
                  class223 var11 = this.field2730[var2][var9][var10];
                  if (var11 != null && var11.field2611 != null && var11.field2611.field2573 instanceof class219) {
                     int var12 = this.method5135(var2, var9, var10, var2, var3, var4);
                     class219 var13 = (class219)var11.field2611.field2573;
                     class219.method4831(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(Liu;IIIII)V"
   )
   void method5134(class219 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field2725) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field2696) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field2727 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        class223 var15 = this.field2730[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = this.method5135(var12, var13, var14, var2, var3, var4);
                           class250 var17 = var15.field2609;
                           if (var17 != null) {
                              class219 var18;
                              if (var17.field3032 instanceof class219) {
                                 var18 = (class219)var17.field3032;
                                 class219.method4831(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field3024 instanceof class219) {
                                 var18 = (class219)var17.field3024;
                                 class219.method4831(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field2603; ++var23) {
                              class253 var19 = var15.field2604[var23];
                              if (var19 != null && var19.field3062 instanceof class219) {
                                 class219 var20 = (class219)var19.field3062;
                                 int var21 = var19.field3050 - var19.field3055 + 1;
                                 int var22 = var19.field3058 - var19.field3057 + 1;
                                 class219.method4831(var1, var20, (var21 - var5) * 64 + (var19.field3055 - var3) * 128, var16, (var19.field3057 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   @ObfuscatedName("bz")
   int method5135(int var1, int var2, int var3, int var4, int var5, int var6) {
      return this.method5136(var1, var2, var3) - this.method5136(var4, var5, var6);
   }

   @ObfuscatedName("bn")
   int method5136(int var1, int var2, int var3) {
      return (this.field2728[var1][var2 + 1][var3 + 1] + this.field2728[var1][var2][var3] + this.field2728[var1][var2][var3 + 1] + this.field2728[var1][var2 + 1][var3]) / 4;
   }

   @ObfuscatedName("be")
   public void method5316(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class223 var7 = this.field2730[var4][var5][var6];
      if (var7 != null) {
         class245 var8 = var7.field2600;
         int var10;
         if (var8 != null) {
            int var18 = var8.field2985;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class239 var9 = var7.field2601;
            if (var9 != null) {
               var10 = var9.field2869;
               int var11 = var9.field2870;
               int var12 = var9.field2871;
               int var13 = var9.field2872;
               int[] var14 = field2760[var10];
               int[] var15 = field2761[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   @ObfuscatedName("bh")
   public void method5138(int var1) {
      this.field2772 = class505.method10135(25, 90, var1);
      class228.method5052(this.field2772);
      if (this.field2773 != null && this.field2773.length > 0) {
         this.method5152(this.field2773, this.field2754, this.field2764, this.field2729, this.field2777);
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Lio;)V"
   )
   public void method5139(class217 var1) {
      if (var1 != this.field2770) {
         this.field2770 = var1;
         this.method5152(this.field2773, this.field2754, this.field2764, this.field2729, this.field2777);
      }

   }

   @ObfuscatedName("bp")
   boolean method5207(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var5 + var4 * this.field2752 + var2 * this.field2702 + var3 * this.field2703);
   }

   @ObfuscatedName("br")
   boolean method5282(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var5 + var4 * this.field2752 + var2 * this.field2702 + var3 * this.field2703, var6);
      return var6;
   }

   @ObfuscatedName("bv")
   boolean method5175(int var1, int var2, int var3, int var4) {
      return this.method5207(this.field2778, var1, var2, var3, var4);
   }

   @ObfuscatedName("bj")
   boolean method5336(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5282(this.field2778, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("bm")
   boolean method5144(int var1, int var2, int var3, int var4) {
      return this.method5207(this.field2779, var1, var2, var3, var4);
   }

   @ObfuscatedName("bf")
   boolean method5145(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5282(this.field2779, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("bw")
   boolean method5146(BitSet var1, int var2, int var3, int var4, int var5) {
      return var1.get(var5 + var4 * this.field2708 + var3 * this.field2707 * '苑' + var2 * this.field2706);
   }

   @ObfuscatedName("cf")
   boolean method5170(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
      var1.set(var5 + var4 * this.field2708 + var3 * this.field2707 * '苑' + var2 * this.field2706, var6);
      return var6;
   }

   @ObfuscatedName("cg")
   boolean method5148(int var1, int var2, int var3, int var4) {
      return this.method5146(this.field2780, var1, var2, var3, var4);
   }

   @ObfuscatedName("ci")
   boolean method5149(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5170(this.field2780, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("cp")
   boolean method5179(int var1, int var2, int var3, int var4) {
      return this.method5146(this.field2781, var1, var2, var3, var4);
   }

   @ObfuscatedName("cm")
   boolean method5222(int var1, int var2, int var3, int var4, boolean var5) {
      return this.method5170(this.field2781, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("cc")
   public void method5152(int[] var1, int var2, int var3, int var4, int var5) {
      this.field2773 = var1;
      this.field2754 = var2;
      this.field2764 = var3;
      this.field2729 = var4;
      this.field2777 = var5;
      this.field2710 = 0;
      this.field2769 = 0;
      this.field2766 = var4;
      this.field2767 = var5;
      this.field2762 = var4 / 2;
      this.field2763 = var5 / 2;
      this.field2779.set(0, this.field2779.size());
      this.field2781.set(0, this.field2781.size());
   }

   @ObfuscatedName("cj")
   void method5158(int var1, int var2) {
      this.field2782 = var1;
      this.field2783 = var2;
   }

   @ObfuscatedName("ce")
   boolean method5150(int var1, int var2) {
      if (!this.method5144(this.field2782, this.field2783, var1, var2)) {
         return this.method5175(this.field2782, this.field2783, var1, var2);
      } else {
         this.method5145(this.field2782, this.field2783, var1, var2, false);
         boolean var3 = false;

         for(int var4 = -1; var4 <= 1; ++var4) {
            for(int var5 = -1; var5 <= 1; ++var5) {
               if (this.method5281(this.field2782, this.field2783, var4 + var1 + 1, var5 + var2 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5281(this.field2782, (this.field2783 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5281(this.field2782 + 1, this.field2783, var4 + var1 + 1, var5 + var2 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }

               if (this.method5281(this.field2782 + 1, (this.field2783 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
                  var3 = true;
                  var4 = 2;
                  break;
               }
            }
         }

         return this.method5336(this.field2782, this.field2783, var1, var2, var3);
      }
   }

   @ObfuscatedName("cr")
   boolean method5281(int var1, int var2, int var3, int var4) {
      if (!this.method5179(var1, var2, var3, var4)) {
         return this.method5148(var1, var2, var3, var4);
      } else {
         this.method5222(var1, var2, var3, var4, false);
         int var5 = var1 * 32 + 128;
         int var6 = var2 * 64;
         int var7 = (var3 - this.field2772 - this.field2771 - 1) * 128;
         int var8 = (var4 - this.field2772 - this.field2737 - 1) * 128;

         for(int var9 = -this.field2754; var9 <= this.field2764; var9 += 128) {
            if (this.method5156(var7, var9 + this.field2773[var1], var8, var5, var6)) {
               return this.method5149(var1, var2, var3, var4, true);
            }
         }

         return this.method5149(var1, var2, var3, var4, false);
      }
   }

   @ObfuscatedName("cb")
   boolean method5156(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = class225.field2637;
      int[] var7 = class225.field2636;
      int var8 = var6[var4];
      int var9 = var7[var4];
      int var10 = var6[var5];
      int var11 = var7[var5];
      int var12 = var11 * var1 + var3 * var10 >> 16;
      int var13 = var3 * var11 - var10 * var1 >> 16;
      int var14 = var13 * var9 + var8 * var2 >> 16;
      int var15 = var9 * var2 - var13 * var8 >> 16;
      if (var14 >= 50 && var14 <= class228.method5050()) {
         int var16 = var12 * 128 / var14 + this.field2762;
         int var17 = var15 * 128 / var14 + this.field2763;
         return var16 >= this.field2710 && var16 <= this.field2766 && var17 >= this.field2769 && var17 <= this.field2767;
      } else {
         return false;
      }
   }

   @ObfuscatedName("cu")
   public void method5292(boolean var1) {
      if (!this.method5160() || var1) {
         this.field2776 = true;
         this.field2722 = var1;
         this.field2720 = -1;
         this.field2683 = -1;
      }
   }

   @ObfuscatedName("cq")
   public void method5140(int var1, int var2, int var3) {
      this.field2686 = var1;
      this.field2741 = var2;
      this.field2755 = var3;
   }

   @ObfuscatedName("cn")
   public void method5131() {
      this.field2722 = true;
   }

   @ObfuscatedName("cl")
   public boolean method5160() {
      return this.field2722 && this.field2720 != -1;
   }

   @ObfuscatedName("cx")
   void method5161() {
      if (this.field2776) {
         this.field2776 = false;
         this.field2720 = this.field2749;
         this.field2683 = this.field2775;
      }

   }

   @ObfuscatedName("ca")
   public void method5162() {
      this.field2720 = -1;
      this.field2722 = false;
   }

   @ObfuscatedName("cy")
   public void method5163(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field2696 * 128) {
         var1 = this.field2696 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field2727 * 128) {
         var3 = this.field2727 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      this.field2747 = class225.field2630[var4];
      this.field2774 = class225.field2638[var4];
      this.field2732 = class225.field2630[var5];
      this.field2750 = class225.field2638[var5];
      this.method5158((var4 - 128) / 32, var5 / 64);
      this.field2738 = var1;
      this.field2739 = var2;
      this.field2740 = var3;
      this.field2721 = var1 / 128;
      this.field2742 = var3 / 128;
      this.field2743 = var7 / 128;
      this.field2712 = var8 / 128;
      this.field2711 = var6;
      class226 var10 = new class226(var1, var2, var3, var4, var5, var7, var8);
      this.method5164(var10, var9);
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(Lji;Z)V"
   )
   void method5164(class238 var1, boolean var2) {
      ++this.field2733;
      this.field2749 = -1;
      this.field2775 = -1;
      this.field2719 = -1.0F;
      this.field2700.method5648(class225.field2632.field3001);
      class225.field2632.field3001.method5648(this.field2699);
      boolean var3 = this.field2698 == -1;
      this.field2745 = !var2 && this.field2770 != class217.field2512 ? this.field2743 : this.field2721;
      this.field2746 = !var2 && this.field2770 != class217.field2512 ? this.field2712 : this.field2742;
      if (var3) {
         this.field2734 = this.field2745 - this.field2772;
         if (this.field2734 < 0) {
            this.field2734 = 0;
         }

         this.field2744 = this.field2746 - this.field2772;
         if (this.field2744 < 0) {
            this.field2744 = 0;
         }

         this.field2735 = this.field2745 + this.field2772;
         if (this.field2735 > this.field2696) {
            this.field2735 = this.field2696;
         }

         this.field2717 = this.field2746 + this.field2772;
         if (this.field2717 > this.field2727) {
            this.field2717 = this.field2727;
         }
      } else {
         this.field2734 = 0;
         this.field2744 = 0;
         this.field2735 = this.field2696;
         this.field2717 = this.field2727;
         this.field2745 = this.field2696 / 2;
         this.field2746 = this.field2727 / 2;
         this.field2772 = Math.max(this.field2745, this.field2746);
      }

      this.field2771 = this.field2721 - this.field2745;
      this.field2737 = this.field2742 - this.field2746;
      if (var3) {
         this.method5166();
      }

      this.field2679 = 0;

      int var4;
      int var6;
      for(var4 = this.field2765; var4 < this.field2725; ++var4) {
         class223[][] var15 = this.field2730[var4];

         for(var6 = this.field2734; var6 < this.field2735; ++var6) {
            for(int var16 = this.field2744; var16 < this.field2717; ++var16) {
               class223 var17 = var15[var6][var16];
               if (var17 != null) {
                  if (var17.field2614 > this.field2711 || var3 && !this.method5150(var6 - this.field2721 + this.field2771 + this.field2772, var16 - this.field2742 + this.field2737 + this.field2772) && this.field2728[var4][var6][var16] - this.field2739 < 2000) {
                     var17.field2599 = false;
                     var17.field2602 = false;
                     var17.field2618 = 0;
                  } else {
                     var17.field2599 = true;
                     var17.field2602 = true;
                     if (var17.field2603 > 0) {
                        var17.field2617 = true;
                     } else {
                        var17.field2617 = false;
                     }

                     ++this.field2679;
                  }
               }
            }
         }
      }

      var4 = Math.abs(this.field2771);
      int var5 = Math.abs(this.field2737);

      class223[][] var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      class223 var14;
      for(var6 = this.field2765; var6 < this.field2725; ++var6) {
         var7 = this.field2730[var6];

         for(var8 = -(var4 + this.field2772); var8 <= 0; ++var8) {
            var9 = var8 + this.field2721;
            var10 = this.field2721 - var8;
            if (var9 >= this.field2734 || var10 < this.field2735) {
               for(var11 = -(var5 + this.field2772); var11 <= 0; ++var11) {
                  var12 = var11 + this.field2742;
                  var13 = this.field2742 - var11;
                  if (var9 >= this.field2734 && var9 < this.field2735) {
                     if (var12 >= this.field2744 && var12 < this.field2717) {
                        var14 = var7[var9][var12];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, true);
                        }
                     }

                     if (var13 >= this.field2744 && var13 < this.field2717) {
                        var14 = var7[var9][var13];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, true);
                        }
                     }
                  }

                  if (var10 >= this.field2734 && var10 < this.field2735) {
                     if (var12 >= this.field2744 && var12 < this.field2717) {
                        var14 = var7[var10][var12];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, true);
                        }
                     }

                     if (var13 >= this.field2744 && var13 < this.field2717) {
                        var14 = var7[var10][var13];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, true);
                        }
                     }
                  }

                  if (this.field2679 == 0) {
                     this.method5161();
                     class225.field2632.field3001.method5648(this.field2700);
                     return;
                  }
               }
            }
         }
      }

      for(var6 = this.field2765; var6 < this.field2725; ++var6) {
         var7 = this.field2730[var6];

         for(var8 = -(var4 + this.field2772); var8 <= 0; ++var8) {
            var9 = var8 + this.field2745;
            var10 = this.field2745 - var8;
            if (var9 >= this.field2734 || var10 < this.field2735) {
               for(var11 = -(var5 + this.field2772); var11 <= 0; ++var11) {
                  var12 = var11 + this.field2746;
                  var13 = this.field2746 - var11;
                  if (var9 >= this.field2734 && var9 < this.field2735) {
                     if (var12 >= this.field2744 && var12 < this.field2717) {
                        var14 = var7[var9][var12];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, false);
                        }
                     }

                     if (var13 >= this.field2744 && var13 < this.field2717) {
                        var14 = var7[var9][var13];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, false);
                        }
                     }
                  }

                  if (var10 >= this.field2734 && var10 < this.field2735) {
                     if (var12 >= this.field2744 && var12 < this.field2717) {
                        var14 = var7[var10][var12];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, false);
                        }
                     }

                     if (var13 >= this.field2744 && var13 < this.field2717) {
                        var14 = var7[var10][var13];
                        if (var14 != null && var14.field2599) {
                           this.method5165(var1, var14, false);
                        }
                     }
                  }

                  if (this.field2679 == 0) {
                     this.method5161();
                     class225.field2632.field3001.method5648(this.field2700);
                     return;
                  }
               }
            }
         }
      }

      class225.field2632.field3001.method5648(this.field2700);
      this.method5161();
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(Lji;Lii;Z)V"
   )
   void method5165(class238 var1, class223 var2, boolean var3) {
      this.field2759.method8689(var2);

      while(true) {
         class223 var4;
         int var5;
         int var6;
         int var7;
         int var8;
         class223[][] var9;
         class223 var10;
         int var12;
         int var15;
         int var16;
         int var24;
         int var25;
         do {
            do {
               do {
                  do {
                     do {
                        label596:
                        do {
                           while(true) {
                              class250 var11;
                              class253 var13;
                              int var17;
                              int var18;
                              int var19;
                              boolean var20;
                              int var21;
                              class223 var36;
                              while(true) {
                                 do {
                                    var4 = (class223)this.field2759.method8716();
                                    if (var4 == null) {
                                       return;
                                    }
                                 } while(!var4.field2602);

                                 var5 = var4.field2613;
                                 var6 = var4.field2607;
                                 var7 = var4.field2605;
                                 var8 = var4.field2624;
                                 var9 = this.field2730[var7];
                                 if (!var4.field2599) {
                                    break;
                                 }

                                 if (var3) {
                                    if (var7 > 0) {
                                       var10 = this.field2730[var7 - 1][var5][var6];
                                       if (var10 != null && var10.field2602) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= this.field2721 && var5 > this.field2734) {
                                       var10 = var9[var5 - 1][var6];
                                       if (var10 != null && var10.field2602 && (var10.field2599 || (var4.field2615 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= this.field2721 && var5 < this.field2735 - 1) {
                                       var10 = var9[var5 + 1][var6];
                                       if (var10 != null && var10.field2602 && (var10.field2599 || (var4.field2615 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 <= this.field2742 && var6 > this.field2744) {
                                       var10 = var9[var5][var6 - 1];
                                       if (var10 != null && var10.field2602 && (var10.field2599 || (var4.field2615 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var6 >= this.field2742 && var6 < this.field2717 - 1) {
                                       var10 = var9[var5][var6 + 1];
                                       if (var10 != null && var10.field2602 && (var10.field2599 || (var4.field2615 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var3 = true;
                                 }

                                 var4.field2599 = false;
                                 if (var4.field2621 != null) {
                                    var10 = var4.field2621;
                                    if (var10.field2600 != null) {
                                       if (!this.method5167(0, var5, var6)) {
                                          var1.vmethod5408(this, var10.field2600, 0, var5, var6);
                                       }
                                    } else if (var10.field2601 != null && !this.method5167(0, var5, var6)) {
                                       var1.vmethod5410(this, var10.field2601, var5, var6);
                                    }

                                    var11 = var10.field2609;
                                    if (var11 != null) {
                                       var1.vmethod5415(var11.field3032, 0, var11.field3027 * 4096, var11.field3026, var11.field3034 * 4096, var11.field3028);
                                    }

                                    for(var12 = 0; var12 < var10.field2603; ++var12) {
                                       var13 = var10.field2604[var12];
                                       if (var13 != null) {
                                          var1.vmethod5415(var13.field3062, var13.field3051, var13.field3053, var13.field3049, var13.field3054, var13.field3052);
                                       }
                                    }
                                 }

                                 var20 = false;
                                 if (var4.field2600 != null) {
                                    if (!this.method5167(var8, var5, var6)) {
                                       var20 = true;
                                       if (var4.field2600.field2988 != 12345678 || var7 <= this.field2686) {
                                          var1.vmethod5408(this, var4.field2600, var8, var5, var6);
                                       }
                                    }
                                 } else if (var4.field2601 != null && !this.method5167(var8, var5, var6)) {
                                    var20 = true;
                                    var1.vmethod5410(this, var4.field2601, var5, var6);
                                 }

                                 var21 = 0;
                                 var12 = 0;
                                 class250 var31 = var4.field2609;
                                 class252 var14 = var4.field2610;
                                 if (var31 != null || var14 != null) {
                                    if (var5 == this.field2721) {
                                       ++var21;
                                    } else if (this.field2721 < var5) {
                                       var21 += 2;
                                    }

                                    if (var6 == this.field2742) {
                                       var21 += 3;
                                    } else if (this.field2742 > var6) {
                                       var21 += 6;
                                    }

                                    var12 = field2748[var21];
                                    var4.field2616 = field2689[var21];
                                 }

                                 if (var31 != null) {
                                    if ((var31.field3025 & field2758[var21]) != 0) {
                                       if (var31.field3025 == 16) {
                                          var4.field2618 = 3;
                                          var4.field2619 = field2690[var21];
                                          var4.field2606 = 3 - var4.field2619;
                                       } else if (var31.field3025 == 32) {
                                          var4.field2618 = 6;
                                          var4.field2619 = field2691[var21];
                                          var4.field2606 = 6 - var4.field2619;
                                       } else if (var31.field3025 == 64) {
                                          var4.field2618 = 12;
                                          var4.field2619 = field2692[var21];
                                          var4.field2606 = 12 - var4.field2619;
                                       } else {
                                          var4.field2618 = 9;
                                          var4.field2619 = field2693[var21];
                                          var4.field2606 = 9 - var4.field2619;
                                       }
                                    } else {
                                       var4.field2618 = 0;
                                    }

                                    if ((var31.field3025 & var12) != 0 && !this.method5168(var8, var5, var6, var31.field3025)) {
                                       var1.vmethod5415(var31.field3032, 0, var31.field3027 * 4096, var31.field3026, var31.field3034 * 4096, var31.field3028);
                                    }

                                    if ((var31.field3029 & var12) != 0 && !this.method5168(var8, var5, var6, var31.field3029)) {
                                       var1.vmethod5415(var31.field3024, 0, var31.field3027 * 4096, var31.field3026, var31.field3034 * 4096, var31.field3028);
                                    }
                                 }

                                 if (var14 != null && !this.method5122(var8, var5, var6, var14.field3036.field2801)) {
                                    if ((var14.field3046 & var12) != 0) {
                                       var1.vmethod5415(var14.field3036, 0, var14.field3039 * 4096 + var14.field3047, var14.field3041, var14.field3040 * 4096 + var14.field3035, var14.field3037);
                                    } else if (var14.field3046 == 256) {
                                       var15 = var14.field3039 * 4096 - this.field2738;
                                       var16 = var14.field3040 * 4096 - this.field2740;
                                       var17 = var14.field3042;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var15;
                                       } else {
                                          var18 = -var15;
                                       }

                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var1.vmethod5415(var14.field3036, 0, var14.field3039 * 4096 + var14.field3047, var14.field3041, var14.field3040 * 4096 + var14.field3035, var14.field3037);
                                       } else if (var14.field3045 != null) {
                                          var1.vmethod5415(var14.field3045, 0, var14.field3039 * 4096, var14.field3041, var14.field3040 * 4096, var14.field3037);
                                       }
                                    }
                                 }

                                 if (var20) {
                                    class220 var22 = var4.field2611;
                                    if (var22 != null) {
                                       var1.vmethod5415(var22.field2573, 0, var22.field2570 * 64, var22.field2569, var22.field2572 * 4096, var22.field2571);
                                    }

                                    class218 var23 = var4.field2608;
                                    if (var23 != null && var23.field2515 == 0) {
                                       if (var23.field2517 != null) {
                                          var1.vmethod5415(var23.field2517, 0, var23.field2514 * 4096, var23.field2520, var23.field2518 * 4096, var23.field2519);
                                       }

                                       if (var23.field2513 != null) {
                                          var1.vmethod5415(var23.field2513, 0, var23.field2514 * 4096, var23.field2520, var23.field2518 * 4096, var23.field2519);
                                       }

                                       if (var23.field2516 != null) {
                                          var1.vmethod5415(var23.field2516, 0, var23.field2514 * 4096, var23.field2520, var23.field2518 * 4096, var23.field2519);
                                       }
                                    }
                                 }

                                 var15 = var4.field2615;
                                 if (var15 != 0) {
                                    if (var5 < this.field2721 && var5 >= this.field2734 && var5 < this.field2735 - 1 && (var15 & 4) != 0) {
                                       var36 = var9[var5 + 1][var6];
                                       if (var36 != null && var36.field2602) {
                                          this.field2759.method8689(var36);
                                       }
                                    }

                                    if (var6 < this.field2742 && var6 >= this.field2744 && var6 < this.field2717 - 1 && (var15 & 2) != 0) {
                                       var36 = var9[var5][var6 + 1];
                                       if (var36 != null && var36.field2602) {
                                          this.field2759.method8689(var36);
                                       }
                                    }

                                    if (var5 > this.field2721 && var5 > this.field2734 && var5 < this.field2735 && (var15 & 1) != 0) {
                                       var36 = var9[var5 - 1][var6];
                                       if (var36 != null && var36.field2602) {
                                          this.field2759.method8689(var36);
                                       }
                                    }

                                    if (var6 > this.field2742 && var6 > this.field2744 && var6 < this.field2717 && (var15 & 8) != 0) {
                                       var36 = var9[var5][var6 - 1];
                                       if (var36 != null && var36.field2602) {
                                          this.field2759.method8689(var36);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var4.field2618 != 0) {
                                 var20 = true;

                                 for(var21 = 0; var21 < var4.field2603; ++var21) {
                                    if (var4.field2604[var21].field3060 != this.field2733 && (var4.field2612[var21] & var4.field2618) == var4.field2619) {
                                       var20 = false;
                                       break;
                                    }
                                 }

                                 if (var20) {
                                    var11 = var4.field2609;
                                    if (!this.method5168(var8, var5, var6, var11.field3025)) {
                                       var1.vmethod5415(var11.field3032, 0, var11.field3027 * 4096, var11.field3026, var11.field3034 * 4096, var11.field3028);
                                    }

                                    var4.field2618 = 0;
                                 }
                              }

                              if (!var4.field2617) {
                                 break;
                              }

                              try {
                                 int var34 = var4.field2603;
                                 var4.field2617 = false;
                                 var21 = 0;

                                 label588:
                                 for(var12 = 0; var12 < var34; ++var12) {
                                    var13 = var4.field2604[var12];
                                    if (var13.field3060 != this.field2733) {
                                       for(var24 = var13.field3055; var24 <= var13.field3050; ++var24) {
                                          for(var15 = var13.field3057; var15 <= var13.field3058; ++var15) {
                                             var36 = var9[var24][var15];
                                             if (var36.field2599) {
                                                var4.field2617 = true;
                                                continue label588;
                                             }

                                             if (var36.field2618 != 0) {
                                                var17 = 0;
                                                if (var24 > var13.field3055) {
                                                   ++var17;
                                                }

                                                if (var24 < var13.field3050) {
                                                   var17 += 4;
                                                }

                                                if (var15 > var13.field3057) {
                                                   var17 += 8;
                                                }

                                                if (var15 < var13.field3058) {
                                                   var17 += 2;
                                                }

                                                if ((var17 & var36.field2618) == var4.field2606) {
                                                   var4.field2617 = true;
                                                   continue label588;
                                                }
                                             }
                                          }
                                       }

                                       this.field2751[var21++] = var13;
                                       var24 = this.field2721 - var13.field3055;
                                       var15 = var13.field3050 - this.field2721;
                                       if (var15 > var24) {
                                          var24 = var15;
                                       }

                                       var16 = this.field2742 - var13.field3057;
                                       var17 = var13.field3058 - this.field2742;
                                       if (var17 > var16) {
                                          var13.field3059 = var24 + var17;
                                       } else {
                                          var13.field3059 = var24 + var16;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var12 = -50;
                                    var25 = -1;

                                    for(var24 = 0; var24 < var21; ++var24) {
                                       class253 var35 = this.field2751[var24];
                                       if (var35.field3060 != this.field2733) {
                                          if (var35.field3059 > var12) {
                                             var12 = var35.field3059;
                                             var25 = var24;
                                          } else if (var12 == var35.field3059) {
                                             var16 = var35.field3053 - this.field2738;
                                             var17 = var35.field3054 - this.field2740;
                                             var18 = this.field2751[var25].field3053 - this.field2738;
                                             var19 = this.field2751[var25].field3054 - this.field2740;
                                             if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
                                                var25 = var24;
                                             }
                                          }
                                       }
                                    }

                                    if (var25 == -1) {
                                       if (var4.field2617) {
                                          break;
                                       }
                                       continue label596;
                                    }

                                    class253 var33 = this.field2751[var25];
                                    var33.field3060 = this.field2733;
                                    if (!this.method5343(var8, var33.field3055, var33.field3050, var33.field3057, var33.field3058, var33.field3062.field2801)) {
                                       var1.vmethod5415(var33.field3062, var33.field3051, var33.field3053, var33.field3049, var33.field3054, var33.field3052);
                                    }

                                    for(var15 = var33.field3055; var15 <= var33.field3050; ++var15) {
                                       for(var16 = var33.field3057; var16 <= var33.field3058; ++var16) {
                                          class223 var26 = var9[var15][var16];
                                          if (var26.field2618 != 0) {
                                             this.field2759.method8689(var26);
                                          } else if ((var15 != var5 || var16 != var6) && var26.field2602) {
                                             this.field2759.method8689(var26);
                                          }
                                       }
                                    }
                                 }
                              } catch (Exception var28) {
                                 var4.field2617 = false;
                                 break;
                              }
                           }
                        } while(!var4.field2602);
                     } while(var4.field2618 != 0);

                     if (var5 > this.field2721 || var5 <= this.field2734) {
                        break;
                     }

                     var10 = var9[var5 - 1][var6];
                  } while(var10 != null && var10.field2602);

                  if (var5 < this.field2721 || var5 >= this.field2735 - 1) {
                     break;
                  }

                  var10 = var9[var5 + 1][var6];
               } while(var10 != null && var10.field2602);

               if (var6 > this.field2742 || var6 <= this.field2744) {
                  break;
               }

               var10 = var9[var5][var6 - 1];
            } while(var10 != null && var10.field2602);

            if (var6 < this.field2742 || var6 >= this.field2717 - 1) {
               break;
            }

            var10 = var9[var5][var6 + 1];
         } while(var10 != null && var10.field2602);

         var4.field2602 = false;
         --this.field2679;
         class218 var32 = var4.field2608;
         if (var32 != null && var32.field2515 != 0) {
            if (var32.field2517 != null) {
               var1.vmethod5415(var32.field2517, 0, var32.field2514 * 4096, var32.field2520 - var32.field2515, var32.field2518 * 4096, var32.field2519);
            }

            if (var32.field2513 != null) {
               var1.vmethod5415(var32.field2513, 0, var32.field2514 * 4096, var32.field2520 - var32.field2515, var32.field2518 * 4096, var32.field2519);
            }

            if (var32.field2516 != null) {
               var1.vmethod5415(var32.field2516, 0, var32.field2514 * 4096, var32.field2520 - var32.field2515, var32.field2518 * 4096, var32.field2519);
            }
         }

         if (var4.field2616 != 0) {
            class252 var29 = var4.field2610;
            if (var29 != null && !this.method5122(var8, var5, var6, var29.field3036.field2801)) {
               if ((var29.field3046 & var4.field2616) != 0) {
                  var1.vmethod5415(var29.field3036, 0, var29.field3039 * 4096 + var29.field3047, var29.field3041, var29.field3040 * 4096 + var29.field3035, var29.field3037);
               } else if (var29.field3046 == 256) {
                  var12 = var29.field3039 * 4096 - this.field2738;
                  var25 = var29.field3040 * 4096 - this.field2740;
                  var24 = var29.field3042;
                  if (var24 != 1 && var24 != 2) {
                     var15 = var12;
                  } else {
                     var15 = -var12;
                  }

                  if (var24 != 2 && var24 != 3) {
                     var16 = var25;
                  } else {
                     var16 = -var25;
                  }

                  if (var16 >= var15) {
                     var1.vmethod5415(var29.field3036, 0, var29.field3039 * 4096 + var29.field3047, var29.field3041, var29.field3040 * 4096 + var29.field3035, var29.field3037);
                  } else if (var29.field3045 != null) {
                     var1.vmethod5415(var29.field3045, 0, var29.field3039 * 4096, var29.field3041, var29.field3040 * 4096, var29.field3037);
                  }
               }
            }

            class250 var27 = var4.field2609;
            if (var27 != null) {
               if ((var27.field3029 & var4.field2616) != 0 && !this.method5168(var8, var5, var6, var27.field3029)) {
                  var1.vmethod5415(var27.field3024, 0, var27.field3027 * 4096, var27.field3026, var27.field3034 * 4096, var27.field3028);
               }

               if ((var27.field3025 & var4.field2616) != 0 && !this.method5168(var8, var5, var6, var27.field3025)) {
                  var1.vmethod5415(var27.field3032, 0, var27.field3027 * 4096, var27.field3026, var27.field3034 * 4096, var27.field3028);
               }
            }
         }

         class223 var30;
         if (var7 < this.field2725 - 1) {
            var30 = this.field2730[var7 + 1][var5][var6];
            if (var30 != null && var30.field2602) {
               this.field2759.method8689(var30);
            }
         }

         if (var5 < this.field2721 && var5 >= this.field2734 && var5 < this.field2735 - 1) {
            var30 = var9[var5 + 1][var6];
            if (var30 != null && var30.field2602) {
               this.field2759.method8689(var30);
            }
         }

         if (var6 < this.field2742 && var6 >= this.field2744 && var6 < this.field2717 - 1) {
            var30 = var9[var5][var6 + 1];
            if (var30 != null && var30.field2602) {
               this.field2759.method8689(var30);
            }
         }

         if (var5 > this.field2721 && var5 > this.field2734 && var5 < this.field2735) {
            var30 = var9[var5 - 1][var6];
            if (var30 != null && var30.field2602) {
               this.field2759.method8689(var30);
            }
         }

         if (var6 > this.field2742 && var6 > this.field2744 && var6 < this.field2717) {
            var30 = var9[var5][var6 - 1];
            if (var30 != null && var30.field2602) {
               this.field2759.method8689(var30);
            }
         }
      }
   }

   @ObfuscatedName("ck")
   void method5166() {
      int var1 = this.field2685[this.field2711];
      class236[] var2 = this.field2715[this.field2711];
      this.field2723 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class236 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field2819 == 1) {
            var5 = var4.field2829 - this.field2721 + this.field2772;
            if (var5 >= 0 && var5 <= this.field2772 + this.field2772) {
               var6 = var4.field2822 - this.field2742 + this.field2772;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2818 - this.field2742 + this.field2772;
               if (var7 > this.field2772 + this.field2772) {
                  var7 = this.field2772 + this.field2772;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.method5150(var5, var6++)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.field2738 - var4.field2815;
                  if (var9 > 32) {
                     var4.field2826 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2826 = 2;
                     var9 = -var9;
                  }

                  var4.field2817 = (var4.field2825 - this.field2740 << 8) / var9;
                  var4.field2833 = (var4.field2834 - this.field2740 << 8) / var9;
                  var4.field2831 = (var4.field2824 - this.field2739 << 8) / var9;
                  var4.field2832 = (var4.field2830 - this.field2739 << 8) / var9;
                  this.field2724[this.field2723++] = var4;
               }
            }
         } else if (var4.field2819 == 2) {
            var5 = var4.field2822 - this.field2742 + this.field2772;
            if (var5 >= 0 && var5 <= this.field2772 + this.field2772) {
               var6 = var4.field2829 - this.field2721 + this.field2772;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2816 - this.field2721 + this.field2772;
               if (var7 > this.field2772 + this.field2772) {
                  var7 = this.field2772 + this.field2772;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (this.method5150(var6++, var5)) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = this.field2740 - var4.field2825;
                  if (var9 > 32) {
                     var4.field2826 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field2826 = 4;
                     var9 = -var9;
                  }

                  var4.field2827 = (var4.field2815 - this.field2738 << 8) / var9;
                  var4.field2828 = (var4.field2821 - this.field2738 << 8) / var9;
                  var4.field2831 = (var4.field2824 - this.field2739 << 8) / var9;
                  var4.field2832 = (var4.field2830 - this.field2739 << 8) / var9;
                  this.field2724[this.field2723++] = var4;
               }
            }
         } else if (var4.field2819 == 4) {
            var5 = var4.field2824 - this.field2739;
            if (var5 > 128) {
               var6 = var4.field2822 - this.field2742 + this.field2772;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field2818 - this.field2742 + this.field2772;
               if (var7 > this.field2772 + this.field2772) {
                  var7 = this.field2772 + this.field2772;
               }

               if (var6 <= var7) {
                  int var8 = var4.field2829 - this.field2721 + this.field2772;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field2816 - this.field2721 + this.field2772;
                  if (var9 > this.field2772 + this.field2772) {
                     var9 = this.field2772 + this.field2772;
                  }

                  boolean var10 = false;

                  label156:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (this.method5150(var11, var12)) {
                           var10 = true;
                           break label156;
                        }
                     }
                  }

                  if (var10) {
                     var4.field2826 = 5;
                     var4.field2827 = (var4.field2815 - this.field2738 << 8) / var5;
                     var4.field2828 = (var4.field2821 - this.field2738 << 8) / var5;
                     var4.field2817 = (var4.field2825 - this.field2740 << 8) / var5;
                     var4.field2833 = (var4.field2834 - this.field2740 << 8) / var5;
                     this.field2724[this.field2723++] = var4;
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ct")
   boolean method5167(int var1, int var2, int var3) {
      int var4 = this.field2731[var1][var2][var3];
      if (var4 == -this.field2733) {
         return false;
      } else if (var4 == this.field2733) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method5278(var5 + 1, this.field2728[var1][var2][var3], var6 + 1) && this.method5278(var5 + 128 - 1, this.field2728[var1][var2 + 1][var3], var6 + 1) && this.method5278(var5 + 128 - 1, this.field2728[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method5278(var5 + 1, this.field2728[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2731[var1][var2][var3] = this.field2733;
            return true;
         } else {
            this.field2731[var1][var2][var3] = -this.field2733;
            return false;
         }
      }
   }

   @ObfuscatedName("ch")
   boolean method5168(int var1, int var2, int var3, int var4) {
      if (!this.method5167(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field2728[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > this.field2738) {
                  if (!this.method5278(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method5278(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5278(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method5278(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5278(var5, var9, var6)) {
                  return false;
               }

               if (!this.method5278(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < this.field2740) {
                  if (!this.method5278(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method5278(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5278(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method5278(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5278(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method5278(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < this.field2738) {
                  if (!this.method5278(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method5278(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5278(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method5278(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method5278(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method5278(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > this.field2740) {
                  if (!this.method5278(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method5278(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method5278(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method5278(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method5278(var5, var9, var6)) {
                  return false;
               }

               if (!this.method5278(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method5278(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method5278(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method5278(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method5278(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method5278(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   @ObfuscatedName("cs")
   boolean method5122(int var1, int var2, int var3, int var4) {
      if (!this.method5167(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method5278(var5 + 1, this.field2728[var1][var2][var3] - var4, var6 + 1) && this.method5278(var5 + 128 - 1, this.field2728[var1][var2 + 1][var3] - var4, var6 + 1) && this.method5278(var5 + 128 - 1, this.field2728[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method5278(var5 + 1, this.field2728[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   @ObfuscatedName("dd")
   boolean method5343(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var3 == var2 && var5 == var4) {
         if (!this.method5167(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method5278(var7 + 1, this.field2728[var1][var2][var4] - var6, var8 + 1) && this.method5278(var7 + 128 - 1, this.field2728[var1][var2 + 1][var4] - var6, var8 + 1) && this.method5278(var7 + 128 - 1, this.field2728[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method5278(var7 + 1, this.field2728[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field2731[var1][var7][var8] == -this.field2733) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field2728[var1][var2][var4] - var6;
         if (!this.method5278(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method5278(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method5278(var7, var9, var11)) {
                  return false;
               } else if (!this.method5278(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @ObfuscatedName("dr")
   boolean method5278(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2723; ++var4) {
         class236 var5 = this.field2724[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field2826 == 1) {
            var6 = var5.field2815 - var1;
            if (var6 > 0) {
               var7 = (var6 * var5.field2817 >> 8) + var5.field2825;
               var8 = (var6 * var5.field2833 >> 8) + var5.field2834;
               var9 = (var6 * var5.field2831 >> 8) + var5.field2824;
               var10 = (var6 * var5.field2832 >> 8) + var5.field2830;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2826 == 2) {
            var6 = var1 - var5.field2815;
            if (var6 > 0) {
               var7 = (var6 * var5.field2817 >> 8) + var5.field2825;
               var8 = (var6 * var5.field2833 >> 8) + var5.field2834;
               var9 = (var6 * var5.field2831 >> 8) + var5.field2824;
               var10 = (var6 * var5.field2832 >> 8) + var5.field2830;
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2826 == 3) {
            var6 = var5.field2825 - var3;
            if (var6 > 0) {
               var7 = (var6 * var5.field2827 >> 8) + var5.field2815;
               var8 = (var6 * var5.field2828 >> 8) + var5.field2821;
               var9 = (var6 * var5.field2831 >> 8) + var5.field2824;
               var10 = (var6 * var5.field2832 >> 8) + var5.field2830;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2826 == 4) {
            var6 = var3 - var5.field2825;
            if (var6 > 0) {
               var7 = (var6 * var5.field2827 >> 8) + var5.field2815;
               var8 = (var6 * var5.field2828 >> 8) + var5.field2821;
               var9 = (var6 * var5.field2831 >> 8) + var5.field2824;
               var10 = (var6 * var5.field2832 >> 8) + var5.field2830;
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field2826 == 5) {
            var6 = var2 - var5.field2824;
            if (var6 > 0) {
               var7 = (var6 * var5.field2827 >> 8) + var5.field2815;
               var8 = (var6 * var5.field2828 >> 8) + var5.field2821;
               var9 = (var6 * var5.field2817 >> 8) + var5.field2825;
               var10 = (var6 * var5.field2833 >> 8) + var5.field2834;
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @ObfuscatedName("fr")
   void vmethod5531(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      class454 var15 = class401.method8245();
      float var16 = 0.0F;
      float var17 = 0.0F;
      if (this.field2716) {
         int var18 = this.field2709 % 300;
         float var19 = (float)var18 / 300.0F * 3.1415927F * 2.0F;
         float var20 = (float)Math.sin((double)var19);
         float var21 = (float)Math.cos((double)var19);
         var16 = (float)((double)var20 * 3.141592653589793D) / 100.0F;
         var17 = (float)((double)var21 * 3.141592653589793D) / 100.0F;
      }

      class448 var25 = new class448();
      var25.field5155.method9072(class51.method1894(var1), var16, var17);
      var25.field5154.method8993((float)var4, (float)var5, (float)var6);
      class448 var26 = new class448();
      var26.field5154.method8993((float)(-(this.field2696 * 64) - this.field2726), (float)this.field2713, (float)(-(this.field2727 * 64) - this.field2714));
      class454 var27 = class401.method8245();
      var27.method9097(var26);
      var15.method9102(1.0F, this.field2687, 1.0F, 1.0F);
      var27.method9173(var15);
      var15.method9097(var25);
      var27.method9173(var15);
      class455 var28 = new class455();
      class454 var22 = class401.method8245();
      var28.method9181(class51.method1894(-var2));
      var28.method9182(class51.method1894(-var3));
      var28.method9197((float)var7, (float)var8, (float)var9);
      var22.method9099(var28);
      var22.method9101();
      class454 var23 = class401.method8245();
      var23.method9097(var25);
      var23.method9101();
      this.field2738 = (int)var23.method9105((float)var7, (float)var8, (float)var9);
      this.field2739 = (int)var23.method9174((float)var7, (float)var8, (float)var9);
      this.field2740 = (int)var23.method9103((float)var7, (float)var8, (float)var9);
      this.field2721 = this.field2738 / 128;
      this.field2742 = this.field2740 / 128;
      this.field2743 = (int)var23.method9105((float)var12, 0.0F, (float)var13) / 128;
      this.field2712 = (int)var23.method9103((float)var12, 0.0F, (float)var13) / 128;
      var25.method8931();
      var26.method8931();
      var15.method9140();
      var23.method9140();
      var27.method9173(var22);
      class231 var24 = new class231(var27);
      var24.method5350(var10);
      class242.field2957 = false;
      this.method5164(var24, var14);
      class242.field2957 = false;
      var22.method9140();
      var27.method9140();
   }

   @ObfuscatedName("af")
   static final int method5099(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("aw")
   static boolean method5100(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
         int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }
}
