package p145j;

/* renamed from: j.t */
/* loaded from: classes.dex */
public final class C1685t {

    /* renamed from: a */
    public final android.widget.TextView f7011a;

    /* renamed from: b */
    public p145j.C1670l0 f7012b;

    /* renamed from: c */
    public p145j.C1670l0 f7013c;

    /* renamed from: d */
    public p145j.C1670l0 f7014d;

    /* renamed from: e */
    public p145j.C1670l0 f7015e;

    /* renamed from: f */
    public p145j.C1670l0 f7016f;

    /* renamed from: g */
    public p145j.C1670l0 f7017g;

    /* renamed from: h */
    public p145j.C1670l0 f7018h;

    /* renamed from: i */
    public final p145j.C1693y f7019i;

    /* renamed from: j */
    public int f7020j = 0;

    /* renamed from: k */
    public int f7021k = -1;

    /* renamed from: l */
    public android.graphics.Typeface f7022l;

    /* renamed from: m */
    public boolean f7023m;

    public C1685t(android.widget.TextView textView) {
        this.f7011a = textView;
        this.f7019i = new p145j.C1693y(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [j.l0, java.lang.Object] */
    /* renamed from: c */
    public static p145j.C1670l0 m3624c(android.content.Context context, p145j.C1675o c1675o, int i4) {
        android.content.res.ColorStateList m3596f;
        synchronized (c1675o) {
            m3596f = c1675o.f6983a.m3596f(context, i4);
        }
        if (m3596f == null) {
            return null;
        }
        ?? obj = new java.lang.Object();
        obj.f6967b = true;
        obj.f6968c = m3596f;
        return obj;
    }

    /* renamed from: a */
    public final void m3625a(android.graphics.drawable.Drawable drawable, p145j.C1670l0 c1670l0) {
        if (drawable == null || c1670l0 == null) {
            return;
        }
        p145j.C1675o.m3619c(drawable, c1670l0, this.f7011a.getDrawableState());
    }

    /* renamed from: b */
    public final void m3626b() {
        p145j.C1670l0 c1670l0 = this.f7012b;
        android.widget.TextView textView = this.f7011a;
        if (c1670l0 != null || this.f7013c != null || this.f7014d != null || this.f7015e != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m3625a(compoundDrawables[0], this.f7012b);
            m3625a(compoundDrawables[1], this.f7013c);
            m3625a(compoundDrawables[2], this.f7014d);
            m3625a(compoundDrawables[3], this.f7015e);
        }
        if (this.f7016f == null && this.f7017g == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m3625a(compoundDrawablesRelative[0], this.f7016f);
        m3625a(compoundDrawablesRelative[2], this.f7017g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0358, code lost:
    
        if (r3 != null) goto L218;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3627d(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p145j.C1685t.m3627d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public final void m3628e(android.content.Context context, int i4) {
        java.lang.String string;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, p121e.AbstractC1299a.f5203s);
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        android.widget.TextView textView = this.f7011a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m3629f(context, c1061t);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        c1061t.m2243u0();
        android.graphics.Typeface typeface = this.f7022l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f7020j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [S0.g, java.lang.Object] */
    /* renamed from: f */
    public final void m3629f(android.content.Context context, android.support.v4.media.session.C1061t c1061t) {
        java.lang.String string;
        android.graphics.Typeface create;
        android.graphics.Typeface create2;
        int i4 = this.f7020j;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) c1061t.f3862n;
        this.f7020j = typedArray.getInt(2, i4);
        int i5 = android.os.Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f7021k = i6;
            if (i6 != -1) {
                this.f7020j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f7023m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f7022l = android.graphics.Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f7022l = android.graphics.Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f7022l = android.graphics.Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f7022l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f7021k;
        int i10 = this.f7020j;
        if (!context.isRestricted()) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f7011a);
            ?? obj = new java.lang.Object();
            obj.f1974d = this;
            obj.f1971a = i9;
            obj.f1972b = i10;
            obj.f1973c = weakReference;
            try {
                android.graphics.Typeface m2226h0 = c1061t.m2226h0(i8, this.f7020j, obj);
                if (m2226h0 != null) {
                    if (i5 < 28 || this.f7021k == -1) {
                        this.f7022l = m2226h0;
                    } else {
                        create2 = android.graphics.Typeface.create(android.graphics.Typeface.create(m2226h0, 0), this.f7021k, (this.f7020j & 2) != 0);
                        this.f7022l = create2;
                    }
                }
                this.f7023m = this.f7022l == null;
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            }
        }
        if (this.f7022l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 28 || this.f7021k == -1) {
            this.f7022l = android.graphics.Typeface.create(string, this.f7020j);
        } else {
            create = android.graphics.Typeface.create(android.graphics.Typeface.create(string, 0), this.f7021k, (this.f7020j & 2) != 0);
            this.f7022l = create;
        }
    }
}
