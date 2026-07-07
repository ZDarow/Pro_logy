package p145j;

/* renamed from: j.I */
/* loaded from: classes.dex */
public final class C1630I implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: l */
    public final /* synthetic */ int f6834l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f6835m;

    public /* synthetic */ C1630I(int i4, java.lang.Object obj) {
        this.f6834l = i4;
        this.f6835m = obj;
    }

    /* renamed from: a */
    private final void m3588a(android.widget.AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m3589b(android.widget.AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i4, long j4) {
        p145j.C1636O c1636o;
        switch (this.f6834l) {
            case 0:
                if (i4 == -1 || (c1636o = ((p145j.AbstractC1634M) this.f6835m).f6851n) == null) {
                    return;
                }
                c1636o.setListSelectionHidden(false);
                return;
            default:
                ((androidx.appcompat.widget.SearchView) this.f6835m).m2300m(i4);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView adapterView) {
        int i4 = this.f6834l;
    }
}
