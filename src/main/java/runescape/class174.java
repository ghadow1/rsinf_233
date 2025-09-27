package runescape;

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
   void vmethod4108(Buffer var1) {
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
   public static ServerPackets[] method4107() {
      return new ServerPackets[]{ServerPackets.VARP_SMALL, ServerPackets.MIDI_SONG_V2, ServerPackets.SOUND_AREA, ServerPackets.IF_SETPLAYERMODEL_OBJ, ServerPackets.IF_SETPLAYERMODEL_BODYTYPE, ServerPackets.IF_SETSCROLLPOS, ServerPackets.OBJ_ADD, ServerPackets.CAM_LOOKAT, ServerPackets.UPDATE_REBOOT_TIMER, ServerPackets.UPDATE_STOCKMARKET_SLOT, ServerPackets.CAM_MOVETO, ServerPackets.IF_SETOBJECT, ServerPackets.IF_SETPOSITION, ServerPackets.IF_SETROTATESPEED, ServerPackets.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, ServerPackets.IF_SETHIDE, ServerPackets.UPDATE_INV_PARTIAL, ServerPackets.MESSAGE_GAME, ServerPackets.MIDI_SWAP, ServerPackets.UPDATE_ZONE_FULL_FOLLOWS, ServerPackets.RESET_ANIMS, ServerPackets.UPDATE_IGNORELIST, ServerPackets.IF_SETNPCHEAD, ServerPackets.VARP_LARGE, ServerPackets.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPackets.RUNCLIENTSCRIPT, ServerPackets.OBJ_ADD_SPECIFIC, ServerPackets.UPDATE_FRIENDLIST, ServerPackets.IF_SETNPCHEAD_ACTIVE, ServerPackets.CLANSETTINGS_DELTA, ServerPackets.NPC_ANIM_SPECIFIC, ServerPackets.CLANSETTINGS_FULL, ServerPackets.OBJ_ENABLED_OPS, ServerPackets.NPC_HEADICON_SPECIFIC, ServerPackets.MINIMAP_TOGGLE, ServerPackets.OBJ_DEL_SPECIFIC, ServerPackets.RESET_INTERACTION_MODE, ServerPackets.REBUILD_NORMAL, ServerPackets.REBUILD_REGION, ServerPackets.HINT_ARROW, ServerPackets.CAM_ROTATETO, ServerPackets.LOC_DEL, ServerPackets.HIDEOBJOPS, ServerPackets.MAP_ANIM, ServerPackets.URL_OPEN, ServerPackets.SET_INTERACTION_MODE, ServerPackets.IF_CLOSESUB, ServerPackets.LOC_ANIM, ServerPackets.CAM_RESET, ServerPackets.HIDENPCOPS, ServerPackets.MESSAGE_PRIVATE, ServerPackets.SET_MAP_FLAG, ServerPackets.CAM_MODE, ServerPackets.PLAYER_SPOTANIM_SPECIFIC, ServerPackets.CLANCHANNEL_DELTA, ServerPackets.OBJ_ENABLED_OPS_SPECIFIC, ServerPackets.IF_SETPLAYERMODEL_BASECOLOUR, ServerPackets.IF_OPENSUB, ServerPackets.MIDI_SONG_WITHSECONDARY, ServerPackets.CAM_SMOOTHRESET, ServerPackets.HIDELOCOPS, ServerPackets.MESSAGE_FRIENDCHANNEL, ServerPackets.SET_HEATMAP_ENABLED, ServerPackets.SEND_PING, ServerPackets.UPDATE_UID192, ServerPackets.OBJ_COUNT, ServerPackets.CAM_SHAKE, ServerPackets.UPDATE_RUNWEIGHT, ServerPackets.IF_CLEARINV, ServerPackets.IF_OPENTOP, ServerPackets.OCULUS_SYNC, ServerPackets.CAM_MOVETO_ARC, ServerPackets.VARCLAN_DISABLE, ServerPackets.LOC_ADD_CHANGE_V2, ServerPackets.CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerPackets.LOGOUT, ServerPackets.VARCLAN_ENABLE, ServerPackets.SET_PLAYER_OP, ServerPackets.VARP_SYNC, ServerPackets.SYNTH_SOUND, ServerPackets.CHAT_FILTER_SETTINGS, ServerPackets.UNKNOWN_STRING, ServerPackets.IF_SETTEXT, ServerPackets.CLANCHANNEL_FULL, ServerPackets.CAM_MOVETO_CYCLES, ServerPackets.VARCLAN, ServerPackets.IF_MOVESUB, ServerPackets.IF_SETANGLE, ServerPackets.UPDATE_RUNENERGY, ServerPackets.UPDATE_FRIENDCHAT_CHANNEL_FULL_V2, ServerPackets.PLAYER_ANIM_SPECIFIC, ServerPackets.CAM_ROTATEBY, ServerPackets.MAP_ANIM_SPECIFIC, ServerPackets.REBUILD_WORLDENTITY_V3, ServerPackets.NPC_INFO_LARGE_V5, ServerPackets.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPackets.REFLECTION_CHECKER, ServerPackets.UPDATE_TRADINGPOST, ServerPackets.UPDATE_STAT_V2, ServerPackets.MESSAGE_CLANCHANNEL, ServerPackets.IF_SETPLAYERHEAD, ServerPackets.CAM_LOOKAT_EASED_COORD, ServerPackets.LOGOUT_WITHREASON, ServerPackets.CAM_TARGET_V3, ServerPackets.LOGOUT_TRANSFER, ServerPackets.TRIGGER_ONDIALOGABORT, ServerPackets.IF_SETPLAYERMODEL_SELF, ServerPackets.SET_NPC_UPDATE_ORIGIN, ServerPackets.NPC_SPOTANIM_SPECIFIC, ServerPackets.MESSAGE_PRIVATE_ECHO, ServerPackets.FRIENDLIST_LOADED, ServerPackets.IF_SETANIM, ServerPackets.IF_SETMODEL, ServerPackets.MESSAGE_CLANCHANNEL_SYSTEM, ServerPackets.MIDI_SONG_STOP, ServerPackets.NPC_INFO_SMALL_V5, ServerPackets.SERVER_TICK_END, ServerPackets.HISCORE_REPLY, ServerPackets.IF_SETCOLOUR, ServerPackets.UPDATE_INV_FULL, ServerPackets.LOC_MERGE, ServerPackets.PLAYER_INFO, ServerPackets.OBJ_DEL, ServerPackets.LOC_ANIM_SPECIFIC, ServerPackets.SITE_SETTINGS, ServerPackets.MIDI_JINGLE, ServerPackets.VARP_RESET, ServerPackets.UPDATE_INV_STOPTRANSMIT, ServerPackets.PACKET_GROUP_START, ServerPackets.WORLDENTITY_INFO_V5, ServerPackets.OBJ_UNCUSTOMISE, ServerPackets.IF_SETEVENTS_V2, ServerPackets.OBJ_UNCUSTOMISE_SPECIFIC, ServerPackets.OBJ_COUNT_SPECIFIC, ServerPackets.IF_RESYNC_V2, ServerPackets.PROJANIM_SPECIFIC_V4, ServerPackets.ACCOUNT_FLAGS, ServerPackets.OBJ_CUSTOMISE_SPECIFIC, ServerPackets.OBJ_CUSTOMISE, ServerPackets.WORLDENTITY_INFO_V6, ServerPackets.SET_ACTIVE_WORLD_V2};
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
