package p146j0;

/* renamed from: j0.r */
/* loaded from: classes.dex */
public final class C1714r extends java.lang.Exception {

    /* renamed from: l */
    public final java.lang.String f7101l;

    /* renamed from: m */
    public final boolean f7102m;

    /* renamed from: n */
    public final p146j0.C1709m f7103n;

    /* renamed from: o */
    public final java.lang.String f7104o;

    public C1714r(p076T.C0702p c0702p, p146j0.C1721y c1721y, boolean z4, int i4) {
        this("Decoder init failed: [" + i4 + "], " + c0702p, c1721y, c0702p.f2408m, z4, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i4 < 0 ? "neg_" : "") + java.lang.Math.abs(i4));
    }

    public C1714r(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z4, p146j0.C1709m c1709m, java.lang.String str3) {
        super(str, th);
        this.f7101l = str2;
        this.f7102m = z4;
        this.f7103n = c1709m;
        this.f7104o = str3;
    }
}
