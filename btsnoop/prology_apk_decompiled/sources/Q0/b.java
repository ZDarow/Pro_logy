package Q0;

import K2.o;
import java.util.ArrayDeque;
import y0.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1585a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f1586b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f1587c = new e();

    /* renamed from: d, reason: collision with root package name */
    public o f1588d;

    /* renamed from: e, reason: collision with root package name */
    public int f1589e;

    /* renamed from: f, reason: collision with root package name */
    public int f1590f;

    /* renamed from: g, reason: collision with root package name */
    public long f1591g;

    public final long a(l lVar, int i4) {
        lVar.k(this.f1585a, 0, i4, false);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = (j4 << 8) | (r0[i5] & 255);
        }
        return j4;
    }
}
