package c0;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f4646a;

    /* renamed from: b, reason: collision with root package name */
    public int f4647b;

    /* renamed from: c, reason: collision with root package name */
    public long f4648c;

    /* renamed from: d, reason: collision with root package name */
    public long f4649d;

    /* renamed from: e, reason: collision with root package name */
    public long f4650e;

    /* renamed from: f, reason: collision with root package name */
    public long f4651f;

    public u(AudioTrack audioTrack) {
        this.f4646a = new t(audioTrack);
        a();
    }

    public final void a() {
        if (this.f4646a != null) {
            b(0);
        }
    }

    public final void b(int i4) {
        this.f4647b = i4;
        if (i4 == 0) {
            this.f4650e = 0L;
            this.f4651f = -1L;
            this.f4648c = System.nanoTime() / 1000;
            this.f4649d = 10000L;
            return;
        }
        if (i4 == 1) {
            this.f4649d = 10000L;
            return;
        }
        if (i4 == 2 || i4 == 3) {
            this.f4649d = 10000000L;
        } else {
            if (i4 != 4) {
                throw new IllegalStateException();
            }
            this.f4649d = 500000L;
        }
    }
}
