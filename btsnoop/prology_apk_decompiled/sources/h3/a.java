package h3;

import java.io.File;
import k3.h;
import q3.i;

/* loaded from: classes.dex */
public abstract class a extends U1.a {
    public static String Q(File file) {
        h.e(file, "<this>");
        String name = file.getName();
        h.d(name, "getName(...)");
        int lastIndexOf = name.lastIndexOf(46, i.h0(name));
        if (lastIndexOf == -1) {
            return "";
        }
        String substring = name.substring(lastIndexOf + 1, name.length());
        h.d(substring, "substring(...)");
        return substring;
    }
}
