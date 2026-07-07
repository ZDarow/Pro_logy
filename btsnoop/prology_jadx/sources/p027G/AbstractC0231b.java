package p027G;

/* renamed from: G.b */
/* loaded from: classes.dex */
public abstract class AbstractC0231b extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: l */
    public boolean f662l;

    /* renamed from: m */
    public boolean f663m;

    /* renamed from: n */
    public android.database.Cursor f664n;

    /* renamed from: o */
    public int f665o;

    /* renamed from: p */
    public p009B2.C0062s f666p;

    /* renamed from: q */
    public p027G.C0230a f667q;

    /* renamed from: r */
    public p027G.C0232c f668r;

    /* renamed from: a */
    public abstract void mo612a(android.view.View view, android.database.Cursor cursor);

    /* renamed from: b */
    public void mo613b(android.database.Cursor cursor) {
        android.database.Cursor cursor2 = this.f664n;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                p009B2.C0062s c0062s = this.f666p;
                if (c0062s != null) {
                    cursor2.unregisterContentObserver(c0062s);
                }
                p027G.C0230a c0230a = this.f667q;
                if (c0230a != null) {
                    cursor2.unregisterDataSetObserver(c0230a);
                }
            }
            this.f664n = cursor;
            if (cursor != null) {
                p009B2.C0062s c0062s2 = this.f666p;
                if (c0062s2 != null) {
                    cursor.registerContentObserver(c0062s2);
                }
                p027G.C0230a c0230a2 = this.f667q;
                if (c0230a2 != null) {
                    cursor.registerDataSetObserver(c0230a2);
                }
                this.f665o = cursor.getColumnIndexOrThrow("_id");
                this.f662l = true;
                notifyDataSetChanged();
            } else {
                this.f665o = -1;
                this.f662l = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract java.lang.String mo614c(android.database.Cursor cursor);

    /* renamed from: d */
    public abstract android.view.View mo615d(android.view.ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        android.database.Cursor cursor;
        if (!this.f662l || (cursor = this.f664n) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i4, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f662l) {
            return null;
        }
        this.f664n.moveToPosition(i4);
        if (view == null) {
            p145j.ViewOnClickListenerC1662h0 viewOnClickListenerC1662h0 = (p145j.ViewOnClickListenerC1662h0) this;
            view = viewOnClickListenerC1662h0.f6924u.inflate(viewOnClickListenerC1662h0.f6923t, viewGroup, false);
        }
        mo612a(view, this.f664n);
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, G.c] */
    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
        if (this.f668r == null) {
            ?? filter = new android.widget.Filter();
            filter.f669a = this;
            this.f668r = filter;
        }
        return this.f668r;
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i4) {
        android.database.Cursor cursor;
        if (!this.f662l || (cursor = this.f664n) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f664n;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        android.database.Cursor cursor;
        if (this.f662l && (cursor = this.f664n) != null && cursor.moveToPosition(i4)) {
            return this.f664n.getLong(this.f665o);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i4, android.view.View view, android.view.ViewGroup viewGroup) {
        if (!this.f662l) {
            throw new java.lang.IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f664n.moveToPosition(i4)) {
            throw new java.lang.IllegalStateException(p009B2.AbstractC0051h.m152k("couldn't move cursor to position ", i4));
        }
        if (view == null) {
            view = mo615d(viewGroup);
        }
        mo612a(view, this.f664n);
        return view;
    }
}
