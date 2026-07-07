package p196u;

/* renamed from: u.f */
/* loaded from: classes.dex */
public final class C2211f extends p196u.AbstractC2212g {
    /* renamed from: p */
    public static android.graphics.fonts.Font m4404p(android.graphics.fonts.FontFamily fontFamily, int i4) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int m4406r = m4406r(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i5);
            int m4406r2 = m4406r(fontStyle, font2.getStyle());
            if (m4406r2 < m4406r) {
                font = font2;
                m4406r = m4406r2;
            }
        }
        return font;
    }

    /* renamed from: q */
    public static android.graphics.fonts.FontFamily m4405q(p219z.C2437h[] c2437hArr, android.content.ContentResolver contentResolver) {
        int i4;
        android.os.ParcelFileDescriptor openFileDescriptor;
        int length = c2437hArr.length;
        android.graphics.fonts.FontFamily.Builder builder = null;
        while (i4 < length) {
            p219z.C2437h c2437h = c2437hArr[i4];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(c2437h.f9573a, "r", null);
            } catch (java.io.IOException e4) {
                android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            }
            if (openFileDescriptor != null) {
                try {
                    android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(openFileDescriptor).setWeight(c2437h.f9575c).setSlant(c2437h.f9576d ? 1 : 0).setTtcIndex(c2437h.f9574b).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                    break;
                }
            } else {
                i4 = openFileDescriptor == null ? i4 + 1 : 0;
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* renamed from: r */
    public static int m4406r(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: b */
    public final android.graphics.Typeface mo4394b(android.content.Context context, p192t.C2159b c2159b, android.content.res.Resources resources, int i4) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (p192t.C2160c c2160c : c2159b.f8596a) {
                try {
                    android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, c2160c.f8602f).setWeight(c2160c.f8598b).setSlant(c2160c.f8599c ? 1 : 0).setTtcIndex(c2160c.f8601e).setFontVariationSettings(c2160c.f8600d).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily build2 = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(build2).setStyle(m4404p(build2, i4).getStyle()).build();
        } catch (java.lang.Exception e4) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: d */
    public final android.graphics.Typeface mo4395d(android.content.Context context, p219z.C2437h[] c2437hArr, int i4) {
        try {
            android.graphics.fonts.FontFamily m4405q = m4405q(c2437hArr, context.getContentResolver());
            if (m4405q == null) {
                return null;
            }
            return new android.graphics.Typeface.CustomFallbackBuilder(m4405q).setStyle(m4404p(m4405q, i4).getStyle()).build();
        } catch (java.lang.Exception e4) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: e */
    public final android.graphics.Typeface mo4407e(android.content.Context context, java.util.List list, int i4) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily m4405q = m4405q((p219z.C2437h[]) list.get(0), contentResolver);
            if (m4405q == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(m4405q);
            for (int i5 = 1; i5 < list.size(); i5++) {
                android.graphics.fonts.FontFamily m4405q2 = m4405q((p219z.C2437h[]) list.get(i5), contentResolver);
                if (m4405q2 != null) {
                    customFallbackBuilder.addCustomFallback(m4405q2);
                }
            }
            return customFallbackBuilder.setStyle(m4404p(m4405q, i4).getStyle()).build();
        } catch (java.lang.Exception e4) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: f */
    public final android.graphics.Typeface mo4396f(android.content.Context context, android.content.res.Resources resources, int i4, java.lang.String str, int i5) {
        try {
            android.graphics.fonts.Font build = new android.graphics.fonts.Font.Builder(resources, i4).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (java.lang.Exception e4) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: h */
    public final p219z.C2437h mo4408h(p219z.C2437h[] c2437hArr, int i4) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }
}
