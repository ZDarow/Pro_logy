package p186r2;

/* renamed from: r2.e */
/* loaded from: classes.dex */
public final class C2071e implements p047L2.InterfaceC0385o {

    /* renamed from: m */
    public static p186r2.C2070d f8418m;

    /* renamed from: l */
    public p035I.C0291m f8419l;

    /* renamed from: a */
    public static java.util.ArrayList m4144a(android.media.MicrophoneInfo.Coordinate3F coordinate3F) {
        float f4;
        float f5;
        float f6;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f4 = coordinate3F.x;
        arrayList.add(java.lang.Double.valueOf(f4));
        f5 = coordinate3F.y;
        arrayList.add(java.lang.Double.valueOf(f5));
        f6 = coordinate3F.z;
        arrayList.add(java.lang.Double.valueOf(f6));
        return arrayList;
    }

    /* renamed from: b */
    public static java.util.HashMap m4145b(android.media.AudioDeviceInfo audioDeviceInfo) {
        return m4147d("id", java.lang.Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", android.os.Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", java.lang.Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", java.lang.Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", java.lang.Integer.valueOf(audioDeviceInfo.getType()));
    }

    /* renamed from: c */
    public static java.util.ArrayList m4146c(int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i4));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static java.util.HashMap m4147d(java.lang.Object... objArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i4 = 0; i4 < objArr.length; i4 += 2) {
            hashMap.put((java.lang.String) objArr[i4], objArr[i4 + 1]);
        }
        return hashMap;
    }

    /* renamed from: e */
    public static void m4148e(int i4) {
        if (android.os.Build.VERSION.SDK_INT < i4) {
            throw new java.lang.RuntimeException(p009B2.AbstractC0051h.m152k("Requires API level ", i4));
        }
    }

    @Override // p047L2.InterfaceC0385o
    /* renamed from: I */
    public final void mo42I(p047L2.C0384n c0384n, p043K2.C0335k c0335k) {
        char c4;
        int streamMinVolume;
        float streamVolumeDb;
        java.util.List availableCommunicationDevices;
        android.media.AudioDeviceInfo communicationDevice;
        int allowedCapturePolicy;
        boolean isHapticPlaybackSupported;
        try {
            java.util.List list = (java.util.List) c0384n.f1134b;
            java.lang.String str = c0384n.f1133a;
            boolean z4 = false;
            switch (str.hashCode()) {
                case -1758921066:
                    if (str.equals("getCommunicationDevice")) {
                        c4 = 17;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1698305881:
                    if (str.equals("getDevices")) {
                        c4 = '(';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1679670739:
                    if (str.equals("isMicrophoneMute")) {
                        c4 = 29;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1582239800:
                    if (str.equals("getStreamMaxVolume")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1562927400:
                    if (str.equals("isSpeakerphoneOn")) {
                        c4 = 20;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1524320654:
                    if (str.equals("isHapticPlaybackSupported")) {
                        c4 = '*';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1504647535:
                    if (str.equals("requestAudioFocus")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1413157019:
                    if (str.equals("setMicrophoneMute")) {
                        c4 = 28;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1296413680:
                    if (str.equals("setSpeakerphoneOn")) {
                        c4 = 19;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1285190630:
                    if (str.equals("isBluetoothScoOn")) {
                        c4 = 27;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1197068311:
                    if (str.equals("adjustStreamVolume")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1091382445:
                    if (str.equals("getMicrophones")) {
                        c4 = ')';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1079290158:
                    if (str.equals("setAllowedCapturePolicy")) {
                        c4 = 21;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1018676910:
                    if (str.equals("setBluetoothScoOn")) {
                        c4 = 26;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -809761226:
                    if (str.equals("getStreamMinVolume")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -763512583:
                    if (str.equals("loadSoundEffects")) {
                        c4 = '%';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -694417919:
                    if (str.equals("isMusicActive")) {
                        c4 = ' ';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -580980717:
                    if (str.equals("startBluetoothSco")) {
                        c4 = 24;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -445792758:
                    if (str.equals("setCommunicationDevice")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -380792370:
                    if (str.equals("getStreamVolumeDb")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -75324903:
                    if (str.equals("getMode")) {
                        c4 = 31;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 152385829:
                    if (str.equals("dispatchMediaKeyEvent")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 160987616:
                    if (str.equals("getParameters")) {
                        c4 = '#';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 186762163:
                    if (str.equals("stopBluetoothSco")) {
                        c4 = 25;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 276698416:
                    if (str.equals("getStreamVolume")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 469094495:
                    if (str.equals("isBluetoothScoAvailableOffCall")) {
                        c4 = 23;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 623794710:
                    if (str.equals("getRingerMode")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 935118828:
                    if (str.equals("setParameters")) {
                        c4 = '\"';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 954131337:
                    if (str.equals("adjustVolume")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 976310915:
                    if (str.equals("isStreamMute")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1084758859:
                    if (str.equals("getProperty")) {
                        c4 = '\'';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1163405254:
                    if (str.equals("getAllowedCapturePolicy")) {
                        c4 = 22;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1187450940:
                    if (str.equals("setStreamVolume")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1241312831:
                    if (str.equals("clearCommunicationDevice")) {
                        c4 = 18;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1258134830:
                    if (str.equals("adjustSuggestedStreamVolume")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1357290231:
                    if (str.equals("abandonAudioFocus")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1378317714:
                    if (str.equals("unloadSoundEffects")) {
                        c4 = '&';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1397925922:
                    if (str.equals("setRingerMode")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1504508844:
                    if (str.equals("playSoundEffect")) {
                        c4 = '$';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1570996442:
                    if (str.equals("getAvailableCommunicationDevices")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1984784677:
                    if (str.equals("setMode")) {
                        c4 = 30;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1986792688:
                    if (str.equals("isVolumeFixed")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2093966320:
                    if (str.equals("generateAudioSessionId")) {
                        c4 = '!';
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
                    c0335k.mo742b(java.lang.Boolean.valueOf(f8418m.m4143f(list)));
                    return;
                case 1:
                    c0335k.mo742b(java.lang.Boolean.valueOf(f8418m.m4138a()));
                    return;
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    f8418m.m4139b((java.util.Map) list.get(0));
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    p186r2.C2070d c2070d = f8418m;
                    c2070d.getClass();
                    m4148e(21);
                    c0335k.mo742b(java.lang.Boolean.valueOf(c2070d.f8415f.isVolumeFixed()));
                    return;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    f8418m.f8415f.adjustStreamVolume(((java.lang.Integer) list.get(0)).intValue(), ((java.lang.Integer) list.get(1)).intValue(), ((java.lang.Integer) list.get(2)).intValue());
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                    f8418m.f8415f.adjustVolume(((java.lang.Integer) list.get(0)).intValue(), ((java.lang.Integer) list.get(1)).intValue());
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                    f8418m.f8415f.adjustSuggestedStreamVolume(((java.lang.Integer) list.get(0)).intValue(), ((java.lang.Integer) list.get(1)).intValue(), ((java.lang.Integer) list.get(2)).intValue());
                    c0335k.mo742b(null);
                    return;
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                    c0335k.mo742b(java.lang.Integer.valueOf(f8418m.f8415f.getRingerMode()));
                    return;
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                    c0335k.mo742b(java.lang.Integer.valueOf(f8418m.f8415f.getStreamMaxVolume(((java.lang.Integer) list.get(0)).intValue())));
                    return;
                case '\t':
                    p186r2.C2070d c2070d2 = f8418m;
                    int intValue = ((java.lang.Integer) list.get(0)).intValue();
                    c2070d2.getClass();
                    m4148e(28);
                    streamMinVolume = c2070d2.f8415f.getStreamMinVolume(intValue);
                    c0335k.mo742b(java.lang.Integer.valueOf(streamMinVolume));
                    return;
                case '\n':
                    c0335k.mo742b(java.lang.Integer.valueOf(f8418m.f8415f.getStreamVolume(((java.lang.Integer) list.get(0)).intValue())));
                    return;
                case 11:
                    p186r2.C2070d c2070d3 = f8418m;
                    int intValue2 = ((java.lang.Integer) list.get(0)).intValue();
                    int intValue3 = ((java.lang.Integer) list.get(1)).intValue();
                    int intValue4 = ((java.lang.Integer) list.get(2)).intValue();
                    c2070d3.getClass();
                    m4148e(28);
                    streamVolumeDb = c2070d3.f8415f.getStreamVolumeDb(intValue2, intValue3, intValue4);
                    c0335k.mo742b(java.lang.Float.valueOf(streamVolumeDb));
                    return;
                case '\f':
                    f8418m.f8415f.setRingerMode(((java.lang.Integer) list.get(0)).intValue());
                    c0335k.mo742b(null);
                    return;
                case '\r':
                    f8418m.f8415f.setStreamVolume(((java.lang.Integer) list.get(0)).intValue(), ((java.lang.Integer) list.get(1)).intValue(), ((java.lang.Integer) list.get(2)).intValue());
                    c0335k.mo742b(null);
                    return;
                case 14:
                    p186r2.C2070d c2070d4 = f8418m;
                    int intValue5 = ((java.lang.Integer) list.get(0)).intValue();
                    c2070d4.getClass();
                    m4148e(23);
                    c0335k.mo742b(java.lang.Boolean.valueOf(c2070d4.f8415f.isStreamMute(intValue5)));
                    return;
                case 15:
                    p186r2.C2070d c2070d5 = f8418m;
                    c2070d5.getClass();
                    m4148e(31);
                    availableCommunicationDevices = c2070d5.f8415f.getAvailableCommunicationDevices();
                    c2070d5.f8417h = availableCommunicationDevices;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = c2070d5.f8417h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m4145b((android.media.AudioDeviceInfo) it.next()));
                    }
                    c0335k.mo742b(arrayList);
                    return;
                case 16:
                    p186r2.C2070d c2070d6 = f8418m;
                    java.lang.Integer num = (java.lang.Integer) list.get(0);
                    c2070d6.getClass();
                    m4148e(31);
                    java.util.Iterator it2 = c2070d6.f8417h.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            android.media.AudioDeviceInfo audioDeviceInfo = (android.media.AudioDeviceInfo) it2.next();
                            if (audioDeviceInfo.getId() == num.intValue()) {
                                z4 = c2070d6.f8415f.setCommunicationDevice(audioDeviceInfo);
                            }
                        }
                    }
                    c0335k.mo742b(java.lang.Boolean.valueOf(z4));
                    return;
                case 17:
                    p186r2.C2070d c2070d7 = f8418m;
                    c2070d7.getClass();
                    m4148e(31);
                    communicationDevice = c2070d7.f8415f.getCommunicationDevice();
                    c0335k.mo742b(m4145b(communicationDevice));
                    return;
                case 18:
                    p186r2.C2070d c2070d8 = f8418m;
                    c2070d8.getClass();
                    m4148e(31);
                    c2070d8.f8415f.clearCommunicationDevice();
                    c0335k.mo742b(null);
                    return;
                case 19:
                    f8418m.f8415f.setSpeakerphoneOn(((java.lang.Boolean) list.get(0)).booleanValue());
                    c0335k.mo742b(null);
                    return;
                case 20:
                    c0335k.mo742b(java.lang.Boolean.valueOf(f8418m.f8415f.isSpeakerphoneOn()));
                    return;
                case 21:
                    p186r2.C2070d c2070d9 = f8418m;
                    int intValue6 = ((java.lang.Integer) list.get(0)).intValue();
                    c2070d9.getClass();
                    m4148e(29);
                    c2070d9.f8415f.setAllowedCapturePolicy(intValue6);
                    c0335k.mo742b(null);
                    return;
                case 22:
                    p186r2.C2070d c2070d10 = f8418m;
                    c2070d10.getClass();
                    m4148e(29);
                    allowedCapturePolicy = c2070d10.f8415f.getAllowedCapturePolicy();
                    c0335k.mo742b(java.lang.Integer.valueOf(allowedCapturePolicy));
                    return;
                case 23:
                    c0335k.mo742b(java.lang.Boolean.valueOf(f8418m.f8415f.isBluetoothScoAvailableOffCall()));
                    return;
                case 24:
                    f8418m.f8415f.startBluetoothSco();
                    c0335k.mo742b(null);
                    return;
                case 25:
                    f8418m.f8415f.stopBluetoothSco();
                    c0335k.mo742b(null);
                    return;
                case 26:
                    f8418m.f8415f.setBluetoothScoOn(((java.lang.Boolean) list.get(0)).booleanValue());
                    c0335k.mo742b(null);
                    return;
                case 27:
                    c0335k.mo742b(java.lang.Boolean.valueOf(f8418m.f8415f.isBluetoothScoOn()));
                    return;
                case 28:
                    f8418m.f8415f.setMicrophoneMute(((java.lang.Boolean) list.get(0)).booleanValue());
                    c0335k.mo742b(null);
                    return;
                case 29:
                    c0335k.mo742b(java.lang.Boolean.valueOf(f8418m.f8415f.isMicrophoneMute()));
                    return;
                case 30:
                    f8418m.f8415f.setMode(((java.lang.Integer) list.get(0)).intValue());
                    c0335k.mo742b(null);
                    return;
                case 31:
                    c0335k.mo742b(java.lang.Integer.valueOf(f8418m.f8415f.getMode()));
                    return;
                case ' ':
                    c0335k.mo742b(java.lang.Boolean.valueOf(f8418m.f8415f.isMusicActive()));
                    return;
                case '!':
                    p186r2.C2070d c2070d11 = f8418m;
                    c2070d11.getClass();
                    m4148e(21);
                    c0335k.mo742b(java.lang.Integer.valueOf(c2070d11.f8415f.generateAudioSessionId()));
                    return;
                case '\"':
                    f8418m.f8415f.setParameters((java.lang.String) list.get(0));
                    c0335k.mo742b(null);
                    return;
                case '#':
                    c0335k.mo742b(f8418m.f8415f.getParameters((java.lang.String) list.get(0)));
                    return;
                case '$':
                    p186r2.C2070d c2070d12 = f8418m;
                    int intValue7 = ((java.lang.Integer) list.get(0)).intValue();
                    java.lang.Double d4 = (java.lang.Double) list.get(1);
                    if (d4 != null) {
                        c2070d12.f8415f.playSoundEffect(intValue7, (float) d4.doubleValue());
                    } else {
                        c2070d12.f8415f.playSoundEffect(intValue7);
                    }
                    c0335k.mo742b(null);
                    return;
                case '%':
                    f8418m.f8415f.loadSoundEffects();
                    c0335k.mo742b(null);
                    return;
                case '&':
                    f8418m.f8415f.unloadSoundEffects();
                    c0335k.mo742b(null);
                    return;
                case '\'':
                    c0335k.mo742b(f8418m.f8415f.getProperty((java.lang.String) list.get(0)));
                    return;
                case '(':
                    c0335k.mo742b(f8418m.m4140c(((java.lang.Integer) list.get(0)).intValue()));
                    return;
                case ')':
                    c0335k.mo742b(f8418m.m4141d());
                    return;
                case '*':
                    f8418m.getClass();
                    m4148e(29);
                    isHapticPlaybackSupported = android.media.AudioManager.isHapticPlaybackSupported();
                    c0335k.mo742b(java.lang.Boolean.valueOf(isHapticPlaybackSupported));
                    return;
                default:
                    c0335k.mo743c();
                    return;
            }
        } catch (java.lang.Exception e4) {
            e4.printStackTrace();
            c0335k.mo741a("Error: " + e4, null, null);
        }
    }
}
