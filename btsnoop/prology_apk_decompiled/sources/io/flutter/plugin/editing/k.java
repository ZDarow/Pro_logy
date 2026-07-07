package io.flutter.plugin.editing;

import C.C0023j;
import I.C0044m;
import K2.p;
import K2.r;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.n;
import io.flutter.plugin.platform.o;

/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public final View f6300a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f6301b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f6302c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.d f6303d;

    /* renamed from: e, reason: collision with root package name */
    public C0023j f6304e = new C0023j(1, 0, 5);

    /* renamed from: f, reason: collision with root package name */
    public p f6305f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f6306g;

    /* renamed from: h, reason: collision with root package name */
    public g f6307h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6308i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f6309j;

    /* renamed from: k, reason: collision with root package name */
    public final o f6310k;

    /* renamed from: l, reason: collision with root package name */
    public final n f6311l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f6312m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f6313n;

    /* renamed from: o, reason: collision with root package name */
    public r f6314o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6315p;

    public k(View view, B1.d dVar, B2.r rVar, o oVar, n nVar) {
        this.f6300a = view;
        this.f6307h = new g(null, view);
        this.f6301b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i4 = Build.VERSION.SDK_INT;
        this.f6302c = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (i4 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f6313n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new j(this));
        }
        this.f6303d = dVar;
        dVar.f97n = new j(this);
        ((C0044m) dVar.f96m).j("TextInputClient.requestExistingInputState", null, null);
        this.f6310k = oVar;
        oVar.f6386r = this;
        this.f6311l = nVar;
        nVar.f6363q = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r10 == r0.f1030e) goto L36;
     */
    @Override // io.flutter.plugin.editing.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.k.a(boolean):void");
    }

    public final void b(int i4) {
        C0023j c0023j = this.f6304e;
        int i5 = c0023j.f320b;
        if ((i5 == 3 || i5 == 4) && c0023j.f321c == i4) {
            this.f6304e = new C0023j(1, 0, 5);
            d();
            View view = this.f6300a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f6301b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f6308i = false;
        }
    }

    public final void c() {
        this.f6310k.f6386r = null;
        this.f6311l.f6363q = null;
        this.f6303d.f97n = null;
        d();
        this.f6307h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f6313n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        p pVar;
        C0044m c0044m;
        AutofillManager autofillManager = this.f6302c;
        if (autofillManager == null || (pVar = this.f6305f) == null || (c0044m = pVar.f1019j) == null || this.f6306g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f6300a, ((String) c0044m.f847l).hashCode());
    }
}
