package p064Q;

/* renamed from: Q.f */
/* loaded from: classes.dex */
public final class C0534f implements android.os.IBinder.DeathRecipient {

    /* renamed from: a */
    public final java.lang.String f1568a;

    /* renamed from: b */
    public final int f1569b;

    /* renamed from: c */
    public final int f1570c;

    /* renamed from: d */
    public final p043K2.C0339o f1571d;

    /* renamed from: e */
    public final java.util.HashMap f1572e = new java.util.HashMap();

    /* renamed from: f */
    public p008B1.C0026d f1573f;

    /* renamed from: g */
    public final /* synthetic */ p064Q.AbstractServiceC0548t f1574g;

    public C0534f(p064Q.AbstractServiceC0548t abstractServiceC0548t, java.lang.String str, int i4, int i5, p043K2.C0339o c0339o) {
        this.f1574g = abstractServiceC0548t;
        this.f1568a = str;
        this.f1569b = i4;
        this.f1570c = i5;
        if (str == null) {
            throw new java.lang.NullPointerException("package shouldn't be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("packageName should be nonempty");
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            p001A.AbstractC0000a.m22s(i4, i5, str);
        }
        this.f1571d = c0339o;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f1574g.f1627q.post(new p024F.RunnableC0199b(6, this));
    }
}
