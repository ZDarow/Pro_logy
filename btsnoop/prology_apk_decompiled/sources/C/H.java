package C;

import android.graphics.Insets;
import android.view.WindowInsets;
import u.C0574b;

/* loaded from: classes.dex */
public class H extends G {

    /* renamed from: o, reason: collision with root package name */
    public C0574b f289o;

    /* renamed from: p, reason: collision with root package name */
    public C0574b f290p;

    /* renamed from: q, reason: collision with root package name */
    public C0574b f291q;

    public H(O o2, WindowInsets windowInsets) {
        super(o2, windowInsets);
        this.f289o = null;
        this.f290p = null;
        this.f291q = null;
    }

    @Override // C.K
    public C0574b f() {
        Insets mandatorySystemGestureInsets;
        if (this.f290p == null) {
            mandatorySystemGestureInsets = this.f282c.getMandatorySystemGestureInsets();
            this.f290p = C0574b.b(mandatorySystemGestureInsets);
        }
        return this.f290p;
    }

    @Override // C.K
    public C0574b h() {
        Insets systemGestureInsets;
        if (this.f289o == null) {
            systemGestureInsets = this.f282c.getSystemGestureInsets();
            this.f289o = C0574b.b(systemGestureInsets);
        }
        return this.f289o;
    }

    @Override // C.K
    public C0574b j() {
        Insets tappableElementInsets;
        if (this.f291q == null) {
            tappableElementInsets = this.f282c.getTappableElementInsets();
            this.f291q = C0574b.b(tappableElementInsets);
        }
        return this.f291q;
    }

    @Override // C.E, C.K
    public O k(int i4, int i5, int i6, int i7) {
        WindowInsets inset;
        inset = this.f282c.inset(i4, i5, i6, i7);
        return O.c(null, inset);
    }

    @Override // C.F, C.K
    public void q(C0574b c0574b) {
    }
}
