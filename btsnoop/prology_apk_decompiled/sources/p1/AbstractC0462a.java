package p1;

import B2.AbstractC0007h;
import B3.p;
import B3.t;
import C.AbstractC0018e;
import L.k;
import T.G;
import T.H;
import W.r;
import W.y;
import Y.l;
import a.AbstractC0110a;
import a3.e;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import b3.C0191e;
import b3.InterfaceC0190d;
import b3.InterfaceC0192f;
import io.flutter.plugins.GeneratedPluginRegistrant;
import j.C0365u;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k3.h;
import p.f;
import p.g;
import r.j;
import r3.AbstractC0531s;
import t0.s;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0462a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A(String str) {
        char c4;
        if (str == null) {
            return -1;
        }
        String l4 = H.l(str);
        l4.getClass();
        switch (l4.hashCode()) {
            case -2123537834:
                if (l4.equals("audio/eac3-joc")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1662384011:
                if (l4.equals("video/mp2p")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1662384007:
                if (l4.equals("video/mp2t")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -1662095187:
                if (l4.equals("video/webm")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -1606874997:
                if (l4.equals("audio/amr-wb")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -1487656890:
                if (l4.equals("image/avif")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -1487464693:
                if (l4.equals("image/heic")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -1487464690:
                if (l4.equals("image/heif")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -1487394660:
                if (l4.equals("image/jpeg")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case -1487018032:
                if (l4.equals("image/webp")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case -1248337486:
                if (l4.equals("application/mp4")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case -1079884372:
                if (l4.equals("video/x-msvideo")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case -1004728940:
                if (l4.equals("text/vtt")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case -879272239:
                if (l4.equals("image/bmp")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case -879258763:
                if (l4.equals("image/png")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case -387023398:
                if (l4.equals("audio/x-matroska")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case -43467528:
                if (l4.equals("application/webm")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 13915911:
                if (l4.equals("video/x-flv")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (l4.equals("audio/ac3")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case 187078297:
                if (l4.equals("audio/ac4")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 187078669:
                if (l4.equals("audio/amr")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 187090232:
                if (l4.equals("audio/mp4")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            case 187091926:
                if (l4.equals("audio/ogg")) {
                    c4 = 22;
                    break;
                }
                c4 = 65535;
                break;
            case 187099443:
                if (l4.equals("audio/wav")) {
                    c4 = 23;
                    break;
                }
                c4 = 65535;
                break;
            case 1331848029:
                if (l4.equals("video/mp4")) {
                    c4 = 24;
                    break;
                }
                c4 = 65535;
                break;
            case 1503095341:
                if (l4.equals("audio/3gpp")) {
                    c4 = 25;
                    break;
                }
                c4 = 65535;
                break;
            case 1504578661:
                if (l4.equals("audio/eac3")) {
                    c4 = 26;
                    break;
                }
                c4 = 65535;
                break;
            case 1504619009:
                if (l4.equals("audio/flac")) {
                    c4 = 27;
                    break;
                }
                c4 = 65535;
                break;
            case 1504824762:
                if (l4.equals("audio/midi")) {
                    c4 = 28;
                    break;
                }
                c4 = 65535;
                break;
            case 1504831518:
                if (l4.equals("audio/mpeg")) {
                    c4 = 29;
                    break;
                }
                c4 = 65535;
                break;
            case 1505118770:
                if (l4.equals("audio/webm")) {
                    c4 = 30;
                    break;
                }
                c4 = 65535;
                break;
            case 2039520277:
                if (l4.equals("video/x-matroska")) {
                    c4 = 31;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return 11;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case 20:
            case 25:
                return 3;
            case k.STRING_FIELD_NUMBER /* 5 */:
                return 21;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 20;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int B(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static InterfaceC0190d C(InterfaceC0190d interfaceC0190d) {
        h.e(interfaceC0190d, "<this>");
        d3.b bVar = interfaceC0190d instanceof d3.b ? (d3.b) interfaceC0190d : null;
        if (bVar == null) {
            return interfaceC0190d;
        }
        InterfaceC0190d interfaceC0190d2 = bVar.f4990n;
        if (interfaceC0190d2 != null) {
            return interfaceC0190d2;
        }
        InterfaceC0192f interfaceC0192f = (InterfaceC0192f) bVar.f().j(C0191e.f4461l);
        InterfaceC0190d hVar = interfaceC0192f != null ? new w3.h((AbstractC0531s) interfaceC0192f, bVar) : bVar;
        bVar.f4990n = hVar;
        return hVar;
    }

    public static boolean D(byte b4) {
        return b4 > -65;
    }

    public static List E(Object obj) {
        List singletonList = Collections.singletonList(obj);
        h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int F(int i4) {
        int i5 = i4 % 65536;
        return i5 >= 0 ? i5 : i5 + 65536;
    }

    public static long I(r rVar, int i4, int i5) {
        rVar.G(i4);
        if (rVar.a() < 5) {
            return -9223372036854775807L;
        }
        int h4 = rVar.h();
        if ((8388608 & h4) != 0 || ((2096896 & h4) >> 8) != i5 || (h4 & 32) == 0 || rVar.u() < 7 || rVar.a() < 7 || (rVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        rVar.f(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static void J(C2.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C2.c.class).invoke(null, cVar);
        } catch (Exception e4) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e4);
        }
    }

    public static void K(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
        }
    }

    public static void L(Activity activity, String[] strArr, int i4) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (TextUtils.isEmpty(strArr[i5])) {
                throw new IllegalArgumentException(AbstractC0007h.m(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i5));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < strArr.length; i7++) {
                if (!hashSet.contains(Integer.valueOf(i7))) {
                    strArr2[i6] = strArr[i7];
                    i6++;
                }
            }
        }
        activity.requestPermissions(strArr, i4);
    }

    public static void M(TextView textView, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0018e.l(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void N(TextView textView, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static boolean O(Activity activity, String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i4 < 32 && i4 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static final void P(Object obj) {
        if (obj instanceof Z2.c) {
            throw ((Z2.c) obj).f3181l;
        }
    }

    public static ActionMode.Callback Q(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof F.k) || callback == null) ? callback : new F.k(callback, textView);
    }

    public static void R(Parcel parcel, int i4, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int X3 = X(parcel, i4);
        parcel.writeStrongBinder(iBinder);
        Y(parcel, X3);
    }

    public static void S(Parcel parcel, int i4, Parcelable parcelable, int i5) {
        if (parcelable == null) {
            return;
        }
        int X3 = X(parcel, i4);
        parcelable.writeToParcel(parcel, i5);
        Y(parcel, X3);
    }

    public static void T(Parcel parcel, int i4, String str) {
        if (str == null) {
            return;
        }
        int X3 = X(parcel, i4);
        parcel.writeString(str);
        Y(parcel, X3);
    }

    public static void U(Parcel parcel, int i4, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr == null) {
            return;
        }
        int X3 = X(parcel, i4);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i5);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        Y(parcel, X3);
    }

    public static void V(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int X3 = X(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        Y(parcel, X3);
    }

    public static void W(Parcel parcel, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i4);
        }
    }

    public static int X(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void Y(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    public static void Z(int i4, int i5) {
        String P3;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                P3 = U1.a.P("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i5 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i5);
                    throw new IllegalArgumentException(sb.toString());
                }
                P3 = U1.a.P("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(P3);
        }
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void a0(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    public static final List b(Throwable th) {
        return e.d0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static void b0(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? c0(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? c0(i5, i6, "end index") : U1.a.P("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static final List c(Throwable th) {
        return e.d0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static String c0(int i4, int i5, String str) {
        if (i4 < 0) {
            return U1.a.P("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return U1.a.P("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, Object obj, int i4, int i5) {
        for (Object obj2 : spannableStringBuilder.getSpans(i4, i5, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i4 && spannableStringBuilder.getSpanEnd(obj2) == i5 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i4, i5, 33);
    }

    public static String e(int i4, int i5, String str) {
        if (i4 < 0) {
            return U1.a.u("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return U1.a.u("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(AbstractC0007h.k("negative size: ", i5));
    }

    public static final p f(t tVar) {
        h.e(tVar, "<this>");
        return new p(tVar);
    }

    public static String g(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b4)));
        }
        return sb.toString();
    }

    public static void k(boolean z4, String str, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(U1.a.u(str, Long.valueOf(j4)));
        }
    }

    public static void l(int i4, int i5) {
        String u4;
        if (i4 < 0 || i4 >= i5) {
            if (i4 < 0) {
                u4 = U1.a.u("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i5 < 0) {
                    throw new IllegalArgumentException(AbstractC0007h.k("negative size: ", i5));
                }
                u4 = U1.a.u("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            throw new IndexOutOfBoundsException(u4);
        }
    }

    public static void m(int i4, int i5) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(e(i4, i5, "index"));
        }
    }

    public static void n(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i6) ? e(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? e(i5, i6, "end index") : U1.a.u("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4)));
        }
    }

    public static int o(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new j(context).f7997a.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int p(int i4, int i5) {
        long j4 = i4 + i5;
        int i6 = (int) j4;
        if (j4 == ((long) i6)) {
            return i6;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i4 + ", " + i5 + ")");
    }

    public static final void q(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0110a.c(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] r(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            jArr[i4] = iArr[i4];
        }
        return jArr;
    }

    public static final Z2.c s(Throwable th) {
        h.e(th, "exception");
        return new Z2.c(th);
    }

    public static u0.h t(s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (sVar.o(elapsedRealtime, i5)) {
                i4++;
            }
        }
        return new u0.h(1, 0, length, i4);
    }

    public static final boolean w(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            h.e(objArr, "<this>");
            Iterable aVar = new n3.a(0, objArr.length - 1, 1);
            if (!(aVar instanceof Collection) || !((Collection) aVar).isEmpty()) {
                Iterator it = aVar.iterator();
                while (it.hasNext()) {
                    int a4 = ((n3.b) it).a();
                    if (!w(objArr[a4], objArr2[a4])) {
                        return false;
                    }
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Collection collection = (Collection) obj;
            h.e(collection, "<this>");
            Iterable aVar2 = new n3.a(0, collection.size() - 1, 1);
            if (!(aVar2 instanceof Collection) || !((Collection) aVar2).isEmpty()) {
                Iterator it2 = aVar2.iterator();
                while (it2.hasNext()) {
                    int a5 = ((n3.b) it2).a();
                    if (!w(list.get(a5), list2.get(a5))) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return h.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!map2.containsKey(entry.getKey()) || !w(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static l x(int i4) {
        int i5 = y.f2709a;
        Locale locale = Locale.US;
        return new l(Uri.parse("rtp://0.0.0.0:" + i4), 1, null, Collections.emptyMap(), 0L, -1L, null, 0);
    }

    public static A.b y(C0365u c0365u) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new A.b(AbstractC0018e.i(c0365u));
        }
        TextPaint textPaint = new TextPaint(c0365u.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0365u.getBreakStrategy();
        int hyphenationFrequency = c0365u.getHyphenationFrequency();
        if (c0365u.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i4 < 28 || (c0365u.getInputType() & 15) != 3) {
                boolean z4 = c0365u.getLayoutDirection() == 1;
                switch (c0365u.getTextDirection()) {
                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z4) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0018e.a(DecimalFormatSymbols.getInstance(c0365u.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new A.b(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int z(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public abstract void G(f fVar, f fVar2);

    public abstract void H(f fVar, Thread thread);

    public abstract boolean h(g gVar, p.c cVar, p.c cVar2);

    public abstract boolean i(g gVar, Object obj, Object obj2);

    public abstract boolean j(g gVar, f fVar, f fVar2);

    public G u(H0.a aVar) {
        ByteBuffer byteBuffer = aVar.f3140p;
        byteBuffer.getClass();
        W.a.e(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return v(aVar, byteBuffer);
    }

    public abstract G v(H0.a aVar, ByteBuffer byteBuffer);
}
