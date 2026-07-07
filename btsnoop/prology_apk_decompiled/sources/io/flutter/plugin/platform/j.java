package io.flutter.plugin.platform;

import I.C0044m;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f6347c;

    public /* synthetic */ j(i iVar, int i4, int i5) {
        this.f6345a = i5;
        this.f6347c = iVar;
        this.f6346b = i4;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f6345a) {
            case 0:
                o oVar = (o) this.f6347c;
                int i4 = this.f6346b;
                if (z4) {
                    C0044m c0044m = (C0044m) oVar.s.f96m;
                    if (c0044m == null) {
                        return;
                    }
                    c0044m.j("viewFocused", Integer.valueOf(i4), null);
                    return;
                }
                io.flutter.plugin.editing.k kVar = oVar.f6386r;
                if (kVar != null) {
                    kVar.b(i4);
                    return;
                }
                return;
            default:
                n nVar = (n) this.f6347c;
                int i5 = this.f6346b;
                if (z4) {
                    C0044m c0044m2 = (C0044m) nVar.f6364r.f96m;
                    if (c0044m2 == null) {
                        return;
                    }
                    c0044m2.j("viewFocused", Integer.valueOf(i5), null);
                    return;
                }
                io.flutter.plugin.editing.k kVar2 = nVar.f6363q;
                if (kVar2 != null) {
                    kVar2.b(i5);
                    return;
                }
                return;
        }
    }
}
