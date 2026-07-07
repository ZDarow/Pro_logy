package io.flutter.plugin.editing;

/* renamed from: io.flutter.plugin.editing.k */
/* loaded from: classes.dex */
public final class C1575k implements io.flutter.plugin.editing.InterfaceC1570f {

    /* renamed from: a */
    public final android.view.View f6535a;

    /* renamed from: b */
    public final android.view.inputmethod.InputMethodManager f6536b;

    /* renamed from: c */
    public final android.view.autofill.AutofillManager f6537c;

    /* renamed from: d */
    public final p008B1.C0026d f6538d;

    /* renamed from: e */
    public p011C.C0118j f6539e = new p011C.C0118j(1, 0, 5);

    /* renamed from: f */
    public p043K2.C0340p f6540f;

    /* renamed from: g */
    public android.util.SparseArray f6541g;

    /* renamed from: h */
    public io.flutter.plugin.editing.C1571g f6542h;

    /* renamed from: i */
    public boolean f6543i;

    /* renamed from: j */
    public android.view.inputmethod.InputConnection f6544j;

    /* renamed from: k */
    public final io.flutter.plugin.platform.C1592o f6545k;

    /* renamed from: l */
    public final io.flutter.plugin.platform.C1591n f6546l;

    /* renamed from: m */
    public android.graphics.Rect f6547m;

    /* renamed from: n */
    public final io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback f6548n;

    /* renamed from: o */
    public p043K2.C0342r f6549o;

    /* renamed from: p */
    public boolean f6550p;

    public C1575k(android.view.View view, p008B1.C0026d c0026d, p009B2.C0061r c0061r, io.flutter.plugin.platform.C1592o c1592o, io.flutter.plugin.platform.C1591n c1591n) {
        this.f6535a = view;
        this.f6542h = new io.flutter.plugin.editing.C1571g(null, view);
        this.f6536b = (android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method");
        int i4 = android.os.Build.VERSION.SDK_INT;
        this.f6537c = (android.view.autofill.AutofillManager) view.getContext().getSystemService(android.view.autofill.AutofillManager.class);
        if (i4 >= 30) {
            io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback(view);
            this.f6548n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new io.flutter.plugin.editing.C1574j(this));
        }
        this.f6538d = c0026d;
        c0026d.f100n = new io.flutter.plugin.editing.C1574j(this);
        ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.requestExistingInputState", null, null);
        this.f6545k = c1592o;
        c1592o.f6623r = this;
        this.f6546l = c1591n;
        c1591n.f6598q = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r10 == r0.f1069e) goto L36;
     */
    @Override // io.flutter.plugin.editing.InterfaceC1570f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3482a(boolean r17) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C1575k.mo3482a(boolean):void");
    }

    /* renamed from: b */
    public final void m3497b(int i4) {
        p011C.C0118j c0118j = this.f6539e;
        int i5 = c0118j.f326b;
        if ((i5 == 3 || i5 == 4) && c0118j.f327c == i4) {
            this.f6539e = new p011C.C0118j(1, 0, 5);
            m3499d();
            android.view.View view = this.f6535a;
            android.os.IBinder applicationWindowToken = view.getApplicationWindowToken();
            android.view.inputmethod.InputMethodManager inputMethodManager = this.f6536b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f6543i = false;
        }
    }

    /* renamed from: c */
    public final void m3498c() {
        this.f6545k.f6623r = null;
        this.f6546l.f6598q = null;
        this.f6538d.f100n = null;
        m3499d();
        this.f6542h.m3491e(this);
        io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f6548n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* renamed from: d */
    public final void m3499d() {
        p043K2.C0340p c0340p;
        p035I.C0291m c0291m;
        android.view.autofill.AutofillManager autofillManager = this.f6537c;
        if (autofillManager == null || (c0340p = this.f6540f) == null || (c0291m = c0340p.f1058j) == null || this.f6541g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f6535a, ((java.lang.String) c0291m.f876l).hashCode());
    }
}
