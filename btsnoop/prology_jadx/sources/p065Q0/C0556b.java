package p065Q0;

/* renamed from: Q0.b */
/* loaded from: classes.dex */
public final class C0556b {

    /* renamed from: a */
    public final byte[] f1637a = new byte[8];

    /* renamed from: b */
    public final java.util.ArrayDeque f1638b = new java.util.ArrayDeque();

    /* renamed from: c */
    public final p065Q0.C0559e f1639c = new p065Q0.C0559e();

    /* renamed from: d */
    public p043K2.C0339o f1640d;

    /* renamed from: e */
    public int f1641e;

    /* renamed from: f */
    public int f1642f;

    /* renamed from: g */
    public long f1643g;

    /* renamed from: a */
    public final long m1062a(p215y0.C2400l c2400l, int i4) {
        c2400l.mo631k(this.f1637a, 0, i4, false);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = (j4 << 8) | (r0[i5] & 255);
        }
        return j4;
    }
}
