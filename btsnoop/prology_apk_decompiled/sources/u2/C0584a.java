package u2;

import B2.AbstractActivityC0003d;
import C2.d;
import H2.b;
import I.C0044m;
import K2.k;
import L2.f;
import L2.n;
import L2.o;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import k3.h;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584a implements b, o, I2.a {

    /* renamed from: l, reason: collision with root package name */
    public AbstractActivityC0003d f8593l;

    /* renamed from: m, reason: collision with root package name */
    public C0044m f8594m;

    @Override // L2.o
    public final void I(n nVar, k kVar) {
        h.e(nVar, "call");
        String str = nVar.f1094a;
        if (!h.a(str, "openSettings")) {
            if (!h.a(str, "openSettingsPanel")) {
                kVar.c();
                return;
            }
            if (Build.VERSION.SDK_INT < 29) {
                kVar.b(null);
                return;
            }
            AbstractActivityC0003d abstractActivityC0003d = this.f8593l;
            if (abstractActivityC0003d == null) {
                kVar.b(null);
                return;
            }
            String str2 = (String) nVar.a("type");
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -810883302:
                        if (str2.equals("volume")) {
                            abstractActivityC0003d.startActivity(new Intent("android.settings.panel.action.VOLUME"));
                            kVar.b(null);
                            return;
                        }
                        break;
                    case 108971:
                        if (str2.equals("nfc")) {
                            abstractActivityC0003d.startActivity(new Intent("android.settings.panel.action.NFC"));
                            kVar.b(null);
                            return;
                        }
                        break;
                    case 3649301:
                        if (str2.equals("wifi")) {
                            abstractActivityC0003d.startActivity(new Intent("android.settings.panel.action.WIFI"));
                            kVar.b(null);
                            return;
                        }
                        break;
                    case 21015448:
                        if (str2.equals("internetConnectivity")) {
                            abstractActivityC0003d.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                            kVar.b(null);
                            return;
                        }
                        break;
                }
            }
            kVar.c();
            return;
        }
        Boolean bool = (Boolean) nVar.a("asAnotherTask");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str3 = (String) nVar.a("type");
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -2045253606:
                    if (str3.equals("batteryOptimization")) {
                        c("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case -1928150741:
                    if (str3.equals("generalSettings")) {
                        c("android.settings.SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case -1770066084:
                    if (str3.equals("manageUnknownAppSources")) {
                        c("android.settings.MANAGE_UNKNOWN_APP_SOURCES", kVar, booleanValue);
                        return;
                    }
                    break;
                case -1335157162:
                    if (str3.equals("device")) {
                        c("android.settings.DEVICE_INFO_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case -1000044642:
                    if (str3.equals("wireless")) {
                        c("android.settings.WIRELESS_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case -213139122:
                    if (str3.equals("accessibility")) {
                        c("android.settings.ACCESSIBILITY_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case -114233073:
                    if (str3.equals("dataRoaming")) {
                        c("android.settings.DATA_ROAMING_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case -80681014:
                    if (str3.equals("developer")) {
                        c("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 96799:
                    if (str3.equals("apn")) {
                        c("android.settings.APN_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 108971:
                    if (str3.equals("nfc")) {
                        c("android.settings.NFC_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 116980:
                    if (str3.equals("vpn")) {
                        c("android.settings.VPN_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 3076014:
                    if (str3.equals("date")) {
                        c("android.settings.DATE_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 3649301:
                    if (str3.equals("wifi")) {
                        c("android.settings.WIFI_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 92895825:
                    if (str3.equals("alarm")) {
                        if (Build.VERSION.SDK_INT < 31) {
                            a(kVar, booleanValue);
                            return;
                        }
                        AbstractActivityC0003d abstractActivityC0003d2 = this.f8593l;
                        Uri fromParts = abstractActivityC0003d2 != null ? Uri.fromParts("package", abstractActivityC0003d2.getPackageName(), null) : null;
                        if (fromParts == null) {
                            kVar.b(null);
                            return;
                        } else {
                            i(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", fromParts), kVar, booleanValue);
                            return;
                        }
                    }
                    break;
                case 109627663:
                    if (str3.equals("sound")) {
                        c("android.settings.SOUND_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 595233003:
                    if (str3.equals("notification")) {
                        AbstractActivityC0003d abstractActivityC0003d3 = this.f8593l;
                        if (abstractActivityC0003d3 != null) {
                            Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", abstractActivityC0003d3.getPackageName());
                            h.d(putExtra, "putExtra(...)");
                            if (booleanValue) {
                                putExtra.addFlags(268435456);
                            }
                            abstractActivityC0003d3.startActivity(putExtra);
                        }
                        kVar.b(null);
                        return;
                    }
                    break;
                case 949122880:
                    if (str3.equals("security")) {
                        c("android.settings.SECURITY_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 1039955198:
                    if (str3.equals("internalStorage")) {
                        c("android.settings.INTERNAL_STORAGE_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 1099603663:
                    if (str3.equals("hotspot")) {
                        Intent className = new Intent().setClassName("com.android.settings", "com.android.settings.TetherSettings");
                        h.d(className, "setClassName(...)");
                        i(className, kVar, booleanValue);
                        return;
                    }
                    break;
                case 1214667623:
                    if (str3.equals("lockAndPassword")) {
                        c("android.app.action.SET_NEW_PASSWORD", kVar, booleanValue);
                        return;
                    }
                    break;
                case 1294374875:
                    if (str3.equals("appLocale")) {
                        if (Build.VERSION.SDK_INT < 33) {
                            kVar.b(null);
                            return;
                        }
                        Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
                        if (booleanValue) {
                            intent.addFlags(268435456);
                        }
                        AbstractActivityC0003d abstractActivityC0003d4 = this.f8593l;
                        if (abstractActivityC0003d4 != null) {
                            intent.setData(Uri.fromParts("package", abstractActivityC0003d4.getPackageName(), null));
                            abstractActivityC0003d4.startActivity(intent);
                        }
                        kVar.b(null);
                        return;
                    }
                    break;
                case 1434631203:
                    if (str3.equals("settings")) {
                        a(kVar, booleanValue);
                        return;
                    }
                    break;
                case 1671764162:
                    if (str3.equals("display")) {
                        c("android.settings.DISPLAY_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 1901043637:
                    if (str3.equals("location")) {
                        c("android.settings.LOCATION_SOURCE_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
                case 1968882350:
                    if (str3.equals("bluetooth")) {
                        c("android.settings.BLUETOOTH_SETTINGS", kVar, booleanValue);
                        return;
                    }
                    break;
            }
        }
        kVar.c();
    }

    public final void a(k kVar, boolean z4) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        if (z4) {
            intent.addFlags(268435456);
        }
        AbstractActivityC0003d abstractActivityC0003d = this.f8593l;
        if (abstractActivityC0003d != null) {
            intent.setData(Uri.fromParts("package", abstractActivityC0003d.getPackageName(), null));
            abstractActivityC0003d.startActivity(intent);
        }
        kVar.b(null);
    }

    @Override // H2.b
    public final void b(H2.a aVar) {
        h.e(aVar, "binding");
        C0044m c0044m = this.f8594m;
        if (c0044m != null) {
            c0044m.s(null);
        } else {
            h.i("channel");
            throw null;
        }
    }

    public final void c(String str, k kVar, boolean z4) {
        try {
            Intent intent = new Intent(str);
            if (z4) {
                intent.addFlags(268435456);
            }
            AbstractActivityC0003d abstractActivityC0003d = this.f8593l;
            if (abstractActivityC0003d != null) {
                abstractActivityC0003d.startActivity(intent);
            }
            kVar.b(null);
        } catch (Exception unused) {
            a(kVar, z4);
        }
    }

    @Override // H2.b
    public final void d(H2.a aVar) {
        h.e(aVar, "flutterPluginBinding");
        C0044m c0044m = new C0044m((f) aVar.f709m, "com.spencerccf.app_settings/methods");
        this.f8594m = c0044m;
        c0044m.s(this);
    }

    @Override // I2.a
    public final void e() {
        this.f8593l = null;
    }

    @Override // I2.a
    public final void f(d dVar) {
        h.e(dVar, "binding");
        this.f8593l = (AbstractActivityC0003d) dVar.f367a;
    }

    @Override // I2.a
    public final void g() {
        this.f8593l = null;
    }

    @Override // I2.a
    public final void h(d dVar) {
        h.e(dVar, "binding");
        this.f8593l = (AbstractActivityC0003d) dVar.f367a;
    }

    public final void i(Intent intent, k kVar, boolean z4) {
        if (z4) {
            try {
                intent.addFlags(268435456);
            } catch (Exception unused) {
                a(kVar, z4);
                return;
            }
        }
        AbstractActivityC0003d abstractActivityC0003d = this.f8593l;
        if (abstractActivityC0003d != null) {
            abstractActivityC0003d.startActivity(intent);
        }
        kVar.b(null);
    }
}
