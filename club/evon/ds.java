package club.evon;

import java.util.ArrayList;
import java.util.Vector;

public class ds implements uz {
   private long a;
   private int[] b;
   private uz c;
   private long d;
   private long[] j;
   private static long[] k = new long[64];
   static int[] e;
   private static ArrayList f;
   private static Vector m;
   private static int i;
   private static Object o;
   private static int h = 52;
   private static int l = 128;
   private static int n = 17;

   public static Object g() {
      return o;
   }

   public static uz a(long var0, long var2, Object var4) {
      nj.a(var0 > 0L);
      uz var5 = d(var0);
      uz var6 = d(var2);
      uz var7 = nj.a(var5, var6);
      if (var4 != null) {
         m.add(var4);
      }

      return var7;
   }

   static uz c(long var0) {
      int var2 = (int)a(var0, h, 63, e, k);
      if (var2 < i) {
         uz var4 = (uz)f.get(var2);
         return var4;
      } else {
         if (f.size() % l == 0) {
            e = (int[])((int[])e.clone());
         }

         ds var3 = new ds(var0);
         f.add(var3);
         return var3;
      }
   }

   private static uz d(long var0) {
      ds var2 = new ds(var0);
      return var2;
   }

   static void a(nj var0) {
      i = f.size();
      c();
      var0.d();
   }

   static void b(nj var0) {
      c();
      int[] var10000 = e = new int[64];
      var10000[0] = -61;
      var10000[1] = -30;
      var10000[2] = -57;
      var10000[3] = -21;
      var10000[4] = -59;
      var10000[5] = -27;
      var10000[6] = -13;
      var10000[7] = -7;
      var10000[8] = -19;
      var10000[9] = -9;
      var10000[10] = -27;
      var10000[11] = -33;
      var10000[12] = -31;
      var10000[13] = -39;
      var10000[14] = 7;
      var10000[15] = -34;
      var10000[16] = -32;
      var10000[17] = -9;
      var10000[18] = 9;
      var10000[19] = 13;
      var10000[20] = -1;
      var10000[21] = 1;
      var10000[22] = -8;
      var10000[23] = -28;
      var10000[24] = 21;
      var10000[25] = -35;
      var10000[26] = 9;
      var10000[27] = 19;
      var10000[28] = -14;
      var10000[29] = -5;
      var10000[30] = 8;
      var10000[31] = 30;
      var10000[32] = 27;
      var10000[33] = -6;
      var10000[34] = 5;
      var10000[35] = -6;
      var10000[36] = -22;
      var10000[37] = 27;
      var10000[38] = -16;
      var10000[39] = 6;
      var10000[40] = -6;
      var10000[41] = 6;
      var10000[42] = 14;
      var10000[43] = 31;
      var10000[44] = 33;
      var10000[45] = -5;
      var10000[46] = 6;
      var10000[47] = -15;
      var10000[48] = 32;
      var10000[49] = 34;
      var10000[50] = 5;
      var10000[51] = 28;
      var10000[52] = 39;
      var10000[53] = -4;
      var10000[54] = 16;
      var10000[55] = -1;
      var10000[56] = 1;
      var10000[57] = 4;
      var10000[58] = 22;
      var10000[59] = 57;
      var10000[60] = 35;
      var10000[61] = 61;
      var10000[62] = 15;
      var10000[63] = 59;
      var0.c();
   }

   private ds(long var1) {
      this.a = var1;
      this.b = e;
      this.j = k;
   }

   public long a(long var1) {
      long var3 = this.a(8, 55);
      long var5 = this.a ^ var1 ^ this.d;
      this.a = var5;
      if (this.c != null) {
         this.c.a(var1);
      }

      return var3;
   }

   public void b(long var1) {
      this.d = var1;
   }

   public void a(uz var1) {
      if (this != var1) {
         if (this.c == null) {
            this.c = var1;
         } else {
            this.c.a(var1);
         }
      }

   }

   public int hashCode() {
      return (int)this.a(8);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof ds) {
         return this.a(56) == ((ds)var1).a(56);
      } else {
         return false;
      }
   }

   public boolean b(uz var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof ds) {
         return this.a(56, 63) - ((ds)var1).a(56, 63) <= 0L;
      } else {
         return true;
      }
   }

   public int[] b() {
      return this.b;
   }

   private long a(int var1) {
      return this.a(0, var1 - 1);
   }

   private long a(int var1, int var2) {
      return a(this.a, var1, var2, this.b, this.j);
   }

   private static long a(long var0, int var2, int var3, int[] var4, long[] var5) {
      long var6 = 0L;
      int var8 = var4.length;

      int var12;
      for(int var9 = 0; var9 < var8; ++var9) {
         long var10 = var0 & k[var9];
         var12 = var4[var9];
         if (var10 != 0L) {
            if (var12 > 0) {
               var10 >>>= var12;
            } else if (var12 < 0) {
               var10 <<= ~var12 + 1;
            }

            var6 |= var10;
         }
      }

      byte var13 = 64;
      long var14 = var6;
      int var11 = var13 - 1 - var3;
      if (var11 > 0) {
         var14 = var6 << var11;
      }

      var12 = var2 + var13 - 1 - var3;
      if (var12 > 0) {
         var14 >>>= var12;
      }

      return var14;
   }

   private static void c() {
      byte var0 = 0;
      a(0, f.size() - 1, f, new ArrayList(f), var0);
   }

   private static void a(int var0, int var1, ArrayList var2, ArrayList var3, int var4) {
      if (var0 < var1) {
         int var5 = var0 + (var1 - var0) / 2;
         ++var4;
         if (var4 < n) {
            a(var0, var5, var2, var3, var4);
            a(var5 + 1, var1, var2, var3, var4);
         }

         a(var0, var5, var1, var2, var3);
      }

   }

   private static void a(int var0, int var1, int var2, ArrayList var3, ArrayList var4) {
      int var5 = var0;
      int var6 = var1 + 1;

      for(int var7 = var0; var7 <= var2; ++var7) {
         var4.set(var7, var3.get(var7));
      }

      while(var5 <= var1 && var6 <= var2) {
         uz var8;
         if (((uz)var4.get(var5)).b((uz)var4.get(var6))) {
            var8 = (uz)var4.get(var5++);
         } else {
            var8 = (uz)var4.get(var6++);
         }

         var3.set(var0, var8);
         ++var0;
      }

      while(var5 <= var1) {
         var3.set(var0, var4.get(var5));
         ++var0;
         ++var5;
      }

   }

   static {
      long var0 = 1L;

      for(int var2 = 0; var2 < 64; ++var2) {
         k[var2] = var0;
         var0 <<= 1;
      }

      o = new Object();
      m = new Vector();
      f = new ArrayList();
      a0();
      i = f.size();
      c();
   }

   private static void a0() {
      e = new int[]{-4, -33, -38, -8, 4, -52, -13, -10, -38, -16, -19, 8, -6, -35, -16, -36, -46, 10, 6, 13, -35, -39, -34, -24, -35, 16, -37, -1, 1, 19, 16, -6, -13, -2, 33, 2, -5, 6, -11, -19, 38, 5, -2, -18, 2, 13, 38, 24, 35, 11, -3, 36, -2, 3, 2, 35, 34, 52, 19, 35, 39, 18, 46, 37};
      f.add(new ds(15971454553001582L));
      f.add(new ds(-6936854644598942967L));
      f.add(new ds(-2113644141552534793L));
      f.add(new ds(2286848226923574050L));
      f.add(new ds(-5590609697831816098L));
      f.add(new ds(3421030266876047859L));
      f.add(new ds(-1663293710264281446L));
      f.add(new ds(6385408120887316619L));
      f.add(new ds(-90176687808269768L));
      f.add(new ds(-982350453840728772L));
      f.add(new ds(-3880713390233698749L));
      f.add(new ds(2349083498025345276L));
      f.add(new ds(4675186110482506555L));
      f.add(new ds(-4764258815270514179L));
      f.add(new ds(-2953557883521081346L));
      f.add(new ds(-6555511044564862086L));
      f.add(new ds(1383352305335719505L));
      f.add(new ds(-5489697289460202975L));
      f.add(new ds(6738412875272394259L));
      f.add(new ds(-705167254030185057L));
      f.add(new ds(-7050767887643139250L));
      f.add(new ds(-3822885761776442786L));
      f.add(new ds(5388733686225654305L));
      f.add(new ds(7609212049883200603L));
      f.add(new ds(3074345601098476928L));
      f.add(new ds(2676991149048966275L));
      f.add(new ds(2729470433782787675L));
      f.add(new ds(605951082986659262L));
      f.add(new ds(8141406625398333801L));
      f.add(new ds(2028818466823382883L));
      f.add(new ds(-986223902178351202L));
      f.add(new ds(-7229389417022230255L));
      f.add(new ds(7587184871354624866L));
      f.add(new ds(6849603366097399091L));
      f.add(new ds(-7185946888815889281L));
      f.add(new ds(-7127059443066637348L));
      f.add(new ds(5111605371921943606L));
      f.add(new ds(-864943849969430290L));
      f.add(new ds(-2796777612334462100L));
      f.add(new ds(-4854587125467723758L));
      f.add(new ds(-7965586886027860642L));
      f.add(new ds(-1301799343904209713L));
      f.add(new ds(-1328763044628173798L));
      f.add(new ds(-649802248904838180L));
      f.add(new ds(-30265073156866111L));
      f.add(new ds(6942630444272469223L));
      f.add(new ds(8111997714391074312L));
      f.add(new ds(1203389460456045308L));
      f.add(new ds(2729478680075955803L));
      f.add(new ds(-1739444378888472265L));
      f.add(new ds(7192742667943211988L));
      f.add(new ds(6232226317931622149L));
      f.add(new ds(6087468474220412354L));
      f.add(new ds(-6615775578139261834L));
      f.add(new ds(3938143800664771581L));
      f.add(new ds(-3841355709312191726L));
      f.add(new ds(3836760565314554589L));
      f.add(new ds(-2543858393168967583L));
      f.add(new ds(8372111998205037468L));
      f.add(new ds(-2580367451144638683L));
      f.add(new ds(-70816450968696721L));
      f.add(new ds(4810436447329842037L));
      f.add(new ds(1552860508491840187L));
      f.add(new ds(-1589215965665188740L));
      f.add(new ds(3961494248555150188L));
      f.add(new ds(8787046110889503366L));
      f.add(new ds(-2277699856568731628L));
      f.add(new ds(4603342453619018688L));
      f.add(new ds(4672598980877175332L));
      f.add(new ds(1260662336063395981L));
      f.add(new ds(-7076219980938437027L));
      f.add(new ds(-6539434036555665049L));
      f.add(new ds(6784144858128173004L));
      f.add(new ds(-4911625265982481109L));
      f.add(new ds(-5318712850187705152L));
      f.add(new ds(-3882483726245338714L));
      f.add(new ds(7190304492638973487L));
      f.add(new ds(3029169168617727460L));
      f.add(new ds(463224999267571377L));
      f.add(new ds(6197973643812421766L));
      f.add(new ds(2953743972033492179L));
      f.add(new ds(7318547047792504382L));
      f.add(new ds(-5837719481586037799L));
      f.add(new ds(-2159902606237832759L));
      f.add(new ds(6061260926844523824L));
      f.add(new ds(2694765774830603282L));
      f.add(new ds(4179623507573264906L));
      f.add(new ds(3188456761622190663L));
      f.add(new ds(-7677642737676530374L));
      f.add(new ds(-6750176374387290672L));
      e = (int[])e.clone();
      f.add(new ds(-824905020774639535L));
      f.add(new ds(-399457613214036698L));
      f.add(new ds(-7731722376393086633L));
      f.add(new ds(-8619645173044787950L));
      f.add(new ds(5953674220643893253L));
      f.add(new ds(-2290977286490154155L));
      f.add(new ds(124156767791191598L));
      f.add(new ds(-178233523714892032L));
      f.add(new ds(2808579426221649322L));
      f.add(new ds(4046965737980750140L));
      f.add(new ds(7919077752721789008L));
      f.add(new ds(8035493824309323487L));
      f.add(new ds(3054442503949422815L));
      f.add(new ds(-4753043344992787363L));
      f.add(new ds(6373641328334696340L));
      f.add(new ds(7194100459406433538L));
      f.add(new ds(-8052860157421206774L));
      f.add(new ds(4332029142861491131L));
      f.add(new ds(4692180043276020709L));
      f.add(new ds(7270756738738263011L));
      f.add(new ds(577028289290966938L));
      f.add(new ds(-2402532067095331076L));
      f.add(new ds(-3075616494363563121L));
      f.add(new ds(-2201374183455682749L));
      f.add(new ds(-9032626845521403829L));
      f.add(new ds(5761283801335318017L));
      f.add(new ds(-1952884122168771088L));
      f.add(new ds(1518118143716472372L));
      f.add(new ds(-6392929285792269662L));
      f.add(new ds(3108958254746032853L));
      f.add(new ds(-2812866648953858800L));
      f.add(new ds(-2575756267844238265L));
      f.add(new ds(5746663442650683185L));
      f.add(new ds(2507310963761244763L));
      f.add(new ds(6935560111533274716L));
      f.add(new ds(3791497350898955338L));
      f.add(new ds(5879339894284833955L));
      f.add(new ds(-1835408325303056491L));
      f.add(new ds(-4797528106763560335L));
      f.add(new ds(5951634609103194950L));
      f.add(new ds(1807003409500162837L));
      f.add(new ds(-788890824277387932L));
      f.add(new ds(-2625735869136121436L));
      f.add(new ds(-4136115910307462500L));
      f.add(new ds(8455847352897436045L));
      f.add(new ds(2678287732500978270L));
      f.add(new ds(-7882895269985352073L));
      f.add(new ds(-1906489184952056493L));
      f.add(new ds(8372111448461806492L));
      f.add(new ds(6666647217329500779L));
      f.add(new ds(1336961559641967106L));
      f.add(new ds(-4026751587378934524L));
      f.add(new ds(2181398566411568434L));
      f.add(new ds(836939635044866820L));
      f.add(new ds(-5700809652860570198L));
      f.add(new ds(-6128155999296511165L));
      f.add(new ds(1830025340568614832L));
      f.add(new ds(-8584735816775406544L));
      f.add(new ds(-8581476069280613735L));
      f.add(new ds(-6009840096204895763L));
      f.add(new ds(1576607663194996086L));
      f.add(new ds(-1181256851738103255L));
      f.add(new ds(-8075999861130961352L));
      f.add(new ds(-150198827114507459L));
      f.add(new ds(2978480687330010923L));
      f.add(new ds(2662689236767447181L));
      f.add(new ds(-6461296720372525021L));
      f.add(new ds(-3354189774955628520L));
      f.add(new ds(1435835066112473819L));
      f.add(new ds(-5828921105303081981L));
      f.add(new ds(4432530053634549206L));
      f.add(new ds(5606640379435967817L));
      f.add(new ds(1310831753445511721L));
      f.add(new ds(-5343559265048548236L));
      f.add(new ds(7906264324115794516L));
      f.add(new ds(-17588445079117479L));
      f.add(new ds(-8514380216424296575L));
      f.add(new ds(-3715557976846995161L));
      f.add(new ds(-506036674948048915L));
      f.add(new ds(1889371926835547871L));
      f.add(new ds(-7857577093581813728L));
      f.add(new ds(4283899619658252845L));
      f.add(new ds(5589883298022668055L));
      f.add(new ds(-5598899639432734560L));
      f.add(new ds(-8659890505808041753L));
      f.add(new ds(5163527792776485138L));
      f.add(new ds(-4635983478657878517L));
      f.add(new ds(5530380282139853042L));
      f.add(new ds(-4026760933240353532L));
      f.add(new ds(7320404719430581869L));
      f.add(new ds(2017371593147359461L));
      f.add(new ds(-4996208767730071613L));
      f.add(new ds(-2288995389717149000L));
      f.add(new ds(-7697345936442401675L));
      f.add(new ds(-3344852412498938098L));
      f.add(new ds(656704046943840165L));
      f.add(new ds(-589872735370406573L));
      f.add(new ds(-4935175182304850931L));
      f.add(new ds(2652384316927754272L));
      f.add(new ds(-4141077140003084960L));
      f.add(new ds(1190108260993594851L));
      f.add(new ds(-5434611702728937551L));
      f.add(new ds(-2774236807430274659L));
      f.add(new ds(-7054493583760433378L));
      f.add(new ds(295842746128897281L));
      e = (int[])e.clone();
      f.add(new ds(-6360969916192451707L));
      f.add(new ds(7239093254542306530L));
      f.add(new ds(6009860563665148517L));
      f.add(new ds(-2129292280125265660L));
      f.add(new ds(3695426481291009582L));
      f.add(new ds(-7773481372403015396L));
      f.add(new ds(-7025593020839004748L));
      f.add(new ds(1951301729436321150L));
      f.add(new ds(6223314901940147957L));
      f.add(new ds(640947731497499292L));
      f.add(new ds(-3916793204830286613L));
      f.add(new ds(-8796233036184427597L));
      f.add(new ds(-480086685589921490L));
      f.add(new ds(-1533484391107517241L));
      f.add(new ds(8586928970741219283L));
      f.add(new ds(461318792195330164L));
      f.add(new ds(7218225405172881256L));
      f.add(new ds(-2777952088896050510L));
      f.add(new ds(-1191592959380549300L));
      f.add(new ds(-1636915012309129330L));
      f.add(new ds(7269347343319941408L));
      f.add(new ds(-5472748327287632924L));
      f.add(new ds(-4506146647404250453L));
      f.add(new ds(-3791149901897580048L));
      f.add(new ds(-6486567398724542290L));
      f.add(new ds(3724286420417562340L));
      f.add(new ds(4494606996670367317L));
      f.add(new ds(7493524265040419628L));
      f.add(new ds(7260012675119154116L));
      f.add(new ds(5191310815228002212L));
      f.add(new ds(-9022190630018388775L));
      f.add(new ds(8202825200273061803L));
      f.add(new ds(6100039952920377576L));
      f.add(new ds(-8076831443599962031L));
      f.add(new ds(798510409019144730L));
      f.add(new ds(6568109611227588757L));
      f.add(new ds(5360644703963120051L));
      f.add(new ds(2240537012274979363L));
      f.add(new ds(-387626317913848269L));
      f.add(new ds(-6801885514471361209L));
      f.add(new ds(-3916670744576052109L));
      f.add(new ds(-387635663758555597L));
      f.add(new ds(-2785515928439883309L));
      f.add(new ds(7693091855053073264L));
      f.add(new ds(-3441729947055594950L));
      f.add(new ds(-73057304210357048L));
      f.add(new ds(3320191948524783266L));
      f.add(new ds(-6529776987259084952L));
      f.add(new ds(6102572649565957073L));
      f.add(new ds(-8033515749034212798L));
      f.add(new ds(-8905538838158256161L));
      f.add(new ds(5673784335972232915L));
      f.add(new ds(2769406310297822401L));
      f.add(new ds(9118803804387621656L));
      f.add(new ds(-8986359745912271360L));
      f.add(new ds(3313497280869146554L));
      f.add(new ds(3378539914368412860L));
      f.add(new ds(4782376290795941150L));
      f.add(new ds(1867689056803229804L));
      f.add(new ds(-5650774388027379404L));
      f.add(new ds(8058736260128685059L));
      f.add(new ds(-775025227887777213L));
      f.add(new ds(1262046536421686579L));
      f.add(new ds(-2520419574092623212L));
      f.add(new ds(1970313949027291747L));
      f.add(new ds(-8749947084175036025L));
      e = (int[])e.clone();
      f.add(new ds(8510270464290226215L));
      f.add(new ds(-7473140165881719449L));
      f.add(new ds(-3910695632963472581L));
      f.add(new ds(-8505044097260058565L));
      f.add(new ds(-5155321927584661543L));
      f.add(new ds(-5623843696569228438L));
      f.add(new ds(-2043555116116870773L));
      f.add(new ds(-550866702115804731L));
      f.add(new ds(-5706514503258175323L));
      f.add(new ds(-1636905666481330290L));
      f.add(new ds(-363914480712360490L));
      f.add(new ds(6838769475471848791L));
      f.add(new ds(-1055432166805094083L));
      f.add(new ds(3864982288551130845L));
      f.add(new ds(4686147664996968125L));
      f.add(new ds(4929087174604948716L));
      f.add(new ds(-8940471540940192884L));
      f.add(new ds(3193695891163192584L));
      f.add(new ds(-6236771816545577062L));
      f.add(new ds(6125600600752987867L));
      f.add(new ds(7555307795447493231L));
      f.add(new ds(-6430478341934457354L));
      f.add(new ds(2181287823304088379L));
      f.add(new ds(4072657446906006833L));
      f.add(new ds(3099349538755795873L));
      f.add(new ds(-8230288782998042819L));
      f.add(new ds(-2626426643687341931L));
      f.add(new ds(-381458062087729518L));
      f.add(new ds(-984787329545031029L));
      f.add(new ds(9097450093313326895L));
      f.add(new ds(2013100971376678406L));
      f.add(new ds(-7486138135649051221L));
      f.add(new ds(1759001677421516079L));
      f.add(new ds(5064141409251490045L));
      f.add(new ds(-8885943510171398253L));
      f.add(new ds(-9065113629584716352L));
      f.add(new ds(-1719039036397121633L));
      f.add(new ds(-8379635858467847893L));
      f.add(new ds(3919443871817426242L));
      f.add(new ds(-6864049548058424544L));
      f.add(new ds(4346943194062135779L));
      f.add(new ds(-4413160978824471177L));
      f.add(new ds(5046194389595463706L));
      f.add(new ds(-5266368950621738916L));
      f.add(new ds(2886639168159537910L));
      f.add(new ds(6612125521409841792L));
      f.add(new ds(3440341773097373597L));
      f.add(new ds(-3073174773393613989L));
      f.add(new ds(6088117176370772900L));
      f.add(new ds(-7551467190600044773L));
      f.add(new ds(7557468080915029265L));
      f.add(new ds(5588890326965233158L));
      f.add(new ds(1144773888767907093L));
      f.add(new ds(8954235667945520434L));
      f.add(new ds(4723929447819814535L));
      f.add(new ds(254075114449011964L));
      f.add(new ds(9178421298831988065L));
      f.add(new ds(-7767684391208714376L));
      f.add(new ds(-1298705234653123274L));
      f.add(new ds(7909495426943266420L));
      f.add(new ds(-4854595921632049102L));
      f.add(new ds(-8713035211257808105L));
      f.add(new ds(3661507491347237013L));
      f.add(new ds(-1249461323382759802L));
      f.add(new ds(3805898193477248068L));
      f.add(new ds(4931650601929943275L));
      f.add(new ds(-261876140438023177L));
      f.add(new ds(-4024239049036581574L));
      f.add(new ds(-1040155176774917256L));
      f.add(new ds(-144510000456691740L));
      f.add(new ds(8685962807551781408L));
      f.add(new ds(-6826421831945367020L));
      f.add(new ds(3360050854679437766L));
      f.add(new ds(-3695371003136133353L));
      f.add(new ds(3234410686191534739L));
      f.add(new ds(5153533842484689329L));
      f.add(new ds(370612400952843900L));
      f.add(new ds(-8151111786611257461L));
      f.add(new ds(-8598359637583453843L));
      f.add(new ds(-578126545480355426L));
      f.add(new ds(5014046220868988897L));
      f.add(new ds(6190461587684619631L));
      f.add(new ds(4433607331112272343L));
      f.add(new ds(50236457109736426L));
      f.add(new ds(-2375404214910601027L));
      f.add(new ds(-3047539509344381442L));
      f.add(new ds(-5400134665160919416L));
      f.add(new ds(-780150647199440810L));
      f.add(new ds(6128281574741334500L));
      f.add(new ds(-1019934191782918528L));
      f.add(new ds(-757491654611642150L));
      f.add(new ds(9221210210530937102L));
      f.add(new ds(1590689828501926212L));
      f.add(new ds(-6027536454022009127L));
      f.add(new ds(-808849259778623699L));
      f.add(new ds(8066338401615439948L));
      f.add(new ds(-6082131580178892002L));
      f.add(new ds(-4591564408644192418L));
      f.add(new ds(-4195931281801605580L));
      f.add(new ds(-1675734743986346183L));
      f.add(new ds(-6166183124266950385L));
      f.add(new ds(957342004522843800L));
      f.add(new ds(-1684236868800129006L));
      f.add(new ds(1303243530248505337L));
      f.add(new ds(162428861639665444L));
      f.add(new ds(-3984923917891253725L));
      f.add(new ds(435697442353970308L));
      f.add(new ds(4964733575481752500L));
      f.add(new ds(6146376271013259733L));
      f.add(new ds(191846797825073547L));
      f.add(new ds(4268884176474034241L));
      f.add(new ds(3013315556599300404L));
      f.add(new ds(2873798716493301124L));
      f.add(new ds(-2092134159498448474L));
      f.add(new ds(2664946925654996327L));
      e = (int[])e.clone();
      f.add(new ds(-2199868073185670012L));
      f.add(new ds(7999399684041232841L));
      f.add(new ds(5740455863157043345L));
      f.add(new ds(4113500359516049505L));
      f.add(new ds(8614042050486574301L));
      f.add(new ds(4681201311285828761L));
      f.add(new ds(-5595393340880178361L));
      f.add(new ds(1557061159952933236L));
      f.add(new ds(-5484793440509869201L));
      f.add(new ds(1549453282316382222L));
      f.add(new ds(-738483943057114670L));
      f.add(new ds(-6251656800760674595L));
      f.add(new ds(-4040932889296934349L));
      f.add(new ds(-7131094875842510501L));
      f.add(new ds(-1959446382603066988L));
      f.add(new ds(-7803896556370140614L));
      f.add(new ds(-5150820324687237567L));
      f.add(new ds(-4154208138348993803L));
      f.add(new ds(-4870380020909102231L));
      f.add(new ds(5954265629621373139L));
      f.add(new ds(4394534129623820872L));
      f.add(new ds(597334048241533006L));
      f.add(new ds(1147983448560992797L));
      f.add(new ds(-1151105987421858968L));
      f.add(new ds(-7742333693736647334L));
      f.add(new ds(-6069776795504340453L));
      f.add(new ds(-8938980149573360031L));
      f.add(new ds(-7360949775920091861L));
      f.add(new ds(601903267777091717L));
      f.add(new ds(-5933801419564115193L));
      f.add(new ds(-1070477102605453425L));
      f.add(new ds(8594671466011449826L));
      f.add(new ds(-1317730163856745915L));
      f.add(new ds(1111815025450640318L));
      f.add(new ds(-3677357406200109875L));
      f.add(new ds(-5237961212963318957L));
      f.add(new ds(-5084187654610122119L));
      f.add(new ds(6474289649373758632L));
      f.add(new ds(4277784911278717005L));
      f.add(new ds(4842490075430640371L));
      f.add(new ds(5423778056051913520L));
      f.add(new ds(-1141082970595344323L));
      f.add(new ds(-6489719365757356329L));
      f.add(new ds(3431985357655909296L));
      f.add(new ds(2204265601502006886L));
      f.add(new ds(2972440498398388504L));
      f.add(new ds(-4830261678341053769L));
      f.add(new ds(3008355923342952423L));
      f.add(new ds(4301299320376592218L));
      f.add(new ds(8361049550548417127L));
      f.add(new ds(4721246528678603698L));
      f.add(new ds(-2563597050713059308L));
      f.add(new ds(-3358540862332250145L));
      f.add(new ds(-4862767640541588258L));
      f.add(new ds(7885068776398665028L));
      f.add(new ds(2545562691960718403L));
      f.add(new ds(-8233315189505918478L));
      f.add(new ds(-2416653762119074783L));
      f.add(new ds(4074819268932800057L));
      f.add(new ds(2324664225905276820L));
      f.add(new ds(-2775037064236521024L));
      f.add(new ds(-855621734325697321L));
      f.add(new ds(5968404706654160194L));
      f.add(new ds(6350672195578083089L));
      f.add(new ds(-6695025315819820101L));
      f.add(new ds(7994769599712191998L));
      f.add(new ds(6666033760777482077L));
      f.add(new ds(-4144603374244592111L));
      f.add(new ds(2309320258263171086L));
      f.add(new ds(-6396118213038470852L));
      f.add(new ds(-6419991416490149931L));
      f.add(new ds(3614962603220914938L));
      f.add(new ds(-4354436677900669688L));
      f.add(new ds(7450294580155118648L));
      f.add(new ds(-3705314392160264279L));
      f.add(new ds(1609474624475639416L));
      f.add(new ds(-7540915447631539407L));
      e = (int[])e.clone();
      f.add(new ds(1125080625358034621L));
      f.add(new ds(-3623144648552382893L));
      f.add(new ds(-868086099337955042L));
      f.add(new ds(8194260028971998222L));
      f.add(new ds(-6028573625320003011L));
      f.add(new ds(-3838955013241587590L));
      f.add(new ds(-4526525281322905232L));
      f.add(new ds(-1521815877418654803L));
      f.add(new ds(7243125648753963525L));
      f.add(new ds(1932851302676082844L));
      f.add(new ds(-4522817997499714509L));
      f.add(new ds(-4416246961552582349L));
      f.add(new ds(-2055238225302181735L));
      f.add(new ds(4197355388357907211L));
      f.add(new ds(7073295040656753688L));
      f.add(new ds(5456012436021365763L));
      f.add(new ds(-4269131523390343383L));
      f.add(new ds(588030718138788162L));
      f.add(new ds(-8486195146228367069L));
      f.add(new ds(-389164448653548400L));
      f.add(new ds(7856087875833321386L));
      f.add(new ds(-547350041912352507L));
      f.add(new ds(1644995125952917710L));
      f.add(new ds(-2493276298280966688L));
      f.add(new ds(6262788392705652413L));
      f.add(new ds(-6386548376283098956L));
      f.add(new ds(1451985776346140462L));
      f.add(new ds(2200893763428934549L));
      f.add(new ds(-1174174037723046000L));
      f.add(new ds(1674093401668878143L));
      f.add(new ds(936043301612905730L));
      f.add(new ds(1573265419132552398L));
      f.add(new ds(4799883078999588485L));
      f.add(new ds(5558539603468309168L));
      f.add(new ds(-4576487469299473089L));
      f.add(new ds(-456997899658051021L));
      f.add(new ds(-4008419546665213830L));
      f.add(new ds(-6568315163682613097L));
      f.add(new ds(-5156181196303784662L));
      f.add(new ds(-9002802907474155265L));
      f.add(new ds(-7617653348115362754L));
      f.add(new ds(3037084044354690700L));
      f.add(new ds(-5173338826610476796L));
      f.add(new ds(-421063999587463696L));
      f.add(new ds(-7630377347911486913L));
      f.add(new ds(-1484825251290748346L));
      f.add(new ds(-3972326101530116541L));
      f.add(new ds(-5766109876959980513L));
      f.add(new ds(-3536715362267224517L));
      f.add(new ds(8520093081809751926L));
      f.add(new ds(2366672300594059502L));
      f.add(new ds(3752291964986258840L));
      f.add(new ds(5532586649710130345L));
      f.add(new ds(1402534682041542517L));
      f.add(new ds(-2832407620453211002L));
      f.add(new ds(8778599957491722826L));
      f.add(new ds(1442363214892825002L));
      f.add(new ds(7464007952045730472L));
      f.add(new ds(-3866493585777007850L));
      f.add(new ds(-357673345966397322L));
      f.add(new ds(-8412172033340245646L));
      f.add(new ds(-6525646090448252234L));
      f.add(new ds(7619520617155040090L));
      f.add(new ds(-3861840213874887876L));
      f.add(new ds(3715894564199196031L));
      f.add(new ds(5619279506367301648L));
      f.add(new ds(4868833874305761354L));
      f.add(new ds(-2109927348417674412L));
      f.add(new ds(564809687804678039L));
      f.add(new ds(-2665186770970101150L));
      f.add(new ds(-4595120734443955155L));
      f.add(new ds(1534021862091994728L));
      f.add(new ds(-2501216016694724492L));
      f.add(new ds(3588432347898929713L));
      f.add(new ds(2318719810406126230L));
      f.add(new ds(-6072774611999010294L));
      f.add(new ds(-1749503791037425736L));
      f.add(new ds(2374524676705003074L));
      f.add(new ds(7201310790002563970L));
      f.add(new ds(-9036597305850630300L));
      f.add(new ds(3024963992514100063L));
      f.add(new ds(-944771263576300171L));
      f.add(new ds(-6251525285144970865L));
      f.add(new ds(2437498365560082257L));
      f.add(new ds(-1200870990693282568L));
      f.add(new ds(5737989328855355059L));
      f.add(new ds(-183205830870835238L));
      f.add(new ds(-4684231424289262345L));
      f.add(new ds(-2199868073198318428L));
      f.add(new ds(-2318213102402191847L));
      f.add(new ds(-4758610750905731745L));
      f.add(new ds(-1063428373502751322L));
      f.add(new ds(-4753345200697036893L));
      f.add(new ds(8897207755671407577L));
      f.add(new ds(1203381214064376540L));
      f.add(new ds(6469985163882561275L));
      f.add(new ds(-1910835320695783778L));
      f.add(new ds(-3872618734318507231L));
      f.add(new ds(2370845894748521245L));
      f.add(new ds(2065650663396599171L));
      f.add(new ds(-4954752927577449910L));
      f.add(new ds(8273069925198601019L));
      f.add(new ds(-6349520764981827529L));
      f.add(new ds(3640108119126369702L));
      f.add(new ds(1797833690601350454L));
      f.add(new ds(-5601447257683556900L));
      f.add(new ds(-4944924279207363040L));
      f.add(new ds(1694429063030363610L));
      f.add(new ds(7042000868212502177L));
      f.add(new ds(-49987763802851971L));
      f.add(new ds(-3031910512386871906L));
      f.add(new ds(-8239879282979513535L));
      f.add(new ds(-9031037469799019048L));
      f.add(new ds(4384527454862516933L));
      f.add(new ds(-2307122849004364508L));
      f.add(new ds(-4783332899128601207L));
      f.add(new ds(-8987546259146924073L));
      f.add(new ds(-2965225940027467973L));
      f.add(new ds(935304665565163728L));
      f.add(new ds(-1994839764860665465L));
      f.add(new ds(-9164220739360171681L));
      f.add(new ds(2939290857286676591L));
      f.add(new ds(-6180204482480023886L));
      f.add(new ds(-6380478717956205760L));
      f.add(new ds(-7174043256347107502L));
      f.add(new ds(3576065969220810872L));
      f.add(new ds(7101252789413956833L));
      f.add(new ds(-8243958725202999615L));
      f.add(new ds(3979107654135745659L));
      f.add(new ds(-1858146817185388827L));
      f.add(new ds(-2991629167735522038L));
      f.add(new ds(-5688789955006709466L));
      f.add(new ds(1134240975663941911L));
      f.add(new ds(-8729263447903979664L));
      f.add(new ds(990603943384021482L));
      f.add(new ds(1601392428015753084L));
      f.add(new ds(-2894373428030320127L));
      f.add(new ds(3178526179693655324L));
      f.add(new ds(4298853372050331678L));
      f.add(new ds(-6171758863968522325L));
      f.add(new ds(5968307851891609894L));
      f.add(new ds(-1612568690115469353L));
      f.add(new ds(377819357260396256L));
      f.add(new ds(3763810451820046609L));
      f.add(new ds(-4232380306049909326L));
      f.add(new ds(-7437789122853983816L));
      f.add(new ds(5680106830184256536L));
      f.add(new ds(-337544721642794312L));
      f.add(new ds(7596172536865105575L));
      f.add(new ds(4491760740889304931L));
      f.add(new ds(-4475889088921288123L));
      f.add(new ds(5403348057416929301L));
      f.add(new ds(-4685343521060123700L));
      f.add(new ds(1530351082757254355L));
      f.add(new ds(-5361906161924628426L));
      f.add(new ds(-2178598247889310267L));
      f.add(new ds(2941156599632589163L));
      f.add(new ds(3350801681171504628L));
      f.add(new ds(-586819325147053537L));
      f.add(new ds(4239703257561233247L));
      f.add(new ds(-2470016765972728842L));
      f.add(new ds(-343790125081156645L));
      f.add(new ds(8303859858674680690L));
      f.add(new ds(-9072655030768353463L));
      f.add(new ds(-872372392100217944L));
      f.add(new ds(-671722916631987876L));
      f.add(new ds(-4167401479505007698L));
      f.add(new ds(7856645825597494046L));
      f.add(new ds(7777287659642257819L));
      f.add(new ds(770905043131749790L));
      e = (int[])e.clone();
      f.add(new ds(6957860404328742215L));
      f.add(new ds(1419411871045611746L));
      f.add(new ds(-5260545330534528124L));
      f.add(new ds(-4706142420593507222L));
      f.add(new ds(-8464665739007834216L));
      f.add(new ds(2703270382991596925L));
      f.add(new ds(-7537804305633580753L));
      f.add(new ds(-3488174413194957441L));
      f.add(new ds(-2803263704032703651L));
      f.add(new ds(-2584628457168168796L));
      f.add(new ds(5061242834464618661L));
      f.add(new ds(-7085595461544240914L));
      f.add(new ds(-5875315375233788838L));
      f.add(new ds(-9121962426214618309L));
      f.add(new ds(-5010181900006114364L));
      f.add(new ds(-3978275260230118094L));
      f.add(new ds(-5508384634624043244L));
      f.add(new ds(2036670613328444350L));
      f.add(new ds(-1336154427649227644L));
      f.add(new ds(503704508099103526L));
      f.add(new ds(5590252067138153165L));
      f.add(new ds(-2780539956093745542L));
      f.add(new ds(-585628572393728726L));
      f.add(new ds(-6695547153602230887L));
      f.add(new ds(-2302681311709131370L));
      f.add(new ds(-3269293730502187963L));
      f.add(new ds(3474852907959106356L));
      f.add(new ds(-8453697766411731505L));
      f.add(new ds(6343915078360016759L));
      f.add(new ds(-674389394547861260L));
      f.add(new ds(-8805860210623776255L));
      f.add(new ds(-2029069484749900302L));
      f.add(new ds(2608021914193106855L));
      f.add(new ds(5609721578186839717L));
      f.add(new ds(4271962487232007527L));
      f.add(new ds(3764148892647383590L));
      f.add(new ds(-3231763601454671322L));
      f.add(new ds(-9188222556064637004L));
      f.add(new ds(-5496487749896101476L));
      f.add(new ds(7464395674069991364L));
      f.add(new ds(3756002060313824917L));
      f.add(new ds(7374456391035849551L));
      f.add(new ds(-9121233467021103719L));
      f.add(new ds(5814195615747815123L));
      f.add(new ds(-8110141894723057897L));
      f.add(new ds(1229981522796038062L));
      f.add(new ds(-1752265559591392498L));
      f.add(new ds(4993943207251027208L));
      f.add(new ds(-68975891238864142L));
      f.add(new ds(-3472673048259704115L));
      f.add(new ds(-4036668194202618482L));
      f.add(new ds(-4089923390186177134L));
      f.add(new ds(-6710217569950110337L));
      f.add(new ds(-6745861462213009271L));
      f.add(new ds(-8687499966299156252L));
      f.add(new ds(-3743926049761145671L));
      f.add(new ds(2175173364065646494L));
      f.add(new ds(-6749445703855069159L));
      f.add(new ds(979665859474180023L));
      f.add(new ds(-5198823163549716827L));
      f.add(new ds(-4881483865186443611L));
      f.add(new ds(-1495499148667059316L));
      f.add(new ds(-3848405817461695032L));
      f.add(new ds(-6114864447798473228L));
      f.add(new ds(-8792588421793432781L));
      f.add(new ds(4797754474574122188L));
      f.add(new ds(-3142614937926892580L));
      f.add(new ds(7399592803544160752L));
      f.add(new ds(3199366121479012817L));
      f.add(new ds(-2796140647291536499L));
      f.add(new ds(6728901573678005057L));
      f.add(new ds(7060255578677432457L));
      f.add(new ds(6381764166258652169L));
      f.add(new ds(4193271652947960020L));
      f.add(new ds(-7908089903342760737L));
      f.add(new ds(7397280220860632304L));
      f.add(new ds(-4354436677885924088L));
      f.add(new ds(7801265631890315862L));
      f.add(new ds(-8142709072414130163L));
      f.add(new ds(-8487722042068313019L));
      f.add(new ds(3948354133425718586L));
      f.add(new ds(7588685614602542326L));
      f.add(new ds(3611212498808213364L));
      f.add(new ds(4137559037543842001L));
      f.add(new ds(-3224216074698312528L));
      f.add(new ds(3478450020557486121L));
      f.add(new ds(-3778511375458176899L));
      f.add(new ds(2133767902305616704L));
      f.add(new ds(-7957570171507910677L));
      f.add(new ds(-6191349959111383616L));
      f.add(new ds(3180777864419981590L));
      f.add(new ds(-5911439193847163972L));
      f.add(new ds(-7646732455710571214L));
      f.add(new ds(8881589241568913136L));
      f.add(new ds(198326875254002278L));
      f.add(new ds(-2480600031078351423L));
      f.add(new ds(-1730140688334001435L));
      f.add(new ds(-8648624399589712669L));
      f.add(new ds(224779363156740792L));
      f.add(new ds(-4882526485643772859L));
      f.add(new ds(2474850328423383668L));
      f.add(new ds(3609647753717987823L));
      f.add(new ds(4235763466962491784L));
      f.add(new ds(4546027828526791521L));
      f.add(new ds(1182152936334234004L));
      f.add(new ds(-8890582888954841004L));
      f.add(new ds(-7112256110737440728L));
      f.add(new ds(-7391519661379170173L));
      f.add(new ds(-3789693876289802980L));
      f.add(new ds(2409803280816842589L));
      f.add(new ds(8925888389128097923L));
      f.add(new ds(7751072224833962594L));
      f.add(new ds(-8934226908729875179L));
      f.add(new ds(-6128165345233362077L));
      f.add(new ds(-556488510294956059L));
      f.add(new ds(-2227551460257702870L));
      f.add(new ds(-1631325638127360470L));
      f.add(new ds(-3724221334108471800L));
      f.add(new ds(-1577969729299449960L));
      f.add(new ds(-4508657386479723147L));
      f.add(new ds(-6827906427837360170L));
      f.add(new ds(4261516338954368018L));
      f.add(new ds(-8222507019854736573L));
      f.add(new ds(5913324691290675730L));
      f.add(new ds(2627640472579520544L));
      f.add(new ds(20973079678154593L));
      f.add(new ds(-7166701301734887813L));
      f.add(new ds(7276173560241234979L));
      f.add(new ds(-4951527281945074081L));
      f.add(new ds(-3749751707555055734L));
      f.add(new ds(8211548396266466448L));
      f.add(new ds(-4222700939216367380L));
      f.add(new ds(3036894570548925625L));
      f.add(new ds(520159373472467990L));
      f.add(new ds(-6555090717115385732L));
      f.add(new ds(1101741959597137417L));
      f.add(new ds(-2600251467736397938L));
      f.add(new ds(7251880980567930331L));
      f.add(new ds(8070970539202044182L));
      f.add(new ds(-6426533880118405977L));
      f.add(new ds(3321961587514702220L));
      f.add(new ds(6456396294946459754L));
      f.add(new ds(1690881958575562184L));
      f.add(new ds(6964300791614143963L));
      f.add(new ds(9098866196365249793L));
      f.add(new ds(-7675547809530829187L));
      f.add(new ds(1771705134392227135L));
      f.add(new ds(372959758852267295L));
      f.add(new ds(3942873156846860000L));
      f.add(new ds(8981713683176577110L));
      f.add(new ds(8104126571545486021L));
      f.add(new ds(5233538756256488575L));
      f.add(new ds(5869148894929622392L));
      f.add(new ds(5291642175418052419L));
      f.add(new ds(-4851882170122919376L));
      f.add(new ds(-1187886754316776151L));
      f.add(new ds(5515894639317964828L));
      f.add(new ds(-8659545981415729983L));
      e = (int[])e.clone();
      f.add(new ds(-6629616748463042916L));
      f.add(new ds(2380061129660447457L));
      f.add(new ds(5431245313574992945L));
      f.add(new ds(-6207152524105778441L));
      f.add(new ds(-3696668097281612733L));
      f.add(new ds(-3677130269940187736L));
      f.add(new ds(4094443509072168520L));
      f.add(new ds(7275055790906729125L));
      f.add(new ds(1586054675850047058L));
      f.add(new ds(7842088165652314047L));
      f.add(new ds(-2966354706208551083L));
      f.add(new ds(-6269511633706094365L));
      f.add(new ds(3478305132495321667L));
      f.add(new ds(7488490929597567004L));
      f.add(new ds(8195070163247899564L));
      f.add(new ds(2568473951917860380L));
      f.add(new ds(3608073424484530367L));
      f.add(new ds(-327431393145080925L));
      f.add(new ds(2223766061730777668L));
      f.add(new ds(2370836548897588029L));
      f.add(new ds(-7408332116754154833L));
      f.add(new ds(2409372205965359153L));
      f.add(new ds(-8634491178155308264L));
      f.add(new ds(4090904648224444794L));
      f.add(new ds(-5249942783430347539L));
      f.add(new ds(5974034488337126131L));
      f.add(new ds(-1993201968434036246L));
      f.add(new ds(2731711603461646467L));
      f.add(new ds(-4187991224538684004L));
      f.add(new ds(-5716396788187877782L));
      f.add(new ds(4618388598952482693L));
      f.add(new ds(3465195975453969358L));
      f.add(new ds(-2870800678152445189L));
      f.add(new ds(-2238289803662922685L));
      f.add(new ds(-8361023787289306413L));
      f.add(new ds(5689005883756827209L));
      f.add(new ds(4287329622573786992L));
      f.add(new ds(9026954443673021053L));
      f.add(new ds(3185650327741632807L));
      f.add(new ds(8918844258407660641L));
      f.add(new ds(6727413124131428333L));
      f.add(new ds(7424117087968390228L));
      f.add(new ds(-3009738347151615985L));
      f.add(new ds(5334389723990130705L));
      f.add(new ds(7171578750648682963L));
      f.add(new ds(-1590972396936489832L));
      f.add(new ds(5749679788244216061L));
      f.add(new ds(210400585519208922L));
      f.add(new ds(3287262113172578757L));
      f.add(new ds(3300022453818878113L));
      f.add(new ds(515176723738966161L));
      f.add(new ds(-1117457307167058289L));
      f.add(new ds(4669577288527869065L));
      f.add(new ds(-8523382724058727562L));
      f.add(new ds(-4246677121058633132L));
      f.add(new ds(4800169843989241836L));
      f.add(new ds(-3207758777257726507L));
      f.add(new ds(-1870325847822753609L));
      f.add(new ds(7710967513922426228L));
      f.add(new ds(2031531665822464109L));
      f.add(new ds(-9001792459683668526L));
      f.add(new ds(-418691708970449730L));
      f.add(new ds(-4934753078734610441L));
      f.add(new ds(4988269906541551867L));
      f.add(new ds(-1324630136717675503L));
      f.add(new ds(7483126246687095132L));
      f.add(new ds(6100040502592305352L));
      f.add(new ds(2575699363347836121L));
      f.add(new ds(3987092346218333317L));
      f.add(new ds(2417969007677363404L));
      f.add(new ds(-9183321369999978930L));
      f.add(new ds(-8147644644333389514L));
      f.add(new ds(-3674229623768772234L));
      f.add(new ds(2557807770596401903L));
      f.add(new ds(1330794171617330462L));
      f.add(new ds(1246322159023180215L));
      f.add(new ds(-1463992907374248310L));
      f.add(new ds(8657117237896907951L));
      f.add(new ds(-2927084909782323969L));
      f.add(new ds(5757360433847699635L));
      f.add(new ds(-1422456794919922L));
      f.add(new ds(7868892744691856358L));
      f.add(new ds(-7538390857707427652L));
      f.add(new ds(-7312068005714277710L));
      f.add(new ds(5191873882296146859L));
      f.add(new ds(8274525137268232087L));
      f.add(new ds(-2582350942046856674L));
      f.add(new ds(7036540971166983088L));
      f.add(new ds(1851016493733964870L));
      f.add(new ds(4223825282593380843L));
      f.add(new ds(1517610333502620847L));
      f.add(new ds(1262552264976615132L));
      f.add(new ds(5259183272581873536L));
      f.add(new ds(4657957339362954306L));
      f.add(new ds(-451153042852722358L));
      f.add(new ds(-6821837977207221662L));
      f.add(new ds(36308363978090102L));
      f.add(new ds(1874482234468511125L));
      f.add(new ds(-8275571368092931193L));
      f.add(new ds(-4792652839937190748L));
      f.add(new ds(2907778660266253268L));
      f.add(new ds(-6151265135997116252L));
      f.add(new ds(1706167694625964535L));
      f.add(new ds(-3634129016142178872L));
      f.add(new ds(4466239538367167730L));
      f.add(new ds(-4036221807709780724L));
      f.add(new ds(49989565513086209L));
      f.add(new ds(1435726603059072717L));
      f.add(new ds(-1004732923522604118L));
      f.add(new ds(-4884014411563011887L));
      f.add(new ds(-2444034754611502704L));
      f.add(new ds(7287766218250157228L));
      f.add(new ds(4268393584731968732L));
      f.add(new ds(-5673264568682240103L));
      f.add(new ds(-2545309415214537604L));
      f.add(new ds(-6528310551676243841L));
      f.add(new ds(-1047170212370814396L));
      f.add(new ds(3362090802085638293L));
      f.add(new ds(9179857324746921308L));
      f.add(new ds(8789244111814944279L));
      f.add(new ds(7879991270878566393L));
      f.add(new ds(-831849989854865365L));
      f.add(new ds(-8084883211160320343L));
      f.add(new ds(-7639948328183051123L));
      f.add(new ds(1317936464713394515L));
      f.add(new ds(-7800451365500118457L));
      f.add(new ds(-8955027013582157132L));
      f.add(new ds(-1730140138649425179L));
      f.add(new ds(-402818485573825747L));
      f.add(new ds(840294044967130201L));
      f.add(new ds(8371060572785124754L));
      f.add(new ds(4360034646334646955L));
      f.add(new ds(-7627878873358341956L));
      f.add(new ds(4947223571371114504L));
      f.add(new ds(2961828950118485435L));
      f.add(new ds(6767870493588089229L));
      f.add(new ds(-903571157513135182L));
      f.add(new ds(-5147164347571645625L));
      f.add(new ds(4737341598527373667L));
      f.add(new ds(-3936870613226898647L));
      f.add(new ds(-3180012980976702281L));
      f.add(new ds(8113101653089634928L));
      f.add(new ds(5713586767547387691L));
      f.add(new ds(-8713290002045333936L));
      f.add(new ds(923129839609895289L));
      f.add(new ds(-4094434574545598327L));
      f.add(new ds(8690228086251224616L));
      f.add(new ds(-2187884258452561506L));
      f.add(new ds(792619103310903189L));
      f.add(new ds(4519148855723310772L));
      f.add(new ds(3083976537287547967L));
      f.add(new ds(4319063163038931331L));
      f.add(new ds(-2809630400563403400L));
      f.add(new ds(2568583272416604100L));
      f.add(new ds(-3674278961708273849L));
      f.add(new ds(4704649855338697110L));
      f.add(new ds(-8567997036043815704L));
      f.add(new ds(5146865764659404777L));
      f.add(new ds(-202999396331395600L));
      f.add(new ds(-5314722149512520265L));
      f.add(new ds(-5939794737864038881L));
      f.add(new ds(-2951749388028997359L));
      f.add(new ds(-9067765456003000730L));
      e = (int[])e.clone();
      f.add(new ds(-3206670976462814004L));
      f.add(new ds(-8639669669134805179L));
      f.add(new ds(5483967964403996941L));
      f.add(new ds(-1396610422113681926L));
      f.add(new ds(-7966003022962494122L));
      f.add(new ds(-8878465816674756020L));
      f.add(new ds(-5197233347185732595L));
      f.add(new ds(8816937985548799922L));
      f.add(new ds(-7121101768223142651L));
      f.add(new ds(-1409428192206253228L));
      f.add(new ds(697991295047853334L));
      f.add(new ds(1021136400113783214L));
      f.add(new ds(-1335709672646072648L));
      f.add(new ds(-8947716049872345750L));
      f.add(new ds(4678403799682764219L));
      f.add(new ds(1958745033377407843L));
      f.add(new ds(-5833178961027517805L));
      f.add(new ds(-5635527902514932862L));
      f.add(new ds(4385407787526772917L));
      f.add(new ds(2324229496567338490L));
      f.add(new ds(2466447178349477411L));
      f.add(new ds(743051087802368479L));
      f.add(new ds(1063492479090761683L));
      f.add(new ds(-36815226099322831L));
      f.add(new ds(-743198302964133875L));
      f.add(new ds(-3320987674291345000L));
      f.add(new ds(4131490490128942008L));
      f.add(new ds(6333869094634534892L));
      f.add(new ds(-7383846770441792439L));
      f.add(new ds(6394402079483683950L));
      f.add(new ds(-6645871109639215897L));
      f.add(new ds(7141350416124306446L));
      f.add(new ds(737536644019848301L));
      f.add(new ds(5078482319366365919L));
      f.add(new ds(7814163291684601129L));
      f.add(new ds(7360015760871293979L));
      f.add(new ds(8372671092218709051L));
      f.add(new ds(-2505670661423040135L));
      f.add(new ds(-3912386863980761133L));
      f.add(new ds(-4387836054010481515L));
      f.add(new ds(-3321352310821625786L));
      f.add(new ds(7315615692505174996L));
      f.add(new ds(-9215076977065212498L));
      f.add(new ds(-3771112108309688605L));
      f.add(new ds(-3373671090130056226L));
      f.add(new ds(-2545717465495390290L));
      f.add(new ds(-7524898334829528930L));
      f.add(new ds(4264554449729197328L));
      f.add(new ds(8517617016677823023L));
      f.add(new ds(2075884847142473509L));
      f.add(new ds(3462946365727104673L));
      f.add(new ds(-453066773690532795L));
      f.add(new ds(1543277897604424180L));
      f.add(new ds(3508584144779890924L));
      f.add(new ds(-3336527913753589679L));
      f.add(new ds(6418859732255388637L));
      f.add(new ds(6066410994201475930L));
      f.add(new ds(-6639262113635446321L));
      f.add(new ds(-4314919453592755599L));
      f.add(new ds(6271950313640048672L));
      f.add(new ds(4179623507489444394L));
      f.add(new ds(6573259645006407007L));
      f.add(new ds(-7927705410442238711L));
      f.add(new ds(2528917892438502316L));
      f.add(new ds(6833837646499441888L));
      f.add(new ds(-9139505750741484875L));
      f.add(new ds(-95820769763662289L));
      f.add(new ds(7482377403266978862L));
      f.add(new ds(6227562442976523270L));
      f.add(new ds(-5353518655996351240L));
      f.add(new ds(-3661109801493671613L));
      f.add(new ds(-6628382569561469542L));
      f.add(new ds(1560435356688768690L));
      f.add(new ds(3088228088982533318L));
      f.add(new ds(6573259644939363711L));
      f.add(new ds(-6270116333885021567L));
      f.add(new ds(-6697466576437752676L));
      f.add(new ds(-6208385134072375436L));
      f.add(new ds(1905227147112044985L));
      f.add(new ds(6529171547614617261L));
      e = new int[]{-16, -1, 1, -7, -23, -46, -19, -8, -47, -24, 7, -49, -25, -35, -7, 8, 16, -23, -24, -40, -37, 7, -14, -38, -5, 19, -24, 23, -10, 5, -19, -25, -15, 24, -24, -6, 14, 25, 10, -14, 23, 6, 24, -11, -18, -18, -6, 15, 35, 19, 24, 46, 6, 14, 11, 47, 25, 37, 24, 40, 49, 38, 18, 18};
   }
}
