
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/input_host.mojom
//

package org.chromium.blink.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class TextSuggestion extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int markerTag;
    public int suggestionIndex;
    public String prefix;
    public String suggestion;
    public String suffix;

    private TextSuggestion(int version) {
        super(STRUCT_SIZE, version);
    }

    public TextSuggestion() {
        this(0);
    }

    public static TextSuggestion deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TextSuggestion deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TextSuggestion decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TextSuggestion result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new TextSuggestion(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.markerTag = decoder0.readInt(8);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.suggestionIndex = decoder0.readInt(12);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.prefix = decoder0.readString(16, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.suggestion = decoder0.readString(24, false);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.suffix = decoder0.readString(32, false);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.markerTag, 8);
        
        encoder0.encode(this.suggestionIndex, 12);
        
        encoder0.encode(this.prefix, 16, false);
        
        encoder0.encode(this.suggestion, 24, false);
        
        encoder0.encode(this.suffix, 32, false);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        TextSuggestion other = (TextSuggestion) object;
        if (this.markerTag!= other.markerTag)
            return false;
        if (this.suggestionIndex!= other.suggestionIndex)
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.prefix, other.prefix))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.suggestion, other.suggestion))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.suffix, other.suffix))
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.markerTag);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.suggestionIndex);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.prefix);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.suggestion);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.suffix);
        return result;
    }
}