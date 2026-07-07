package p064Q;

/* renamed from: Q.i */
/* loaded from: classes.dex */
public abstract class AbstractC0537i {

    /* renamed from: a */
    public final java.io.Serializable f1581a;

    /* renamed from: b */
    public java.lang.Object f1582b;

    /* renamed from: c */
    public java.lang.Object f1583c;

    /* renamed from: d */
    public final java.lang.Object f1584d;

    public AbstractC0537i(p064Q.AbstractC0537i abstractC0537i, java.lang.String str, java.lang.String str2) {
        this.f1583c = abstractC0537i;
        this.f1581a = str;
        this.f1582b = str2;
        this.f1584d = new java.util.LinkedList();
    }

    /* renamed from: h */
    public static int m1039h(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return java.lang.Integer.parseInt(attributeValue);
        } catch (java.lang.NumberFormatException e4) {
            throw p076T.C0666I.m1203b(null, e4);
        }
    }

    /* renamed from: i */
    public static long m1040i(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, long j4) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j4;
        }
        try {
            return java.lang.Long.parseLong(attributeValue);
        } catch (java.lang.NumberFormatException e4) {
            throw p076T.C0666I.m1203b(null, e4);
        }
    }

    /* renamed from: j */
    public static int m1041j(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new p021E0.C0192d(str, 1);
        }
        try {
            return java.lang.Integer.parseInt(attributeValue);
        } catch (java.lang.NumberFormatException e4) {
            throw p076T.C0666I.m1203b(null, e4);
        }
    }

    /* renamed from: a */
    public void mo1042a(java.lang.Object obj) {
    }

    /* renamed from: b */
    public abstract java.lang.Object mo1043b();

    /* renamed from: c */
    public java.lang.Object m1044c(java.lang.String str) {
        int i4 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) this.f1584d;
            if (i4 >= linkedList.size()) {
                p064Q.AbstractC0537i abstractC0537i = (p064Q.AbstractC0537i) this.f1583c;
                if (abstractC0537i == null) {
                    return null;
                }
                return abstractC0537i.m1044c(str);
            }
            android.util.Pair pair = (android.util.Pair) linkedList.get(i4);
            if (((java.lang.String) pair.first).equals(str)) {
                return pair.second;
            }
            i4++;
        }
    }

    /* renamed from: d */
    public boolean mo1045d(java.lang.String str) {
        return false;
    }

    /* renamed from: e */
    public void mo1046e(java.lang.String str, android.os.Bundle bundle) {
        ((p064Q.C0538j) this.f1582b).notifyChildrenChanged(str);
    }

    /* renamed from: f */
    public java.lang.Object m1047f(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            p064Q.AbstractC0537i abstractC0537i = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (((java.lang.String) this.f1582b).equals(name)) {
                    mo1049k(xmlPullParser);
                    z4 = true;
                } else if (z4) {
                    if (i4 > 0) {
                        i4++;
                    } else if (mo1045d(name)) {
                        mo1049k(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name);
                        java.lang.String str = (java.lang.String) this.f1581a;
                        if (equals) {
                            abstractC0537i = new p064Q.AbstractC0537i(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            abstractC0537i = new p064Q.AbstractC0537i(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            abstractC0537i = new p175p0.C1948g(this, str);
                        }
                        if (abstractC0537i == null) {
                            i4 = 1;
                        } else {
                            mo1042a(abstractC0537i.m1047f(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z4 && i4 == 0) {
                    mo1050l(xmlPullParser);
                }
            } else if (!z4) {
                continue;
            } else if (i4 > 0) {
                i4--;
            } else {
                java.lang.String name2 = xmlPullParser.getName();
                mo1048g(xmlPullParser);
                if (!mo1045d(name2)) {
                    return mo1043b();
                }
            }
            xmlPullParser.next();
        }
    }

    /* renamed from: g */
    public void mo1048g(org.xmlpull.v1.XmlPullParser xmlPullParser) {
    }

    /* renamed from: k */
    public abstract void mo1049k(org.xmlpull.v1.XmlPullParser xmlPullParser);

    /* renamed from: l */
    public void mo1050l(org.xmlpull.v1.XmlPullParser xmlPullParser) {
    }

    /* renamed from: m */
    public void m1051m(java.lang.Object obj, java.lang.String str) {
        ((java.util.LinkedList) this.f1584d).add(android.util.Pair.create(str, obj));
    }

    public AbstractC0537i(p064Q.AbstractServiceC0548t abstractServiceC0548t) {
        this.f1584d = abstractServiceC0548t;
        this.f1581a = new java.util.ArrayList();
    }
}
