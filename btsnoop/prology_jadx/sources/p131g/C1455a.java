package p131g;

/* renamed from: g.a */
/* loaded from: classes.dex */
public final class C1455a implements android.text.method.TransformationMethod {

    /* renamed from: a */
    public java.util.Locale f5830a;

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f5830a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z4, int i4, android.graphics.Rect rect) {
    }
}
