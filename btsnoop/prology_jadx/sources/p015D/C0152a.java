package p015D;

/* renamed from: D.a */
/* loaded from: classes.dex */
public final class C0152a extends android.text.style.ClickableSpan {

    /* renamed from: a */
    public final int f416a;

    /* renamed from: b */
    public final p015D.C0157f f417b;

    /* renamed from: c */
    public final int f418c;

    public C0152a(int i4, p015D.C0157f c0157f, int i5) {
        this.f416a = i4;
        this.f417b = c0157f;
        this.f418c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f416a);
        this.f417b.f425a.performAction(this.f418c, bundle);
    }
}
