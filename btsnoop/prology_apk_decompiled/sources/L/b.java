package L;

import B2.q;
import android.content.Context;
import java.io.File;
import u1.C0582b;
import v1.InterfaceC0588a;

/* loaded from: classes.dex */
public final class b extends k3.i implements j3.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1032m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1033n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1034o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, Object obj, Object obj2) {
        super(0);
        this.f1032m = i4;
        this.f1033n = obj;
        this.f1034o = obj2;
    }

    @Override // j3.a
    public final Object c() {
        switch (this.f1032m) {
            case 0:
                Context context = (Context) this.f1033n;
                ((c) this.f1034o).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                k3.h.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((InterfaceC0588a) ((C0582b) this.f1033n).f8571m).a((q) this.f1034o);
                return Z2.g.f3186a;
        }
    }
}
