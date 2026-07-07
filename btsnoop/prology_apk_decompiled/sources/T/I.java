package T;

import java.io.IOException;

/* loaded from: classes.dex */
public class I extends IOException {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2122l;

    /* renamed from: m, reason: collision with root package name */
    public final int f2123m;

    public I(String str, Exception exc, boolean z4, int i4) {
        super(str, exc);
        this.f2122l = z4;
        this.f2123m = i4;
    }

    public static I a(RuntimeException runtimeException, String str) {
        return new I(str, runtimeException, true, 1);
    }

    public static I b(String str, Exception exc) {
        return new I(str, exc, true, 4);
    }

    public static I c(String str) {
        return new I(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f2122l + ", dataType=" + this.f2123m + "}";
    }
}
