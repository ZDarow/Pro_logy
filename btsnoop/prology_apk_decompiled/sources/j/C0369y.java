package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369y {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f6772l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f6773m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f6774a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6775b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f6776c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f6777d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f6778e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f6779f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f6780g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f6781h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f6782i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f6783j;

    /* renamed from: k, reason: collision with root package name */
    public final C0366v f6784k;

    static {
        new ConcurrentHashMap();
    }

    public C0369y(TextView textView) {
        this.f6782i = textView;
        this.f6783j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6784k = new C0367w();
        } else {
            this.f6784k = new C0366v();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f6773m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        if (this.f6774a != 0) {
            if (this.f6775b) {
                if (this.f6782i.getMeasuredHeight() <= 0 || this.f6782i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f6784k.a(this.f6782i) ? 1048576 : (this.f6782i.getMeasuredWidth() - this.f6782i.getTotalPaddingLeft()) - this.f6782i.getTotalPaddingRight();
                int height = (this.f6782i.getHeight() - this.f6782i.getCompoundPaddingBottom()) - this.f6782i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f6772l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c4 = c(rectF);
                        if (c4 != this.f6782i.getTextSize()) {
                            f(c4, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f6775b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f6779f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 <= i4) {
            int i7 = (i5 + i4) / 2;
            int i8 = this.f6779f[i7];
            TextView textView = this.f6782i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f6781h;
            if (textPaint == null) {
                this.f6781h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f6781h.set(textView.getPaint());
            this.f6781h.setTextSize(i8);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f6781h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f6784k.b(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i6 = i5;
                i5 = i9;
            } else {
                i6 = i7 - 1;
                i4 = i6;
            }
        }
        return this.f6779f[i6];
    }

    public final void f(float f4, int i4) {
        Context context = this.f6783j;
        float applyDimension = TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f6782i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f6775b = false;
                try {
                    Method d4 = d("nullLayouts");
                    if (d4 != null) {
                        d4.invoke(textView, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
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

    public final boolean g() {
        if (this.f6774a == 1) {
            if (!this.f6780g || this.f6779f.length == 0) {
                int floor = ((int) Math.floor((this.f6778e - this.f6777d) / this.f6776c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round((i4 * this.f6776c) + this.f6777d);
                }
                this.f6779f = b(iArr);
            }
            this.f6775b = true;
        } else {
            this.f6775b = false;
        }
        return this.f6775b;
    }

    public final boolean h() {
        boolean z4 = this.f6779f.length > 0;
        this.f6780g = z4;
        if (z4) {
            this.f6774a = 1;
            this.f6777d = r0[0];
            this.f6778e = r0[r1 - 1];
            this.f6776c = -1.0f;
        }
        return z4;
    }

    public final void i(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f6774a = 1;
        this.f6777d = f4;
        this.f6778e = f5;
        this.f6776c = f6;
        this.f6780g = false;
    }
}
