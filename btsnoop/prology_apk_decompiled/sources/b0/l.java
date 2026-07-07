package b0;

import W.y;
import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f4392a;

    /* renamed from: b, reason: collision with root package name */
    public final k f4393b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4394c;

    static {
        if (y.f2709a < 31) {
            new l("");
        } else {
            new l(k.f4390b, "");
        }
    }

    public l(String str) {
        W.a.j(y.f2709a < 31);
        this.f4392a = str;
        this.f4393b = null;
        this.f4394c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f4392a, lVar.f4392a) && Objects.equals(this.f4393b, lVar.f4393b) && Objects.equals(this.f4394c, lVar.f4394c);
    }

    public final int hashCode() {
        return Objects.hash(this.f4392a, this.f4393b, this.f4394c);
    }

    public l(LogSessionId logSessionId, String str) {
        this(new k(logSessionId), str);
    }

    public l(k kVar, String str) {
        this.f4393b = kVar;
        this.f4392a = str;
        this.f4394c = new Object();
    }
}
