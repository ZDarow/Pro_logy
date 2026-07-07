package p120d3;

/* renamed from: d3.g */
/* loaded from: classes.dex */
public abstract class AbstractC1297g extends p120d3.AbstractC1292b implements p154k3.InterfaceC1801f {

    /* renamed from: o */
    public final int f5183o;

    public AbstractC1297g(int i4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(interfaceC1190d);
        this.f5183o = i4;
    }

    @Override // p154k3.InterfaceC1801f
    /* renamed from: e */
    public final int mo3039e() {
        return this.f5183o;
    }

    @Override // p120d3.AbstractC1292b
    public final java.lang.String toString() {
        if (this.f5175l != null) {
            return super.toString();
        }
        p154k3.AbstractC1812q.f7375a.getClass();
        java.lang.String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        p154k3.AbstractC1803h.m3778d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
