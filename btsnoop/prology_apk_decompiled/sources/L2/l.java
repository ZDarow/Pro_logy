package L2;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class l implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final l f1093a = new Object();

    @Override // L2.q
    public ByteBuffer a(n nVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", nVar.f1094a);
            jSONObject.put("args", U1.a.M(nVar.f1095b));
            Object M3 = U1.a.M(jSONObject);
            if (M3 instanceof String) {
                w wVar = w.f1101b;
                String quote = JSONObject.quote((String) M3);
                wVar.getClass();
                return w.d(quote);
            }
            w wVar2 = w.f1101b;
            String obj = M3.toString();
            wVar2.getClass();
            return w.d(obj);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // L2.q
    public ByteBuffer b(Object obj) {
        JSONArray put = new JSONArray().put(U1.a.M(obj));
        if (put == null) {
            return null;
        }
        Object M3 = U1.a.M(put);
        if (M3 instanceof String) {
            w wVar = w.f1101b;
            String quote = JSONObject.quote((String) M3);
            wVar.getClass();
            return w.d(quote);
        }
        w wVar2 = w.f1101b;
        String obj2 = M3.toString();
        wVar2.getClass();
        return w.d(obj2);
    }

    @Override // L2.q
    public n c(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    w.f1101b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(w.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e4) {
                    throw new IllegalArgumentException("Invalid JSON", e4);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj2 = jSONObject.get("method");
                Object opt = jSONObject.opt("args");
                if (opt != JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof String) {
                    return new n(obj, (String) obj2);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // L2.q
    public Object d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    w.f1101b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(w.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e4) {
                    throw new IllegalArgumentException("Invalid JSON", e4);
                }
            } catch (JSONException e5) {
                throw new IllegalArgumentException("Invalid JSON", e5);
            }
        }
        if (nextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) nextValue;
            if (jSONArray.length() == 1) {
                Object opt = jSONArray.opt(0);
                if (opt == JSONObject.NULL) {
                    return null;
                }
                return opt;
            }
            if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object opt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (opt2 == obj3) {
                    opt2 = null;
                }
                Object opt3 = jSONArray.opt(2);
                if (opt3 != obj3) {
                    obj = opt3;
                }
                if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                    throw new j((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // L2.q
    public ByteBuffer e(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(U1.a.M(str)).put(JSONObject.NULL).put(U1.a.M(str2));
        if (put == null) {
            return null;
        }
        Object M3 = U1.a.M(put);
        if (M3 instanceof String) {
            w wVar = w.f1101b;
            String quote = JSONObject.quote((String) M3);
            wVar.getClass();
            return w.d(quote);
        }
        w wVar2 = w.f1101b;
        String obj = M3.toString();
        wVar2.getClass();
        return w.d(obj);
    }

    @Override // L2.q
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(U1.a.M(str2)).put(U1.a.M(obj));
        if (put == null) {
            return null;
        }
        Object M3 = U1.a.M(put);
        if (M3 instanceof String) {
            w wVar = w.f1101b;
            String quote = JSONObject.quote((String) M3);
            wVar.getClass();
            return w.d(quote);
        }
        w wVar2 = w.f1101b;
        String obj2 = M3.toString();
        wVar2.getClass();
        return w.d(obj2);
    }
}
