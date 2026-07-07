package B2;

import T.C0093n;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public boolean f115a;

    /* renamed from: b, reason: collision with root package name */
    public Object f116b = new SparseBooleanArray();

    public void a(int i4) {
        W.a.j(!this.f115a);
        ((SparseBooleanArray) this.f116b).append(i4, true);
    }

    public C0093n b() {
        W.a.j(!this.f115a);
        this.f115a = true;
        return new C0093n((SparseBooleanArray) this.f116b);
    }

    public void c(boolean z4) {
        if (this.f115a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f115a = true;
        E e4 = (E) this.f116b;
        int i4 = e4.f119c - 1;
        e4.f119c = i4;
        boolean z5 = z4 | e4.f118b;
        e4.f118b = z5;
        if (i4 != 0 || z5) {
            return;
        }
        ((android.support.v4.media.session.t) e4.f121e).r0((KeyEvent) e4.f120d);
    }
}
