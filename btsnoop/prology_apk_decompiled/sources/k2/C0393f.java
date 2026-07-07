package k2;

import B2.AbstractC0007h;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

/* renamed from: k2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393f extends BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0395h f7060a;

    public C0393f(C0395h c0395h) {
        this.f7060a = c0395h;
    }

    public final boolean a(BluetoothGatt bluetoothGatt, int i4, String str) {
        C0395h c0395h = this.f7060a;
        if (i4 == 2) {
            if (c0395h.f7080u.get(str) == null && c0395h.f7083y.get(str) == null) {
                c0395h.C("[unexpected connection] disconnecting now", 5);
                c0395h.f7079t.remove(str);
                c0395h.f7081v.remove(str);
                c0395h.w.remove(str);
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
                return true;
            }
        } else if (i4 == 0 && c0395h.f7080u.get(str) == null && c0395h.f7079t.get(str) == null && c0395h.f7083y.get(str) == null) {
            c0395h.C("[unexpected connection] disconnect complete", 5);
            c0395h.f7081v.remove(str);
            c0395h.w.remove(str);
            bluetoothGatt.close();
            return true;
        }
        return false;
    }

    public final void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i4) {
        UUID uuid = bluetoothGattCharacteristic.getService().getUuid();
        C0395h c0395h = this.f7060a;
        c0395h.getClass();
        if (C0395h.E(uuid).equals("1801") && C0395h.E(bluetoothGattCharacteristic.getUuid()).toUpperCase().equals("2A05")) {
            c0395h.z("OnServicesReset", C0395h.o(bluetoothGatt.getDevice()));
        }
        BluetoothGattService w = C0395h.w(bluetoothGatt, bluetoothGattCharacteristic);
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        if (w != null) {
            hashMap.put("primary_service_uuid", C0395h.E(w.getUuid()));
        }
        hashMap.put("service_uuid", C0395h.E(bluetoothGattCharacteristic.getService().getUuid()));
        hashMap.put("characteristic_uuid", C0395h.E(bluetoothGattCharacteristic.getUuid()));
        hashMap.put("instance_id", Integer.valueOf(C0395h.u(bluetoothGattCharacteristic)));
        hashMap.put("value", bArr);
        AbstractC0007h.p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", C0395h.k(i4));
        c0395h.z("OnCharacteristicReceived", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        C0395h c0395h = this.f7060a;
        c0395h.C("onCharacteristicChanged:", 5);
        c0395h.C("  chr: " + C0395h.E(bluetoothGattCharacteristic.getUuid()), 5);
        b(bluetoothGatt, bluetoothGattCharacteristic, bArr, 0);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onCharacteristicRead:", i5);
        c0395h.C("  chr: " + C0395h.E(bluetoothGattCharacteristic.getUuid()), i5);
        c0395h.C("  status: " + C0395h.k(i4) + " (" + i4 + ")", i5);
        StringBuilder sb = new StringBuilder("  instanceId: ");
        sb.append(C0395h.u(bluetoothGattCharacteristic));
        c0395h.C(sb.toString(), i5);
        b(bluetoothGatt, bluetoothGattCharacteristic, bArr, i4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onCharacteristicWrite:", i5);
        c0395h.C("  chr: " + C0395h.E(bluetoothGattCharacteristic.getUuid()), i5);
        c0395h.C("  status: " + C0395h.k(i4) + " (" + i4 + ")", i5);
        BluetoothGattService w = C0395h.w(bluetoothGatt, bluetoothGattCharacteristic);
        String address = bluetoothGatt.getDevice().getAddress();
        String E3 = w != null ? C0395h.E(w.getUuid()) : "";
        String E4 = C0395h.E(bluetoothGattCharacteristic.getService().getUuid());
        String E5 = C0395h.E(bluetoothGattCharacteristic.getUuid());
        Integer valueOf = Integer.valueOf(C0395h.u(bluetoothGattCharacteristic));
        byte[] bArr = (byte[]) c0395h.f7084z.remove(address + ":" + E3 + ":" + E4 + ":" + E5 + ":" + valueOf);
        if (bArr == null) {
            bArr = new byte[0];
        }
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", address);
        if (w != null) {
            hashMap.put("primary_service_uuid", C0395h.E(w.getUuid()));
        }
        hashMap.put("service_uuid", E4);
        hashMap.put("characteristic_uuid", E5);
        hashMap.put("instance_id", valueOf);
        hashMap.put("value", bArr);
        AbstractC0007h.p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", C0395h.k(i4));
        c0395h.z("OnCharacteristicWritten", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i4, int i5) {
        String str;
        C0395h c0395h = this.f7060a;
        try {
            Semaphore semaphore = c0395h.s;
            int i6 = 0;
            boolean z4 = false;
            while (!z4) {
                try {
                    semaphore.acquire();
                    z4 = true;
                } catch (InterruptedException unused) {
                    c0395h.C("failed to acquire mutex, retrying", 2);
                }
            }
            StringBuilder sb = new StringBuilder("onConnectionStateChange:");
            if (i5 == 0) {
                str = "disconnected";
            } else if (i5 == 1) {
                str = "connecting";
            } else if (i5 == 2) {
                str = "connected";
            } else if (i5 != 3) {
                str = "UNKNOWN_CONNECTION_STATE (" + i5 + ")";
            } else {
                str = "disconnecting";
            }
            sb.append(str);
            c0395h.C(sb.toString(), 5);
            c0395h.C("  status: " + C0395h.l(i4), 5);
            Semaphore semaphore2 = c0395h.s;
            if (i5 != 2 && i5 != 0) {
                semaphore2.release();
                return;
            }
            String address = bluetoothGatt.getDevice().getAddress();
            if (a(bluetoothGatt, i5, address)) {
                semaphore2.release();
                return;
            }
            ConcurrentHashMap concurrentHashMap = c0395h.f7080u;
            ConcurrentHashMap concurrentHashMap2 = c0395h.f7079t;
            if (i5 == 2) {
                concurrentHashMap2.put(address, bluetoothGatt);
                concurrentHashMap.remove(address);
                c0395h.f7082x.put(address, 23);
            }
            if (i5 == 0) {
                concurrentHashMap2.remove(address);
                concurrentHashMap.remove(address);
                c0395h.f7081v.remove(address);
                c0395h.w.remove(address);
                if (c0395h.f7083y.containsKey(address)) {
                    c0395h.C("autoconnect is true. skipping gatt.close()", 5);
                } else {
                    bluetoothGatt.close();
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("remote_id", address);
            if (i5 == 2) {
                i6 = 1;
            }
            hashMap.put("connection_state", Integer.valueOf(i6));
            hashMap.put("disconnect_reason_code", Integer.valueOf(i4));
            hashMap.put("disconnect_reason_string", C0395h.l(i4));
            c0395h.z("OnConnectionStateChanged", hashMap);
            semaphore2.release();
        } catch (Throwable th) {
            c0395h.s.release();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i4, byte[] bArr) {
        int i5 = i4 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onDescriptorRead:", i5);
        c0395h.C("  chr: " + C0395h.E(bluetoothGattDescriptor.getCharacteristic().getUuid()), i5);
        c0395h.C("  desc: " + C0395h.E(bluetoothGattDescriptor.getUuid()), i5);
        c0395h.C("  status: " + C0395h.k(i4) + " (" + i4 + ")", i5);
        BluetoothGattService w = C0395h.w(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        if (w != null) {
            hashMap.put("primary_service_uuid", C0395h.E(w.getUuid()));
        }
        hashMap.put("service_uuid", C0395h.E(bluetoothGattDescriptor.getCharacteristic().getService().getUuid()));
        hashMap.put("characteristic_uuid", C0395h.E(bluetoothGattDescriptor.getCharacteristic().getUuid()));
        hashMap.put("descriptor_uuid", C0395h.E(bluetoothGattDescriptor.getUuid()));
        hashMap.put("instance_id", Integer.valueOf(C0395h.u(bluetoothGattDescriptor.getCharacteristic())));
        hashMap.put("value", bArr);
        AbstractC0007h.p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", C0395h.k(i4));
        c0395h.z("OnDescriptorRead", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onDescriptorWrite:", i5);
        c0395h.C("  chr: " + C0395h.E(bluetoothGattDescriptor.getCharacteristic().getUuid()), i5);
        c0395h.C("  desc: " + C0395h.E(bluetoothGattDescriptor.getUuid()), i5);
        c0395h.C("  status: " + C0395h.k(i4) + " (" + i4 + ")", i5);
        BluetoothGattService w = C0395h.w(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
        String address = bluetoothGatt.getDevice().getAddress();
        String E3 = w != null ? C0395h.E(w.getUuid()) : "";
        String E4 = C0395h.E(bluetoothGattDescriptor.getCharacteristic().getService().getUuid());
        String E5 = C0395h.E(bluetoothGattDescriptor.getCharacteristic().getUuid());
        Integer valueOf = Integer.valueOf(C0395h.u(bluetoothGattDescriptor.getCharacteristic()));
        String E6 = C0395h.E(bluetoothGattDescriptor.getUuid());
        StringBuilder sb = new StringBuilder();
        sb.append(address);
        sb.append(":");
        sb.append(E3);
        sb.append(":");
        sb.append(E4);
        sb.append(":");
        sb.append(E5);
        sb.append(":");
        sb.append(valueOf);
        byte[] bArr = (byte[]) c0395h.f7061A.remove(AbstractC0007h.m(sb, ":", E6));
        if (bArr == null) {
            bArr = new byte[0];
        }
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", address);
        if (w != null) {
            hashMap.put("primary_service_uuid", C0395h.E(w.getUuid()));
        }
        hashMap.put("service_uuid", E4);
        hashMap.put("characteristic_uuid", E5);
        hashMap.put("descriptor_uuid", E6);
        hashMap.put("instance_id", Integer.valueOf(C0395h.u(bluetoothGattDescriptor.getCharacteristic())));
        hashMap.put("value", bArr);
        AbstractC0007h.p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", C0395h.k(i4));
        c0395h.z("OnDescriptorWritten", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i4, int i5) {
        int i6 = i5 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onMtuChanged:", i6);
        c0395h.C("  mtu: " + i4, i6);
        c0395h.C("  status: " + C0395h.k(i5) + " (" + i5 + ")", i6);
        String address = bluetoothGatt.getDevice().getAddress();
        c0395h.f7082x.put(address, Integer.valueOf(i4));
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", address);
        hashMap.put("mtu", Integer.valueOf(i4));
        AbstractC0007h.p(i5 == 0 ? 1 : 0, hashMap, "success", i5, "error_code");
        hashMap.put("error_string", C0395h.k(i5));
        c0395h.z("OnMtuChanged", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i4, int i5) {
        int i6 = i5 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onReadRemoteRssi:", i6);
        c0395h.C("  rssi: " + i4, i6);
        c0395h.C("  status: " + C0395h.k(i5) + " (" + i5 + ")", i6);
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        hashMap.put("rssi", Integer.valueOf(i4));
        AbstractC0007h.p(i5 == 0 ? 1 : 0, hashMap, "success", i5, "error_code");
        hashMap.put("error_string", C0395h.k(i5));
        c0395h.z("OnReadRssi", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onReliableWriteCompleted:", i5);
        c0395h.C("  status: " + C0395h.k(i4) + " (" + i4 + ")", i5);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        C0395h c0395h = this.f7060a;
        c0395h.C("onServicesDiscovered:", i5);
        c0395h.C("  count: " + bluetoothGatt.getServices().size(), i5);
        c0395h.C("  status: " + i4 + C0395h.k(i4), i5);
        ArrayList arrayList = new ArrayList();
        for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
            arrayList.add(C0395h.p(bluetoothGatt.getDevice(), bluetoothGattService, null, bluetoothGatt));
            Iterator<BluetoothGattService> it = bluetoothGattService.getIncludedServices().iterator();
            while (it.hasNext()) {
                arrayList.add(C0395h.p(bluetoothGatt.getDevice(), it.next(), bluetoothGattService, bluetoothGatt));
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        hashMap.put("services", arrayList);
        AbstractC0007h.p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", C0395h.k(i4));
        c0395h.z("OnDiscoveredServices", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i4) {
        onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i4) {
        onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i4, bluetoothGattDescriptor.getValue());
    }
}
