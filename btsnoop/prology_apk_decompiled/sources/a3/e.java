package a3;

import java.util.Arrays;
import java.util.List;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0462a {
    public static List d0(Object... objArr) {
        k3.h.e(objArr, "elements");
        if (objArr.length <= 0) {
            return l.f3631l;
        }
        List asList = Arrays.asList(objArr);
        k3.h.d(asList, "asList(...)");
        return asList;
    }
}
