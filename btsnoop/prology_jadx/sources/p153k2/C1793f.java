package p153k2;

/* renamed from: k2.f */
/* loaded from: classes.dex */
public final class C1793f extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a */
    public final /* synthetic */ p153k2.C1795h f7326a;

    public C1793f(p153k2.C1795h c1795h) {
        this.f7326a = c1795h;
    }

    /* renamed from: a */
    public final boolean m3746a(android.bluetooth.BluetoothGatt bluetoothGatt, int i4, java.lang.String str) {
        p153k2.C1795h c1795h = this.f7326a;
        if (i4 == 2) {
            if (c1795h.f7348u.get(str) == null && c1795h.f7352y.get(str) == null) {
                c1795h.m3765C("[unexpected connection] disconnecting now", 5);
                c1795h.f7347t.remove(str);
                c1795h.f7349v.remove(str);
                c1795h.f7350w.remove(str);
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
                return true;
            }
        } else if (i4 == 0 && c1795h.f7348u.get(str) == null && c1795h.f7347t.get(str) == null && c1795h.f7352y.get(str) == null) {
            c1795h.m3765C("[unexpected connection] disconnect complete", 5);
            c1795h.f7349v.remove(str);
            c1795h.f7350w.remove(str);
            bluetoothGatt.close();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m3747b(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i4) {
        java.util.UUID uuid = bluetoothGattCharacteristic.getService().getUuid();
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.getClass();
        if (p153k2.C1795h.m3750E(uuid).equals("1801") && p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getUuid()).toUpperCase().equals("2A05")) {
            c1795h.m3770z("OnServicesReset", p153k2.C1795h.m3757o(bluetoothGatt.getDevice()));
        }
        android.bluetooth.BluetoothGattService m3762w = p153k2.C1795h.m3762w(bluetoothGatt, bluetoothGattCharacteristic);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        if (m3762w != null) {
            hashMap.put("primary_service_uuid", p153k2.C1795h.m3750E(m3762w.getUuid()));
        }
        hashMap.put("service_uuid", p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getService().getUuid()));
        hashMap.put("characteristic_uuid", p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getUuid()));
        hashMap.put("instance_id", java.lang.Integer.valueOf(p153k2.C1795h.m3761u(bluetoothGattCharacteristic)));
        hashMap.put("value", bArr);
        p009B2.AbstractC0051h.m157p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", p153k2.C1795h.m3753k(i4));
        c1795h.m3770z("OnCharacteristicReceived", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onCharacteristicChanged:", 5);
        c1795h.m3765C("  chr: " + p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getUuid()), 5);
        m3747b(bluetoothGatt, bluetoothGattCharacteristic, bArr, 0);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onCharacteristicRead:", i5);
        c1795h.m3765C("  chr: " + p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getUuid()), i5);
        c1795h.m3765C("  status: " + p153k2.C1795h.m3753k(i4) + " (" + i4 + ")", i5);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("  instanceId: ");
        sb.append(p153k2.C1795h.m3761u(bluetoothGattCharacteristic));
        c1795h.m3765C(sb.toString(), i5);
        m3747b(bluetoothGatt, bluetoothGattCharacteristic, bArr, i4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onCharacteristicWrite:", i5);
        c1795h.m3765C("  chr: " + p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getUuid()), i5);
        c1795h.m3765C("  status: " + p153k2.C1795h.m3753k(i4) + " (" + i4 + ")", i5);
        android.bluetooth.BluetoothGattService m3762w = p153k2.C1795h.m3762w(bluetoothGatt, bluetoothGattCharacteristic);
        java.lang.String address = bluetoothGatt.getDevice().getAddress();
        java.lang.String m3750E = m3762w != null ? p153k2.C1795h.m3750E(m3762w.getUuid()) : "";
        java.lang.String m3750E2 = p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getService().getUuid());
        java.lang.String m3750E3 = p153k2.C1795h.m3750E(bluetoothGattCharacteristic.getUuid());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(p153k2.C1795h.m3761u(bluetoothGattCharacteristic));
        byte[] bArr = (byte[]) c1795h.f7353z.remove(address + ":" + m3750E + ":" + m3750E2 + ":" + m3750E3 + ":" + valueOf);
        if (bArr == null) {
            bArr = new byte[0];
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("remote_id", address);
        if (m3762w != null) {
            hashMap.put("primary_service_uuid", p153k2.C1795h.m3750E(m3762w.getUuid()));
        }
        hashMap.put("service_uuid", m3750E2);
        hashMap.put("characteristic_uuid", m3750E3);
        hashMap.put("instance_id", valueOf);
        hashMap.put("value", bArr);
        p009B2.AbstractC0051h.m157p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", p153k2.C1795h.m3753k(i4));
        c1795h.m3770z("OnCharacteristicWritten", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i4, int i5) {
        java.lang.String str;
        p153k2.C1795h c1795h = this.f7326a;
        try {
            java.util.concurrent.Semaphore semaphore = c1795h.f7346s;
            int i6 = 0;
            boolean z4 = false;
            while (!z4) {
                try {
                    semaphore.acquire();
                    z4 = true;
                } catch (java.lang.InterruptedException unused) {
                    c1795h.m3765C("failed to acquire mutex, retrying", 2);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("onConnectionStateChange:");
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
            c1795h.m3765C(sb.toString(), 5);
            c1795h.m3765C("  status: " + p153k2.C1795h.m3754l(i4), 5);
            java.util.concurrent.Semaphore semaphore2 = c1795h.f7346s;
            if (i5 != 2 && i5 != 0) {
                semaphore2.release();
                return;
            }
            java.lang.String address = bluetoothGatt.getDevice().getAddress();
            if (m3746a(bluetoothGatt, i5, address)) {
                semaphore2.release();
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = c1795h.f7348u;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = c1795h.f7347t;
            if (i5 == 2) {
                concurrentHashMap2.put(address, bluetoothGatt);
                concurrentHashMap.remove(address);
                c1795h.f7351x.put(address, 23);
            }
            if (i5 == 0) {
                concurrentHashMap2.remove(address);
                concurrentHashMap.remove(address);
                c1795h.f7349v.remove(address);
                c1795h.f7350w.remove(address);
                if (c1795h.f7352y.containsKey(address)) {
                    c1795h.m3765C("autoconnect is true. skipping gatt.close()", 5);
                } else {
                    bluetoothGatt.close();
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("remote_id", address);
            if (i5 == 2) {
                i6 = 1;
            }
            hashMap.put("connection_state", java.lang.Integer.valueOf(i6));
            hashMap.put("disconnect_reason_code", java.lang.Integer.valueOf(i4));
            hashMap.put("disconnect_reason_string", p153k2.C1795h.m3754l(i4));
            c1795h.m3770z("OnConnectionStateChanged", hashMap);
            semaphore2.release();
        } catch (java.lang.Throwable th) {
            c1795h.f7346s.release();
            throw th;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i4, byte[] bArr) {
        int i5 = i4 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onDescriptorRead:", i5);
        c1795h.m3765C("  chr: " + p153k2.C1795h.m3750E(bluetoothGattDescriptor.getCharacteristic().getUuid()), i5);
        c1795h.m3765C("  desc: " + p153k2.C1795h.m3750E(bluetoothGattDescriptor.getUuid()), i5);
        c1795h.m3765C("  status: " + p153k2.C1795h.m3753k(i4) + " (" + i4 + ")", i5);
        android.bluetooth.BluetoothGattService m3762w = p153k2.C1795h.m3762w(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        if (m3762w != null) {
            hashMap.put("primary_service_uuid", p153k2.C1795h.m3750E(m3762w.getUuid()));
        }
        hashMap.put("service_uuid", p153k2.C1795h.m3750E(bluetoothGattDescriptor.getCharacteristic().getService().getUuid()));
        hashMap.put("characteristic_uuid", p153k2.C1795h.m3750E(bluetoothGattDescriptor.getCharacteristic().getUuid()));
        hashMap.put("descriptor_uuid", p153k2.C1795h.m3750E(bluetoothGattDescriptor.getUuid()));
        hashMap.put("instance_id", java.lang.Integer.valueOf(p153k2.C1795h.m3761u(bluetoothGattDescriptor.getCharacteristic())));
        hashMap.put("value", bArr);
        p009B2.AbstractC0051h.m157p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", p153k2.C1795h.m3753k(i4));
        c1795h.m3770z("OnDescriptorRead", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onDescriptorWrite:", i5);
        c1795h.m3765C("  chr: " + p153k2.C1795h.m3750E(bluetoothGattDescriptor.getCharacteristic().getUuid()), i5);
        c1795h.m3765C("  desc: " + p153k2.C1795h.m3750E(bluetoothGattDescriptor.getUuid()), i5);
        c1795h.m3765C("  status: " + p153k2.C1795h.m3753k(i4) + " (" + i4 + ")", i5);
        android.bluetooth.BluetoothGattService m3762w = p153k2.C1795h.m3762w(bluetoothGatt, bluetoothGattDescriptor.getCharacteristic());
        java.lang.String address = bluetoothGatt.getDevice().getAddress();
        java.lang.String m3750E = m3762w != null ? p153k2.C1795h.m3750E(m3762w.getUuid()) : "";
        java.lang.String m3750E2 = p153k2.C1795h.m3750E(bluetoothGattDescriptor.getCharacteristic().getService().getUuid());
        java.lang.String m3750E3 = p153k2.C1795h.m3750E(bluetoothGattDescriptor.getCharacteristic().getUuid());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(p153k2.C1795h.m3761u(bluetoothGattDescriptor.getCharacteristic()));
        java.lang.String m3750E4 = p153k2.C1795h.m3750E(bluetoothGattDescriptor.getUuid());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(address);
        sb.append(":");
        sb.append(m3750E);
        sb.append(":");
        sb.append(m3750E2);
        sb.append(":");
        sb.append(m3750E3);
        sb.append(":");
        sb.append(valueOf);
        byte[] bArr = (byte[]) c1795h.f7327A.remove(p009B2.AbstractC0051h.m154m(sb, ":", m3750E4));
        if (bArr == null) {
            bArr = new byte[0];
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("remote_id", address);
        if (m3762w != null) {
            hashMap.put("primary_service_uuid", p153k2.C1795h.m3750E(m3762w.getUuid()));
        }
        hashMap.put("service_uuid", m3750E2);
        hashMap.put("characteristic_uuid", m3750E3);
        hashMap.put("descriptor_uuid", m3750E4);
        hashMap.put("instance_id", java.lang.Integer.valueOf(p153k2.C1795h.m3761u(bluetoothGattDescriptor.getCharacteristic())));
        hashMap.put("value", bArr);
        p009B2.AbstractC0051h.m157p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", p153k2.C1795h.m3753k(i4));
        c1795h.m3770z("OnDescriptorWritten", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(android.bluetooth.BluetoothGatt bluetoothGatt, int i4, int i5) {
        int i6 = i5 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onMtuChanged:", i6);
        c1795h.m3765C("  mtu: " + i4, i6);
        c1795h.m3765C("  status: " + p153k2.C1795h.m3753k(i5) + " (" + i5 + ")", i6);
        java.lang.String address = bluetoothGatt.getDevice().getAddress();
        c1795h.f7351x.put(address, java.lang.Integer.valueOf(i4));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("remote_id", address);
        hashMap.put("mtu", java.lang.Integer.valueOf(i4));
        p009B2.AbstractC0051h.m157p(i5 == 0 ? 1 : 0, hashMap, "success", i5, "error_code");
        hashMap.put("error_string", p153k2.C1795h.m3753k(i5));
        c1795h.m3770z("OnMtuChanged", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReadRemoteRssi(android.bluetooth.BluetoothGatt bluetoothGatt, int i4, int i5) {
        int i6 = i5 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onReadRemoteRssi:", i6);
        c1795h.m3765C("  rssi: " + i4, i6);
        c1795h.m3765C("  status: " + p153k2.C1795h.m3753k(i5) + " (" + i5 + ")", i6);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        hashMap.put("rssi", java.lang.Integer.valueOf(i4));
        p009B2.AbstractC0051h.m157p(i5 == 0 ? 1 : 0, hashMap, "success", i5, "error_code");
        hashMap.put("error_string", p153k2.C1795h.m3753k(i5));
        c1795h.m3770z("OnReadRssi", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onReliableWriteCompleted(android.bluetooth.BluetoothGatt bluetoothGatt, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onReliableWriteCompleted:", i5);
        c1795h.m3765C("  status: " + p153k2.C1795h.m3753k(i4) + " (" + i4 + ")", i5);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i4) {
        int i5 = i4 == 0 ? 5 : 2;
        p153k2.C1795h c1795h = this.f7326a;
        c1795h.m3765C("onServicesDiscovered:", i5);
        c1795h.m3765C("  count: " + bluetoothGatt.getServices().size(), i5);
        c1795h.m3765C("  status: " + i4 + p153k2.C1795h.m3753k(i4), i5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.bluetooth.BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
            arrayList.add(p153k2.C1795h.m3758p(bluetoothGatt.getDevice(), bluetoothGattService, null, bluetoothGatt));
            java.util.Iterator<android.bluetooth.BluetoothGattService> it = bluetoothGattService.getIncludedServices().iterator();
            while (it.hasNext()) {
                arrayList.add(p153k2.C1795h.m3758p(bluetoothGatt.getDevice(), it.next(), bluetoothGattService, bluetoothGatt));
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("remote_id", bluetoothGatt.getDevice().getAddress());
        hashMap.put("services", arrayList);
        p009B2.AbstractC0051h.m157p(i4 == 0 ? 1 : 0, hashMap, "success", i4, "error_code");
        hashMap.put("error_string", p153k2.C1795h.m3753k(i4));
        c1795h.m3770z("OnDiscoveredServices", hashMap);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i4) {
        onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i4) {
        onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i4, bluetoothGattDescriptor.getValue());
    }
}
