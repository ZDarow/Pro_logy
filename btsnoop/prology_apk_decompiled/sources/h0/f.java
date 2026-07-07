package h0;

import T.C0092m;
import f2.G;
import f2.I;
import f2.c0;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends g {
    public final String w;

    /* renamed from: x, reason: collision with root package name */
    public final I f5880x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, long j4, long j5, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j4, j5, false, c0.f5550p);
        G g4 = I.f5510m;
    }

    public f(String str, f fVar, String str2, long j4, int i4, long j5, C0092m c0092m, String str3, String str4, long j6, long j7, boolean z4, List list) {
        super(str, fVar, j4, i4, j5, c0092m, str3, str4, j6, j7, z4);
        this.w = str2;
        this.f5880x = I.j(list);
    }
}
