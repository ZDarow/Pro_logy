package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0459a f7571b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0459a f7572c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f7573a;

    static {
        if (g.f7584d) {
            f7572c = null;
            f7571b = null;
        } else {
            f7572c = new C0459a(false, null);
            f7571b = new C0459a(true, null);
        }
    }

    public C0459a(boolean z4, CancellationException cancellationException) {
        this.f7573a = cancellationException;
    }
}
