package K2;

import I.C0044m;
import android.util.Log;

/* loaded from: classes.dex */
public final class k implements L2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f998c;

    public /* synthetic */ k(int i4, Object obj, Object obj2) {
        this.f996a = i4;
        this.f998c = obj;
        this.f997b = obj2;
    }

    private final void d() {
    }

    @Override // L2.p
    public final void a(String str, String str2, Object obj) {
        switch (this.f996a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                return;
            default:
                ((D2.g) this.f997b).a(((L2.q) ((C0044m) ((B1.d) this.f998c).f97n).f849n).f(str, str2, obj));
                return;
        }
    }

    @Override // L2.p
    public final void b(Object obj) {
        switch (this.f996a) {
            case 0:
                ((l) this.f998c).f1000b = (byte[]) this.f997b;
                return;
            default:
                ((D2.g) this.f997b).a(((L2.q) ((C0044m) ((B1.d) this.f998c).f97n).f849n).b(obj));
                return;
        }
    }

    @Override // L2.p
    public final void c() {
        switch (this.f996a) {
            case 0:
                return;
            default:
                ((D2.g) this.f997b).a(null);
                return;
        }
    }
}
