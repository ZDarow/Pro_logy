package p160m;

/* renamed from: m.b */
/* loaded from: classes.dex */
public abstract class AbstractC1834b {
    /* renamed from: a */
    public static java.lang.String m3798a() {
        android.os.LocaleList adjustedDefault = android.os.LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
