package p044L;

/* renamed from: L.b */
/* loaded from: classes.dex */
public final class C0344b extends p154k3.AbstractC1804i implements p149j3.InterfaceC1726a {

    /* renamed from: m */
    public final /* synthetic */ int f1071m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f1072n;

    /* renamed from: o */
    public final /* synthetic */ java.lang.Object f1073o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0344b(int i4, java.lang.Object obj, java.lang.Object obj2) {
        super(0);
        this.f1071m = i4;
        this.f1072n = obj;
        this.f1073o = obj2;
    }

    @Override // p149j3.InterfaceC1726a
    /* renamed from: c */
    public final java.lang.Object mo501c() {
        switch (this.f1071m) {
            case 0:
                android.content.Context context = (android.content.Context) this.f1072n;
                ((p044L.C0345c) this.f1073o).getClass();
                java.lang.String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                p154k3.AbstractC1803h.m3779e(concat, "fileName");
                return new java.io.File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((p203v1.InterfaceC2270a) ((p198u1.C2234b) this.f1072n).f8914m).mo4458a((p009B2.C0060q) this.f1073o);
                return p100Z2.C0934g.f3298a;
        }
    }
}
