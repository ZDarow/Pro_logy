package p196u;

/* renamed from: u.c */
/* loaded from: classes.dex */
public abstract class AbstractC2208c {

    /* renamed from: a */
    public static final p196u.AbstractC2212g f8814a;

    /* renamed from: b */
    public static final p165n.C1882i f8815b;

    static {
        android.os.Trace.beginSection(p101a.AbstractC0936a.m1788Z("TypefaceCompat static init"));
        int i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f8814a = new p196u.AbstractC2212g(0);
        } else if (i4 >= 28) {
            f8814a = new p196u.C2209d();
        } else {
            f8814a = new p196u.C2209d();
        }
        f8815b = new p165n.C1882i(16);
        android.os.Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r6.equals(r10) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m4389a(android.content.Context r15, p192t.InterfaceC2158a r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, p073S0.C0629g r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p196u.AbstractC2208c.m4389a(android.content.Context, t.a, android.content.res.Resources, int, java.lang.String, int, int, S0.g):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static java.lang.String m4390b(android.content.res.Resources resources, int i4, java.lang.String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }
}
