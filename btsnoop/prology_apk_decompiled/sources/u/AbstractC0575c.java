package u;

import a.AbstractC0110a;
import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import n.C0446i;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0575c {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0579g f8476a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0446i f8477b;

    static {
        Trace.beginSection(AbstractC0110a.Z("TypefaceCompat static init"));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f8476a = new AbstractC0579g(0);
        } else if (i4 >= 28) {
            f8476a = new C0576d();
        } else {
            f8476a = new C0576d();
        }
        f8477b = new C0446i(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r6.equals(r10) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r15, t.InterfaceC0554a r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, S0.g r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.AbstractC0575c.a(android.content.Context, t.a, android.content.res.Resources, int, java.lang.String, int, int, S0.g):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }
}
