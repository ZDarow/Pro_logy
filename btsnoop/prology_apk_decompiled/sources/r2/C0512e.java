package r2;

import B2.AbstractC0007h;
import I.C0044m;
import K2.k;
import L2.n;
import L2.o;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: r2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512e implements o {

    /* renamed from: m, reason: collision with root package name */
    public static C0511d f8103m;

    /* renamed from: l, reason: collision with root package name */
    public C0044m f8104l;

    public static ArrayList a(MicrophoneInfo.Coordinate3F coordinate3F) {
        float f4;
        float f5;
        float f6;
        ArrayList arrayList = new ArrayList();
        f4 = coordinate3F.x;
        arrayList.add(Double.valueOf(f4));
        f5 = coordinate3F.y;
        arrayList.add(Double.valueOf(f5));
        f6 = coordinate3F.z;
        arrayList.add(Double.valueOf(f6));
        return arrayList;
    }

    public static HashMap b(AudioDeviceInfo audioDeviceInfo) {
        return d("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), "type", Integer.valueOf(audioDeviceInfo.getType()));
    }

    public static ArrayList c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    public static HashMap d(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < objArr.length; i4 += 2) {
            hashMap.put((String) objArr[i4], objArr[i4 + 1]);
        }
        return hashMap;
    }

    public static void e(int i4) {
        if (Build.VERSION.SDK_INT < i4) {
            throw new RuntimeException(AbstractC0007h.k("Requires API level ", i4));
        }
    }

    @Override // L2.o
    public final void I(n nVar, k kVar) {
        char c4;
        int streamMinVolume;
        float streamVolumeDb;
        List availableCommunicationDevices;
        AudioDeviceInfo communicationDevice;
        int allowedCapturePolicy;
        boolean isHapticPlaybackSupported;
        try {
            List list = (List) nVar.f1095b;
            String str = nVar.f1094a;
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
                    kVar.b(Boolean.valueOf(f8103m.f(list)));
                    return;
                case 1:
                    kVar.b(Boolean.valueOf(f8103m.a()));
                    return;
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    f8103m.b((Map) list.get(0));
                    kVar.b(null);
                    return;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    C0511d c0511d = f8103m;
                    c0511d.getClass();
                    e(21);
                    kVar.b(Boolean.valueOf(c0511d.f8100f.isVolumeFixed()));
                    return;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    f8103m.f8100f.adjustStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    kVar.b(null);
                    return;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                    f8103m.f8100f.adjustVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue());
                    kVar.b(null);
                    return;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    f8103m.f8100f.adjustSuggestedStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    kVar.b(null);
                    return;
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    kVar.b(Integer.valueOf(f8103m.f8100f.getRingerMode()));
                    return;
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                    kVar.b(Integer.valueOf(f8103m.f8100f.getStreamMaxVolume(((Integer) list.get(0)).intValue())));
                    return;
                case '\t':
                    C0511d c0511d2 = f8103m;
                    int intValue = ((Integer) list.get(0)).intValue();
                    c0511d2.getClass();
                    e(28);
                    streamMinVolume = c0511d2.f8100f.getStreamMinVolume(intValue);
                    kVar.b(Integer.valueOf(streamMinVolume));
                    return;
                case '\n':
                    kVar.b(Integer.valueOf(f8103m.f8100f.getStreamVolume(((Integer) list.get(0)).intValue())));
                    return;
                case 11:
                    C0511d c0511d3 = f8103m;
                    int intValue2 = ((Integer) list.get(0)).intValue();
                    int intValue3 = ((Integer) list.get(1)).intValue();
                    int intValue4 = ((Integer) list.get(2)).intValue();
                    c0511d3.getClass();
                    e(28);
                    streamVolumeDb = c0511d3.f8100f.getStreamVolumeDb(intValue2, intValue3, intValue4);
                    kVar.b(Float.valueOf(streamVolumeDb));
                    return;
                case '\f':
                    f8103m.f8100f.setRingerMode(((Integer) list.get(0)).intValue());
                    kVar.b(null);
                    return;
                case '\r':
                    f8103m.f8100f.setStreamVolume(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                    kVar.b(null);
                    return;
                case 14:
                    C0511d c0511d4 = f8103m;
                    int intValue5 = ((Integer) list.get(0)).intValue();
                    c0511d4.getClass();
                    e(23);
                    kVar.b(Boolean.valueOf(c0511d4.f8100f.isStreamMute(intValue5)));
                    return;
                case 15:
                    C0511d c0511d5 = f8103m;
                    c0511d5.getClass();
                    e(31);
                    availableCommunicationDevices = c0511d5.f8100f.getAvailableCommunicationDevices();
                    c0511d5.f8102h = availableCommunicationDevices;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c0511d5.f8102h.iterator();
                    while (it.hasNext()) {
                        arrayList.add(b((AudioDeviceInfo) it.next()));
                    }
                    kVar.b(arrayList);
                    return;
                case 16:
                    C0511d c0511d6 = f8103m;
                    Integer num = (Integer) list.get(0);
                    c0511d6.getClass();
                    e(31);
                    Iterator it2 = c0511d6.f8102h.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) it2.next();
                            if (audioDeviceInfo.getId() == num.intValue()) {
                                z4 = c0511d6.f8100f.setCommunicationDevice(audioDeviceInfo);
                            }
                        }
                    }
                    kVar.b(Boolean.valueOf(z4));
                    return;
                case 17:
                    C0511d c0511d7 = f8103m;
                    c0511d7.getClass();
                    e(31);
                    communicationDevice = c0511d7.f8100f.getCommunicationDevice();
                    kVar.b(b(communicationDevice));
                    return;
                case 18:
                    C0511d c0511d8 = f8103m;
                    c0511d8.getClass();
                    e(31);
                    c0511d8.f8100f.clearCommunicationDevice();
                    kVar.b(null);
                    return;
                case 19:
                    f8103m.f8100f.setSpeakerphoneOn(((Boolean) list.get(0)).booleanValue());
                    kVar.b(null);
                    return;
                case 20:
                    kVar.b(Boolean.valueOf(f8103m.f8100f.isSpeakerphoneOn()));
                    return;
                case 21:
                    C0511d c0511d9 = f8103m;
                    int intValue6 = ((Integer) list.get(0)).intValue();
                    c0511d9.getClass();
                    e(29);
                    c0511d9.f8100f.setAllowedCapturePolicy(intValue6);
                    kVar.b(null);
                    return;
                case 22:
                    C0511d c0511d10 = f8103m;
                    c0511d10.getClass();
                    e(29);
                    allowedCapturePolicy = c0511d10.f8100f.getAllowedCapturePolicy();
                    kVar.b(Integer.valueOf(allowedCapturePolicy));
                    return;
                case 23:
                    kVar.b(Boolean.valueOf(f8103m.f8100f.isBluetoothScoAvailableOffCall()));
                    return;
                case 24:
                    f8103m.f8100f.startBluetoothSco();
                    kVar.b(null);
                    return;
                case 25:
                    f8103m.f8100f.stopBluetoothSco();
                    kVar.b(null);
                    return;
                case 26:
                    f8103m.f8100f.setBluetoothScoOn(((Boolean) list.get(0)).booleanValue());
                    kVar.b(null);
                    return;
                case 27:
                    kVar.b(Boolean.valueOf(f8103m.f8100f.isBluetoothScoOn()));
                    return;
                case 28:
                    f8103m.f8100f.setMicrophoneMute(((Boolean) list.get(0)).booleanValue());
                    kVar.b(null);
                    return;
                case 29:
                    kVar.b(Boolean.valueOf(f8103m.f8100f.isMicrophoneMute()));
                    return;
                case 30:
                    f8103m.f8100f.setMode(((Integer) list.get(0)).intValue());
                    kVar.b(null);
                    return;
                case 31:
                    kVar.b(Integer.valueOf(f8103m.f8100f.getMode()));
                    return;
                case ' ':
                    kVar.b(Boolean.valueOf(f8103m.f8100f.isMusicActive()));
                    return;
                case '!':
                    C0511d c0511d11 = f8103m;
                    c0511d11.getClass();
                    e(21);
                    kVar.b(Integer.valueOf(c0511d11.f8100f.generateAudioSessionId()));
                    return;
                case '\"':
                    f8103m.f8100f.setParameters((String) list.get(0));
                    kVar.b(null);
                    return;
                case '#':
                    kVar.b(f8103m.f8100f.getParameters((String) list.get(0)));
                    return;
                case '$':
                    C0511d c0511d12 = f8103m;
                    int intValue7 = ((Integer) list.get(0)).intValue();
                    Double d4 = (Double) list.get(1);
                    if (d4 != null) {
                        c0511d12.f8100f.playSoundEffect(intValue7, (float) d4.doubleValue());
                    } else {
                        c0511d12.f8100f.playSoundEffect(intValue7);
                    }
                    kVar.b(null);
                    return;
                case '%':
                    f8103m.f8100f.loadSoundEffects();
                    kVar.b(null);
                    return;
                case '&':
                    f8103m.f8100f.unloadSoundEffects();
                    kVar.b(null);
                    return;
                case '\'':
                    kVar.b(f8103m.f8100f.getProperty((String) list.get(0)));
                    return;
                case '(':
                    kVar.b(f8103m.c(((Integer) list.get(0)).intValue()));
                    return;
                case ')':
                    kVar.b(f8103m.d());
                    return;
                case '*':
                    f8103m.getClass();
                    e(29);
                    isHapticPlaybackSupported = AudioManager.isHapticPlaybackSupported();
                    kVar.b(Boolean.valueOf(isHapticPlaybackSupported));
                    return;
                default:
                    kVar.c();
                    return;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            kVar.a("Error: " + e4, null, null);
        }
    }
}
