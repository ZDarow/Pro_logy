package io.flutter.plugin.editing;

/* renamed from: io.flutter.plugin.editing.e */
/* loaded from: classes.dex */
public final class C1569e extends android.view.inputmethod.BaseInputConnection {

    /* renamed from: a */
    public final /* synthetic */ io.flutter.plugin.editing.C1571g f6509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569e(android.view.View view, io.flutter.plugin.editing.C1571g c1571g) {
        super(view, true);
        this.f6509a = c1571g;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final android.text.Editable getEditable() {
        return this.f6509a;
    }
}
