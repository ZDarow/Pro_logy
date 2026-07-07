package k3;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public final int f7098l;

    public i(int i4) {
        this.f7098l = i4;
    }

    @Override // k3.f
    public final int e() {
        return this.f7098l;
    }

    public final String toString() {
        q.f7105a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
