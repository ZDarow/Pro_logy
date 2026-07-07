package U1;

import B2.AbstractActivityC0003d;
import B2.AbstractC0008i;
import E0.e;
import M1.d;
import N.g;
import T.I;
import W.y;
import Y.k;
import Y.l;
import a.AbstractC0110a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import b1.C0184g;
import com.google.android.gms.common.api.Status;
import d2.C0241d;
import e0.C0250b;
import e0.j;
import e0.m;
import f2.h0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.C0378A;
import k1.s;
import k1.t;
import k3.h;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import p1.AbstractC0462a;
import q.AbstractC0463a;
import t.C0555b;
import t.C0556c;
import t.C0557d;
import t.InterfaceC0554a;
import z.C0630c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f2514a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f2515b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f2516c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f2517d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2518e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f2519f;

    public static void C(Status status, Object obj, C0241d c0241d) {
        if (status.f4737l <= 0) {
            c0241d.a(obj);
        } else {
            c0241d.f4974a.c(status.f4739n != null ? new d(status) : new d(status));
        }
    }

    public static void D(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public static void E(XmlResourceParser xmlResourceParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    public static Integer F(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        return hashSet.contains(3) ? 3 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[LOOP:0: B:14:0x0054->B:16:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G(V0.d r13, V0.k r14, W.c r15) {
        /*
            long r0 = r14.f2621a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.g(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r13.Q()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r13.B(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            int r2 = r13.Q()
            if (r4 >= r2) goto L52
            java.util.List r7 = r13.w(r0)
            long r2 = r13.B(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L52
            long r8 = r14.f2621a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            V0.a r12 = new V0.a
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.accept(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.Q()
            if (r3 >= r6) goto L60
            v(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f2622b
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            v(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            V0.a r14 = new V0.a
            java.util.List r7 = r13.w(r0)
            long r8 = r13.B(r4)
            long r2 = r13.B(r4)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.accept(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.a.G(V0.d, V0.k, W.c):void");
    }

    public static HashMap H(Location location) {
        boolean hasMslAltitude;
        double mslAltitudeMeters;
        boolean hasMslAltitudeAccuracy;
        float mslAltitudeAccuracyMeters;
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.valueOf(location.getLatitude()));
        hashMap.put("longitude", Double.valueOf(location.getLongitude()));
        hashMap.put("timestamp", Long.valueOf(location.getTime()));
        int i4 = Build.VERSION.SDK_INT;
        hashMap.put("is_mocked", Boolean.valueOf(i4 >= 31 ? location.isMock() : location.isFromMockProvider()));
        if (location.hasAltitude()) {
            hashMap.put("altitude", Double.valueOf(location.getAltitude()));
        }
        if (location.hasVerticalAccuracy()) {
            hashMap.put("altitude_accuracy", Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasAccuracy()) {
            hashMap.put("accuracy", Double.valueOf(location.getAccuracy()));
        }
        if (location.hasBearing()) {
            hashMap.put("heading", Double.valueOf(location.getBearing()));
        }
        if (location.hasBearingAccuracy()) {
            hashMap.put("heading_accuracy", Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (location.hasSpeed()) {
            hashMap.put("speed", Double.valueOf(location.getSpeed()));
        }
        if (location.hasSpeedAccuracy()) {
            hashMap.put("speed_accuracy", Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.getExtras() != null) {
            if (location.getExtras().containsKey("geolocator_mslAltitude")) {
                hashMap.put("altitude", Double.valueOf(location.getExtras().getDouble("geolocator_mslAltitude")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatelliteCount")) {
                hashMap.put("gnss_satellite_count", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatelliteCount")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatellitesUsedInFix")) {
                hashMap.put("gnss_satellites_used_in_fix", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatellitesUsedInFix")));
            }
            if (i4 >= 34) {
                hasMslAltitude = location.hasMslAltitude();
                if (hasMslAltitude) {
                    mslAltitudeMeters = location.getMslAltitudeMeters();
                    hashMap.put("altitude", Double.valueOf(mslAltitudeMeters));
                    hasMslAltitudeAccuracy = location.hasMslAltitudeAccuracy();
                    if (hasMslAltitudeAccuracy) {
                        mslAltitudeAccuracyMeters = location.getMslAltitudeAccuracyMeters();
                        hashMap.put("altitude_accuracy", Float.valueOf(mslAltitudeAccuracyMeters));
                    }
                }
            }
        }
        return hashMap;
    }

    public static String I(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (c4 >= 'A' && c4 <= 'Z') {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static int J(AbstractActivityC0003d abstractActivityC0003d, String str, int i4) {
        if (i4 == -1) {
            return l(abstractActivityC0003d, str);
        }
        return 1;
    }

    public static long K(long j4, long j5, long j6, int i4) {
        int i5 = y.f2709a;
        return j4 + y.U(j5 - j6, 1000000L, i4, RoundingMode.FLOOR);
    }

    public static String L(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static Object M(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(M(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i4 = 0; i4 < length; i4++) {
                jSONArray2.put(M(Array.get(obj, i4)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), M(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public static ArrayList N(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static String P(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append("@");
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb3), (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + sb3.length() + 8 + 1);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i5] = sb;
            i5++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i6, indexOf);
            sb5.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb5.append((CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb5.append(", ");
                sb5.append(objArr[i7]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final boolean a(int i4, int i5, int i6, byte[] bArr, byte[] bArr2) {
        h.e(bArr, "a");
        h.e(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static l b(m mVar, String str, j jVar, int i4) {
        k kVar = new k();
        kVar.f3021a = W.a.y(str, jVar.f5072c);
        kVar.f3024d = jVar.f5070a;
        kVar.f3025e = jVar.f5071b;
        String b4 = mVar.b();
        if (b4 == null) {
            b4 = W.a.y(((C0250b) mVar.f5078m.get(0)).f5025a, jVar.f5072c).toString();
        }
        kVar.f3026f = b4;
        kVar.f3027g = i4;
        kVar.f3023c = h0.f5570r;
        W.a.l(kVar.f3021a, "The uri must be set.");
        return new l(kVar.f3021a, kVar.f3022b, null, kVar.f3023c, kVar.f3024d, kVar.f3025e, kVar.f3026f, kVar.f3027g);
    }

    public static final String c(Integer num, int i4, boolean z4) {
        String str = z4 ? i4 == 0 ? " COLLATE NOCASE ASC" : " COLLATE NOCASE DESC" : i4 == 0 ? " ASC" : " DESC";
        return (num != null && num.intValue() == 0) ? "name".concat(str) : "name".concat(str);
    }

    public static final void d(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static void e(int i4) {
        if (2 > i4 || i4 >= 37) {
            throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new n3.a(2, 36, 1));
        }
    }

    public static long f(long j4, long j5) {
        long j6 = j4 + j5;
        if (((j4 ^ j5) < 0) || ((j4 ^ j6) >= 0)) {
            return j6;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j4 + ", " + j5 + ")");
    }

    public static int g(C0378A c0378a, e eVar, View view, View view2, s sVar, boolean z4) {
        if (sVar.p() == 0 || c0378a.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z4) {
            return Math.min(eVar.j(), eVar.d(view2) - eVar.e(view));
        }
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int h(C0378A c0378a, e eVar, View view, View view2, s sVar, boolean z4) {
        if (sVar.p() == 0 || c0378a.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return c0378a.a();
        }
        eVar.d(view2);
        eVar.e(view);
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static Bitmap i(byte[] bArr, int i4) {
        int i5 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i4, null);
        if (decodeByteArray == null) {
            throw I.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            g gVar = new g(byteArrayInputStream);
            byteArrayInputStream.close();
            N.c c4 = gVar.c("Orientation");
            int i6 = 1;
            if (c4 != null) {
                try {
                    i6 = c4.e(gVar.f1222f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (i6) {
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    i5 = 180;
                    break;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    i5 = 270;
                    break;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i5 = 90;
                    break;
            }
            if (i5 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i5);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String k(Context context, String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && s(context, null, str)) {
            return str;
        }
        if (i4 >= 29) {
            if (s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (s(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (s(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    public static int l(AbstractActivityC0003d abstractActivityC0003d, String str) {
        if (abstractActivityC0003d == null) {
            return 0;
        }
        boolean z4 = abstractActivityC0003d.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean O3 = AbstractC0462a.O(abstractActivityC0003d, str);
        if (z4) {
            O3 = !O3;
        }
        if (!z4 && O3) {
            abstractActivityC0003d.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        return (z4 && O3) ? 4 : 0;
    }

    public static long m(long j4, long j5, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j6 = j4 / j5;
        long j7 = j4 - (j5 * j6);
        if (j7 == 0) {
            return j6;
        }
        int i4 = ((int) ((j4 ^ j5) >> 63)) | 1;
        switch (h2.e.f6001a[roundingMode.ordinal()]) {
            case 1:
                if (j7 == 0) {
                    return j6;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return j6;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (i4 >= 0) {
                    return j6;
                }
                break;
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                break;
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                if (i4 <= 0) {
                    return j6;
                }
                break;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                long abs = Math.abs(j7);
                long abs2 = abs - (Math.abs(j5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j6) == 0)) {
                        return j6;
                    }
                } else if (abs2 <= 0) {
                    return j6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j6 + i4;
    }

    public static boolean o(String str, String str2) {
        char c4;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != str2.charAt(i4) && ((c4 = (char) ((r4 | ' ') - 97)) >= 26 || c4 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static long p(long j4, long j5) {
        AbstractC0110a.j("a", j4);
        AbstractC0110a.j("b", j5);
        if (j4 == 0) {
            return j5;
        }
        if (j5 == 0) {
            return j4;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long j6 = j4 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j5);
        long j7 = j5 >> numberOfTrailingZeros2;
        while (j6 != j7) {
            long j8 = j6 - j7;
            long j9 = (j8 >> 63) & j8;
            long j10 = (j8 - j9) - j9;
            j7 += j9;
            j6 = j10 >> Long.numberOfTrailingZeros(j10);
        }
        return j6 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static final Class q(o3.b bVar) {
        h.e(bVar, "<this>");
        Class a4 = ((k3.d) bVar).a();
        if (!a4.isPrimitive()) {
            return a4;
        }
        String name = a4.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a4 : Double.class;
            case 104431:
                return !name.equals("int") ? a4 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a4 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a4 : Character.class;
            case 3327612:
                return !name.equals("long") ? a4 : Long.class;
            case 3625364:
                return !name.equals("void") ? a4 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a4 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a4 : Float.class;
            case 109413500:
                return !name.equals("short") ? a4 : Short.class;
            default:
                return a4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ArrayList r(Context context, int i4) {
        String k4;
        String k5;
        String k6;
        ArrayList arrayList = new ArrayList();
        switch (i4) {
            case 0:
            case 37:
                if (s(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                if (s(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                return arrayList;
            case 1:
                if (s(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                }
                return arrayList;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (s(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (s(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (s(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                }
                return arrayList;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
            case L.k.LONG_FIELD_NUMBER /* 4 */:
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                if (i4 != 4 || Build.VERSION.SDK_INT < 29) {
                    if (s(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (s(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                    }
                } else if (s(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
                return arrayList;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
            case 20:
                return null;
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case 14:
                if (s(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                return arrayList;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                if (s(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                if (Build.VERSION.SDK_INT > 29 && s(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (s(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (s(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (s(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (s(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (s(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (s(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                }
                return arrayList;
            case 9:
                if (Build.VERSION.SDK_INT >= 33 && s(context, arrayList, "android.permission.READ_MEDIA_IMAGES")) {
                    arrayList.add("android.permission.READ_MEDIA_IMAGES");
                }
                return arrayList;
            case 10:
            case 25:
            case 26:
            default:
                return arrayList;
            case 12:
                if (s(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                }
                return arrayList;
            case 13:
                if (s(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (s(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (s(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (s(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (s(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                }
                return arrayList;
            case 15:
                if (s(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                int i5 = Build.VERSION.SDK_INT;
                if ((i5 < 29 || (i5 == 29 && AbstractC0008i.s())) && s(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                }
                return arrayList;
            case 16:
                if (s(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                }
                return arrayList;
            case 17:
                if (Build.VERSION.SDK_INT >= 33 && s(context, arrayList, "android.permission.POST_NOTIFICATIONS")) {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
                return arrayList;
            case 18:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (s(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                }
                return arrayList;
            case 19:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                if (s(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                    arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                }
                return arrayList;
            case 21:
                if (s(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                }
                return arrayList;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && s(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
                return arrayList;
            case 23:
                if (s(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
                return arrayList;
            case 24:
                if (s(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
                return arrayList;
            case 27:
                if (s(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                }
                return arrayList;
            case 28:
                if (Build.VERSION.SDK_INT >= 31 && (k4 = k(context, "android.permission.BLUETOOTH_SCAN")) != null) {
                    arrayList.add(k4);
                }
                return arrayList;
            case 29:
                if (Build.VERSION.SDK_INT >= 31 && (k5 = k(context, "android.permission.BLUETOOTH_ADVERTISE")) != null) {
                    arrayList.add(k5);
                }
                return arrayList;
            case 30:
                if (Build.VERSION.SDK_INT >= 31 && (k6 = k(context, "android.permission.BLUETOOTH_CONNECT")) != null) {
                    arrayList.add(k6);
                }
                return arrayList;
            case 31:
                if (Build.VERSION.SDK_INT >= 33 && s(context, arrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
                    arrayList.add("android.permission.NEARBY_WIFI_DEVICES");
                }
                return arrayList;
            case 32:
                if (Build.VERSION.SDK_INT >= 33 && s(context, arrayList, "android.permission.READ_MEDIA_VIDEO")) {
                    arrayList.add("android.permission.READ_MEDIA_VIDEO");
                }
                return arrayList;
            case 33:
                if (Build.VERSION.SDK_INT >= 33 && s(context, arrayList, "android.permission.READ_MEDIA_AUDIO")) {
                    arrayList.add("android.permission.READ_MEDIA_AUDIO");
                }
                return arrayList;
            case 34:
                if (s(context, arrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
                    arrayList.add("android.permission.SCHEDULE_EXACT_ALARM");
                }
                return arrayList;
            case 35:
                if (Build.VERSION.SDK_INT >= 33 && s(context, arrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
                return arrayList;
            case 36:
                if (s(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                return arrayList;
        }
    }

    public static boolean s(Context context, ArrayList arrayList, String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e4) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e4);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 4096);
        }
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f2516c == null) {
            f2516c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f2516c.booleanValue();
        if (f2517d == null) {
            f2517d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f2517d.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static String u(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i4 = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, (Throwable) e4);
                    str2 = "<" + str3 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i6 = 0;
        while (i4 < objArr.length && (indexOf = str.indexOf("%s", i6)) != -1) {
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i4 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void v(V0.d dVar, int i4, W.c cVar) {
        long B4 = dVar.B(i4);
        List w = dVar.w(B4);
        if (w.isEmpty()) {
            return;
        }
        if (i4 == dVar.Q() - 1) {
            throw new IllegalStateException();
        }
        long B5 = dVar.B(i4 + 1) - dVar.B(i4);
        if (B5 > 0) {
            cVar.accept(new V0.a(w, B4, B5));
        }
    }

    public static InterfaceC0554a w(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0463a.f7658a);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(5);
            String string3 = obtainAttributes.getString(6);
            String string4 = obtainAttributes.getString(2);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(3, 1);
            int integer2 = obtainAttributes.getInteger(4, 500);
            String string5 = obtainAttributes.getString(7);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    E(xmlResourceParser);
                }
                List x3 = x(resources, resourceId);
                return new C0557d(new C0630c(string, string2, string3, x3), string4 != null ? new C0630c(string, string2, string4, x3) : null, integer, integer2, string5);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0463a.f7659b);
                        int i4 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z4 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i5 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i6 = obtainAttributes2.getInt(i5, 0);
                        int i7 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                        String string7 = obtainAttributes2.getString(i7);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            E(xmlResourceParser);
                        }
                        arrayList.add(new C0556c(i4, i6, resourceId2, string7, string6, z4));
                    } else {
                        E(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0555b((C0556c[]) arrayList.toArray(new C0556c[0]));
            }
        } else {
            E(xmlResourceParser);
        }
        return null;
    }

    public static List x(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i4);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static C0184g y(C0184g c0184g, String[] strArr, Map map) {
        int i4 = 0;
        if (c0184g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C0184g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C0184g c0184g2 = new C0184g();
                int length = strArr.length;
                while (i4 < length) {
                    c0184g2.a((C0184g) map.get(strArr[i4]));
                    i4++;
                }
                return c0184g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c0184g.a((C0184g) map.get(strArr[0]));
                return c0184g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i4 < length2) {
                    c0184g.a((C0184g) map.get(strArr[i4]));
                    i4++;
                }
            }
        }
        return c0184g;
    }

    public static long z(long j4, long j5) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5) + Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4);
        if (numberOfLeadingZeros > 65) {
            return j4 * j5;
        }
        long j6 = ((j4 ^ j5) >>> 63) + Long.MAX_VALUE;
        if ((numberOfLeadingZeros < 64) || ((j5 == Long.MIN_VALUE) & (j4 < 0))) {
            return j6;
        }
        long j7 = j4 * j5;
        return (j4 == 0 || j7 / j4 == j5) ? j7 : j6;
    }

    public abstract void A(boolean z4);

    public abstract void B(boolean z4);

    public abstract void O(byte[] bArr, int i4, int i5);

    public abstract String j(byte[] bArr, int i4, int i5);

    public abstract int n(String str, byte[] bArr, int i4, int i5);
}
