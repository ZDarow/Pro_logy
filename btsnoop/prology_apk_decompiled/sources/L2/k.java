package L2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1092a = new Object();

    @Override // L2.m
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            w.f1101b.getClass();
            JSONTokener jSONTokener = new JSONTokener(w.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // L2.m
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object M3 = U1.a.M(obj);
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
