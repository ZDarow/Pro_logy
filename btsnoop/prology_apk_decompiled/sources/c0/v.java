package c0;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: A, reason: collision with root package name */
    public long f4652A;

    /* renamed from: B, reason: collision with root package name */
    public long f4653B;

    /* renamed from: C, reason: collision with root package name */
    public long f4654C;

    /* renamed from: D, reason: collision with root package name */
    public long f4655D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4656E;

    /* renamed from: F, reason: collision with root package name */
    public long f4657F;

    /* renamed from: G, reason: collision with root package name */
    public long f4658G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4659H;

    /* renamed from: I, reason: collision with root package name */
    public long f4660I;
    public W.t J;

    /* renamed from: a, reason: collision with root package name */
    public final K2.o f4661a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f4662b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f4663c;

    /* renamed from: d, reason: collision with root package name */
    public int f4664d;

    /* renamed from: e, reason: collision with root package name */
    public int f4665e;

    /* renamed from: f, reason: collision with root package name */
    public u f4666f;

    /* renamed from: g, reason: collision with root package name */
    public int f4667g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4668h;

    /* renamed from: i, reason: collision with root package name */
    public long f4669i;

    /* renamed from: j, reason: collision with root package name */
    public float f4670j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4671k;

    /* renamed from: l, reason: collision with root package name */
    public long f4672l;

    /* renamed from: m, reason: collision with root package name */
    public long f4673m;

    /* renamed from: n, reason: collision with root package name */
    public Method f4674n;

    /* renamed from: o, reason: collision with root package name */
    public long f4675o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4676p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4677q;

    /* renamed from: r, reason: collision with root package name */
    public long f4678r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f4679t;

    /* renamed from: u, reason: collision with root package name */
    public long f4680u;

    /* renamed from: v, reason: collision with root package name */
    public long f4681v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public int f4682x;

    /* renamed from: y, reason: collision with root package name */
    public long f4683y;

    /* renamed from: z, reason: collision with root package name */
    public long f4684z;

    public v(K2.o oVar) {
        this.f4661a = oVar;
        try {
            this.f4674n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f4662b = new long[10];
        this.J = W.t.f2700a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022e A[Catch: Exception -> 0x0244, TRY_LEAVE, TryCatch #0 {Exception -> 0x0244, blocks: (B:67:0x0205, B:69:0x022e), top: B:66:0x0205 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r28) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.v.a(boolean):long");
    }

    public final long b() {
        this.J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f4683y != -9223372036854775807L) {
            AudioTrack audioTrack = this.f4663c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f4652A;
            }
            return Math.min(this.f4653B, this.f4652A + W.y.U(W.y.y(W.y.M(elapsedRealtime) - this.f4683y, this.f4670j), this.f4667g, 1000000L, RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack2 = this.f4663c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (this.f4668h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f4681v = this.f4679t;
                    }
                    playbackHeadPosition += this.f4681v;
                }
                if (W.y.f2709a <= 29) {
                    if (playbackHeadPosition != 0 || this.f4679t <= 0 || playState != 3) {
                        this.f4684z = -9223372036854775807L;
                    } else if (this.f4684z == -9223372036854775807L) {
                        this.f4684z = elapsedRealtime;
                    }
                }
                long j4 = this.f4679t;
                if (j4 > playbackHeadPosition) {
                    if (this.f4659H) {
                        this.f4660I += j4;
                        this.f4659H = false;
                    } else {
                        this.f4680u++;
                    }
                }
                this.f4679t = playbackHeadPosition;
            }
            this.s = elapsedRealtime;
        }
        return this.f4679t + this.f4660I + (this.f4680u << 32);
    }

    public final boolean c(long j4) {
        long a4 = a(false);
        int i4 = this.f4667g;
        int i5 = W.y.f2709a;
        if (j4 <= W.y.U(a4, i4, 1000000L, RoundingMode.CEILING)) {
            if (!this.f4668h) {
                return false;
            }
            AudioTrack audioTrack = this.f4663c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f4672l = 0L;
        this.f4682x = 0;
        this.w = 0;
        this.f4673m = 0L;
        this.f4655D = 0L;
        this.f4658G = 0L;
        this.f4671k = false;
    }
}
