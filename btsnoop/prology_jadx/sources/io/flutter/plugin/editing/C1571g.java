package io.flutter.plugin.editing;

/* renamed from: io.flutter.plugin.editing.g */
/* loaded from: classes.dex */
public final class C1571g extends android.text.SpannableStringBuilder {

    /* renamed from: l */
    public int f6510l = 0;

    /* renamed from: m */
    public int f6511m = 0;

    /* renamed from: n */
    public final java.util.ArrayList f6512n = new java.util.ArrayList();

    /* renamed from: o */
    public final java.util.ArrayList f6513o = new java.util.ArrayList();

    /* renamed from: p */
    public final java.util.ArrayList f6514p = new java.util.ArrayList();

    /* renamed from: q */
    public java.lang.String f6515q;

    /* renamed from: r */
    public java.lang.String f6516r;

    /* renamed from: s */
    public int f6517s;

    /* renamed from: t */
    public int f6518t;

    /* renamed from: u */
    public int f6519u;

    /* renamed from: v */
    public int f6520v;

    /* renamed from: w */
    public final io.flutter.plugin.editing.C1569e f6521w;

    public C1571g(p043K2.C0342r c0342r, android.view.View view) {
        this.f6521w = new io.flutter.plugin.editing.C1569e(view, this);
        if (c0342r != null) {
            m3492f(c0342r);
        }
    }

    /* renamed from: a */
    public final void m3487a(io.flutter.plugin.editing.InterfaceC1570f interfaceC1570f) {
        if (this.f6511m > 0) {
            android.util.Log.e("ListenableEditingState", "adding a listener " + interfaceC1570f.toString() + " in a listener callback");
        }
        if (this.f6510l <= 0) {
            this.f6512n.add(interfaceC1570f);
        } else {
            android.util.Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f6513o.add(interfaceC1570f);
        }
    }

    /* renamed from: b */
    public final void m3488b() {
        this.f6510l++;
        if (this.f6511m > 0) {
            android.util.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f6510l != 1 || this.f6512n.isEmpty()) {
            return;
        }
        this.f6516r = toString();
        this.f6517s = android.text.Selection.getSelectionStart(this);
        this.f6518t = android.text.Selection.getSelectionEnd(this);
        this.f6519u = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        this.f6520v = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
    }

    /* renamed from: c */
    public final void m3489c() {
        int i4 = this.f6510l;
        if (i4 == 0) {
            android.util.Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        java.util.ArrayList arrayList = this.f6512n;
        java.util.ArrayList arrayList2 = this.f6513o;
        if (i4 == 1) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                io.flutter.plugin.editing.InterfaceC1570f interfaceC1570f = (io.flutter.plugin.editing.InterfaceC1570f) it.next();
                this.f6511m++;
                interfaceC1570f.mo3482a(true);
                this.f6511m--;
            }
            if (!arrayList.isEmpty()) {
                java.lang.String.valueOf(arrayList.size());
                m3490d(!toString().equals(this.f6516r), (this.f6517s == android.text.Selection.getSelectionStart(this) && this.f6518t == android.text.Selection.getSelectionEnd(this)) ? false : true, (this.f6519u == android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this) && this.f6520v == android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f6510l--;
    }

    /* renamed from: d */
    public final void m3490d(boolean z4, boolean z5, boolean z6) {
        if (z4 || z5 || z6) {
            java.util.Iterator it = this.f6512n.iterator();
            while (it.hasNext()) {
                io.flutter.plugin.editing.InterfaceC1570f interfaceC1570f = (io.flutter.plugin.editing.InterfaceC1570f) it.next();
                this.f6511m++;
                interfaceC1570f.mo3482a(z4);
                this.f6511m--;
            }
        }
    }

    /* renamed from: e */
    public final void m3491e(io.flutter.plugin.editing.InterfaceC1570f interfaceC1570f) {
        if (this.f6511m > 0) {
            android.util.Log.e("ListenableEditingState", "removing a listener " + interfaceC1570f.toString() + " in a listener callback");
        }
        this.f6512n.remove(interfaceC1570f);
        if (this.f6510l > 0) {
            this.f6513o.remove(interfaceC1570f);
        }
    }

    /* renamed from: f */
    public final void m3492f(p043K2.C0342r c0342r) {
        int i4;
        m3488b();
        replace(0, length(), (java.lang.CharSequence) c0342r.f1065a);
        int i5 = c0342r.f1066b;
        if (i5 >= 0) {
            android.text.Selection.setSelection(this, i5, c0342r.f1067c);
        } else {
            android.text.Selection.removeSelection(this);
        }
        int i6 = c0342r.f1068d;
        if (i6 < 0 || i6 >= (i4 = c0342r.f1069e)) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f6521w.setComposingRegion(i6, i4);
        }
        this.f6514p.clear();
        m3489c();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i4, int i5, int i6) {
        super.setSpan(obj, i4, i5, i6);
        java.util.ArrayList arrayList = this.f6514p;
        java.lang.String c1571g = toString();
        int selectionStart = android.text.Selection.getSelectionStart(this);
        int selectionEnd = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        ?? obj2 = new java.lang.Object();
        obj2.f6530e = selectionStart;
        obj2.f6531f = selectionEnd;
        obj2.f6532g = composingSpanStart;
        obj2.f6533h = composingSpanEnd;
        obj2.f6526a = c1571g;
        obj2.f6527b = "";
        obj2.f6528c = -1;
        obj2.f6529d = -1;
        arrayList.add(obj2);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.String toString() {
        java.lang.String str = this.f6515q;
        if (str != null) {
            return str;
        }
        java.lang.String spannableStringBuilder = super.toString();
        this.f6515q = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i4, int i5, java.lang.CharSequence charSequence, int i6, int i7) {
        if (this.f6511m > 0) {
            android.util.Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        java.lang.String c1571g = toString();
        int i8 = i5 - i4;
        boolean z4 = i8 != i7 - i6;
        for (int i9 = 0; i9 < i8 && !z4; i9++) {
            z4 |= charAt(i4 + i9) != charSequence.charAt(i6 + i9);
        }
        if (z4) {
            this.f6515q = null;
        }
        int selectionStart = android.text.Selection.getSelectionStart(this);
        int selectionEnd = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        android.text.SpannableStringBuilder replace = super.replace(i4, i5, charSequence, i6, i7);
        java.util.ArrayList arrayList = this.f6514p;
        int selectionStart2 = android.text.Selection.getSelectionStart(this);
        int selectionEnd2 = android.text.Selection.getSelectionEnd(this);
        int composingSpanStart2 = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this);
        ?? obj = new java.lang.Object();
        obj.f6530e = selectionStart2;
        obj.f6531f = selectionEnd2;
        obj.f6532g = composingSpanStart2;
        obj.f6533h = composingSpanEnd2;
        java.lang.String charSequence2 = charSequence.toString();
        obj.f6526a = c1571g;
        obj.f6527b = charSequence2;
        obj.f6528c = i4;
        obj.f6529d = i5;
        arrayList.add(obj);
        if (this.f6510l > 0) {
            return replace;
        }
        m3490d(z4, (android.text.Selection.getSelectionStart(this) == selectionStart && android.text.Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (android.view.inputmethod.BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
