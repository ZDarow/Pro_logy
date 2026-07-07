package p051M2;

/* renamed from: M2.a */
/* loaded from: classes.dex */
public final class C0428a {

    /* renamed from: a */
    public final p008B1.C0026d f1210a;

    /* renamed from: b */
    public final android.content.Context f1211b;

    public C0428a(android.content.Context context, p008B1.C0026d c0026d) {
        p043K2.C0339o c0339o = new p043K2.C0339o(2, this);
        this.f1211b = context;
        this.f1210a = c0026d;
        c0026d.f100n = c0339o;
    }

    /* renamed from: a */
    public static java.util.Locale m903a(java.lang.String str) {
        java.util.Locale.Builder builder = new java.util.Locale.Builder();
        java.lang.String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i4 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i4 = 2;
        }
        if (split.length > i4 && split[i4].length() >= 2 && split[i4].length() <= 3) {
            builder.setRegion(split[i4]);
        }
        return builder.build();
    }

    /* renamed from: b */
    public final void m904b(android.content.res.Configuration configuration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(locales.get(i4));
        }
        p008B1.C0026d c0026d = this.f1210a;
        c0026d.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.Locale locale = (java.util.Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((p035I.C0291m) c0026d.f99m).m694j("setLocale", arrayList2, null);
    }
}
