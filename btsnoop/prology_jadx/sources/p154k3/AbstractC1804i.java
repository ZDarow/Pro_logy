package p154k3;

/* renamed from: k3.i */
/* loaded from: classes.dex */
public abstract class AbstractC1804i implements p154k3.InterfaceC1801f, java.io.Serializable {

    /* renamed from: l */
    public final int f7368l;

    public AbstractC1804i(int i4) {
        this.f7368l = i4;
    }

    @Override // p154k3.InterfaceC1801f
    /* renamed from: e */
    public final int mo3039e() {
        return this.f7368l;
    }

    public final java.lang.String toString() {
        p154k3.AbstractC1812q.f7375a.getClass();
        java.lang.String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        p154k3.AbstractC1803h.m3778d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
