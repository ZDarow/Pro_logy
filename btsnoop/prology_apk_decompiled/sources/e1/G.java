package e1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public int f5140a;

    /* renamed from: b, reason: collision with root package name */
    public int f5141b;

    /* renamed from: c, reason: collision with root package name */
    public int f5142c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f5143d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5144e;

    public G(int i4, int i5) {
        this(Integer.MIN_VALUE, i4, i5);
    }

    public void a() {
        int i4 = this.f5142c;
        this.f5142c = i4 == Integer.MIN_VALUE ? this.f5140a : i4 + this.f5141b;
        this.f5144e = ((String) this.f5143d) + this.f5142c;
    }

    public int b(int i4) {
        int i5 = this.f5141b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (((ArrayList) this.f5143d).size() == 0) {
            return i4;
        }
        View view = (View) ((ArrayList) this.f5143d).get(r3.size() - 1);
        k1.F f4 = (k1.F) view.getLayoutParams();
        this.f5141b = ((StaggeredGridLayoutManager) this.f5144e).f4306j.d(view);
        f4.getClass();
        return this.f5141b;
    }

    public void c() {
        if (this.f5142c == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public G(int i4, int i5, int i6) {
        String str;
        if (i4 != Integer.MIN_VALUE) {
            str = i4 + "/";
        } else {
            str = "";
        }
        this.f5143d = str;
        this.f5140a = i5;
        this.f5141b = i6;
        this.f5142c = Integer.MIN_VALUE;
        this.f5144e = "";
    }

    public G(StaggeredGridLayoutManager staggeredGridLayoutManager, int i4) {
        this.f5144e = staggeredGridLayoutManager;
        this.f5143d = new ArrayList();
        this.f5140a = Integer.MIN_VALUE;
        this.f5141b = Integer.MIN_VALUE;
        this.f5142c = i4;
    }
}
