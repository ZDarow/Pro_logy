package V0;

import f2.I;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final I f2596a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2597b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2598c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2599d;

    public a(List list, long j4, long j5) {
        this.f2596a = I.j(list);
        this.f2597b = j4;
        this.f2598c = j5;
        long j6 = -9223372036854775807L;
        if (j4 != -9223372036854775807L && j5 != -9223372036854775807L) {
            j6 = j4 + j5;
        }
        this.f2599d = j6;
    }
}
