package C2;

import android.util.SparseArray;
import io.flutter.plugin.platform.n;
import io.flutter.plugin.platform.o;
import java.util.Iterator;
import t2.C0572c;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f342b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f341a = i4;
        this.f342b = obj;
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // C2.b
    public final void a() {
        switch (this.f341a) {
            case 0:
                c cVar = (c) this.f342b;
                Iterator it = cVar.f365v.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
                while (true) {
                    o oVar = cVar.s;
                    SparseArray sparseArray = oVar.w;
                    if (sparseArray.size() > 0) {
                        oVar.f6379H.A(sparseArray.keyAt(0));
                    } else {
                        while (true) {
                            n nVar = cVar.f363t;
                            SparseArray sparseArray2 = nVar.f6365t;
                            if (sparseArray2.size() <= 0) {
                                cVar.f355k.f1000b = null;
                                return;
                            } else {
                                nVar.f6357A.A(sparseArray2.keyAt(0));
                            }
                        }
                    }
                }
            default:
                ((C0572c) this.f342b).f8425m.a0();
                return;
        }
    }

    @Override // C2.b
    public final void b() {
        int i4 = this.f341a;
    }
}
