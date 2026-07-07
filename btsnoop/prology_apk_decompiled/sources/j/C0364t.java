package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import e.AbstractC0248a;
import java.lang.ref.WeakReference;

/* renamed from: j.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364t {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6753a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f6754b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f6755c;

    /* renamed from: d, reason: collision with root package name */
    public l0 f6756d;

    /* renamed from: e, reason: collision with root package name */
    public l0 f6757e;

    /* renamed from: f, reason: collision with root package name */
    public l0 f6758f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f6759g;

    /* renamed from: h, reason: collision with root package name */
    public l0 f6760h;

    /* renamed from: i, reason: collision with root package name */
    public final C0369y f6761i;

    /* renamed from: j, reason: collision with root package name */
    public int f6762j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f6763k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f6764l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6765m;

    public C0364t(TextView textView) {
        this.f6753a = textView;
        this.f6761i = new C0369y(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [j.l0, java.lang.Object] */
    public static l0 c(Context context, C0360o c0360o, int i4) {
        ColorStateList f4;
        synchronized (c0360o) {
            f4 = c0360o.f6725a.f(context, i4);
        }
        if (f4 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f6709b = true;
        obj.f6710c = f4;
        return obj;
    }

    public final void a(Drawable drawable, l0 l0Var) {
        if (drawable == null || l0Var == null) {
            return;
        }
        C0360o.c(drawable, l0Var, this.f6753a.getDrawableState());
    }

    public final void b() {
        l0 l0Var = this.f6754b;
        TextView textView = this.f6753a;
        if (l0Var != null || this.f6755c != null || this.f6756d != null || this.f6757e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f6754b);
            a(compoundDrawables[1], this.f6755c);
            a(compoundDrawables[2], this.f6756d);
            a(compoundDrawables[3], this.f6757e);
        }
        if (this.f6758f == null && this.f6759g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f6758f);
        a(compoundDrawablesRelative[2], this.f6759g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0358, code lost:
    
        if (r3 != null) goto L218;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0364t.d(android.util.AttributeSet, int):void");
    }

    public final void e(Context context, int i4) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, AbstractC0248a.s);
        android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f6753a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, tVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        tVar.u0();
        Typeface typeface = this.f6764l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f6762j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [S0.g, java.lang.Object] */
    public final void f(Context context, android.support.v4.media.session.t tVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i4 = this.f6762j;
        TypedArray typedArray = (TypedArray) tVar.f3735n;
        this.f6762j = typedArray.getInt(2, i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f6763k = i6;
            if (i6 != -1) {
                this.f6762j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f6765m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f6764l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f6764l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f6764l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f6764l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f6763k;
        int i10 = this.f6762j;
        if (!context.isRestricted()) {
            WeakReference weakReference = new WeakReference(this.f6753a);
            ?? obj = new Object();
            obj.f1903d = this;
            obj.f1900a = i9;
            obj.f1901b = i10;
            obj.f1902c = weakReference;
            try {
                Typeface h02 = tVar.h0(i8, this.f6762j, obj);
                if (h02 != null) {
                    if (i5 < 28 || this.f6763k == -1) {
                        this.f6764l = h02;
                    } else {
                        create2 = Typeface.create(Typeface.create(h02, 0), this.f6763k, (this.f6762j & 2) != 0);
                        this.f6764l = create2;
                    }
                }
                this.f6765m = this.f6764l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6764l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f6763k == -1) {
            this.f6764l = Typeface.create(string, this.f6762j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f6763k, (this.f6762j & 2) != 0);
            this.f6764l = create;
        }
    }
}
