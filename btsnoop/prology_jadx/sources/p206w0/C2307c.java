package p206w0;

/* renamed from: w0.c */
/* loaded from: classes.dex */
public final class C2307c {

    /* renamed from: a */
    public final p206w0.C2306b f9103a;

    public C2307c(p206w0.C2306b c2306b) {
        this.f9103a = c2306b;
    }

    /* renamed from: a */
    public final void m4486a() {
        try {
            ((p206w0.C2307c) java.lang.Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(p076T.InterfaceC0688c0.class).newInstance(this.f9103a)).m4486a();
        } catch (java.lang.Exception e4) {
            int i4 = p076T.C0686b0.f2309l;
            if (!(e4 instanceof p076T.C0686b0)) {
                throw new java.lang.Exception(e4);
            }
        }
    }
}
