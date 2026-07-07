package a0;

import android.util.Base64;

/* renamed from: a0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0136p implements e2.j {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3560l;

    @Override // e2.j
    public final Object get() {
        switch (this.f3560l) {
            case 0:
                return new C0130j(new u0.e(), 50000, 50000, 2500, 5000, -1, false, 0);
            case 1:
                byte[] bArr = new byte[12];
                b0.g.f4357i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    invoke.getClass();
                    return (T.c0) invoke;
                } catch (Exception e4) {
                    throw new IllegalStateException(e4);
                }
        }
    }
}
