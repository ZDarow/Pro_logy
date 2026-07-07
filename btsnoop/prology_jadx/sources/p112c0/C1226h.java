package p112c0;

/* renamed from: c0.h */
/* loaded from: classes.dex */
public final class C1226h extends android.database.ContentObserver {

    /* renamed from: a */
    public final android.content.ContentResolver f4774a;

    /* renamed from: b */
    public final android.net.Uri f4775b;

    /* renamed from: c */
    public final /* synthetic */ p112c0.C1227i f4776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226h(p112c0.C1227i c1227i, android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(handler);
        this.f4776c = c1227i;
        this.f4774a = contentResolver;
        this.f4775b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        p112c0.C1227i c1227i = this.f4776c;
        c1227i.m2909a(p112c0.C1223e.m2903b(c1227i.f4777a, c1227i.f4785i, c1227i.f4784h));
    }
}
