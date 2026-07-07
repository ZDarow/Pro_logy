package L2;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1095b;

    public n(Object obj, String str) {
        this.f1094a = str;
        this.f1095b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f1095b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public final Object b() {
        return this.f1095b;
    }

    public final boolean c(String str) {
        Object obj = this.f1095b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
