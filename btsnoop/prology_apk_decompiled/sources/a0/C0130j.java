package a0;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: a0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130j {

    /* renamed from: a, reason: collision with root package name */
    public final u0.e f3512a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3513b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3514c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3515d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3516e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3517f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3518g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3519h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f3520i;

    /* renamed from: j, reason: collision with root package name */
    public long f3521j;

    public C0130j(u0.e eVar, int i4, int i5, int i6, int i7, int i8, boolean z4, int i9) {
        a(i6, 0, "bufferForPlaybackMs", "0");
        a(i7, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i4, i6, "minBufferMs", "bufferForPlaybackMs");
        a(i4, i7, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i5, i4, "maxBufferMs", "minBufferMs");
        a(i9, 0, "backBufferDurationMs", "0");
        this.f3512a = eVar;
        this.f3513b = W.y.M(i4);
        this.f3514c = W.y.M(i5);
        this.f3515d = W.y.M(i6);
        this.f3516e = W.y.M(i7);
        this.f3517f = i8;
        this.f3518g = z4;
        this.f3519h = W.y.M(i9);
        this.f3520i = new HashMap();
        this.f3521j = -1L;
    }

    public static void a(int i4, int i5, String str, String str2) {
        W.a.d(str + " cannot be less than " + str2, i4 >= i5);
    }

    public final int b() {
        Iterator it = this.f3520i.values().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((C0129i) it.next()).f3502b;
        }
        return i4;
    }

    public final boolean c(O o2) {
        int i4;
        C0129i c0129i = (C0129i) this.f3520i.get(o2.f3326a);
        c0129i.getClass();
        u0.e eVar = this.f3512a;
        synchronized (eVar) {
            i4 = eVar.f8503d * eVar.f8501b;
        }
        boolean z4 = true;
        boolean z5 = i4 >= b();
        float f4 = o2.f3328c;
        long j4 = this.f3514c;
        long j5 = this.f3513b;
        if (f4 > 1.0f) {
            j5 = Math.min(W.y.y(j5, f4), j4);
        }
        long max = Math.max(j5, 500000L);
        long j6 = o2.f3327b;
        if (j6 < max) {
            if (!this.f3518g && z5) {
                z4 = false;
            }
            c0129i.f3501a = z4;
            if (!z4 && j6 < 500000) {
                W.a.A("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j6 >= j4 || z5) {
            c0129i.f3501a = false;
        }
        return c0129i.f3501a;
    }

    public final void d() {
        if (!this.f3520i.isEmpty()) {
            this.f3512a.a(b());
            return;
        }
        u0.e eVar = this.f3512a;
        synchronized (eVar) {
            if (eVar.f8500a) {
                eVar.a(0);
            }
        }
    }
}
