package c0;

import T.C0084e;
import T.C0095p;
import android.media.AudioAttributes;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final C0095p f4470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4474e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4475f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4476g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4477h;

    /* renamed from: i, reason: collision with root package name */
    public final U.a f4478i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4479j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4480k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4481l;

    public C(C0095p c0095p, int i4, int i5, int i6, int i7, int i8, int i9, int i10, U.a aVar, boolean z4, boolean z5, boolean z6) {
        this.f4470a = c0095p;
        this.f4471b = i4;
        this.f4472c = i5;
        this.f4473d = i6;
        this.f4474e = i7;
        this.f4475f = i8;
        this.f4476g = i9;
        this.f4477h = i10;
        this.f4478i = aVar;
        this.f4479j = z4;
        this.f4480k = z5;
        this.f4481l = z6;
    }

    public static AudioAttributes c(C0084e c0084e, boolean z4) {
        return z4 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c0084e.a().f1009m;
    }

    public final AudioTrack a(C0084e c0084e, int i4) {
        int i5 = this.f4472c;
        try {
            AudioTrack b4 = b(c0084e, i4);
            int state = b4.getState();
            if (state == 1) {
                return b4;
            }
            try {
                b4.release();
            } catch (Exception unused) {
            }
            throw new C0217p(state, this.f4474e, this.f4475f, this.f4477h, this.f4470a, i5 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e4) {
            throw new C0217p(0, this.f4474e, this.f4475f, this.f4477h, this.f4470a, i5 == 1, e4);
        }
    }

    public final AudioTrack b(C0084e c0084e, int i4) {
        char c4;
        AudioTrack.Builder offloadedPlayback;
        int i5 = W.y.f2709a;
        char c5 = 0;
        boolean z4 = this.f4481l;
        int i6 = this.f4474e;
        int i7 = this.f4476g;
        int i8 = this.f4475f;
        if (i5 >= 29) {
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(c(c0084e, z4)).setAudioFormat(W.y.r(i6, i8, i7)).setTransferMode(1).setBufferSizeInBytes(this.f4477h).setSessionId(i4).setOffloadedPlayback(this.f4472c == 1);
            return offloadedPlayback.build();
        }
        if (i5 >= 21) {
            return new AudioTrack(c(c0084e, z4), W.y.r(i6, i8, i7), this.f4477h, 1, i4);
        }
        int i9 = c0084e.f2238c;
        if (i9 != 13) {
            switch (i9) {
                case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                    break;
                case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                    c4 = '\b';
                    break;
                case L.k.LONG_FIELD_NUMBER /* 4 */:
                    c4 = 4;
                    break;
                case L.k.STRING_FIELD_NUMBER /* 5 */:
                case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                case L.k.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                    c4 = 5;
                    break;
                case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    c4 = 2;
                    break;
                default:
                    c4 = 3;
                    break;
            }
            c5 = c4;
        } else {
            c5 = 1;
        }
        if (i4 == 0) {
            return new AudioTrack(c5, this.f4474e, this.f4475f, this.f4476g, this.f4477h, 1);
        }
        return new AudioTrack(c5, this.f4474e, this.f4475f, this.f4476g, this.f4477h, 1, i4);
    }
}
