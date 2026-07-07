package Q;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi21;
import java.util.Objects;
import r2.C0509b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f1503g;

    /* renamed from: a, reason: collision with root package name */
    public final int f1504a;

    /* renamed from: b, reason: collision with root package name */
    public final C0509b f1505b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1506c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f1507d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1508e;

    /* renamed from: f, reason: collision with root package name */
    public final AudioFocusRequest f1509f;

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media.AudioAttributesImplApi26, androidx.media.AudioAttributesImplApi21] */
    static {
        int i4 = AudioAttributesCompat.f4193b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1);
        f1503g = new AudioAttributesCompat(new AudioAttributesImplApi21(builder.build()));
    }

    public b(int i4, C0509b c0509b, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z4) {
        this.f1504a = i4;
        this.f1506c = handler;
        this.f1507d = audioAttributesCompat;
        this.f1508e = z4;
        this.f1505b = c0509b;
        this.f1509f = a.a(i4, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f4194a.a() : null, z4, c0509b, handler);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1504a == bVar.f1504a && this.f1508e == bVar.f1508e && equals(bVar.f1505b) && this.f1506c.equals(bVar.f1506c) && Objects.equals(this.f1507d, bVar.f1507d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1504a), this.f1505b, this.f1506c, this.f1507d, Boolean.valueOf(this.f1508e));
    }
}
