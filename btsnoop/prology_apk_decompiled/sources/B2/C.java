package B2;

import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f114a;

    public C() {
        this.f114a = 0;
    }

    public Character a(int i4) {
        char c4 = (char) i4;
        if ((Integer.MIN_VALUE & i4) != 0) {
            int i5 = i4 & Integer.MAX_VALUE;
            int i6 = this.f114a;
            if (i6 != 0) {
                this.f114a = KeyCharacterMap.getDeadChar(i6, i5);
            } else {
                this.f114a = i5;
            }
        } else {
            int i7 = this.f114a;
            if (i7 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i7, i4);
                if (deadChar > 0) {
                    c4 = (char) deadChar;
                }
                this.f114a = 0;
            }
        }
        return Character.valueOf(c4);
    }

    public C(int i4) {
        this.f114a = i4;
    }
}
