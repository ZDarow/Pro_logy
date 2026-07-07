package p199u2;

/* renamed from: u2.a */
/* loaded from: classes.dex */
public final class C2246a implements p034H2.InterfaceC0248b, p047L2.InterfaceC0385o, p038I2.InterfaceC0309a {

    /* renamed from: l */
    public p009B2.AbstractActivityC0047d f8937l;

    /* renamed from: m */
    public p035I.C0291m f8938m;

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        p154k3.AbstractC1803h.m3779e(c0384n, "call");
        java.lang.String str = c0384n.f1133a;
        if (!p154k3.AbstractC1803h.m3775a(str, "openSettings")) {
            if (!p154k3.AbstractC1803h.m3775a(str, "openSettingsPanel")) {
                c0335k.mo743c();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT < 29) {
                c0335k.mo742b(null);
                return;
            }
            p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f8937l;
            if (abstractActivityC0047d == null) {
                c0335k.mo742b(null);
                return;
            }
            java.lang.String str2 = (java.lang.String) c0384n.m839a("type");
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -810883302:
                        if (str2.equals("volume")) {
                            abstractActivityC0047d.startActivity(new android.content.Intent("android.settings.panel.action.VOLUME"));
                            c0335k.mo742b(null);
                            return;
                        }
                        break;
                    case 108971:
                        if (str2.equals("nfc")) {
                            abstractActivityC0047d.startActivity(new android.content.Intent("android.settings.panel.action.NFC"));
                            c0335k.mo742b(null);
                            return;
                        }
                        break;
                    case 3649301:
                        if (str2.equals("wifi")) {
                            abstractActivityC0047d.startActivity(new android.content.Intent("android.settings.panel.action.WIFI"));
                            c0335k.mo742b(null);
                            return;
                        }
                        break;
                    case 21015448:
                        if (str2.equals("internetConnectivity")) {
                            abstractActivityC0047d.startActivity(new android.content.Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                            c0335k.mo742b(null);
                            return;
                        }
                        break;
                }
            }
            c0335k.mo743c();
            return;
        }
        java.lang.Boolean bool = (java.lang.Boolean) c0384n.m839a("asAnotherTask");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.String str3 = (java.lang.String) c0384n.m839a("type");
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -2045253606:
                    if (str3.equals("batteryOptimization")) {
                        m4443c("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case -1928150741:
                    if (str3.equals("generalSettings")) {
                        m4443c("android.settings.SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case -1770066084:
                    if (str3.equals("manageUnknownAppSources")) {
                        m4443c("android.settings.MANAGE_UNKNOWN_APP_SOURCES", c0335k, booleanValue);
                        return;
                    }
                    break;
                case -1335157162:
                    if (str3.equals("device")) {
                        m4443c("android.settings.DEVICE_INFO_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case -1000044642:
                    if (str3.equals("wireless")) {
                        m4443c("android.settings.WIRELESS_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case -213139122:
                    if (str3.equals("accessibility")) {
                        m4443c("android.settings.ACCESSIBILITY_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case -114233073:
                    if (str3.equals("dataRoaming")) {
                        m4443c("android.settings.DATA_ROAMING_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case -80681014:
                    if (str3.equals("developer")) {
                        m4443c("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 96799:
                    if (str3.equals("apn")) {
                        m4443c("android.settings.APN_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 108971:
                    if (str3.equals("nfc")) {
                        m4443c("android.settings.NFC_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 116980:
                    if (str3.equals("vpn")) {
                        m4443c("android.settings.VPN_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 3076014:
                    if (str3.equals("date")) {
                        m4443c("android.settings.DATE_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 3649301:
                    if (str3.equals("wifi")) {
                        m4443c("android.settings.WIFI_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 92895825:
                    if (str3.equals("alarm")) {
                        if (android.os.Build.VERSION.SDK_INT < 31) {
                            m4442a(c0335k, booleanValue);
                            return;
                        }
                        p009B2.AbstractActivityC0047d abstractActivityC0047d2 = this.f8937l;
                        android.net.Uri fromParts = abstractActivityC0047d2 != null ? android.net.Uri.fromParts("package", abstractActivityC0047d2.getPackageName(), null) : null;
                        if (fromParts == null) {
                            c0335k.mo742b(null);
                            return;
                        } else {
                            m4444i(new android.content.Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", fromParts), c0335k, booleanValue);
                            return;
                        }
                    }
                    break;
                case 109627663:
                    if (str3.equals("sound")) {
                        m4443c("android.settings.SOUND_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 595233003:
                    if (str3.equals("notification")) {
                        p009B2.AbstractActivityC0047d abstractActivityC0047d3 = this.f8937l;
                        if (abstractActivityC0047d3 != null) {
                            android.content.Intent putExtra = new android.content.Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", abstractActivityC0047d3.getPackageName());
                            p154k3.AbstractC1803h.m3778d(putExtra, "putExtra(...)");
                            if (booleanValue) {
                                putExtra.addFlags(268435456);
                            }
                            abstractActivityC0047d3.startActivity(putExtra);
                        }
                        c0335k.mo742b(null);
                        return;
                    }
                    break;
                case 949122880:
                    if (str3.equals("security")) {
                        m4443c("android.settings.SECURITY_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 1039955198:
                    if (str3.equals("internalStorage")) {
                        m4443c("android.settings.INTERNAL_STORAGE_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 1099603663:
                    if (str3.equals("hotspot")) {
                        android.content.Intent className = new android.content.Intent().setClassName("com.android.settings", "com.android.settings.TetherSettings");
                        p154k3.AbstractC1803h.m3778d(className, "setClassName(...)");
                        m4444i(className, c0335k, booleanValue);
                        return;
                    }
                    break;
                case 1214667623:
                    if (str3.equals("lockAndPassword")) {
                        m4443c("android.app.action.SET_NEW_PASSWORD", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 1294374875:
                    if (str3.equals("appLocale")) {
                        if (android.os.Build.VERSION.SDK_INT < 33) {
                            c0335k.mo742b(null);
                            return;
                        }
                        android.content.Intent intent = new android.content.Intent("android.settings.APP_LOCALE_SETTINGS");
                        if (booleanValue) {
                            intent.addFlags(268435456);
                        }
                        p009B2.AbstractActivityC0047d abstractActivityC0047d4 = this.f8937l;
                        if (abstractActivityC0047d4 != null) {
                            intent.setData(android.net.Uri.fromParts("package", abstractActivityC0047d4.getPackageName(), null));
                            abstractActivityC0047d4.startActivity(intent);
                        }
                        c0335k.mo742b(null);
                        return;
                    }
                    break;
                case 1434631203:
                    if (str3.equals("settings")) {
                        m4442a(c0335k, booleanValue);
                        return;
                    }
                    break;
                case 1671764162:
                    if (str3.equals("display")) {
                        m4443c("android.settings.DISPLAY_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 1901043637:
                    if (str3.equals("location")) {
                        m4443c("android.settings.LOCATION_SOURCE_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
                case 1968882350:
                    if (str3.equals("bluetooth")) {
                        m4443c("android.settings.BLUETOOTH_SETTINGS", c0335k, booleanValue);
                        return;
                    }
                    break;
            }
        }
        c0335k.mo743c();
    }

    /* renamed from: a */
    public final void m4442a(p043K2.C0335k c0335k, boolean z4) {
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        if (z4) {
            intent.addFlags(268435456);
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f8937l;
        if (abstractActivityC0047d != null) {
            intent.setData(android.net.Uri.fromParts("package", abstractActivityC0047d.getPackageName(), null));
            abstractActivityC0047d.startActivity(intent);
        }
        c0335k.mo742b(null);
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: b */
    public final void mo44b(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "binding");
        p035I.C0291m c0291m = this.f8938m;
        if (c0291m != null) {
            c0291m.m702s(null);
        } else {
            p154k3.AbstractC1803h.m3783i("channel");
            throw null;
        }
    }

    /* renamed from: c */
    public final void m4443c(java.lang.String str, p043K2.C0335k c0335k, boolean z4) {
        try {
            android.content.Intent intent = new android.content.Intent(str);
            if (z4) {
                intent.addFlags(268435456);
            }
            p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f8937l;
            if (abstractActivityC0047d != null) {
                abstractActivityC0047d.startActivity(intent);
            }
            c0335k.mo742b(null);
        } catch (java.lang.Exception unused) {
            m4442a(c0335k, z4);
        }
    }

    @Override // p034H2.InterfaceC0248b
    /* renamed from: d */
    public final void mo46d(p034H2.C0247a c0247a) {
        p154k3.AbstractC1803h.m3779e(c0247a, "flutterPluginBinding");
        p035I.C0291m c0291m = new p035I.C0291m((p047L2.InterfaceC0376f) c0247a.f720m, "com.spencerccf.app_settings/methods");
        this.f8938m = c0291m;
        c0291m.m702s(this);
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: e */
    public final void mo531e() {
        this.f8937l = null;
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: f */
    public final void mo532f(p013C2.C0139d c0139d) {
        p154k3.AbstractC1803h.m3779e(c0139d, "binding");
        this.f8937l = (p009B2.AbstractActivityC0047d) c0139d.f375a;
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: g */
    public final void mo533g() {
        this.f8937l = null;
    }

    @Override // p038I2.InterfaceC0309a
    /* renamed from: h */
    public final void mo534h(p013C2.C0139d c0139d) {
        p154k3.AbstractC1803h.m3779e(c0139d, "binding");
        this.f8937l = (p009B2.AbstractActivityC0047d) c0139d.f375a;
    }

    /* renamed from: i */
    public final void m4444i(android.content.Intent intent, p043K2.C0335k c0335k, boolean z4) {
        if (z4) {
            try {
                intent.addFlags(268435456);
            } catch (java.lang.Exception unused) {
                m4442a(c0335k, z4);
                return;
            }
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d = this.f8937l;
        if (abstractActivityC0047d != null) {
            abstractActivityC0047d.startActivity(intent);
        }
        c0335k.mo742b(null);
    }
}
