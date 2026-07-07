package p117d0;

/* renamed from: d0.f */
/* loaded from: classes.dex */
public final class C1262f implements p197u0.InterfaceC2229p {

    /* renamed from: l */
    public static final java.util.regex.Pattern f5030l = java.util.regex.Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // p197u0.InterfaceC2229p
    /* renamed from: p */
    public final java.lang.Object mo601p(android.net.Uri uri, p094Y.C0872j c0872j) {
        java.lang.String readLine = new java.io.BufferedReader(new java.io.InputStreamReader(c0872j, p124e2.AbstractC1356d.f5630c)).readLine();
        try {
            java.util.regex.Matcher matcher = f5030l.matcher(readLine);
            if (!matcher.matches()) {
                throw p076T.C0666I.m1203b("Couldn't parse timestamp: " + readLine, null);
            }
            java.lang.String group = matcher.group(1);
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j4 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = java.lang.Long.parseLong(matcher.group(5));
                java.lang.String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (android.text.TextUtils.isEmpty(group2) ? 0L : java.lang.Long.parseLong(group2))) * 60000) * j4;
            }
            return java.lang.Long.valueOf(time);
        } catch (java.text.ParseException e4) {
            throw p076T.C0666I.m1203b(null, e4);
        }
    }
}
