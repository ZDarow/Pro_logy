package p047L2;

/* renamed from: L2.l */
/* loaded from: classes.dex */
public final class C0382l implements p047L2.InterfaceC0387q {

    /* renamed from: a */
    public static final p047L2.C0382l f1132a = new java.lang.Object();

    @Override // p047L2.InterfaceC0387q
    /* renamed from: a */
    public java.nio.ByteBuffer mo833a(p047L2.C0384n c0384n) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("method", c0384n.f1133a);
            jSONObject.put("args", p080U1.AbstractC0748a.m1365M(c0384n.f1134b));
            java.lang.Object m1365M = p080U1.AbstractC0748a.m1365M(jSONObject);
            if (m1365M instanceof java.lang.String) {
                p047L2.C0393w c0393w = p047L2.C0393w.f1140b;
                java.lang.String quote = org.json.JSONObject.quote((java.lang.String) m1365M);
                c0393w.getClass();
                return p047L2.C0393w.m853d(quote);
            }
            p047L2.C0393w c0393w2 = p047L2.C0393w.f1140b;
            java.lang.String obj = m1365M.toString();
            c0393w2.getClass();
            return p047L2.C0393w.m853d(obj);
        } catch (org.json.JSONException e4) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // p047L2.InterfaceC0387q
    /* renamed from: b */
    public java.nio.ByteBuffer mo834b(java.lang.Object obj) {
        org.json.JSONArray put = new org.json.JSONArray().put(p080U1.AbstractC0748a.m1365M(obj));
        if (put == null) {
            return null;
        }
        java.lang.Object m1365M = p080U1.AbstractC0748a.m1365M(put);
        if (m1365M instanceof java.lang.String) {
            p047L2.C0393w c0393w = p047L2.C0393w.f1140b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) m1365M);
            c0393w.getClass();
            return p047L2.C0393w.m853d(quote);
        }
        p047L2.C0393w c0393w2 = p047L2.C0393w.f1140b;
        java.lang.String obj2 = m1365M.toString();
        c0393w2.getClass();
        return p047L2.C0393w.m853d(obj2);
    }

    @Override // p047L2.InterfaceC0387q
    /* renamed from: c */
    public p047L2.C0384n mo835c(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object nextValue;
        java.lang.Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    p047L2.C0393w.f1140b.getClass();
                    org.json.JSONTokener jSONTokener = new org.json.JSONTokener(p047L2.C0393w.m852c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new java.lang.IllegalArgumentException("Invalid JSON");
                    }
                } catch (org.json.JSONException e4) {
                    throw new java.lang.IllegalArgumentException("Invalid JSON", e4);
                }
            }
            if (nextValue instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) nextValue;
                java.lang.Object obj2 = jSONObject.get("method");
                java.lang.Object opt = jSONObject.opt("args");
                if (opt != org.json.JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof java.lang.String) {
                    return new p047L2.C0384n(obj, (java.lang.String) obj2);
                }
            }
            throw new java.lang.IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (org.json.JSONException e5) {
            throw new java.lang.IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // p047L2.InterfaceC0387q
    /* renamed from: d */
    public java.lang.Object mo836d(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object nextValue;
        java.lang.Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    p047L2.C0393w.f1140b.getClass();
                    org.json.JSONTokener jSONTokener = new org.json.JSONTokener(p047L2.C0393w.m852c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new java.lang.IllegalArgumentException("Invalid JSON");
                    }
                } catch (org.json.JSONException e4) {
                    throw new java.lang.IllegalArgumentException("Invalid JSON", e4);
                }
            } catch (org.json.JSONException e5) {
                throw new java.lang.IllegalArgumentException("Invalid JSON", e5);
            }
        }
        if (nextValue instanceof org.json.JSONArray) {
            org.json.JSONArray jSONArray = (org.json.JSONArray) nextValue;
            if (jSONArray.length() == 1) {
                java.lang.Object opt = jSONArray.opt(0);
                if (opt == org.json.JSONObject.NULL) {
                    return null;
                }
                return opt;
            }
            if (jSONArray.length() == 3) {
                java.lang.Object obj2 = jSONArray.get(0);
                java.lang.Object opt2 = jSONArray.opt(1);
                java.lang.Object obj3 = org.json.JSONObject.NULL;
                if (opt2 == obj3) {
                    opt2 = null;
                }
                java.lang.Object opt3 = jSONArray.opt(2);
                if (opt3 != obj3) {
                    obj = opt3;
                }
                if ((obj2 instanceof java.lang.String) && (opt2 == null || (opt2 instanceof java.lang.String))) {
                    throw new p047L2.C0380j((java.lang.String) obj2, (java.lang.String) opt2, obj);
                }
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // p047L2.InterfaceC0387q
    /* renamed from: e */
    public java.nio.ByteBuffer mo837e(java.lang.String str, java.lang.String str2) {
        org.json.JSONArray put = new org.json.JSONArray().put("error").put(p080U1.AbstractC0748a.m1365M(str)).put(org.json.JSONObject.NULL).put(p080U1.AbstractC0748a.m1365M(str2));
        if (put == null) {
            return null;
        }
        java.lang.Object m1365M = p080U1.AbstractC0748a.m1365M(put);
        if (m1365M instanceof java.lang.String) {
            p047L2.C0393w c0393w = p047L2.C0393w.f1140b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) m1365M);
            c0393w.getClass();
            return p047L2.C0393w.m853d(quote);
        }
        p047L2.C0393w c0393w2 = p047L2.C0393w.f1140b;
        java.lang.String obj = m1365M.toString();
        c0393w2.getClass();
        return p047L2.C0393w.m853d(obj);
    }

    @Override // p047L2.InterfaceC0387q
    /* renamed from: f */
    public java.nio.ByteBuffer mo838f(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        org.json.JSONArray put = new org.json.JSONArray().put(str).put(p080U1.AbstractC0748a.m1365M(str2)).put(p080U1.AbstractC0748a.m1365M(obj));
        if (put == null) {
            return null;
        }
        java.lang.Object m1365M = p080U1.AbstractC0748a.m1365M(put);
        if (m1365M instanceof java.lang.String) {
            p047L2.C0393w c0393w = p047L2.C0393w.f1140b;
            java.lang.String quote = org.json.JSONObject.quote((java.lang.String) m1365M);
            c0393w.getClass();
            return p047L2.C0393w.m853d(quote);
        }
        p047L2.C0393w c0393w2 = p047L2.C0393w.f1140b;
        java.lang.String obj2 = m1365M.toString();
        c0393w2.getClass();
        return p047L2.C0393w.m853d(obj2);
    }
}
