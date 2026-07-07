package c0;

import B2.AbstractC0007h;
import T.C0095p;

/* loaded from: classes.dex */
public final class r extends Exception {

    /* renamed from: l, reason: collision with root package name */
    public final int f4636l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4637m;

    /* renamed from: n, reason: collision with root package name */
    public final C0095p f4638n;

    public r(int i4, C0095p c0095p, boolean z4) {
        super(AbstractC0007h.k("AudioTrack write failed: ", i4));
        this.f4637m = z4;
        this.f4636l = i4;
        this.f4638n = c0095p;
    }
}
