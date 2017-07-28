
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/fingerprint.mojom
//

package org.chromium.device.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface Fingerprint extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends Fingerprint, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Fingerprint, Fingerprint.Proxy> MANAGER = Fingerprint_Internal.MANAGER;


    void getRecordsForUser(
String userId, 
GetRecordsForUserResponse callback);

    interface GetRecordsForUserResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<java.util.Map<String, String>> { }



    void startEnrollSession(
String userId, String label);



    void cancelCurrentEnrollSession(

CancelCurrentEnrollSessionResponse callback);

    interface CancelCurrentEnrollSessionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void requestRecordLabel(
String recordPath, 
RequestRecordLabelResponse callback);

    interface RequestRecordLabelResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<String> { }



    void setRecordLabel(
String recordPath, String newLabel, 
SetRecordLabelResponse callback);

    interface SetRecordLabelResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void removeRecord(
String recordPath, 
RemoveRecordResponse callback);

    interface RemoveRecordResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void startAuthSession(
);



    void endCurrentAuthSession(

EndCurrentAuthSessionResponse callback);

    interface EndCurrentAuthSessionResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void destroyAllRecords(

DestroyAllRecordsResponse callback);

    interface DestroyAllRecordsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void addFingerprintObserver(
FingerprintObserver observer);



    void requestType(

RequestTypeResponse callback);

    interface RequestTypeResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


}
