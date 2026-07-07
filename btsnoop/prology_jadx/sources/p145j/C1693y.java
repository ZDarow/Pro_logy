package p145j;

/* renamed from: j.y */
/* loaded from: classes.dex */
public final class C1693y {

    /* renamed from: l */
    public static final android.graphics.RectF f7030l = new android.graphics.RectF();

    /* renamed from: m */
    public static final java.util.concurrent.ConcurrentHashMap f7031m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a */
    public int f7032a = 0;

    /* renamed from: b */
    public boolean f7033b = false;

    /* renamed from: c */
    public float f7034c = -1.0f;

    /* renamed from: d */
    public float f7035d = -1.0f;

    /* renamed from: e */
    public float f7036e = -1.0f;

    /* renamed from: f */
    public int[] f7037f = new int[0];

    /* renamed from: g */
    public boolean f7038g = false;

    /* renamed from: h */
    public android.text.TextPaint f7039h;

    /* renamed from: i */
    public final android.widget.TextView f7040i;

    /* renamed from: j */
    public final android.content.Context f7041j;

    /* renamed from: k */
    public final p145j.C1689v f7042k;

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public C1693y(android.widget.TextView textView) {
        this.f7040i = textView;
        this.f7041j = textView.getContext();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.f7042k = new p145j.C1691w();
        } else {
            this.f7042k = new p145j.C1689v();
        }
    }

    /* renamed from: b */
    public static int[] m3634b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        java.util.Arrays.sort(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i4)) < 0) {
                arrayList.add(java.lang.Integer.valueOf(i4));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((java.lang.Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    public static java.lang.reflect.Method m3635d(java.lang.String str) {
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f7031m;
            java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentHashMap.get(str);
            if (method == null && (method = android.widget.TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (java.lang.Exception e4) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    /* renamed from: e */
    public static java.lang.Object m3636e(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        try {
            return m3635d(str).invoke(obj, null);
        } catch (java.lang.Exception e4) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    /* renamed from: a */
    public final void m3637a() {
        if (this.f7032a != 0) {
            if (this.f7033b) {
                if (this.f7040i.getMeasuredHeight() <= 0 || this.f7040i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f7042k.mo3633a(this.f7040i) ? 1048576 : (this.f7040i.getMeasuredWidth() - this.f7040i.getTotalPaddingLeft()) - this.f7040i.getTotalPaddingRight();
                int height = (this.f7040i.getHeight() - this.f7040i.getCompoundPaddingBottom()) - this.f7040i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = f7030l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m3638c = m3638c(rectF);
                        if (m3638c != this.f7040i.getTextSize()) {
                            m3639f(m3638c, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f7033b = true;
        }
    }

    /* renamed from: c */
    public final int m3638c(android.graphics.RectF rectF) {
        java.lang.CharSequence transformation;
        int length = this.f7037f.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 <= i4) {
            int i7 = (i5 + i4) / 2;
            int i8 = this.f7037f[i7];
            android.widget.TextView textView = this.f7040i;
            java.lang.CharSequence text = textView.getText();
            android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            android.text.TextPaint textPaint = this.f7039h;
            if (textPaint == null) {
                this.f7039h = new android.text.TextPaint();
            } else {
                textPaint.reset();
            }
            this.f7039h.set(textView.getPaint());
            this.f7039h.setTextSize(i8);
            android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) m3636e(textView, "getLayoutAlignment", android.text.Layout.Alignment.ALIGN_NORMAL);
            android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(text, 0, text.length(), this.f7039h, java.lang.Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f7042k.mo3631b(obtain, textView);
            } catch (java.lang.ClassCastException unused) {
                android.util.Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            android.text.StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i6 = i5;
                i5 = i9;
            } else {
                i6 = i7 - 1;
                i4 = i6;
            }
        }
        return this.f7037f[i6];
    }

    /* renamed from: f */
    public final void m3639f(float f4, int i4) {
        android.content.Context context = this.f7041j;
        float applyDimension = android.util.TypedValue.applyDimension(i4, f4, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        android.widget.TextView textView = this.f7040i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f7033b = false;
                try {
                    java.lang.reflect.Method m3635d = m3635d("nullLayouts");
                    if (m3635d != null) {
                        m3635d.invoke(textView, null);
                    }
                } catch (java.lang.Exception e4) {
                    android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean m3640g() {
        if (this.f7032a == 1) {
            if (!this.f7038g || this.f7037f.length == 0) {
                int floor = ((int) java.lang.Math.floor((this.f7036e - this.f7035d) / this.f7034c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = java.lang.Math.round((i4 * this.f7034c) + this.f7035d);
                }
                this.f7037f = m3634b(iArr);
            }
            this.f7033b = true;
        } else {
            this.f7033b = false;
        }
        return this.f7033b;
    }

    /* renamed from: h */
    public final boolean m3641h() {
        boolean z4 = this.f7037f.length > 0;
        this.f7038g = z4;
        if (z4) {
            this.f7032a = 1;
            this.f7035d = r0[0];
            this.f7036e = r0[r1 - 1];
            this.f7034c = -1.0f;
        }
        return z4;
    }

    /* renamed from: i */
    public final void m3642i(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f7032a = 1;
        this.f7035d = f4;
        this.f7036e = f5;
        this.f7034c = f6;
        this.f7038g = false;
    }
}
