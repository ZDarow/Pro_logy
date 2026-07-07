package p009B2;

/* renamed from: B2.C */
/* loaded from: classes.dex */
public final class C0032C {

    /* renamed from: a */
    public int f117a;

    public C0032C() {
        this.f117a = 0;
    }

    /* renamed from: a */
    public java.lang.Character m117a(int i4) {
        char c4 = (char) i4;
        if ((Integer.MIN_VALUE & i4) != 0) {
            int i5 = i4 & Integer.MAX_VALUE;
            int i6 = this.f117a;
            if (i6 != 0) {
                this.f117a = android.view.KeyCharacterMap.getDeadChar(i6, i5);
            } else {
                this.f117a = i5;
            }
        } else {
            int i7 = this.f117a;
            if (i7 != 0) {
                int deadChar = android.view.KeyCharacterMap.getDeadChar(i7, i4);
                if (deadChar > 0) {
                    c4 = (char) deadChar;
                }
                this.f117a = 0;
            }
        }
        return java.lang.Character.valueOf(c4);
    }

    public C0032C(int i4) {
        this.f117a = i4;
    }
}
