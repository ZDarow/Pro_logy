package p086W;

/* renamed from: W.b */
/* loaded from: classes.dex */
public abstract class AbstractC0782b {

    /* renamed from: a */
    public static final java.util.regex.Pattern f2735a = java.util.regex.Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    public static final java.util.regex.Pattern f2736b = java.util.regex.Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    public static final java.util.regex.Pattern f2737c = java.util.regex.Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    public static final java.util.HashMap f2738d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f2738d = hashMap;
        p009B2.AbstractC0051h.m157p(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        p009B2.AbstractC0051h.m157p(-983041, hashMap, "azure", -657956, "beige");
        p009B2.AbstractC0051h.m157p(-6972, hashMap, "bisque", -16777216, "black");
        p009B2.AbstractC0051h.m157p(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        p009B2.AbstractC0051h.m157p(-7722014, hashMap, "blueviolet", -5952982, "brown");
        p009B2.AbstractC0051h.m157p(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        p009B2.AbstractC0051h.m157p(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        p009B2.AbstractC0051h.m157p(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        p009B2.AbstractC0051h.m157p(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        p009B2.AbstractC0051h.m157p(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        p009B2.AbstractC0051h.m157p(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        p009B2.AbstractC0051h.m157p(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        p009B2.AbstractC0051h.m157p(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        p009B2.AbstractC0051h.m157p(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        p009B2.AbstractC0051h.m157p(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        p009B2.AbstractC0051h.m157p(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        p009B2.AbstractC0051h.m157p(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        p009B2.AbstractC0051h.m157p(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        p009B2.AbstractC0051h.m157p(-38476, hashMap, "hotpink", -3318692, "indianred");
        p009B2.AbstractC0051h.m157p(-11861886, hashMap, "indigo", -16, "ivory");
        p009B2.AbstractC0051h.m157p(-989556, hashMap, "khaki", -1644806, "lavender");
        p009B2.AbstractC0051h.m157p(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        p009B2.AbstractC0051h.m157p(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        p009B2.AbstractC0051h.m157p(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        p009B2.AbstractC0051h.m157p(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        p009B2.AbstractC0051h.m157p(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        p009B2.AbstractC0051h.m157p(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        p009B2.AbstractC0051h.m157p(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        p009B2.AbstractC0051h.m157p(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        p009B2.AbstractC0051h.m157p(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        p009B2.AbstractC0051h.m157p(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        p009B2.AbstractC0051h.m157p(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        p009B2.AbstractC0051h.m157p(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        p009B2.AbstractC0051h.m157p(-6943, hashMap, "mistyrose", -6987, "moccasin");
        p009B2.AbstractC0051h.m157p(-8531, hashMap, "navajowhite", -16777088, "navy");
        p009B2.AbstractC0051h.m157p(-133658, hashMap, "oldlace", -8355840, "olive");
        p009B2.AbstractC0051h.m157p(-9728477, hashMap, "olivedrab", -23296, "orange");
        p009B2.AbstractC0051h.m157p(-47872, hashMap, "orangered", -2461482, "orchid");
        p009B2.AbstractC0051h.m157p(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        p009B2.AbstractC0051h.m157p(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        p009B2.AbstractC0051h.m157p(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        p009B2.AbstractC0051h.m157p(-3308225, hashMap, "peru", -16181, "pink");
        p009B2.AbstractC0051h.m157p(-2252579, hashMap, "plum", -5185306, "powderblue");
        p009B2.AbstractC0051h.m157p(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        p009B2.AbstractC0051h.m157p(-65536, hashMap, "red", -4419697, "rosybrown");
        p009B2.AbstractC0051h.m157p(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        p009B2.AbstractC0051h.m157p(-360334, hashMap, "salmon", -744352, "sandybrown");
        p009B2.AbstractC0051h.m157p(-13726889, hashMap, "seagreen", -2578, "seashell");
        p009B2.AbstractC0051h.m157p(-6270419, hashMap, "sienna", -4144960, "silver");
        p009B2.AbstractC0051h.m157p(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        p009B2.AbstractC0051h.m157p(-12156236, hashMap, "steelblue", -2968436, "tan");
        p009B2.AbstractC0051h.m157p(-16744320, hashMap, "teal", -2572328, "thistle");
        p009B2.AbstractC0051h.m157p(-40121, hashMap, "tomato", 0, "transparent");
        p009B2.AbstractC0051h.m157p(-12525360, hashMap, "turquoise", -1146130, "violet");
        p009B2.AbstractC0051h.m157p(-663885, hashMap, "wheat", -1, "white");
        p009B2.AbstractC0051h.m157p(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    /* renamed from: a */
    public static int m1438a(java.lang.String str, boolean z4) {
        int parseInt;
        p086W.AbstractC0781a.m1416e(!android.text.TextUtils.isEmpty(str));
        java.lang.String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) java.lang.Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new java.lang.IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            java.util.regex.Matcher matcher = (z4 ? f2737c : f2736b).matcher(replace);
            if (matcher.matches()) {
                if (z4) {
                    java.lang.String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (java.lang.Float.parseFloat(group) * 255.0f);
                } else {
                    java.lang.String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = java.lang.Integer.parseInt(group2, 10);
                }
                java.lang.String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = java.lang.Integer.parseInt(group3, 10);
                java.lang.String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = java.lang.Integer.parseInt(group4, 10);
                java.lang.String group5 = matcher.group(3);
                group5.getClass();
                return android.graphics.Color.argb(parseInt, parseInt2, parseInt3, java.lang.Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            java.util.regex.Matcher matcher2 = f2735a.matcher(replace);
            if (matcher2.matches()) {
                java.lang.String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = java.lang.Integer.parseInt(group6, 10);
                java.lang.String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = java.lang.Integer.parseInt(group7, 10);
                java.lang.String group8 = matcher2.group(3);
                group8.getClass();
                return android.graphics.Color.rgb(parseInt4, parseInt5, java.lang.Integer.parseInt(group8, 10));
            }
        } else {
            java.lang.Integer num = (java.lang.Integer) f2738d.get(p080U1.AbstractC0748a.m1361I(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new java.lang.IllegalArgumentException();
    }
}
