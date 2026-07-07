package io.flutter.plugin.editing;

import K2.r;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends SpannableStringBuilder {

    /* renamed from: l, reason: collision with root package name */
    public int f6277l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f6278m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6279n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f6280o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f6281p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public String f6282q;

    /* renamed from: r, reason: collision with root package name */
    public String f6283r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public int f6284t;

    /* renamed from: u, reason: collision with root package name */
    public int f6285u;

    /* renamed from: v, reason: collision with root package name */
    public int f6286v;
    public final e w;

    public g(r rVar, View view) {
        this.w = new e(view, this);
        if (rVar != null) {
            f(rVar);
        }
    }

    public final void a(f fVar) {
        if (this.f6278m > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f6277l <= 0) {
            this.f6279n.add(fVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f6280o.add(fVar);
        }
    }

    public final void b() {
        this.f6277l++;
        if (this.f6278m > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f6277l != 1 || this.f6279n.isEmpty()) {
            return;
        }
        this.f6283r = toString();
        this.s = Selection.getSelectionStart(this);
        this.f6284t = Selection.getSelectionEnd(this);
        this.f6285u = BaseInputConnection.getComposingSpanStart(this);
        this.f6286v = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i4 = this.f6277l;
        if (i4 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f6279n;
        ArrayList arrayList2 = this.f6280o;
        if (i4 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f6278m++;
                fVar.a(true);
                this.f6278m--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                d(!toString().equals(this.f6283r), (this.s == Selection.getSelectionStart(this) && this.f6284t == Selection.getSelectionEnd(this)) ? false : true, (this.f6285u == BaseInputConnection.getComposingSpanStart(this) && this.f6286v == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f6277l--;
    }

    public final void d(boolean z4, boolean z5, boolean z6) {
        if (z4 || z5 || z6) {
            Iterator it = this.f6279n.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                this.f6278m++;
                fVar.a(z4);
                this.f6278m--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f6278m > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.f6279n.remove(fVar);
        if (this.f6277l > 0) {
            this.f6280o.remove(fVar);
        }
    }

    public final void f(r rVar) {
        int i4;
        b();
        replace(0, length(), (CharSequence) rVar.f1026a);
        int i5 = rVar.f1027b;
        if (i5 >= 0) {
            Selection.setSelection(this, i5, rVar.f1028c);
        } else {
            Selection.removeSelection(this);
        }
        int i6 = rVar.f1029d;
        if (i6 < 0 || i6 >= (i4 = rVar.f1030e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.w.setComposingRegion(i6, i4);
        }
        this.f6281p.clear();
        c();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i4, int i5, int i6) {
        super.setSpan(obj, i4, i5, i6);
        ArrayList arrayList = this.f6281p;
        String gVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj2 = new Object();
        obj2.f6295e = selectionStart;
        obj2.f6296f = selectionEnd;
        obj2.f6297g = composingSpanStart;
        obj2.f6298h = composingSpanEnd;
        obj2.f6291a = gVar;
        obj2.f6292b = "";
        obj2.f6293c = -1;
        obj2.f6294d = -1;
        arrayList.add(obj2);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f6282q;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f6282q = spannableStringBuilder;
        return spannableStringBuilder;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        if (this.f6278m > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String gVar = toString();
        int i8 = i5 - i4;
        boolean z4 = i8 != i7 - i6;
        for (int i9 = 0; i9 < i8 && !z4; i9++) {
            z4 |= charAt(i4 + i9) != charSequence.charAt(i6 + i9);
        }
        if (z4) {
            this.f6282q = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i4, i5, charSequence, i6, i7);
        ArrayList arrayList = this.f6281p;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj = new Object();
        obj.f6295e = selectionStart2;
        obj.f6296f = selectionEnd2;
        obj.f6297g = composingSpanStart2;
        obj.f6298h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        obj.f6291a = gVar;
        obj.f6292b = charSequence2;
        obj.f6293c = i4;
        obj.f6294d = i5;
        arrayList.add(obj);
        if (this.f6277l > 0) {
            return replace;
        }
        d(z4, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
