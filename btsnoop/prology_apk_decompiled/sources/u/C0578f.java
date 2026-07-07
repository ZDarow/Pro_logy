package u;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import t.C0555b;
import t.C0556c;
import z.C0635h;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578f extends AbstractC0579g {
    public static Font p(FontFamily fontFamily, int i4) {
        FontStyle fontStyle = new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int r4 = r(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int r5 = r(fontStyle, font2.getStyle());
            if (r5 < r4) {
                font = font2;
                r4 = r5;
            }
        }
        return font;
    }

    public static FontFamily q(C0635h[] c0635hArr, ContentResolver contentResolver) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        int length = c0635hArr.length;
        FontFamily.Builder builder = null;
        while (i4 < length) {
            C0635h c0635h = c0635hArr[i4];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(c0635h.f9209a, "r", null);
            } catch (IOException e4) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            }
            if (openFileDescriptor != null) {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(c0635h.f9211c).setSlant(c0635h.f9212d ? 1 : 0).setTtcIndex(c0635h.f9210b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
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

    public static int r(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // u.AbstractC0579g
    public final Typeface b(Context context, C0555b c0555b, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (C0556c c0556c : c0555b.f8275a) {
                try {
                    Font build = new Font.Builder(resources, c0556c.f8281f).setWeight(c0556c.f8277b).setSlant(c0556c.f8278c ? 1 : 0).setTtcIndex(c0556c.f8280e).setFontVariationSettings(c0556c.f8279d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(p(build2, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // u.AbstractC0579g
    public final Typeface d(Context context, C0635h[] c0635hArr, int i4) {
        try {
            FontFamily q4 = q(c0635hArr, context.getContentResolver());
            if (q4 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(q4).setStyle(p(q4, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // u.AbstractC0579g
    public final Typeface e(Context context, List list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily q4 = q((C0635h[]) list.get(0), contentResolver);
            if (q4 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(q4);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily q5 = q((C0635h[]) list.get(i5), contentResolver);
                if (q5 != null) {
                    customFallbackBuilder.addCustomFallback(q5);
                }
            }
            return customFallbackBuilder.setStyle(p(q4, i4).getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // u.AbstractC0579g
    public final Typeface f(Context context, Resources resources, int i4, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e4) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e4);
            return null;
        }
    }

    @Override // u.AbstractC0579g
    public final C0635h h(C0635h[] c0635hArr, int i4) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
