package L1;

import B2.AbstractC0007h;
import C.InterfaceC0025l;
import I.C0044m;
import L2.o;
import T.C0095p;
import Y1.x;
import a.AbstractC0110a;
import a1.C0146a;
import a2.C0147a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Parcel;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import b1.C0182e;
import com.prology.R;
import d1.C0231a;
import d2.C0241d;
import h1.InterfaceC0316a;
import i.InterfaceC0333n;
import i.MenuC0328i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import m0.C0419H;
import m0.InterfaceC0423d;
import m0.InterfaceC0424e;
import n.C0444g;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0025l, o, V0.j, N1.j, InterfaceC0316a, i1.c, InterfaceC0333n, j0.i, InterfaceC0423d {

    /* renamed from: m, reason: collision with root package name */
    public static g f1070m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ g f1071n = new g(16, false);

    /* renamed from: o, reason: collision with root package name */
    public static g f1072o;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1073l;

    public /* synthetic */ g(int i4, Object obj) {
        this.f1073l = i4;
    }

    public static final boolean f(B3.l lVar) {
        B3.l lVar2 = C3.d.f389c;
        String b4 = lVar.b();
        return !q3.i.n0(b4.length() - ".class".length(), 0, ".class".length(), b4, ".class", true);
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static MediaCodec k(j0.h hVar) {
        j0.m mVar = hVar.f6827a;
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = mVar.f6833a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static B1.d p(Context context, String[] strArr, String str, C0044m c0044m) {
        String[] r4 = r(context);
        int length = r4.length;
        int i4 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i4 >= length) {
                return null;
            }
            String str2 = r4[i4];
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i5 = i6;
                }
            }
            if (zipFile != null) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c4 = File.separatorChar;
                            sb.append(c4);
                            sb.append(str3);
                            sb.append(c4);
                            sb.append(str);
                            String sb2 = sb.toString();
                            c0044m.k("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                B1.d dVar = new B1.d(6, false);
                                dVar.f96m = zipFile;
                                dVar.f97n = entry;
                                return dVar;
                            }
                        }
                        i7 = i8;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i4++;
        }
    }

    public static String[] q(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c4 = File.separatorChar;
        sb.append(c4);
        sb.append("([^\\");
        sb.append(c4);
        sb.append("]*)");
        sb.append(c4);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : r(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] r(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static final k s(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            l lVar = new l(packageInfo.signatures[0].toByteArray());
            for (int i4 = 0; i4 < kVarArr.length; i4++) {
                if (kVarArr[i4].equals(lVar)) {
                    return kVarArr[i4];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean t(android.content.pm.PackageInfo r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L2c
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1c
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L19
            goto L1c
        L19:
            r2 = r4
        L1a:
            r3 = r0
            goto L2e
        L1c:
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo
            if (r2 != 0) goto L22
        L20:
            r2 = r1
            goto L29
        L22:
            int r2 = r2.flags
            r2 = r2 & 129(0x81, float:1.81E-43)
            if (r2 == 0) goto L20
            r2 = r0
        L29:
            r3 = r2
            r2 = r4
            goto L2e
        L2c:
            r2 = 0
            goto L1a
        L2e:
            if (r4 == 0) goto L4c
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L4c
            if (r3 == 0) goto L3d
            L1.k[] r4 = L1.m.f1081a
            L1.k r4 = s(r2, r4)
            goto L49
        L3d:
            L1.k[] r4 = L1.m.f1081a
            r4 = r4[r1]
            L1.k[] r4 = new L1.k[]{r4}
            L1.k r4 = s(r2, r4)
        L49:
            if (r4 == 0) goto L4c
            return r0
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.g.t(android.content.pm.PackageInfo):boolean");
    }

    @Override // j0.i
    public j0.j G(j0.h hVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = k(hVar);
            Trace.beginSection("configureCodec");
            mediaCodec.configure(hVar.f6828b, hVar.f6830d, hVar.f6831e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new t(mediaCodec);
        } catch (IOException | RuntimeException e4) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e4;
        }
    }

    @Override // L2.o
    public void I(L2.n nVar, K2.k kVar) {
        switch (this.f1073l) {
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                kVar.b(null);
                return;
            default:
                kVar.b(null);
                return;
        }
    }

    @Override // N1.j
    public void J(Object obj, Object obj2) {
        c cVar;
        C0241d c0241d = (C0241d) obj2;
        Y1.i iVar = (Y1.i) obj;
        C0147a c0147a = new C0147a(Long.MAX_VALUE, 0, false, null);
        c[] b4 = iVar.b();
        c cVar2 = null;
        if (b4 != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= b4.length) {
                    cVar = null;
                    break;
                }
                cVar = b4[i4];
                if ("location_updates_with_callback".equals(cVar.f1061l)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (cVar != null && cVar.d() >= 1) {
                x xVar = (x) iVar.q();
                Y1.k kVar = new Y1.k(4, null, new Y1.e(1, c0241d), null, null);
                Parcel K3 = xVar.K();
                Y1.c.b(K3, c0147a);
                Y1.c.b(K3, kVar);
                xVar.V(K3, 90);
                return;
            }
        }
        c[] b5 = iVar.b();
        if (b5 != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= b5.length) {
                    break;
                }
                c cVar3 = b5[i5];
                if ("get_last_location_with_request".equals(cVar3.f1061l)) {
                    cVar2 = cVar3;
                    break;
                }
                i5++;
            }
            if (cVar2 != null && cVar2.d() >= 1) {
                x xVar2 = (x) iVar.q();
                Y1.e eVar = new Y1.e(1, c0241d);
                Parcel K4 = xVar2.K();
                Y1.c.b(K4, c0147a);
                K4.writeStrongBinder(eVar);
                xVar2.V(K4, 82);
                return;
            }
        }
        x xVar3 = (x) iVar.q();
        Parcel K5 = xVar3.K();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                xVar3.f2812d.transact(7, K5, obtain, 0);
                obtain.readException();
                K5.recycle();
                Location location = (Location) Y1.c.a(obtain, Location.CREATOR);
                obtain.recycle();
                c0241d.a(location);
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } catch (Throwable th) {
            K5.recycle();
            throw th;
        }
    }

    @Override // i.InterfaceC0333n
    public void a(MenuC0328i menuC0328i, boolean z4) {
    }

    @Override // C.InterfaceC0025l
    public void b(int i4, int i5, int i6, boolean z4) {
    }

    @Override // C.InterfaceC0025l
    public void c(int i4, int i5, int i6, int i7) {
    }

    @Override // V0.j
    public V0.l d(C0095p c0095p) {
        String str = c0095p.f2325m;
        if (str != null) {
            List list = c0095p.f2328p;
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c4 = 7;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    return new X0.h(list);
                case 1:
                    return new C0044m(6);
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return new C0231a(0);
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return new Y.x(9, (byte) 0);
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    return new c1.a(list);
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    return new Z0.a(list);
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return new C0146a();
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return new C0182e();
            }
        }
        throw new IllegalArgumentException(AbstractC0007h.l("Unsupported MIME type: ", str));
    }

    @Override // V0.j
    public int e(C0095p c0095p) {
        String str = c0095p.f2325m;
        if (str != null) {
            char c4 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c4 = 7;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return 2;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return 1;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    return 2;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return 1;
            }
        }
        throw new IllegalArgumentException(AbstractC0007h.l("Unsupported MIME type: ", str));
    }

    @Override // h1.InterfaceC0316a
    public CharSequence g(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f4227l.getString(R.string.not_set);
        }
        return null;
    }

    @Override // i.InterfaceC0333n
    public boolean h(MenuC0328i menuC0328i) {
        return false;
    }

    @Override // i1.c
    public void i(int i4, Serializable serializable) {
    }

    @Override // m0.InterfaceC0423d
    public InterfaceC0424e l(int i4) {
        C0419H c0419h = new C0419H();
        C0419H c0419h2 = new C0419H();
        try {
            c0419h.f7174l.b(AbstractC0462a.x(0));
            int m4 = c0419h.m();
            boolean z4 = m4 % 2 == 0;
            c0419h2.f7174l.b(AbstractC0462a.x(z4 ? m4 + 1 : m4 - 1));
            if (z4) {
                c0419h.f7175m = c0419h2;
                return c0419h;
            }
            c0419h2.f7175m = c0419h;
            return c0419h2;
        } catch (IOException e4) {
            AbstractC0110a.m(c0419h);
            AbstractC0110a.m(c0419h2);
            throw e4;
        }
    }

    @Override // i1.c
    public void m() {
    }

    public String n(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // V0.j
    public boolean o(C0095p c0095p) {
        String str = c0095p.f2325m;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public /* synthetic */ g(int i4, boolean z4) {
        this.f1073l = i4;
    }

    public g(Context context) {
        this.f1073l = 17;
        context.getApplicationContext();
    }

    public g(int i4) {
        this.f1073l = i4;
        switch (i4) {
            case 26:
                new n.j(0);
                new C0444g();
                return;
            default:
                new CopyOnWriteArrayList();
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(t tVar) {
        this(10);
        this.f1073l = 10;
    }
}
