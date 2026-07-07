package Q;

import T.I;
import android.os.Bundle;
import android.util.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f1530a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1531b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1532c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1533d;

    public i(i iVar, String str, String str2) {
        this.f1532c = iVar;
        this.f1530a = str;
        this.f1531b = str2;
        this.f1533d = new LinkedList();
    }

    public static int h(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e4) {
            throw I.b(null, e4);
        }
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j4) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j4;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e4) {
            throw I.b(null, e4);
        }
    }

    public static int j(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new E0.d(str, 1);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e4) {
            throw I.b(null, e4);
        }
    }

    public void a(Object obj) {
    }

    public abstract Object b();

    public Object c(String str) {
        int i4 = 0;
        while (true) {
            LinkedList linkedList = (LinkedList) this.f1533d;
            if (i4 >= linkedList.size()) {
                i iVar = (i) this.f1532c;
                if (iVar == null) {
                    return null;
                }
                return iVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i4);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i4++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public void e(String str, Bundle bundle) {
        ((j) this.f1531b).notifyChildrenChanged(str);
    }

    public Object f(XmlPullParser xmlPullParser) {
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            i iVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (((String) this.f1531b).equals(name)) {
                    k(xmlPullParser);
                    z4 = true;
                } else if (z4) {
                    if (i4 > 0) {
                        i4++;
                    } else if (d(name)) {
                        k(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name);
                        String str = (String) this.f1530a;
                        if (equals) {
                            iVar = new i(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            iVar = new i(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            iVar = new p0.g(this, str);
                        }
                        if (iVar == null) {
                            i4 = 1;
                        } else {
                            a(iVar.f(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z4 && i4 == 0) {
                    l(xmlPullParser);
                }
            } else if (!z4) {
                continue;
            } else if (i4 > 0) {
                i4--;
            } else {
                String name2 = xmlPullParser.getName();
                g(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public void g(XmlPullParser xmlPullParser) {
    }

    public abstract void k(XmlPullParser xmlPullParser);

    public void l(XmlPullParser xmlPullParser) {
    }

    public void m(Object obj, String str) {
        ((LinkedList) this.f1533d).add(Pair.create(str, obj));
    }

    public i(t tVar) {
        this.f1533d = tVar;
        this.f1530a = new ArrayList();
    }
}
