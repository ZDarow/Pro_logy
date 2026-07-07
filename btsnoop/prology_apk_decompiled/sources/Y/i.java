package Y;

import java.io.IOException;

/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f3014m = 0;

    /* renamed from: l, reason: collision with root package name */
    public final int f3015l;

    public i(int i4) {
        this.f3015l = i4;
    }

    public i(Exception exc, int i4) {
        super(exc);
        this.f3015l = i4;
    }

    public i(String str, int i4) {
        super(str);
        this.f3015l = i4;
    }

    public i(String str, Exception exc, int i4) {
        super(str, exc);
        this.f3015l = i4;
    }
}
