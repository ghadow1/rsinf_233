package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class ServerPackets {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets VARP_SMALL = new ServerPackets(0, 3);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MIDI_SONG_V2 = new ServerPackets(1, 10);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   static final ServerPackets SOUND_AREA = new ServerPackets(2, 7);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETPLAYERMODEL_OBJ = new ServerPackets(3, 8);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETPLAYERMODEL_BODYTYPE = new ServerPackets(4, 5);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETSCROLLPOS = new ServerPackets(5, 6);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_ADD = new ServerPackets(6, 14);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_LOOKAT = new ServerPackets(7, 6);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_REBOOT_TIMER = new ServerPackets(8, 2);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_STOCKMARKET_SLOT = new ServerPackets(9, 20);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_MOVETO = new ServerPackets(10, 6);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETOBJECT = new ServerPackets(11, 10);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETPOSITION = new ServerPackets(12, 8);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETROTATESPEED = new ServerPackets(13, 8);
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerPackets(14, -1);
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETHIDE = new ServerPackets(15, 5);
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_INV_PARTIAL = new ServerPackets(16, -2);
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MESSAGE_GAME = new ServerPackets(17, -1);
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MIDI_SWAP = new ServerPackets(18, 8);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_ZONE_FULL_FOLLOWS = new ServerPackets(19, 3);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets RESET_ANIMS = new ServerPackets(20, 0);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_IGNORELIST = new ServerPackets(21, -2);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETNPCHEAD = new ServerPackets(22, 6);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets VARP_LARGE = new ServerPackets(23, 6);
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPackets(24, 3);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets RUNCLIENTSCRIPT = new ServerPackets(25, -2);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_ADD_SPECIFIC = new ServerPackets(26, 17);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_FRIENDLIST = new ServerPackets(27, -2);
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETNPCHEAD_ACTIVE = new ServerPackets(28, 6);
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CLANSETTINGS_DELTA = new ServerPackets(29, -2);
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets NPC_ANIM_SPECIFIC = new ServerPackets(30, 5);
   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CLANSETTINGS_FULL = new ServerPackets(31, -2);
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_ENABLED_OPS = new ServerPackets(32, 4);
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets NPC_HEADICON_SPECIFIC = new ServerPackets(33, 9);
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MINIMAP_TOGGLE = new ServerPackets(34, 1);
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_DEL_SPECIFIC = new ServerPackets(35, 10);
   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets RESET_INTERACTION_MODE = new ServerPackets(36, 2);
   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets REBUILD_NORMAL = new ServerPackets(37, -2);
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets REBUILD_REGION = new ServerPackets(38, -2);
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets HINT_ARROW = new ServerPackets(39, 6);
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_ROTATETO = new ServerPackets(40, 7);
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOC_DEL = new ServerPackets(41, 2);
   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets HIDEOBJOPS = new ServerPackets(42, 1);
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MAP_ANIM = new ServerPackets(43, 6);
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets URL_OPEN = new ServerPackets(44, -2);
   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SET_INTERACTION_MODE = new ServerPackets(45, 4);
   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_CLOSESUB = new ServerPackets(46, 4);
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOC_ANIM = new ServerPackets(47, 4);
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_RESET = new ServerPackets(48, 0);
   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets HIDENPCOPS = new ServerPackets(49, 1);
   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MESSAGE_PRIVATE = new ServerPackets(50, -2);
   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SET_MAP_FLAG = new ServerPackets(51, 2);
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_MODE = new ServerPackets(52, 1);
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets PLAYER_SPOTANIM_SPECIFIC = new ServerPackets(53, 9);
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CLANCHANNEL_DELTA = new ServerPackets(54, -2);
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_ENABLED_OPS_SPECIFIC = new ServerPackets(55, 7);
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETPLAYERMODEL_BASECOLOUR = new ServerPackets(56, 6);
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_OPENSUB = new ServerPackets(57, 7);
   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MIDI_SONG_WITHSECONDARY = new ServerPackets(58, 12);
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_SMOOTHRESET = new ServerPackets(59, 4);
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets HIDELOCOPS = new ServerPackets(60, 1);
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MESSAGE_FRIENDCHANNEL = new ServerPackets(61, -1);
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SET_HEATMAP_ENABLED = new ServerPackets(62, 1);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SEND_PING = new ServerPackets(63, 8);
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_UID192 = new ServerPackets(64, 28);
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_COUNT = new ServerPackets(65, 11);
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_SHAKE = new ServerPackets(66, 4);
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_RUNWEIGHT = new ServerPackets(67, 2);
   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_CLEARINV = new ServerPackets(68, 4);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_OPENTOP = new ServerPackets(69, 2);
   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OCULUS_SYNC = new ServerPackets(70, 4);
   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_MOVETO_ARC = new ServerPackets(71, 10);
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets VARCLAN_DISABLE = new ServerPackets(72, 0);
   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOC_ADD_CHANGE_V2 = new ServerPackets(73, -2);
   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerPackets(74, 1);
   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOGOUT = new ServerPackets(75, 0);
   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets VARCLAN_ENABLE = new ServerPackets(76, 0);
   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SET_PLAYER_OP = new ServerPackets(77, -1);
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets VARP_SYNC = new ServerPackets(78, 0);
   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SYNTH_SOUND = new ServerPackets(79, 5);
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CHAT_FILTER_SETTINGS = new ServerPackets(80, 2);
   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UNKNOWN_STRING = new ServerPackets(81, -1);
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETTEXT = new ServerPackets(82, -2);
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CLANCHANNEL_FULL = new ServerPackets(83, -2);
   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_MOVETO_CYCLES = new ServerPackets(84, 8);
   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets VARCLAN = new ServerPackets(85, -1);
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_MOVESUB = new ServerPackets(86, 8);
   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETANGLE = new ServerPackets(87, 10);
   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_RUNENERGY = new ServerPackets(88, 2);
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_FRIENDCHAT_CHANNEL_FULL_V2 = new ServerPackets(89, -2);
   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets PLAYER_ANIM_SPECIFIC = new ServerPackets(90, 3);
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_ROTATEBY = new ServerPackets(91, 7);
   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MAP_ANIM_SPECIFIC = new ServerPackets(92, 8);
   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets REBUILD_WORLDENTITY_V3 = new ServerPackets(93, -2);
   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets NPC_INFO_LARGE_V5 = new ServerPackets(94, -2);
   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPackets(95, -2);
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets REFLECTION_CHECKER = new ServerPackets(96, -2);
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_TRADINGPOST = new ServerPackets(97, -2);
   @ObfuscatedName("df")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_STAT_V2 = new ServerPackets(98, 7);
   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MESSAGE_CLANCHANNEL = new ServerPackets(99, -1);
   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETPLAYERHEAD = new ServerPackets(100, 4);
   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_LOOKAT_EASED_COORD = new ServerPackets(101, 7);
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOGOUT_WITHREASON = new ServerPackets(102, 1);
   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets CAM_TARGET_V3 = new ServerPackets(103, 5);
   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOGOUT_TRANSFER = new ServerPackets(104, -1);
   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets TRIGGER_ONDIALOGABORT = new ServerPackets(105, 0);
   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETPLAYERMODEL_SELF = new ServerPackets(106, 5);
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SET_NPC_UPDATE_ORIGIN = new ServerPackets(107, 2);
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets NPC_SPOTANIM_SPECIFIC = new ServerPackets(108, 9);
   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MESSAGE_PRIVATE_ECHO = new ServerPackets(109, -2);
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets FRIENDLIST_LOADED = new ServerPackets(110, 0);
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETANIM = new ServerPackets(111, 6);
   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETMODEL = new ServerPackets(112, 6);
   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MESSAGE_CLANCHANNEL_SYSTEM = new ServerPackets(113, -1);
   @ObfuscatedName("es")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MIDI_SONG_STOP = new ServerPackets(114, 4);
   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets NPC_INFO_SMALL_V5 = new ServerPackets(115, -2);
   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SERVER_TICK_END = new ServerPackets(116, 0);
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   static final ServerPackets HISCORE_REPLY = new ServerPackets(117, -2);
   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETCOLOUR = new ServerPackets(118, 6);
   @ObfuscatedName("el")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_INV_FULL = new ServerPackets(119, -2);
   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOC_MERGE = new ServerPackets(120, 14);
   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets PLAYER_INFO = new ServerPackets(121, -2);
   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_DEL = new ServerPackets(122, 7);
   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets LOC_ANIM_SPECIFIC = new ServerPackets(123, 6);
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SITE_SETTINGS = new ServerPackets(124, -1);
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets MIDI_JINGLE = new ServerPackets(125, 5);
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets VARP_RESET = new ServerPackets(126, 0);
   @ObfuscatedName("et")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets UPDATE_INV_STOPTRANSMIT = new ServerPackets(127, 2);
   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets PACKET_GROUP_START = new ServerPackets(128, 2);
   @ObfuscatedName("ev")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets WORLDENTITY_INFO_V5 = new ServerPackets(129, -2);
   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_UNCUSTOMISE = new ServerPackets(130, 7);
   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_SETEVENTS_V2 = new ServerPackets(131, 16);
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_UNCUSTOMISE_SPECIFIC = new ServerPackets(132, 10);
   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_COUNT_SPECIFIC = new ServerPackets(133, 14);
   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets IF_RESYNC_V2 = new ServerPackets(134, -2);
   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets PROJANIM_SPECIFIC_V4 = new ServerPackets(135, 27);
   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets ACCOUNT_FLAGS = new ServerPackets(136, 8);
   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_CUSTOMISE_SPECIFIC = new ServerPackets(137, 20);
   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets OBJ_CUSTOMISE = new ServerPackets(138, 17);
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets WORLDENTITY_INFO_V6 = new ServerPackets(139, -2);
   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      descriptor = "Lmh;"
   )
   public static final ServerPackets SET_ACTIVE_WORLD_V2 = new ServerPackets(140, 3);
   @ObfuscatedName("fo")
   @ObfuscatedGetter(
      intValue = -1309674587
   )
   public final int field3808;
   @ObfuscatedName("fc")
   @ObfuscatedGetter(
      intValue = 1475708737
   )
   public final int length;

   ServerPackets(int var1, int var2) {
      this.field3808 = var1;
      this.length = var2;
   }
}
