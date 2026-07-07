package s2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f8267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8268b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8269c;

    /* renamed from: d, reason: collision with root package name */
    public final l f8270d;

    public m(String str, String str2, long j4, l lVar) {
        this.f8267a = str;
        this.f8268b = str2;
        this.f8269c = j4;
        this.f8270d = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f8267a.equals(mVar.f8267a) && this.f8268b.equals(mVar.f8268b) && this.f8269c == mVar.f8269c && Objects.equals(this.f8270d, mVar.f8270d);
    }
}
