package G;

import B2.AbstractC0007h;
import B2.s;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import j.h0;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* renamed from: l, reason: collision with root package name */
    public boolean f652l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f653m;

    /* renamed from: n, reason: collision with root package name */
    public Cursor f654n;

    /* renamed from: o, reason: collision with root package name */
    public int f655o;

    /* renamed from: p, reason: collision with root package name */
    public s f656p;

    /* renamed from: q, reason: collision with root package name */
    public a f657q;

    /* renamed from: r, reason: collision with root package name */
    public c f658r;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f654n;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                s sVar = this.f656p;
                if (sVar != null) {
                    cursor2.unregisterContentObserver(sVar);
                }
                a aVar = this.f657q;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f654n = cursor;
            if (cursor != null) {
                s sVar2 = this.f656p;
                if (sVar2 != null) {
                    cursor.registerContentObserver(sVar2);
                }
                a aVar2 = this.f657q;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.f655o = cursor.getColumnIndexOrThrow("_id");
                this.f652l = true;
                notifyDataSetChanged();
            } else {
                this.f655o = -1;
                this.f652l = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f652l || (cursor = this.f654n) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f652l) {
            return null;
        }
        this.f654n.moveToPosition(i4);
        if (view == null) {
            h0 h0Var = (h0) this;
            view = h0Var.f6669u.inflate(h0Var.f6668t, viewGroup, false);
        }
        a(view, this.f654n);
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, G.c] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f658r == null) {
            ?? filter = new Filter();
            filter.f659a = this;
            this.f658r = filter;
        }
        return this.f658r;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        Cursor cursor;
        if (!this.f652l || (cursor = this.f654n) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f654n;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        Cursor cursor;
        if (this.f652l && (cursor = this.f654n) != null && cursor.moveToPosition(i4)) {
            return this.f654n.getLong(this.f655o);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f652l) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f654n.moveToPosition(i4)) {
            throw new IllegalStateException(AbstractC0007h.k("couldn't move cursor to position ", i4));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f654n);
        return view;
    }
}
