package r2;

import B2.AbstractC0007h;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi21;
import c0.C0208g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p1.AbstractC0462a;

/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511d {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f8095a;

    /* renamed from: b, reason: collision with root package name */
    public Q.b f8096b;

    /* renamed from: c, reason: collision with root package name */
    public C0510c f8097c;

    /* renamed from: d, reason: collision with root package name */
    public C0510c f8098d;

    /* renamed from: e, reason: collision with root package name */
    public Context f8099e;

    /* renamed from: f, reason: collision with root package name */
    public AudioManager f8100f;

    /* renamed from: g, reason: collision with root package name */
    public C0208g f8101g;

    /* renamed from: h, reason: collision with root package name */
    public List f8102h;

    public final boolean a() {
        Context context;
        Context context2 = this.f8099e;
        if (context2 == null) {
            return false;
        }
        C0510c c0510c = this.f8097c;
        if (c0510c != null) {
            context2.unregisterReceiver(c0510c);
            this.f8097c = null;
        }
        C0510c c0510c2 = this.f8098d;
        if (c0510c2 != null && (context = this.f8099e) != null) {
            context.unregisterReceiver(c0510c2);
            this.f8098d = null;
        }
        Q.b bVar = this.f8096b;
        if (bVar == null) {
            return true;
        }
        AudioManager audioManager = this.f8100f;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        int a4 = Q.c.a(audioManager, bVar.f1509f);
        this.f8096b = null;
        return a4 == 1;
    }

    public final void b(Map map) {
        Object obj = map.get("downTime");
        long longValue = ((obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
        Object obj2 = map.get("eventTime");
        this.f8100f.dispatchMediaKeyEvent(new KeyEvent(longValue, ((obj2 == null || (obj2 instanceof Long)) ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("keyCode")).intValue(), ((Integer) map.get("repeatCount")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scanCode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
    }

    public final ArrayList c(int i4) {
        C0512e.e(23);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : this.f8100f.getDevices(i4)) {
            arrayList.add(C0512e.d("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", C0512e.c(audioDeviceInfo.getSampleRates()), "channelMasks", C0512e.c(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", C0512e.c(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", C0512e.c(audioDeviceInfo.getChannelCounts()), "encodings", C0512e.c(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
        }
        return arrayList;
    }

    public final ArrayList d() {
        List microphones;
        List<Pair> frequencyResponse;
        List<Pair> channelMapping;
        String description;
        int id;
        int type;
        String address;
        int location;
        int group;
        int indexInTheGroup;
        MicrophoneInfo.Coordinate3F position;
        MicrophoneInfo.Coordinate3F orientation;
        float sensitivity;
        float maxSpl;
        float minSpl;
        int directionality;
        C0512e.e(28);
        ArrayList arrayList = new ArrayList();
        microphones = this.f8100f.getMicrophones();
        Iterator it = microphones.iterator();
        while (it.hasNext()) {
            MicrophoneInfo d4 = AbstractC0508a.d(it.next());
            ArrayList arrayList2 = new ArrayList();
            frequencyResponse = d4.getFrequencyResponse();
            for (Pair pair : frequencyResponse) {
                arrayList2.add(new ArrayList(Arrays.asList(Double.valueOf(((Float) pair.first).floatValue()), Double.valueOf(((Float) pair.second).floatValue()))));
            }
            ArrayList arrayList3 = new ArrayList();
            channelMapping = d4.getChannelMapping();
            for (Pair pair2 : channelMapping) {
                arrayList3.add(new ArrayList(Arrays.asList((Integer) pair2.first, (Integer) pair2.second)));
            }
            description = d4.getDescription();
            id = d4.getId();
            Integer valueOf = Integer.valueOf(id);
            type = d4.getType();
            Integer valueOf2 = Integer.valueOf(type);
            address = d4.getAddress();
            location = d4.getLocation();
            Integer valueOf3 = Integer.valueOf(location);
            group = d4.getGroup();
            Integer valueOf4 = Integer.valueOf(group);
            indexInTheGroup = d4.getIndexInTheGroup();
            Integer valueOf5 = Integer.valueOf(indexInTheGroup);
            position = d4.getPosition();
            ArrayList a4 = C0512e.a(position);
            orientation = d4.getOrientation();
            ArrayList a5 = C0512e.a(orientation);
            sensitivity = d4.getSensitivity();
            Float valueOf6 = Float.valueOf(sensitivity);
            maxSpl = d4.getMaxSpl();
            Float valueOf7 = Float.valueOf(maxSpl);
            minSpl = d4.getMinSpl();
            Float valueOf8 = Float.valueOf(minSpl);
            directionality = d4.getDirectionality();
            arrayList.add(C0512e.d("description", description, "id", valueOf, "type", valueOf2, "address", address, "location", valueOf3, "group", valueOf4, "indexInTheGroup", valueOf5, "position", a4, "orientation", a5, "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", valueOf6, "maxSpl", valueOf7, "minSpl", valueOf8, "directionality", Integer.valueOf(directionality)));
        }
        return arrayList;
    }

    public final void e(String str, Object... objArr) {
        Iterator it = this.f8095a.iterator();
        while (it.hasNext()) {
            C0512e c0512e = (C0512e) it.next();
            c0512e.f8104l.j(str, new ArrayList(Arrays.asList(objArr)), null);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [r2.b] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    public final boolean f(List list) {
        if (this.f8096b != null) {
            return true;
        }
        Map map = (Map) list.get(0);
        int intValue = ((Integer) map.get("gainType")).intValue();
        AudioAttributesCompat audioAttributesCompat = Q.b.f1503g;
        if (intValue != 1 && intValue != 2 && intValue != 3 && intValue != 4) {
            throw new IllegalArgumentException(AbstractC0007h.k("Illegal audio focus gain type ", intValue));
        }
        ?? r5 = new AudioManager.OnAudioFocusChangeListener() { // from class: r2.b
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i4) {
                C0511d c0511d = C0511d.this;
                if (i4 == -1) {
                    c0511d.a();
                }
                c0511d.e("onAudioFocusChanged", Integer.valueOf(i4));
            }
        };
        Handler handler = new Handler(Looper.getMainLooper());
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            int i4 = AudioAttributesCompat.f4193b;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            if (map2.get("contentType") != null) {
                builder.setContentType(((Integer) map2.get("contentType")).intValue());
            }
            if (map2.get("flags") != null) {
                builder.setFlags(((Integer) map2.get("flags")).intValue());
            }
            if (map2.get("usage") != null) {
                builder.setUsage(((Integer) map2.get("usage")).intValue());
            }
            audioAttributesCompat = new AudioAttributesCompat(new AudioAttributesImplApi21(builder.build()));
        }
        Q.b bVar = new Q.b(intValue, r5, handler, audioAttributesCompat, map.get("willPauseWhenDucked") != null ? ((Boolean) map.get("willPauseWhenDucked")).booleanValue() : false);
        this.f8096b = bVar;
        AudioManager audioManager = this.f8100f;
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        boolean z4 = Q.c.b(audioManager, bVar.f1509f) == 1;
        if (z4) {
            if (this.f8097c == null) {
                C0510c c0510c = new C0510c(this, 0);
                this.f8097c = c0510c;
                AbstractC0462a.K(this.f8099e, c0510c, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            }
            if (this.f8098d == null) {
                C0510c c0510c2 = new C0510c(this, 1);
                this.f8098d = c0510c2;
                AbstractC0462a.K(this.f8099e, c0510c2, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            }
        }
        return z4;
    }
}
