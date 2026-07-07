package p112c0;

/* renamed from: c0.v */
/* loaded from: classes.dex */
public final class C1240v {

    /* renamed from: A */
    public long f4818A;

    /* renamed from: B */
    public long f4819B;

    /* renamed from: C */
    public long f4820C;

    /* renamed from: D */
    public long f4821D;

    /* renamed from: E */
    public boolean f4822E;

    /* renamed from: F */
    public long f4823F;

    /* renamed from: G */
    public long f4824G;

    /* renamed from: H */
    public boolean f4825H;

    /* renamed from: I */
    public long f4826I;

    /* renamed from: J */
    public p086W.C0800t f4827J;

    /* renamed from: a */
    public final p043K2.C0339o f4828a;

    /* renamed from: b */
    public final long[] f4829b;

    /* renamed from: c */
    public android.media.AudioTrack f4830c;

    /* renamed from: d */
    public int f4831d;

    /* renamed from: e */
    public int f4832e;

    /* renamed from: f */
    public p112c0.C1239u f4833f;

    /* renamed from: g */
    public int f4834g;

    /* renamed from: h */
    public boolean f4835h;

    /* renamed from: i */
    public long f4836i;

    /* renamed from: j */
    public float f4837j;

    /* renamed from: k */
    public boolean f4838k;

    /* renamed from: l */
    public long f4839l;

    /* renamed from: m */
    public long f4840m;

    /* renamed from: n */
    public java.lang.reflect.Method f4841n;

    /* renamed from: o */
    public long f4842o;

    /* renamed from: p */
    public boolean f4843p;

    /* renamed from: q */
    public boolean f4844q;

    /* renamed from: r */
    public long f4845r;

    /* renamed from: s */
    public long f4846s;

    /* renamed from: t */
    public long f4847t;

    /* renamed from: u */
    public long f4848u;

    /* renamed from: v */
    public long f4849v;

    /* renamed from: w */
    public int f4850w;

    /* renamed from: x */
    public int f4851x;

    /* renamed from: y */
    public long f4852y;

    /* renamed from: z */
    public long f4853z;

    public C1240v(p043K2.C0339o c0339o) {
        this.f4828a = c0339o;
        try {
            this.f4841n = android.media.AudioTrack.class.getMethod("getLatency", null);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        this.f4829b = new long[10];
        this.f4827J = p086W.C0800t.f2792a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022e A[Catch: Exception -> 0x0244, TRY_LEAVE, TryCatch #0 {Exception -> 0x0244, blocks: (B:67:0x0205, B:69:0x022e), top: B:66:0x0205 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m2916a(boolean r28) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p112c0.C1240v.m2916a(boolean):long");
    }

    /* renamed from: b */
    public final long m2917b() {
        this.f4827J.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f4852y != -9223372036854775807L) {
            android.media.AudioTrack audioTrack = this.f4830c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f4818A;
            }
            return java.lang.Math.min(this.f4819B, this.f4818A + p086W.AbstractC0805y.m1600U(p086W.AbstractC0805y.m1630y(p086W.AbstractC0805y.m1592M(elapsedRealtime) - this.f4852y, this.f4837j), this.f4834g, 1000000L, java.math.RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.f4846s >= 5) {
            android.media.AudioTrack audioTrack2 = this.f4830c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (this.f4835h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f4849v = this.f4847t;
                    }
                    playbackHeadPosition += this.f4849v;
                }
                if (p086W.AbstractC0805y.f2801a <= 29) {
                    if (playbackHeadPosition != 0 || this.f4847t <= 0 || playState != 3) {
                        this.f4853z = -9223372036854775807L;
                    } else if (this.f4853z == -9223372036854775807L) {
                        this.f4853z = elapsedRealtime;
                    }
                }
                long j4 = this.f4847t;
                if (j4 > playbackHeadPosition) {
                    if (this.f4825H) {
                        this.f4826I += j4;
                        this.f4825H = false;
                    } else {
                        this.f4848u++;
                    }
                }
                this.f4847t = playbackHeadPosition;
            }
            this.f4846s = elapsedRealtime;
        }
        return this.f4847t + this.f4826I + (this.f4848u << 32);
    }

    /* renamed from: c */
    public final boolean m2918c(long j4) {
        long m2916a = m2916a(false);
        int i4 = this.f4834g;
        int i5 = p086W.AbstractC0805y.f2801a;
        if (j4 <= p086W.AbstractC0805y.m1600U(m2916a, i4, 1000000L, java.math.RoundingMode.CEILING)) {
            if (!this.f4835h) {
                return false;
            }
            android.media.AudioTrack audioTrack = this.f4830c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || m2917b() != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void m2919d() {
        this.f4839l = 0L;
        this.f4851x = 0;
        this.f4850w = 0;
        this.f4840m = 0L;
        this.f4821D = 0L;
        this.f4824G = 0L;
        this.f4838k = false;
    }
}
