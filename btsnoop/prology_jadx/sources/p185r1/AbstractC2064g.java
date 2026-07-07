package p185r1;

/* renamed from: r1.g */
/* loaded from: classes.dex */
public abstract class AbstractC2064g {
    /* renamed from: b */
    public static java.lang.String m4124b(java.lang.Object obj, java.lang.String str) {
        p154k3.AbstractC1803h.m3779e(obj, "value");
        return str + " value: " + obj;
    }

    /* renamed from: c */
    public static p185r1.C2066i m4125c(java.lang.String str) {
        java.lang.String group;
        if (str != null && !p182q3.AbstractC2032i.m4078l0(str)) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = java.lang.Integer.parseInt(group);
                java.lang.String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = java.lang.Integer.parseInt(group2);
                    java.lang.String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = java.lang.Integer.parseInt(group3);
                        java.lang.String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                        p154k3.AbstractC1803h.m3778d(group4, "description");
                        return new p185r1.C2066i(parseInt, parseInt2, parseInt3, group4);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public abstract java.lang.Object mo4122a();

    /* renamed from: d */
    public abstract p185r1.AbstractC2064g mo4123d(java.lang.String str, p149j3.InterfaceC1737l interfaceC1737l);
}
