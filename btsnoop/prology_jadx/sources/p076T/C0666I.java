package p076T;

/* renamed from: T.I */
/* loaded from: classes.dex */
public class C0666I extends java.io.IOException {

    /* renamed from: l */
    public final boolean f2202l;

    /* renamed from: m */
    public final int f2203m;

    public C0666I(java.lang.String str, java.lang.Exception exc, boolean z4, int i4) {
        super(str, exc);
        this.f2202l = z4;
        this.f2203m = i4;
    }

    /* renamed from: a */
    public static p076T.C0666I m1202a(java.lang.RuntimeException runtimeException, java.lang.String str) {
        return new p076T.C0666I(str, runtimeException, true, 1);
    }

    /* renamed from: b */
    public static p076T.C0666I m1203b(java.lang.String str, java.lang.Exception exc) {
        return new p076T.C0666I(str, exc, true, 4);
    }

    /* renamed from: c */
    public static p076T.C0666I m1204c(java.lang.String str) {
        return new p076T.C0666I(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f2202l + ", dataType=" + this.f2203m + "}";
    }
}
