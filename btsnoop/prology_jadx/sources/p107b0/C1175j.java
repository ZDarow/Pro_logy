package p107b0;

/* renamed from: b0.j */
/* loaded from: classes.dex */
public final class C1175j {

    /* renamed from: A */
    public boolean f4522A;

    /* renamed from: a */
    public final android.content.Context f4523a;

    /* renamed from: b */
    public final p107b0.C1172g f4524b;

    /* renamed from: c */
    public final android.media.metrics.PlaybackSession f4525c;

    /* renamed from: i */
    public java.lang.String f4531i;

    /* renamed from: j */
    public android.media.metrics.PlaybackMetrics.Builder f4532j;

    /* renamed from: k */
    public int f4533k;

    /* renamed from: n */
    public p076T.AbstractC0667J f4536n;

    /* renamed from: o */
    public p063P2.C0528a f4537o;

    /* renamed from: p */
    public p063P2.C0528a f4538p;

    /* renamed from: q */
    public p063P2.C0528a f4539q;

    /* renamed from: r */
    public p076T.C0702p f4540r;

    /* renamed from: s */
    public p076T.C0702p f4541s;

    /* renamed from: t */
    public p076T.C0702p f4542t;

    /* renamed from: u */
    public boolean f4543u;

    /* renamed from: v */
    public int f4544v;

    /* renamed from: w */
    public boolean f4545w;

    /* renamed from: x */
    public int f4546x;

    /* renamed from: y */
    public int f4547y;

    /* renamed from: z */
    public int f4548z;

    /* renamed from: e */
    public final p076T.C0676T f4527e = new p076T.C0676T();

    /* renamed from: f */
    public final p076T.C0675S f4528f = new p076T.C0675S();

    /* renamed from: h */
    public final java.util.HashMap f4530h = new java.util.HashMap();

    /* renamed from: g */
    public final java.util.HashMap f4529g = new java.util.HashMap();

    /* renamed from: d */
    public final long f4526d = android.os.SystemClock.elapsedRealtime();

    /* renamed from: l */
    public int f4534l = 0;

    /* renamed from: m */
    public int f4535m = 0;

    public C1175j(android.content.Context context, android.media.metrics.PlaybackSession playbackSession) {
        this.f4523a = context.getApplicationContext();
        this.f4525c = playbackSession;
        p107b0.C1172g c1172g = new p107b0.C1172g();
        this.f4524b = c1172g;
        c1172g.f4518d = this;
    }

    /* renamed from: a */
    public final boolean m2810a(p063P2.C0528a c0528a) {
        java.lang.String str;
        if (c0528a != null) {
            java.lang.String str2 = (java.lang.String) c0528a.f1553n;
            p107b0.C1172g c1172g = this.f4524b;
            synchronized (c1172g) {
                str = c1172g.f4520f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m2811b() {
        android.media.metrics.PlaybackMetrics build;
        android.media.metrics.PlaybackMetrics.Builder builder = this.f4532j;
        if (builder != null && this.f4522A) {
            builder.setAudioUnderrunCount(this.f4548z);
            this.f4532j.setVideoFramesDropped(this.f4546x);
            this.f4532j.setVideoFramesPlayed(this.f4547y);
            java.lang.Long l4 = (java.lang.Long) this.f4529g.get(this.f4531i);
            this.f4532j.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            java.lang.Long l5 = (java.lang.Long) this.f4530h.get(this.f4531i);
            this.f4532j.setNetworkBytesRead(l5 == null ? 0L : l5.longValue());
            this.f4532j.setStreamSource((l5 == null || l5.longValue() <= 0) ? 0 : 1);
            android.media.metrics.PlaybackSession playbackSession = this.f4525c;
            build = this.f4532j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f4532j = null;
        this.f4531i = null;
        this.f4548z = 0;
        this.f4546x = 0;
        this.f4547y = 0;
        this.f4540r = null;
        this.f4541s = null;
        this.f4542t = null;
        this.f4522A = false;
    }

    /* renamed from: c */
    public final void m2812c(p076T.AbstractC0677U abstractC0677U, p179q0.C1964F c1964f) {
        int mo1231b;
        android.media.metrics.PlaybackMetrics.Builder builder = this.f4532j;
        if (c1964f == null || (mo1231b = abstractC0677U.mo1231b(c1964f.f7960a)) == -1) {
            return;
        }
        p076T.C0675S c0675s = this.f4528f;
        int i4 = 0;
        abstractC0677U.mo1232f(mo1231b, c0675s, false);
        int i5 = c0675s.f2225c;
        p076T.C0676T c0676t = this.f4527e;
        abstractC0677U.m1255n(i5, c0676t);
        p076T.C0711y c0711y = c0676t.f2234c.f2143b;
        if (c0711y != null) {
            int m1586G = p086W.AbstractC0805y.m1586G(c0711y.f2450b, c0711y.f2449a);
            i4 = m1586G != 0 ? m1586G != 1 ? m1586G != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i4);
        if (c0676t.f2244m != -9223372036854775807L && !c0676t.f2242k && !c0676t.f2240i && !c0676t.m1245a()) {
            builder.setMediaDurationMillis(p086W.AbstractC0805y.m1605Z(c0676t.f2244m));
        }
        builder.setPlaybackType(c0676t.m1245a() ? 2 : 1);
        this.f4522A = true;
    }

    /* renamed from: d */
    public final void m2813d(p107b0.C1166a c1166a, java.lang.String str) {
        p179q0.C1964F c1964f = c1166a.f4485d;
        if ((c1964f == null || !c1964f.m3968b()) && str.equals(this.f4531i)) {
            m2811b();
        }
        this.f4529g.remove(str);
        this.f4530h.remove(str);
    }

    /* renamed from: e */
    public final void m2814e(int i4, long j4, p076T.C0702p c0702p, int i5) {
        android.media.metrics.TrackChangeEvent.Builder timeSinceCreatedMillis;
        android.media.metrics.TrackChangeEvent build;
        int i6;
        timeSinceCreatedMillis = p009B2.AbstractC0059p.m242g(i4).setTimeSinceCreatedMillis(j4 - this.f4526d);
        if (c0702p != null) {
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
            java.lang.String str = c0702p.f2407l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            java.lang.String str2 = c0702p.f2408m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            java.lang.String str3 = c0702p.f2405j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i7 = c0702p.f2404i;
            if (i7 != -1) {
                timeSinceCreatedMillis.setBitrate(i7);
            }
            int i8 = c0702p.f2414s;
            if (i8 != -1) {
                timeSinceCreatedMillis.setWidth(i8);
            }
            int i9 = c0702p.f2415t;
            if (i9 != -1) {
                timeSinceCreatedMillis.setHeight(i9);
            }
            int i10 = c0702p.f2385A;
            if (i10 != -1) {
                timeSinceCreatedMillis.setChannelCount(i10);
            }
            int i11 = c0702p.f2386B;
            if (i11 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i11);
            }
            java.lang.String str4 = c0702p.f2399d;
            if (str4 != null) {
                int i12 = p086W.AbstractC0805y.f2801a;
                java.lang.String[] split = str4.split("-", -1);
                android.util.Pair create = android.util.Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((java.lang.String) create.first);
                java.lang.Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((java.lang.String) obj);
                }
            }
            float f4 = c0702p.f2416u;
            if (f4 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f4);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f4522A = true;
        android.media.metrics.PlaybackSession playbackSession = this.f4525c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
