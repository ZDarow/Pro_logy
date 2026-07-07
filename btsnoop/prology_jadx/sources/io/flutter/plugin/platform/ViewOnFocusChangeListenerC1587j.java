package io.flutter.plugin.platform;

/* renamed from: io.flutter.plugin.platform.j */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1587j implements android.view.View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f6580a;

    /* renamed from: b */
    public final /* synthetic */ int f6581b;

    /* renamed from: c */
    public final /* synthetic */ io.flutter.plugin.platform.InterfaceC1586i f6582c;

    public /* synthetic */ ViewOnFocusChangeListenerC1587j(io.flutter.plugin.platform.InterfaceC1586i interfaceC1586i, int i4, int i5) {
        this.f6580a = i5;
        this.f6582c = interfaceC1586i;
        this.f6581b = i4;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z4) {
        switch (this.f6580a) {
            case 0:
                io.flutter.plugin.platform.C1592o c1592o = (io.flutter.plugin.platform.C1592o) this.f6582c;
                int i4 = this.f6581b;
                if (z4) {
                    p035I.C0291m c0291m = (p035I.C0291m) c1592o.f6624s.f99m;
                    if (c0291m == null) {
                        return;
                    }
                    c0291m.m694j("viewFocused", java.lang.Integer.valueOf(i4), null);
                    return;
                }
                io.flutter.plugin.editing.C1575k c1575k = c1592o.f6623r;
                if (c1575k != null) {
                    c1575k.m3497b(i4);
                    return;
                }
                return;
            default:
                io.flutter.plugin.platform.C1591n c1591n = (io.flutter.plugin.platform.C1591n) this.f6582c;
                int i5 = this.f6581b;
                if (z4) {
                    p035I.C0291m c0291m2 = (p035I.C0291m) c1591n.f6599r.f99m;
                    if (c0291m2 == null) {
                        return;
                    }
                    c0291m2.m694j("viewFocused", java.lang.Integer.valueOf(i5), null);
                    return;
                }
                io.flutter.plugin.editing.C1575k c1575k2 = c1591n.f6598q;
                if (c1575k2 != null) {
                    c1575k2.m3497b(i5);
                    return;
                }
                return;
        }
    }
}
