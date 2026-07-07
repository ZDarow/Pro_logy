package L1;

import O1.s;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: l, reason: collision with root package name */
    public AlertDialog f1058l;

    /* renamed from: m, reason: collision with root package name */
    public DialogInterface.OnCancelListener f1059m;

    /* renamed from: n, reason: collision with root package name */
    public AlertDialog f1060n;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1059m;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f1058l;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f1060n == null) {
            Activity activity = getActivity();
            s.d(activity);
            this.f1060n = new AlertDialog.Builder(activity).create();
        }
        return this.f1060n;
    }
}
