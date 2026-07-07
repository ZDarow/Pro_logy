package B2;

import android.os.Build;
import java.util.Iterator;

/* renamed from: B2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149b;

    public /* synthetic */ C0004e(int i4, Object obj) {
        this.f148a = i4;
        this.f149b = obj;
    }

    private final void c() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        switch (this.f148a) {
            case 0:
                C0006g c0006g = (C0006g) this.f149b;
                c0006g.f152a.getClass();
                c0006g.f159h = false;
                return;
            case 1:
                u uVar = (u) this.f149b;
                uVar.f206r = false;
                Iterator it = uVar.f205q.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).a();
                }
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f149b).f6248d = false;
                return;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        switch (this.f148a) {
            case 0:
                C0006g c0006g = (C0006g) this.f149b;
                AbstractActivityC0003d abstractActivityC0003d = c0006g.f152a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0003d.reportFullyDrawn();
                } else {
                    abstractActivityC0003d.getClass();
                }
                c0006g.f159h = true;
                c0006g.f160i = true;
                return;
            case 1:
                u uVar = (u) this.f149b;
                uVar.f206r = true;
                Iterator it = uVar.f205q.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.k) it.next()).b();
                }
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                N n4 = (N) this.f149b;
                n4.f132a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.j jVar = n4.f133b;
                if (jVar != null) {
                    jVar.f6245a.removeIsDisplayingFlutterUiListener(this);
                    return;
                }
                return;
            default:
                ((io.flutter.embedding.engine.renderer.j) this.f149b).f6248d = true;
                return;
        }
    }
}
