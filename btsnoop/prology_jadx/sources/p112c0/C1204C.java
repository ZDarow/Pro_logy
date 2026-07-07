package p112c0;

/* renamed from: c0.C */
/* loaded from: classes.dex */
public final class C1204C {

    /* renamed from: a */
    public final p076T.C0702p f4631a;

    /* renamed from: b */
    public final int f4632b;

    /* renamed from: c */
    public final int f4633c;

    /* renamed from: d */
    public final int f4634d;

    /* renamed from: e */
    public final int f4635e;

    /* renamed from: f */
    public final int f4636f;

    /* renamed from: g */
    public final int f4637g;

    /* renamed from: h */
    public final int f4638h;

    /* renamed from: i */
    public final p079U.C0740a f4639i;

    /* renamed from: j */
    public final boolean f4640j;

    /* renamed from: k */
    public final boolean f4641k;

    /* renamed from: l */
    public final boolean f4642l;

    public C1204C(p076T.C0702p c0702p, int i4, int i5, int i6, int i7, int i8, int i9, int i10, p079U.C0740a c0740a, boolean z4, boolean z5, boolean z6) {
        this.f4631a = c0702p;
        this.f4632b = i4;
        this.f4633c = i5;
        this.f4634d = i6;
        this.f4635e = i7;
        this.f4636f = i8;
        this.f4637g = i9;
        this.f4638h = i10;
        this.f4639i = c0740a;
        this.f4640j = z4;
        this.f4641k = z5;
        this.f4642l = z6;
    }

    /* renamed from: c */
    public static android.media.AudioAttributes m2841c(p076T.C0691e c0691e, boolean z4) {
        return z4 ? new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (android.media.AudioAttributes) c0691e.m1269a().f1048m;
    }

    /* renamed from: a */
    public final android.media.AudioTrack m2842a(p076T.C0691e c0691e, int i4) {
        int i5 = this.f4633c;
        try {
            android.media.AudioTrack m2843b = m2843b(c0691e, i4);
            int state = m2843b.getState();
            if (state == 1) {
                return m2843b;
            }
            try {
                m2843b.release();
            } catch (java.lang.Exception unused) {
            }
            throw new p112c0.C1234p(state, this.f4635e, this.f4636f, this.f4638h, this.f4631a, i5 == 1, null);
        } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e4) {
            throw new p112c0.C1234p(0, this.f4635e, this.f4636f, this.f4638h, this.f4631a, i5 == 1, e4);
        }
    }

    /* renamed from: b */
    public final android.media.AudioTrack m2843b(p076T.C0691e c0691e, int i4) {
        char c4;
        android.media.AudioTrack.Builder offloadedPlayback;
        int i5 = p086W.AbstractC0805y.f2801a;
        char c5 = 0;
        boolean z4 = this.f4642l;
        int i6 = this.f4635e;
        int i7 = this.f4637g;
        int i8 = this.f4636f;
        if (i5 >= 29) {
            offloadedPlayback = new android.media.AudioTrack.Builder().setAudioAttributes(m2841c(c0691e, z4)).setAudioFormat(p086W.AbstractC0805y.m1623r(i6, i8, i7)).setTransferMode(1).setBufferSizeInBytes(this.f4638h).setSessionId(i4).setOffloadedPlayback(this.f4633c == 1);
            return offloadedPlayback.build();
        }
        if (i5 >= 21) {
            return new android.media.AudioTrack(m2841c(c0691e, z4), p086W.AbstractC0805y.m1623r(i6, i8, i7), this.f4638h, 1, i4);
        }
        int i9 = c0691e.f2318c;
        if (i9 != 13) {
            switch (i9) {
                case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                    break;
                case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                    c4 = '\b';
                    break;
                case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                    c4 = 4;
                    break;
                case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                case 10:
                    c4 = 5;
                    break;
                case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
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
            return new android.media.AudioTrack(c5, this.f4635e, this.f4636f, this.f4637g, this.f4638h, 1);
        }
        return new android.media.AudioTrack(c5, this.f4635e, this.f4636f, this.f4637g, this.f4638h, 1, i4);
    }
}
