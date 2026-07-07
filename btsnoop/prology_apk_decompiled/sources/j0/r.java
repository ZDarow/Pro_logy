package j0;

import T.C0095p;

/* loaded from: classes.dex */
public final class r extends Exception {

    /* renamed from: l, reason: collision with root package name */
    public final String f6841l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6842m;

    /* renamed from: n, reason: collision with root package name */
    public final m f6843n;

    /* renamed from: o, reason: collision with root package name */
    public final String f6844o;

    public r(C0095p c0095p, y yVar, boolean z4, int i4) {
        this("Decoder init failed: [" + i4 + "], " + c0095p, yVar, c0095p.f2325m, z4, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i4 < 0 ? "neg_" : "") + Math.abs(i4));
    }

    public r(String str, Throwable th, String str2, boolean z4, m mVar, String str3) {
        super(str, th);
        this.f6841l = str2;
        this.f6842m = z4;
        this.f6843n = mVar;
        this.f6844o = str3;
    }
}
