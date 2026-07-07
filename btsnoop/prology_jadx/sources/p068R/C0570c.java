package p068R;

/* renamed from: R.c */
/* loaded from: classes.dex */
public final class C0570c extends p021E0.AbstractC0193e {

    /* renamed from: b */
    public int[] f1771b;

    /* renamed from: c */
    public android.support.v4.media.session.MediaSessionCompat$Token f1772c;

    @Override // p021E0.AbstractC0193e
    /* renamed from: a */
    public final void mo549a(android.support.v4.media.session.C1061t c1061t) {
        int i4 = android.os.Build.VERSION.SDK_INT;
        android.app.Notification.Builder builder = (android.app.Notification.Builder) c1061t.f3861m;
        if (i4 >= 34) {
            p068R.AbstractC0568a.m1089d(builder, p068R.AbstractC0568a.m1087b(p068R.AbstractC0569b.m1091a(p068R.AbstractC0568a.m1086a(), null, 0, null, java.lang.Boolean.FALSE), this.f1771b, this.f1772c));
        } else {
            p068R.AbstractC0568a.m1089d(builder, p068R.AbstractC0568a.m1087b(p068R.AbstractC0568a.m1086a(), this.f1771b, this.f1772c));
        }
    }
}
