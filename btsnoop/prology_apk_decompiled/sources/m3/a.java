package m3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import k3.h;

/* loaded from: classes.dex */
public final class a extends l3.a {
    @Override // l3.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
