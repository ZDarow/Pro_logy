package q0;

import java.io.IOException;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474f extends IOException {
    public C0474f(int i4) {
        super("Illegal clipping: ".concat(i4 != 0 ? i4 != 1 ? i4 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
