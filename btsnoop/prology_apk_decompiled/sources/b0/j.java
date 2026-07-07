package b0;

import B2.p;
import T.C0095p;
import T.C0103y;
import T.J;
import T.S;
import T.T;
import T.U;
import W.y;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import q0.F;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4365A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4366a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4367b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f4368c;

    /* renamed from: i, reason: collision with root package name */
    public String f4374i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f4375j;

    /* renamed from: k, reason: collision with root package name */
    public int f4376k;

    /* renamed from: n, reason: collision with root package name */
    public J f4379n;

    /* renamed from: o, reason: collision with root package name */
    public P2.a f4380o;

    /* renamed from: p, reason: collision with root package name */
    public P2.a f4381p;

    /* renamed from: q, reason: collision with root package name */
    public P2.a f4382q;

    /* renamed from: r, reason: collision with root package name */
    public C0095p f4383r;
    public C0095p s;

    /* renamed from: t, reason: collision with root package name */
    public C0095p f4384t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4385u;

    /* renamed from: v, reason: collision with root package name */
    public int f4386v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public int f4387x;

    /* renamed from: y, reason: collision with root package name */
    public int f4388y;

    /* renamed from: z, reason: collision with root package name */
    public int f4389z;

    /* renamed from: e, reason: collision with root package name */
    public final T f4370e = new T();

    /* renamed from: f, reason: collision with root package name */
    public final S f4371f = new S();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f4373h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f4372g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f4369d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f4377l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4378m = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.f4366a = context.getApplicationContext();
        this.f4368c = playbackSession;
        g gVar = new g();
        this.f4367b = gVar;
        gVar.f4361d = this;
    }

    public final boolean a(P2.a aVar) {
        String str;
        if (aVar != null) {
            String str2 = (String) aVar.f1502n;
            g gVar = this.f4367b;
            synchronized (gVar) {
                str = gVar.f4363f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f4375j;
        if (builder != null && this.f4365A) {
            builder.setAudioUnderrunCount(this.f4389z);
            this.f4375j.setVideoFramesDropped(this.f4387x);
            this.f4375j.setVideoFramesPlayed(this.f4388y);
            Long l4 = (Long) this.f4372g.get(this.f4374i);
            this.f4375j.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l5 = (Long) this.f4373h.get(this.f4374i);
            this.f4375j.setNetworkBytesRead(l5 == null ? 0L : l5.longValue());
            this.f4375j.setStreamSource((l5 == null || l5.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f4368c;
            build = this.f4375j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f4375j = null;
        this.f4374i = null;
        this.f4389z = 0;
        this.f4387x = 0;
        this.f4388y = 0;
        this.f4383r = null;
        this.s = null;
        this.f4384t = null;
        this.f4365A = false;
    }

    public final void c(U u4, F f4) {
        int b4;
        PlaybackMetrics.Builder builder = this.f4375j;
        if (f4 == null || (b4 = u4.b(f4.f7668a)) == -1) {
            return;
        }
        S s = this.f4371f;
        int i4 = 0;
        u4.f(b4, s, false);
        int i5 = s.f2145c;
        T t4 = this.f4370e;
        u4.n(i5, t4);
        C0103y c0103y = t4.f2154c.f2067b;
        if (c0103y != null) {
            int G3 = y.G(c0103y.f2365b, c0103y.f2364a);
            i4 = G3 != 0 ? G3 != 1 ? G3 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i4);
        if (t4.f2164m != -9223372036854775807L && !t4.f2162k && !t4.f2160i && !t4.a()) {
            builder.setMediaDurationMillis(y.Z(t4.f2164m));
        }
        builder.setPlaybackType(t4.a() ? 2 : 1);
        this.f4365A = true;
    }

    public final void d(C0177a c0177a, String str) {
        F f4 = c0177a.f4329d;
        if ((f4 == null || !f4.b()) && str.equals(this.f4374i)) {
            b();
        }
        this.f4372g.remove(str);
        this.f4373h.remove(str);
    }

    public final void e(int i4, long j4, C0095p c0095p, int i5) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i6;
        timeSinceCreatedMillis = p.g(i4).setTimeSinceCreatedMillis(j4 - this.f4369d);
        if (c0095p != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i5 != 1) {
                i6 = 3;
                if (i5 != 2) {
                    i6 = i5 != 3 ? 1 : 4;
                }
            } else {
                i6 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i6);
            String str = c0095p.f2324l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0095p.f2325m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0095p.f2322j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i7 = c0095p.f2321i;
            if (i7 != -1) {
                timeSinceCreatedMillis.setBitrate(i7);
            }
            int i8 = c0095p.s;
            if (i8 != -1) {
                timeSinceCreatedMillis.setWidth(i8);
            }
            int i9 = c0095p.f2331t;
            if (i9 != -1) {
                timeSinceCreatedMillis.setHeight(i9);
            }
            int i10 = c0095p.f2303A;
            if (i10 != -1) {
                timeSinceCreatedMillis.setChannelCount(i10);
            }
            int i11 = c0095p.f2304B;
            if (i11 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i11);
            }
            String str4 = c0095p.f2316d;
            if (str4 != null) {
                int i12 = y.f2709a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f4 = c0095p.f2332u;
            if (f4 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f4);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f4365A = true;
        PlaybackSession playbackSession = this.f4368c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
