package p073S0;

/* renamed from: S0.g */
/* loaded from: classes.dex */
public final class C0629g {

    /* renamed from: a */
    public int f1971a;

    /* renamed from: b */
    public int f1972b;

    /* renamed from: c */
    public java.lang.Object f1973c = new long[10];

    /* renamed from: d */
    public java.lang.Object f1974d = new java.lang.Object[10];

    /* renamed from: a */
    public synchronized void m1143a(long j4, java.lang.Object obj) {
        if (this.f1972b > 0) {
            if (j4 <= ((long[]) this.f1973c)[((this.f1971a + r0) - 1) % ((java.lang.Object[]) this.f1974d).length]) {
                m1145c();
            }
        }
        m1146d();
        int i4 = this.f1971a;
        int i5 = this.f1972b;
        java.lang.Object[] objArr = (java.lang.Object[]) this.f1974d;
        int length = (i4 + i5) % objArr.length;
        ((long[]) this.f1973c)[length] = j4;
        objArr[length] = obj;
        this.f1972b = i5 + 1;
    }

    /* renamed from: b */
    public void m1144b() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new p026F2.RunnableC0226c(11, this));
    }

    /* renamed from: c */
    public synchronized void m1145c() {
        this.f1971a = 0;
        this.f1972b = 0;
        java.util.Arrays.fill((java.lang.Object[]) this.f1974d, (java.lang.Object) null);
    }

    /* renamed from: d */
    public void m1146d() {
        int length = ((java.lang.Object[]) this.f1974d).length;
        if (this.f1972b < length) {
            return;
        }
        int i4 = length * 2;
        long[] jArr = new long[i4];
        java.lang.Object[] objArr = new java.lang.Object[i4];
        int i5 = this.f1971a;
        int i6 = length - i5;
        java.lang.System.arraycopy((long[]) this.f1973c, i5, jArr, 0, i6);
        java.lang.System.arraycopy((java.lang.Object[]) this.f1974d, this.f1971a, objArr, 0, i6);
        int i7 = this.f1971a;
        if (i7 > 0) {
            java.lang.System.arraycopy((long[]) this.f1973c, 0, jArr, i6, i7);
            java.lang.System.arraycopy((java.lang.Object[]) this.f1974d, 0, objArr, i6, this.f1971a);
        }
        this.f1973c = jArr;
        this.f1974d = objArr;
        this.f1971a = 0;
    }

    /* renamed from: e */
    public void m1147e(android.graphics.Typeface typeface) {
        int i4;
        if (android.os.Build.VERSION.SDK_INT >= 28 && (i4 = this.f1971a) != -1) {
            typeface = android.graphics.Typeface.create(typeface, i4, (this.f1972b & 2) != 0);
        }
        p145j.C1685t c1685t = (p145j.C1685t) this.f1974d;
        if (c1685t.f7023m) {
            c1685t.f7022l = typeface;
            android.widget.TextView textView = (android.widget.TextView) ((java.lang.ref.WeakReference) this.f1973c).get();
            if (textView != null) {
                java.lang.reflect.Field field = p011C.AbstractC0132x.f336a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new p145j.RunnableC1683s(textView, typeface, c1685t.f7020j));
                } else {
                    textView.setTypeface(typeface, c1685t.f7020j);
                }
            }
        }
    }

    /* renamed from: f */
    public synchronized java.lang.Object m1148f() {
        return this.f1972b == 0 ? null : m1150h();
    }

    /* renamed from: g */
    public synchronized java.lang.Object m1149g(long j4) {
        java.lang.Object obj;
        obj = null;
        while (this.f1972b > 0 && j4 - ((long[]) this.f1973c)[this.f1971a] >= 0) {
            obj = m1150h();
        }
        return obj;
    }

    /* renamed from: h */
    public java.lang.Object m1150h() {
        p086W.AbstractC0781a.m1421j(this.f1972b > 0);
        java.lang.Object[] objArr = (java.lang.Object[]) this.f1974d;
        int i4 = this.f1971a;
        java.lang.Object obj = objArr[i4];
        objArr[i4] = null;
        this.f1971a = (i4 + 1) % objArr.length;
        this.f1972b--;
        return obj;
    }

    /* renamed from: i */
    public synchronized int m1151i() {
        return this.f1972b;
    }
}
