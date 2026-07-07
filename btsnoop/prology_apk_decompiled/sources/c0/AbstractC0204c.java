package c0;

import T.C0084e;
import a.AbstractC0110a;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import f2.C0278F;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0204c {
    public static C0206e a(AudioManager audioManager, C0084e c0084e) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c0084e.a().f1009m);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(AbstractC0110a.d(12)));
        for (int i4 = 0; i4 < directProfilesForAttributes.size(); i4++) {
            AudioProfile f4 = b0.i.f(directProfilesForAttributes.get(i4));
            encapsulationType = f4.getEncapsulationType();
            if (encapsulationType != 1) {
                format = f4.getFormat();
                if (W.y.I(format) || C0206e.f4603e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        channelMasks2 = f4.getChannelMasks();
                        set.addAll(AbstractC0110a.d(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = f4.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(AbstractC0110a.d(channelMasks)));
                    }
                }
            }
        }
        C0278F i5 = f2.I.i();
        for (Map.Entry entry : hashMap.entrySet()) {
            i5.a(new C0205d(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C0206e(i5.g());
    }

    public static C0211j b(AudioManager audioManager, C0084e c0084e) {
        List audioDevicesForAttributes;
        try {
            audioManager.getClass();
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c0084e.a().f1009m);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C0211j((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
