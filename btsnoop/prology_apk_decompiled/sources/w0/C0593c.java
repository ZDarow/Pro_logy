package w0;

import T.b0;
import T.c0;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593c {

    /* renamed from: a, reason: collision with root package name */
    public final C0592b f8748a;

    public C0593c(C0592b c0592b) {
        this.f8748a = c0592b;
    }

    public final void a() {
        try {
            ((C0593c) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(c0.class).newInstance(this.f8748a)).a();
        } catch (Exception e4) {
            int i4 = b0.f2229l;
            if (!(e4 instanceof b0)) {
                throw new Exception(e4);
            }
        }
    }
}
