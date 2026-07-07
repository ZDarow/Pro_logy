package u0;

import W.y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public int f8502c;

    /* renamed from: d, reason: collision with root package name */
    public int f8503d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8500a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f8501b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f8504e = 0;

    /* renamed from: f, reason: collision with root package name */
    public a[] f8505f = new a[100];

    public final synchronized void a(int i4) {
        boolean z4 = i4 < this.f8502c;
        this.f8502c = i4;
        if (z4) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, y.g(this.f8502c, this.f8501b) - this.f8503d);
        int i4 = this.f8504e;
        if (max >= i4) {
            return;
        }
        Arrays.fill(this.f8505f, max, i4, (Object) null);
        this.f8504e = max;
    }
}
