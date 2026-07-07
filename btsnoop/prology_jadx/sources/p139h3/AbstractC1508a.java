package p139h3;

/* renamed from: h3.a */
/* loaded from: classes.dex */
public abstract class AbstractC1508a extends p080U1.AbstractC0748a {
    /* renamed from: Q */
    public static java.lang.String m3334Q(java.io.File file) {
        p154k3.AbstractC1803h.m3779e(file, "<this>");
        java.lang.String name = file.getName();
        p154k3.AbstractC1803h.m3778d(name, "getName(...)");
        int lastIndexOf = name.lastIndexOf(46, p182q3.AbstractC2032i.m4074h0(name));
        if (lastIndexOf == -1) {
            return "";
        }
        java.lang.String substring = name.substring(lastIndexOf + 1, name.length());
        p154k3.AbstractC1803h.m3778d(substring, "substring(...)");
        return substring;
    }
}
