package M2;

import B1.d;
import I.C0044m;
import K2.o;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f1171a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1172b;

    public a(Context context, d dVar) {
        o oVar = new o(2, this);
        this.f1172b = context;
        this.f1171a = dVar;
        dVar.f97n = oVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
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

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(locales.get(i4));
        }
        d dVar = this.f1171a;
        dVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((C0044m) dVar.f96m).j("setLocale", arrayList2, null);
    }
}
